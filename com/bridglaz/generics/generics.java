package com.bridglaz.generics;

public class generics {

        static void max_variables(Integer num1, Integer num2, Integer num3){
            if(num1.compareTo(num2) > 0){
                if(num1.compareTo(num3) > 0){
                    System.out.println( num1 + " is Maximum of three numbers ");
                }else {
                    System.out.println( num3 + " is Maximum of three numbers ");
                }
            }else{
                if(num2.compareTo(num3) > 0){
                    System.out.println( num2 + " is Maximum of three numbers ");
                }else{
                    System.out.println( num3 + " is Maximum of three numbers ");
                }
            }
        }

        public static void main(String[] args) {
            max_variables(345,445,1000);
        }
    }
