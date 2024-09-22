import java.util.Scanner;
public class OddEven {
  public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.print("Odd or Even calculator \n\n ");
    System.out.print("Please enter a number :-");
    int  num=scanner.nextInt();


    if (num==0) {
      System.out.println(" Entered number is zero "+num);
    }
    else if (num%2==0) {
      System.out.print("Number is Even :"+num);
    }
    else{
      System.out.print("Number is Odd:"+num);
    }

  }
}
