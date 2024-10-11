//This program computes the sum of the digits in an integer

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//User input digits
    System.out.print("Enter integer(s): ");
    long number = input.nextLong();

//Display the sum with messsage
    System.out.println("The sum of the digits in " + number + " is " + sum(number));
    }

//Calculations for the sum of the digits
    public static long sum(long n){
      int sum = 0;
      while (n>0) {
        sum += n % 10;
        n /= 10;
      }
      return sum;
  }
}  