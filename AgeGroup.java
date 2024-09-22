import java.util.Scanner;
public class AgeGroup {
public static void main(String[] args) {
  Scanner input =new Scanner(System.in);
  System.out.println("Categorize the persons into different age group \n");
  System.out.print("Please enter your age :");
  int age=input.nextInt();


  if (age<=13) {
    System.out.println("you are a Child !");
  }else if (age>13 && age<=20) {
    System.out.println("you are Teen !");
  }else if (age>20 && age<=60) {
    System.out.println("You are an Adult !");
  }else{
    System.out.println("you are an Old man !");
  }
}
}
