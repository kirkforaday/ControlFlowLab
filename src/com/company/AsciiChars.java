package com.company;

public class AsciiChars {
        public static void printNumbers(){
            System.out.print("Valid Numeric Input: ");
            for(int i=48;i<58;i++){
                System.out.print((char)i);
            }
            System.out.println();
        }

        public static void printLowerCase(){
            System.out.print("Valid Lowercase Alphabetic Input: ");
            for(int i=97;i<123;i++){
                System.out.print((char)i);
            }
            System.out.println();
        }
        public static void printUpperCase(){
            System.out.print("Valid Uppercase Alphabetic Input: ");
            for(int i=65;i<91;i++){
                System.out.print((char)i);
            }
            System.out.println();
        }
}
