import java.util.Scanner;

public class lastOcurance {

    public static int lastOcc(int arr[], int target){
        int low =0;
        int high =arr.length-1;
        int mid =0;
        int result= -1;
        
        while(low<= high){
          mid =(low+high)/2;
          if(arr[mid]==target){
            result=mid;
            low= mid+1;
          }
          else if(arr[mid]>target){
            high = mid-1;
          }
          else{
            low =low+1;
          }
          
        }

       
        return result;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int b[]= new int[n];
        System.out.println("enter element of array");

        for(int i=0; i<n; i++){
            b[i]=sc.nextInt();
        }
        System.out.println("enter target");
        int target = sc.nextInt();

      int res=lastOcc(b,target);

      System.out.println(res);
      sc.close();

    }
}
