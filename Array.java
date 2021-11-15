package com.company;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        //       index: 0   1   2
        int array [] = {4, 8, 10};

        System.out.println(array[0]); // 0 --> 4
        System.out.println(array[1]); // 1 --> 8
        System.out.println(array[2]);  //2 --> 10

        //System.out.println(String.format("%d  %d %d "), array[0] , array[1] , array[2]);
                         //  0        1       2
         String cars [] = {"Honda", "Volvo", "Mazda" };   // 0 - 2
         System.out.println(cars[0] + ", " + cars[1] + ", " + cars[2]);

        System.out.println("=================");
         // begin; condition - end; jumps
         for(int i = 0; i < 3; i++){
             System.out.println(cars[i]);
         }

        System.out.println("=================");
         int arr[] = {1, 2, 3 ,4, 5, 6};
       // System.out.println(arr.length);
        for(int i =0;  i < arr.length; i++ ){
            System.out.println(arr[i]);
        }
        //             0  1 2  3 4
        int array1 [] = {1,2,3,4,5};
        for(int i = 0; i < array1.length; i++){
            System.out.println("in index: " +  i  + ", value: " + array1[i]);
        }
        //                         0       1       2        3
        String colorsArray [] = {"black", "blue", "red", "green" };
        for(int index = 0; index <= colorsArray.length; index++){  //index = 4  = 4
            System.out.println(colorsArray[index]);  // colorArray[4]
        }

        /// 10 numbers  -- >  sum = 10- Values (1+2+3+4+5+6+7+8+9+10)
        int my_array [] = {0,5,0,8,4,2,1,9};
        int shum = 0;

        for(int index = 0; index < my_array.length; index++ ){
            shum = shum + my_array[index];
            System.out.println("shum now is: " + shum);
        }
        System.out.println( shum);


    }
}
