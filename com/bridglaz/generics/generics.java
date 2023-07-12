package com.bridglaz.generics;

public class generics {

   static void max_variables(String str1, String str2, String str3) {
        if(str1.compareTo(str2) > 0){
            if(str1.compareTo(str3) > 0){
                System.out.println( str1 + " is Maximum of three strings ");
            }else {
                System.out.println( str3 + " is Maximum of three strings ");
            }
        }else{
            if(str2.compareTo(str3) > 0){
                System.out.println( str2 + " is Maximum of three strings ");
            }else{
                System.out.println( str3 + " is Maximum of three strings ");
            }
        }
    }
    static void max_variables(Integer num1, Integer num2, Integer num3){
        if(num1.compareTo(num2) > 0){
            if(num1.compareTo(num3) > 0){
                System.out.println( num1 + " is Maximum of three integers ");
            }else {
                System.out.println( num3 + " is Maximum of three integers ");
            }
        }else{
            if(num2.compareTo(num3) > 0){
                System.out.println( num2 + " is Maximum of three integers ");
            }else{
                System.out.println( num3 + " is Maximum of three integers ");
            }
        }
    }

    static void max_variables(Float num1, Float num2, Float num3){
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
        max_variables(10,500,99);
        max_variables(6.1f,1.8f,70f);
        max_variables("Orange", "WaterMelon", "Banana");
    }
    }
