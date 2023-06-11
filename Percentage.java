//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Percentage {
  public static void main(String[] args){
    int totalmarks;
    int maxmarks;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter total marks");
    totalmarks=sc.nextInt();
    System.out.println("enter the maximum marks");
    maxmarks=sc.nextInt();
    double percentage=maxmarks%totalmarks*100;
    int a=(int)percentage;
    System.out.println(a);
  }

//Define the main method

//Declare the variables

//Use the scanner class to provide total_marks and maximum_marks at execution time
/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the total marks");
total_marks= scanner.nextInt();
System.out.println("Enter maximum marks possible "); 
maximum_marks=scanner.nextInt(); 
*/


//Calculate the percentage of marks

//Print the Result

}