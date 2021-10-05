package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner =new Scanner(System.in);
        boolean x =false;
        System.out.println("What is the test out of?");
        int totalMark=scanner.nextInt();
        System.out.println("What did the student get?");
        int studentMark=scanner.nextInt();
        int percentage=((studentMark*100)/totalMark);
        System.out.println("Student percentage is "+percentage);
        if (percentage>=80){
            System.out.println("Student got an A");
        }
        else if (percentage>=70){
            System.out.println("Student got a B");
        }
        else if (percentage>=60){
            System.out.println("Student got a C");
        }
        else if (percentage>=50){
            System.out.println("Student got a D");
        }
        else if (percentage>=40){
            System.out.println("Student got a E");
        }
        else {
            System.out.println("Student got a U");
        }

    }
}
