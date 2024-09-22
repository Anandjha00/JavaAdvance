public class SumAndAverage {
  public static void main(String[] args) {
    System.out.println(" Sum and Average Calculator ! \n");
    int[][] nums=Array2d.input2dArray(null);
    int sum=sum(nums);
    System.out.print("The sum of all the elements of given Array :"+ sum);
    float avg=ave(nums);
    System.out.print("\nThe average of given array is: "+avg);

  }

  public static int  sum(int[][] arr){
    int sum=0;
    int i=0;
    while (i<arr.length) {
      int j=0;
      while (j<arr[i].length) {
        sum=sum+arr[i][j];
        j++;
      }
      i++;
    }return sum;
  }

  public static float ave(int[][] arr){
    if (arr.length==0) {
      return 0;
    }
    int sum=sum(arr);
    int rows=arr.length;
    int columns= arr[0].length;
    float size=rows*columns;
    float avg =sum/size;
    return avg;
  } 
}
