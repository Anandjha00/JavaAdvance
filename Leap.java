import java.util.Scanner;
public class Leap {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Finding the Year is Leap or Not \n");
    System.out.print("Enter a year :");
    int year =input.nextInt();

    if (year%4==0) {
      System.err.println("This year is a leap year :" +year);
    }else if (year%100==0 && year%400==0) {
      System.out.println("This Year is a leap year:" +year);
    }else{
      System.out.println("This Year is not a leap year!");
    }
    }

  
  
}
