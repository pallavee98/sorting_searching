public class totalOne {
    public static int oneInArray(int arr[],int n){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
               count +=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1 [] = {0,0,0,0,1,1,1,1,1,1};
        int arr2 [] = {0,0,0,0,0,1,1};
        int x =1;

        int count1=oneInArray(arr1,x);
        int count2=oneInArray(arr2,x);
        System.out.println(count1);
        System.out.println(count2);

    }
    
}
