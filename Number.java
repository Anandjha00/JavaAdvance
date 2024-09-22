import java .util.Scanner;
public class Number {

  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int num;

    System.out.print("Finding the number is negative ,positive or zero \n");
    System.out.println("Please enter the number: ");
    num=input.nextInt();


   if(num>=1){
    System.out.println("Number is positive: " +num);
   }
   else if (num<0) {
    System.out.println("Number nis negative:"+num); 
   }
   else{
   System.out.println("Number is Zero "+num);
  }
}
}