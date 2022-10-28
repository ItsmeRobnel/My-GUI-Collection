
package robnel;
import java.util.Scanner;

public class Robnel {

   
    public static void main(String[] args) {
       int i,j;
       int arr[][] = new int[4][4];
       Scanner sc = new Scanner(System.in);
       
       // Entering Elements on the Array
       
       for(i = 0; i<4;i++){
           System.out.println("Enter the 4 values: ");
           for(j=0;j<4;j++){
               arr[i][j] = sc.nextInt();
           }System.out.println();
       }
       //Displaying the values of the 2d array
        System.out.println("The elements int he 2d Array are");
       for(i=0 ;i<4;i++){
           for(j=0;j<4;j++){
               System.out.print(arr[i][j]+ " ");
           }System.out.println();
       }
       //Displaying the half of the array
        System.out.println("========The half of the 2d array is=========");
       for(i=0;i<4;i++){
           for(j=0;j<4;j++){
               if(i<=j){
                   System.out.print(arr[i][j] + " ");
               }else System.out.print(" ");
                   
           } System.out.println();
       }
    }
    
}
