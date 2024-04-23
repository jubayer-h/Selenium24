package Selenium;

import java.util.Scanner;

public class Contorl_if {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter your Number :  ");
        num=input.nextInt();
        // if (num>0){
        //            System.out.println("positve");
        //        }
        if (num>=18){
            System.out.println("valid voter");
        }
        else if(num<17){
            System.out.println("not valid voter");
        }
        else{
            System.out.println("try again");
        }
    }
}
