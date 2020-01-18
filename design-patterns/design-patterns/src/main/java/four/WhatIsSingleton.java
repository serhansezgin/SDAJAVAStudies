package four;

public class WhatIsSingleton {

    /**
     * It is under creational category.
     *
     * When we use it ?
     *  - If we need restrict the instantiation of a class to one "single" instance.
     *  - Like...when we need to use only one instance/object in the system.
     *  - The singleton allows only one entry point to create the new instance of the class.
     */

    /**
     * Some examples from java library
     *     - java.lang.Runtime#getRuntime()
     *     - java.awt.Desktop#getDesktop()
     *     - java.lang.System#getSecurityManager()
     *
     * Logging
     *     - LogManager.getLogManager()
     *
     * Database
     *     - Database.getConnection()
     */

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        SecurityManager securityManager = System.getSecurityManager();

    }
}
