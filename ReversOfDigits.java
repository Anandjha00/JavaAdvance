import java.util.Scanner;
class ReversOfDigits {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Reverse the digits of given integer: \n");
    System.out.print("Please enter a integer : ");
    int num= input.nextInt();
    int rev=rev(num);
    System.out.println("The reverse number is : " +rev );
  }

  public static int  rev(int first){
    
    int newnumber=0;
    while (first>0) {
      int digit = first%10;
      newnumber=newnumber*10+digit;
      first=first/10;
      

    }

    
    
    return newnumber;

  }
}


