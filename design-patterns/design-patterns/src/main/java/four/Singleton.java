package four;

import java.lang.reflect.Constructor;
import java.util.Properties;

public class Singleton {
    public static void main(String[] args) {
       EagerSingleton singleton = EagerSingleton.getInstance();
    }
}

// Eager singleton
class EagerSingleton {

    // static instance
    private static EagerSingleton ins = new EagerSingleton();

    // Constructor is private!
    private EagerSingleton(){

    }
    public static EagerSingleton getInstance(){
        System.out.println("I am eager singleton...");
        return ins;
    }
}

/**
 *  - The instance is created  at the time of class loading
 *  - We are making constructor private
 *  - We have one public static method to
 *  - provide the single entry point to create the new instance of the class.
 *
 *   DRAWBACK :
 *   - We create an instance even though client app might not use it.
 *   - This brings an issue in creating a database connection
 *   or creating a socket.
 *   - The issue is considered as a problem : memory leak!!!
 */

// Eager  singleton


// Lazy singleton

class LazySingleton{

    private static LazySingleton ins;

    private LazySingleton() { }

    public static LazySingleton getInstance() {
        if (ins == null) {
            ins = new LazySingleton();
        }
        return ins;
    }
}

/**
 * - The instance creation is done in public static method
 * getInstance()
 * - We are checking is there any instance already created.
 * - We have private constructor here.
 * - BONUS! How can we test two instance from Lazy Singleton
 * are same ?
 *
 * - So we have a perfect Singleton right ?
 *
 *
 */
// Lazy singleton

// Lazy singleton Proof
class LazySingletonTest {
    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();

        System.out.println("instance 1 hash code:" +
                instance1.hashCode());
        System.out.println("instance 2 hash code:" +
                instance2.hashCode());
    }
}
// Lazy singleton Proof

// Lazy singleton with Reflection

class LazySingletonReflectionTest {

    /**
     *
     * Reflection is a process to change class
     * behaviour at runtime!
     *
     */
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingletonReflected = null;

        try {
            Class<LazySingleton> clazz = LazySingleton.class;
            Constructor<LazySingleton> cons = clazz.getDeclaredConstructor();
            cons.setAccessible(true);
            lazySingletonReflected = cons.newInstance();
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("lazySingleton has code:"
                + lazySingleton.hashCode());
        System.out.println("lazySingletonReflected hash code:"
                + lazySingletonReflected.hashCode());
    }

    /**
     * To prevent reflection, we can put a checker in constructor
     *          if(ins != null){
     *             throw new RuntimeException
     *             ("Please use getInstance() method to create an instance!");
     *         }
     */


}

/**
 *  - So our Lazy Singleton is perfect! We can use it!
 *  - or...
 *  - What if our app running in multi- threaded env.
 *  - Our Singleton class is thread-safe?
 */
// Lazy singleton with Reflection

// Lazy singleton without Reflection
class LazySingletonWitReflection {

    private static LazySingletonWitReflection ins;
    private LazySingletonWitReflection() {
        if (ins != null) {
            throw new RuntimeException
                    ("Please use getInstance() method to " +
                            "create an instance!");
        }
    }
    public static LazySingletonWitReflection getInstance() {
        if (ins == null) {
            ins = new LazySingletonWitReflection();
        }
        return ins;
    }

    public static void main(String[] args) {
        LazySingletonWitReflection withoutReflection = LazySingletonWitReflection.getInstance();

        LazySingletonWitReflection lazySingletonReflected = null;

        try {
            Class<LazySingletonWitReflection> clazz = LazySingletonWitReflection.class;
            Constructor<LazySingletonWitReflection> cons = clazz.getDeclaredConstructor();
            cons.setAccessible(true);
            lazySingletonReflected = cons.newInstance();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
// Lazy singleton without Reflection


// Lazy Singleton Multi-Threaded
class LazySingletonThreadTest {

    public static void main(String[] args) {
        //Thread 1
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                LazySingleton instance1 = LazySingleton.getInstance();
                System.out.println("Instance 1 hash:" +
                        instance1.hashCode());
            }
        });
        //Thread 2
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                LazySingleton instance2 = LazySingleton.getInstance();
                System.out.println("Instance 2 hash:" +
                        instance2.hashCode());
            }
        });
        t1.start();
        t2.start();
    }
    /**
     * If we run this block of code multiple times,
     * we are going to see sometimes same hashes, sometimes different.
     */
}
// Lazy Singleton Multi-Threaded


// multi-threaded approach 1 singleton

class SingletonMultiThreadApproach1 {

    private static SingletonMultiThreadApproach1 ins;

    private SingletonMultiThreadApproach1(){
        if (ins != null) {
            throw new RuntimeException
                    ("Please use getInstance() " +
                            "method to create an instance!");
        }
    }
    public synchronized static SingletonMultiThreadApproach1 getInstance(){
        if(ins == null){
            ins = new SingletonMultiThreadApproach1();
        }
        return ins;
    }
}
/**
 * - Prevented reflection
 * - public, static and synchronized getInstance()
 * - synchronized provides thread-safety
 * - Second thread will wait the first thread to complete getInstance()
 *
 * - So are we done ?
 * - Any cons of this approach ?
 * - Performance is slow because of locking overhead.
 * - Synchronization is not required once the instance variable
 * is initialized.
 */
// multi-threaded approach 1 singleton


/**
 * so far so good but the last code block in the multi-threading
 * environment might cause locking. "Double-Checked Locking idiom"
 */

// multi-threaded approach with double check locking singleton
class SingletonMultiThreadedApproach2 {

    private static SingletonMultiThreadedApproach2 ins;
    private SingletonMultiThreadedApproach2() {
        if (ins != null) {
            throw new RuntimeException
                    ("Please use getInstance() method to create " +
                            "an instance!");
        }
    }
    public static SingletonMultiThreadedApproach2 getInstance() {
        if (ins == null) { //First check
            synchronized (SingletonMultiThreadedApproach2.class) {  // Second check
                if (ins == null) {
                    ins = new SingletonMultiThreadedApproach2();
                }
            }
        }
        return ins;
    }
}

/**
 * - Prevented reflection
 * - public, static getInstance()
 * - null check first
 * - synchronized block is for only instance creation
 *
 * - So we found an efficient solution!
 * - However this approach has subtle problems we should avoid
 * - Let go through the flow is described below :
 *
 * 1. Thread A notices that the value is not initialized,
 * so it obtains the lock and begins to initialize the value.
 *
 * 2. Thread B notices that the shared variable has been initialized (or so it appears),
 * and returns its value. Because thread B believes the value is already initialized,
 * it does not acquire the lock. If B uses the object before all of the initialization
 * done by A is seen by B (either because A has not finished initializing
 * it or because some of the initialized values in the object have not
 * yet percolated to the memory B uses (cache coherence)),
 * the program will likely crash.
 *
 * Check wiki : https://en.wikipedia.org/wiki/Double-checked_locking#Usage_in_Java
 *
 * - To summarize, before the instance creation finishes, second thread gets its reference
 * and tries to use it!
 */

// multi-threaded approach with double check locking singleton

// enum approach - by Joshua Bloch - Effective Java Book

enum ConnectionPool {

    INSTANCE;
    private ConnectionPool() {
        // do required initialization here
    }
    public static ConnectionPool getInstance() {
        return INSTANCE;
    }
}
/**
 * - Enum classes are thread-safe by their nature
 * - Enum has an implicit empty constructor.
 * - It is guaranteed by the JVM itself that
 *  it will be always only one copy
 *
 * - We have a singleton class, it is thread-safe,
 * no reflection problem with the minimum effort.
 *
 * - It does not seem bulky code
 * more elegant to read and maintain.
 */

// enum approach - by Joshua Bloch - Effective Java Book

// real world example
enum Configuration {
    HOST("host"),
    PORT("port"),
    MAIL_SERVER("mailServer"),
    INPUT_DIRECTORY("inputDirectory"),
    OUTPUT_DIRECTORY("outputDirectory");

    private static Properties properties;
    static {
        properties = new Properties();
        try {
            properties.load(Configuration.class.getClassLoader()
                    .getResourceAsStream(
                    "configuration.properties"));
        } catch (Exception e) {
            throw new RuntimeException("Error when loading configuration file", e);
        }
    }
    private String key;
    Configuration(String key) {
        this.key = key;
    }
    public String getKey() {
        return key;
    }
    public String getValue() {
        return properties.getProperty(key);
    }
}

class ConfigurationTest{
    public static void main(String[] args) {
        System.out.println(Configuration.HOST.getValue());
        System.out.println(Configuration.HOST.getKey());
    }
}