package string;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        String str="abc";
        String str2=new String("xyz");
        System.out.println(str);

        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());

        String fullname=name +" "+ str;
        System.out.println(fullname);

        System.out.println(fullname.charAt(4));
    }
}
