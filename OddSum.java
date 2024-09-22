import java.util.Scanner;
public class OddSum {
  public static void main(String[] args) {
    System.out.println("Adding all 'Odd' numbers til the given number\n\n");
    oddsum();
  }

  public static int oddsum(){
    Scanner input= new Scanner(System.in);
    System.out.print("Please enter a number : ");
    int num=input.nextInt();

    int i=1;
    int sum=0;
    while (i<=num) {
      if (i%2!=0) {
        sum=sum+i;
      }
      i++;
    }
    System.out.println("The sum of all Odd numbers from 1 to " + num +" is : "+sum);
    return sum;
  }
}
