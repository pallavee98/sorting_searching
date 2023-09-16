import java.util.Scanner;

class   FrequencyTarget{

    public static int FirstOcurrance(int arr[], int target){
        int low=0;
        int high= arr.length-1;
        int mid =0;
        int fcount =-1;

        while(low<=high){
            mid = low+(high-low)/2;
            
            if(arr[mid]== target){
                fcount=mid;
                high =mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else 
            low=mid+1;
        }
        return fcount;
    }


    public static int LastOcurrance(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        int lcount =-1;

        while(low<=high){
            mid=low+(high-low)/2;

            if(arr[mid]==target){
                lcount=mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high =mid-1;
            }
            else
            low= mid+1;
        }
        return lcount;

    }


    public static void main(String[] args) {
        int arr[] ={2,5,5,5,6,6,8,9,9,9};
        System.out.println("enter num whose frequency you want to calculate");

        Scanner sc= new Scanner(System.in);
        int target =sc.nextInt();
        System.out.println("calculating");

        int first= FirstOcurrance(arr, target);
        int last =LastOcurrance(arr, target);

        // System.out.println((last-first+1));
        // System.out.println("call");

        if(first==last && first==-1){
            System.out.println("not found in array");


        }
        else
        System.out.println(last-first+1);
        sc.close();

      





    }
    
}  