public class SelectionSort {
    public static void main(String[] args) {
        int arr[] ={3,5,1,6,0};
        int iteration =0;

        for(int i=0; i<arr.length; i++){
            int max = i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[max]){
                    max=j;
                    iteration +=1;
                }
            }

            if(max !=i){
                int temp =arr[i];
                arr[i]=arr[max];
                arr[max]=temp;
            }
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println(iteration);
    }
    
}
