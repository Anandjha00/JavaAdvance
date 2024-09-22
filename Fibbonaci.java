import java.util.Scanner;
class Fibbonaci {
  public static void main(String[] args) {
    Scanner input =new Scanner (System.in);
    System.out.println("Print the fibbonacci series up to given number : \n");
    int num =input.nextInt();
    System.out.println("The Fibbonacci series is : \n");
    printFibbonacci(num);

  }  
  public static void printFibbonacci(int num) {
    if (num<0) return;
    System.out.print("0 ");
    if(num==0) return;
     
    int first=0,second=1;
    while (first+second<=num) {
      int third=first+second;
      System.out.print(+third +" ");
      first=second;
      second=third;
      
    }
 
    
  }
}
