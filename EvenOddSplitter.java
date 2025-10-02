/*
Name: Madeline Puryear
Date: 10/2/2025
Description:  it splits numbers into two seperate arrays based on wether they are even or odd
*/

import java.util.Scanner;

public class EvenOddSplitter {

    // get even numbers
    public static void getEvens(int[] nums){
        int[] evenNums;
        int count = 0;

        for(int i = 0; i < nums.length;i++){
            if (nums[i]%2 == 0){
                count++;
            }
        }
        evenNums = new int[count];
        count = 0;
        for(int i = 0; i < nums.length;i++){
            if (nums[i]%2 == 0){
                evenNums[count] = nums[i];
                count++;
            }
        }

        System.out.print("Even numbers: ");
        for(int num : evenNums){
            System.out.print(num + " ");
        }
        System.out.println("");
    }


    //get odd numbers
    public static void getOdd(int[] nums){
        int[] oddNums;
        int count = 0;

        for(int i = 0; i < nums.length;i++){
            if (nums[i]%2 != 0){
                count++;
            }
        }
        oddNums = new int[count];
        count = 0;
        for(int i = 0; i < nums.length;i++){
            if (nums[i]%2 != 0){
                oddNums[count] = nums[i];
                count++;
            }
        }

        System.out.print("Odd numbers: ");
        for(int num : oddNums){
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        // Get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 15 integers, each separated by a space: ");
        int[] theNums = new int[15];

        for (int i = 0; i < theNums.length;i++) {
            theNums[i] = scanner.nextInt();
        }

        getEvens(theNums);
        getOdd(theNums);
        
        scanner.close();
    }

}
