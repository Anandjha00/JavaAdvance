import java.util.Scanner;

public class Grades {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int fmarks,ymarks;
    float avg;
    System.out.println("Finding Grade On The Base Of Marks\n");
    
    System.out.print("Enter the full marks: ");
    fmarks=input.nextInt();
    System.out.print("Enter what is your score :");
    ymarks=input.nextInt();

    avg = (ymarks*100)/fmarks;

    if (avg>=90) {
      System.out.println("Congratulations! your grade is A ");
    }else if (avg>=75 && avg<90) {
      System.out.println("Congratulations! your grade is B ");
    }else if (avg>=60 && avg<75) {
      System.out.print("your grade is C ");
    }else if (avg>=30 && avg<60) {
      System.out.println("your grade is D ");
    }else{
      System.out.println("Bad Luck! your grade is F ! Try again ");
    }

  }
}
