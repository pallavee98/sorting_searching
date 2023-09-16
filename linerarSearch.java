import java.util.Scanner;

public class linerarSearch {

    public static int findtarget(int arr[], int target){
         for(int i=0; i<arr.length; i++){
           
            if( arr[i]== target){

              return i;
            }
            
         }

         return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("enter element of array");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter target ");
        int target =sc.nextInt();

       System.out.println(findtarget(a,target));

       sc.close();
    }
    
}
