// Note* Whie giving input dont give commas

import java.util.Arrays;
import java.util.Scanner;

public class Q1MergeArray {
   
    private static void mergeArrays(int[] A, int[] B, int m, int n) {
       
        int k = m + n + 1;

        while (m >= 0 && n >= 0) {
           
            if (A[m] > B[n]) {
                A[k--] = A[m--];
            } else {
                A[k--] = B[n--];
            }
        }

       
        while (n >= 0) {
            A[k--] = B[n--];
        }

       
        Arrays.fill(B, 0);
    }

    
    public static void rearrange(int[] A, int[] B) {
        
        if (A.length == 0) {
            return;
        }

       
        int k = 0;
        for (int value: A) {
            if (value != 0) {
                A[k++] = value;
            }
        }

       
        mergeArrays(A, B, k - 1, B.length - 1);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array A:");
        int sizeA = scanner.nextInt();
        int[] A = new int[sizeA];

        System.out.println("Enter the elements of array A (sorted with vacant cells represented by 0):");
        for (int i = 0; i < sizeA; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of array B:");
        int sizeB = scanner.nextInt();
        int[] B = new int[sizeB];

        System.out.println("Enter the elements of array B (sorted):");
        for (int i = 0; i < sizeB; i++) {
            B[i] = scanner.nextInt();
        }

        
        rearrange(A, B);

       
        System.out.println("Merged Array: " + Arrays.toString(A));

        
        scanner.close();
    }
}
