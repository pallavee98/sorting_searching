public class one {
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};
        int pass=0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    pass +=1;
                }

                
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println(pass);
    }
    
}
