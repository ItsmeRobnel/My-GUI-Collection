
package robnel;

import java.util.Scanner;

public class TwoDArr {
    public static void main(String []args){
        int i,j;
        int arr[][] = new int[4][4];
        
        Scanner sc = new Scanner(System.in);
        for(i = 0; i < 4; i++){
            System.out.println("\nEnter a number");
            for(j = 0; j < 4; j++){ 
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nThe two dimensional array has a value of:");
        for (i = 0; i < 4; i++){
            for(j = 0; j < 4; j++){
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
        System.out.println("\nThe half of two dimensional array has a value of:");
        for (i = 0; i < 4; i++){
            for (j = 0; j < 4; j++){
                if (i <= j)
                {
                    System.out.print(arr[i][j] + " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
