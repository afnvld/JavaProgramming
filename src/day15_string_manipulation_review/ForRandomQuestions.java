package day15_string_manipulation_review;

import java.util.Scanner;

public class ForRandomQuestions {
    public static void main(String[] args) {
        // print vs println
        // when we use System.out.print,
        // next thing that I print will be in the same line
        // when we use System.out.println,
        // next thing that I print will be in the next line
        
        System.out.print("one");// next thing will be printed in the same line
        System.out.println("two"); //  next thing will be printed in the next line
        System.out.println("three"); //next thing will be printed in the next line
        System.out.print("four");
        
        System.out.println("__________________________");
        
        // next()  vs nextLine()
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value for nextLine");
        String nextLine = scanner.nextLine(); // captures everything in the line
        
        System.out.println("Please enter value for next");
        String next = scanner.next(); // captures until space character

        System.out.println(nextLine);

        System.out.println(next);
        
        scanner.close();
        
        
    }
}