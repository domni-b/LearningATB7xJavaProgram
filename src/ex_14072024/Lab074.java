package ex_14072024;

import java.util.SortedMap;

public class Lab074 {

    public static void main(String[] args) {

        String name = "The Testing Academy"; // SCP
        String name1 = "The Testing Academy"; // SCP

        String name2 = new String("The Testing Academy"); // Heap area (QA)

        System.out.println(name == name1); // Check for the Ref
        System.out.println(name.equals(name1)); // Check for the Content




    }

}
