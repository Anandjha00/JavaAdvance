import java.util.Scanner;
public class Compare {
  public static void main(String[] args) {
    Scanner number=new Scanner(System.in);
    System.out.println("Compare and find the greatest number ");
    int num1,num2,num3;


   System.out.print(" The first number :");
   num1=number.nextInt();

   System.out.print("The second number :");
   num2= number.nextInt();

   System.out.print("The third number : "); 
   num3= number.nextInt();


    if (num1>num2 && num2>num3) {
      System.err.println("First number is greatest number :"+num1);
    }
    else if (num2>num1 && num1>num3) {
      System.err.println("The Second number is greatest number : " +num2);
    }
    else{
      System.out.println("The third number is the greatest number:"+num3);
    }

  }
}
