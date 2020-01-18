package three;

public class WhatIsBuilder {

    /**
     *
     * It is under creational category
     *
     * When we use it ?
     * - if we have complex constructor
     * - If we have large number of parameters
     * - Immutability - it is a concern
     */

    /**
     * Some examples from java library
     *  - StringBuilder#append()
     *  - StringBuffer#append()
     *  - ByteBuffer#put()
     *  - PreparedStatement#setString(),setInt()
     */

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("world");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("").append("").append("...");
        System.out.println(stringBuffer);
    }
}
