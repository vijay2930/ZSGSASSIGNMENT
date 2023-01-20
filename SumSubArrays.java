class SumSubArrays{
    public static void sum(int arr[]){
        int start=0;
        int end=arr.length;
        int mid=(start+end)/2;
        while(true){
            int sum1=0;
            int sum2=0;
            for(int i=0;i<mid;i++){
                sum1+=arr[i];
            }
            for(int i=mid;i<end;i++){
                sum2+=arr[i];
            }
            if(sum1==sum2){
                break;
            }
            else if(sum1<sum2){
                mid++;
            }
            else if(sum1>sum2){
                mid--;
            }
        }
        System.out.println("Array 1");
        for(int i=start;i<mid;i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println("\nArray 2");
        for(int i=mid;i<end;i++){
            System.out.printf("%d ",arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,5};
        sum(arr);
    }
}