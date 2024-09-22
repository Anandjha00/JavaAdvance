import java.util.Scanner;
public class MultiplicationTable {
  public static void main(String[] args) {
    System.out.println("Welcome to table Calculator !\n\n");
    table();
  }

  public static void table(){
    Scanner input=new Scanner(System.in);
    System.out.print("Please enter a number:");
    int num=input.nextInt();
    
    int i=1;
    while (i<=10) {
    // int tab=num*i;
      System.out.println(num +" x " +i+ " = " +(num*i));
      i++;
    }
  
  }
}
