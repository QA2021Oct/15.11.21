package com.company;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        // begin ; condition ; jumps
        // 1:
        for(int i = 20; i <= 2000; i+=5){
            System.out.println(i);
        }

        //2:
        int sum = 0;
        // begin ; condition ; jumps
        for(int i =1; i <= 20; i++) {
            sum = sum + i;
        }
        System.out.println("Sum= " + sum);

        //3:
        // 5         >= -10    ++
        // begin ; condition ; jumps
        //  5, 4, 3, 2, 1 .... -10  ///  5 6 7 8 9
        for(int i = 5; i >= -10; i--){
            System.out.println(i);
        }
        //4:  begin 100; end  > 0; --      -> i % 7 = 0
        for(int i = 100; i > 0; i-- ){
            if(i % 7 == 0) {
                System.out.print(i);
                System.out.print(", ");
            }
        }
        //5: begin - 1; end < 100; i++
        for(int i= 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
        //6: begin - 1; end < 100; i++
        for(int i= 1; i <= 100; i++){
            if(i % 2 != 0){
                System.out.print(i + ", ");
            }
        }
        Scanner s = new Scanner(System.in);
        int sum1 = 0; // = 100
        //7:
        while(sum1 < 100){
            System.out.println("Enter number? ");
            //sum = sum + s.nextInt();
            sum1 += s.nextInt();
        }
        System.out.println("Done " + sum1);

    }
}
