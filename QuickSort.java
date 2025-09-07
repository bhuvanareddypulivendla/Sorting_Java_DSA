public class QuickSort{
    static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=(low-1);

        for(int j=low;j<high;j++){ //it traverse array till low to high-1
            if(arr[j]<pivot){
                i++;

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }
    static void quicksort(int arr[],int low,int high){
        if(low<high){
        int pi=partition(arr,low,high);

        quicksort(arr,low,pi-1);
        quicksort(arr,pi+1,high);
    }
}
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[]={7,2,4,6,9,1,8};
        int n=arr.length;

        QuickSort qs=new QuickSort();
        qs.quicksort(arr,0,n-1);

        System.out.println("Sorted Array:");
        qs.printArray(arr);
    }
}