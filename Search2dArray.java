import java.util.Scanner;

public class Search2dArray {

public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  int[][] nums= Array2d.input2dArray(null);
  System.out.println("Search element from 2d array !\n");
  System.out.print("Please enter the element you want to search : ");
  int number=input.nextInt();
  boolean search=search(nums, number);
  if (search==true) {
    System.out.println("Your number is found in the array !");
    
  }else{
    System.out.println("your number is not found in the array!");
  }


}  
public static boolean search(int[][] arr,int number){
  int i=0,j=0;
  while (i<arr.length) {
    while (j<arr[i].length) {
      if (arr[i][j]==number) {
        return true;
      }
      j++;
    }
    i++;
  }
  return false;
}
}