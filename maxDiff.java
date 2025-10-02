/*
Name: Madeline Puryear
Date: 10/2/2025
Description:  Finds the maximun difference between the smallest and largest numbers
*/

import java.util.Scanner;
public class maxDiff {
  public static void maxDifference(int[] nums){
        int max = nums[0];
        int min = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            } else if(nums[i] < min){
                min = nums[i];
            }
        }
        int theMaxDiff = max / min;
        System.out.println("The Maximum Difference: " + theMaxDiff);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many numbers will you enter? ");
        int len = scanner.nextInt();
        int[] theNums = new int[len];
        scanner.nextLine();
        
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < theNums.length;i++) {
            theNums[i] = scanner.nextInt();
        }
        
        maxDifference(theNums);
        scanner.close();
    }
}
