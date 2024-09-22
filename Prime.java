import java.util.Scanner;
class Prime {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Prime number calculator ! \n");
    System.out.print("Please enter a number : ");
    int num=input.nextInt();
    int pri=pri(num);
    if (pri==0) {
      System.out.println("This is Prime number :" +num);
    }else{
      System.out.println("This is Composite number : " +num);
    }
  }

  public static int pri(int first){
    int i=2;
    int pr =0;
    while (i<first) {
      if (first%i==0) {
        pr=i;
      }
      i++;
    }
    return pr;
  }
}