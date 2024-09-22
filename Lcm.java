import java.util.Scanner;
public class Lcm {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("LCM calculator ! \n");
    System.out.print("Please enter the first number : ");
    int num1=input.nextInt();
    System.out.print("Please enter the second number: ");
    int num2=input.nextInt();
    int lcm=lcm(num1, num2);
    System.out.println("LCM is : " +lcm);
     
  }

  public static int  lcm(int num1, int num2){
    
    int i=1;
    int tab=1;
    while (i<=num2) {
      tab= num1*i;
      if (tab%num2==0) {
       return tab;
      }
      i++;
    }
    return 0;
  }






}
