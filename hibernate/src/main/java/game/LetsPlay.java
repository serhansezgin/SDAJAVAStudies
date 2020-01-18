package game;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LetsPlay {

    private static Map<Integer,String> questions = new HashMap<Integer, String>(){{
        put(1,"What is a JDBC?");
        put(2,"What are the main steps in making JDBC connectivity?");
        put(3, "What is sql injection");
        put(4, "What are different types of Statement?");
        put(5, "What are the different methods used to query the database?");
        put(6, "What is transaction? ");
        put(7, "What are the differences between Statement and PreparedStatement interface?");
        put(8, "What is Hibernate?");
        put(9, "What is ORM?");
        put(10, "What are the advantages of Hibernate?");
        put(11, "What are the core interfaces of Hibernate?");
        put(12, "What is hibernate configuration file?");
        put(13, "What is hibernate mapping file?");
        put(14, "What is Hibernate Session?");
        put(15, "What are session methods?");
        put(16, "What is HQL");
        put(17, "How many types of association mapping are possible in hibernate");
        put(18, "What is lazy loading in hibernate?");
        put(19, "What are the states of the object in hibernate?");
        put(20, "What is JPQL");
    }};

    public static void main(String[] args) {
        String[] people = new String[]{"Aleksei","Tauri","Ola","Roop","Sezgin"};

        System.out.println(people[generateRandomInt(0,4)]);
        System.out.println(pickQuestion());
    }

    public static String pickQuestion(){
        int key = generateRandomInt(1,20);
        return questions.get(key);
    }


    public static int generateRandomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
