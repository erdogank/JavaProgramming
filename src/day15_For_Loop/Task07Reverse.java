package day15_For_Loop;

import java.util.Scanner;

public class Task07Reverse {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.nextLine();

        scan.close();


        String reverse="";

        for (int i=str.length()-1; i>=0; i--) {

            reverse +=str.charAt(i);

        }
        System.out.println(reverse);

    }
}
