class duplicate{
    public static void main(String[] args) {
        int arr[] ={2,3,4,7,10};
        int duplicate =-1;

        for(int i=1;i<arr.length; i++){
           if(arr[i]==arr[i-1]){
            duplicate =i-1;
           }
        }

        if(duplicate!=-1){
            System.out.println("duplicate at" + duplicate);
        }
        else{
            System.out.println("no duplicate");
        }

    }
}