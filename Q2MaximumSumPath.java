// Note* Whie giving input dont give commas


import java.util.Scanner;

public class Q2MaximumSumPath {
  
    int max(int x, int y) {
        return (x > y) ? x : y;
    }

    int maxPathSum(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        
        int i = 0, j = 0;

        
        int result = 0, sum1 = 0, sum2 = 0;

       
        while (i < m && j < n) {
          
            if (arr1[i] < arr2[j])
                sum1 += arr1[i++];

                
            else if (arr1[i] > arr2[j])
                sum2 += arr2[j++];

                
            else {
               
                result += max(sum1, sum2) + arr1[i];

                sum1 = 0;
                sum2 = 0;

               
                i++;
                j++;
            }
        }

        
        while (i < m)
            sum1 += arr1[i++];

        
        while (j < n)
            sum2 += arr2[j++];

        
        result += max(sum1, sum2);

        return result;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q2MaximumSumPath maximumSumPath = new Q2MaximumSumPath();

        System.out.println("Enter the size of array 1:");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];

        System.out.println("Enter the elements of array 1:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of array 2:");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("Enter the elements of array 2:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        
        System.out.println("Maximum sum path is: " + maximumSumPath.maxPathSum(arr1, arr2));

        scanner.close();
    }
}
