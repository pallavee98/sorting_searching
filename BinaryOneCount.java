public class BinaryOneCount {
    public static int oneInArra(int arr[]){
       
        int low =0;
        int high =arr.length-1;
        int mid =0;

        while(low<=high){
            mid=low+(high-low)/2;

            if(arr[mid]==0){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return arr.length-low;

        
    }
    public static void main(String[] args) {
        int arr1 [] = {0,0,0,0,1,1,1,1,1,1};
        int arr2 [] = {0,0,0,0,0,1,1};
        

        int count1=oneInArra(arr1);
        int count2=oneInArra(arr2);
        System.out.println(count1);
        System.out.println(count2);
    }
    
}
