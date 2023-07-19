package StringMethods;

public class String3 {
    public static void main(String[] args) {
        String data="Annamalai";
        System.out.println(data.startsWith("s"));

        System.out.println(data.endsWith("i"));

        System.out.println(data.charAt(3));

        System.out.println(data.length());

        String data1="Nothing more than happieeness.Happy the faces";
        System.out.println(data1);

        System.out.println(data1.replace("Happy","feel"));

        //String replace=data1.replace("Happy","feel");
        //System.out.println(replace);

       // System.out.println(data.replace("A","a"));  // 0ne of 2nd method.

    }
}
