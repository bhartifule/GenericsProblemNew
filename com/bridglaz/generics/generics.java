package com.bridglaz.generics;

public class generics {

    static void max_variables(Float num1, Float num2, Float num3) {
        if(num1.compareTo(num2) > 0){
            if(num1.compareTo(num3) > 0){
                System.out.println( num1 + " is Maximum of three float numbers ");
            }else {
                System.out.println( num3 + " is Maximum of three float numbers ");
            }
        }else{
            if(num2.compareTo(num3) > 0){
                System.out.println( num2 + " is Maximum of three float numbers ");
            }else{
                System.out.println( num3 + " is Maximum of three float numbers ");
            }
        }
    }

    public static void main(String[] args) {
        max_variables(1.3f,1.5f,0.2f);
    }
    }
