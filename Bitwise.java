import java.util.Scanner;;
public class Bitwise {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Odd Even calculator:\n");
    System.out.print("Please enter your number: ");
    int num=input.nextInt();

    if ((num &1)==1) {
      System.out.println("Entered number is Odd !");
    }else{
      System.out.println("Entered number is Even !");
    }
  }
}
