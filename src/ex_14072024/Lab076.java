package ex_14072024;

public class Lab076 {
    public static void main(String[] args) {

        String s1 = "Domni";

        // String s1 = "D o m n i";
        //             |0|1|2|3|4|

        char c = s1.charAt(4);

        System.out.println(c);

        s1 = s1.concat("Bad"); // Domni Bad

        System.out.println(s1);


    }


}
