public class insertionsort {
    public static void main(String[] args) {
        int arr[] ={3,5,1,6,0};

        for(int i=0; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j]>arr[j-1]){
                 int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
            }
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
