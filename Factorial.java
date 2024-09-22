import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    System.out.println("Finding 'Factorial' of a given number \n\n");   
    fact();
  }
  public static void fact () {
    Scanner input= new Scanner(System.in);
    System.out.print("PLease enter a number : ");
    int num= input.nextInt();

    int i=num;
    long fact=1;
    while (i>=2) {
      fact=fact*i;
      i--;
    }
    System.out.println("Factorical is : "+ fact);
  }
  }
