import java.util.Scanner;
class Gcd {
  public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("GCD calculator ! \n");
    System.out.println("Please enter a number : ");
    int first=input.nextInt();
    System.out.println("Please enter the second number : ");
    int second=input.nextInt();
    int gcd = gcd(first, second);
    System.out.print("Greatest comman factor is : " +gcd);

  }

  public static int gcd(int first,int second) {
   
   int gc=1;
   int i=1;
   while (i<=second) {
    if (first%i==0 && second%i==0) {
       
       gc=i;
      
    }i++;
    
   }

    return gc;
  }
}
