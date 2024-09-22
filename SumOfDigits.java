import java.util.Scanner;
public class SumOfDigits {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Sum of digits of given integer !\n\n");
    System.out.print("Please enter a number :");
    int num=input.nextInt();
    int add=sum(num);
  }

  public static int sum(int num){
    int add=0;
    while (num>0) {
      add = add+ num%10;
      num = num/10;
      
    }System.out.println("Sum of digits of a given number is :" + add);
      
    return add;
    }
  }

