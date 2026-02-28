import java.util.*;
public class array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n=sc.nextInt();
        int i;
        int arr[]=new int[n];
        System.out.println("Enter" + n + "elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
