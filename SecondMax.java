

import java.util.Scanner;

public class SecondMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0 ; i<n ;i++){
            a[i] = sc.nextInt();
        }

        int max=a[0];
        int secondMax=a[0];
        for(int i = 1 ; i < n ; i++){
           if(a[i] > max){
             secondMax = max;
            max = a[i];
           }else if(a[i] > secondMax && a[i]!=max){
              secondMax = a[i];
           }
        }
        
        System.out.println("First Max = "+max);
        System.out.println("Second Max = "+secondMax);

        sc.close();
    }
}




