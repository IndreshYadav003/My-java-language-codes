public class inversionOfMergeSortMethod2 {
    static int count=0;
    public static void printArray(int []array){
        for(int element:array) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
    public static  void inversion(int []arr1,int []arr2){
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                count+=(arr1.length-i);
                j++;
            }else
                i++;
        }
    }
    //create function to merge two  sorted array
    public static void mergeTwoSortedArray(int []arr1,int []arr2, int []mergeArray){
        int n= arr1.length;
        int m= arr2.length;
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(arr1[i]<=arr2[j])mergeArray[k++]=arr1[i++];
            else {mergeArray[k++]=arr2[j++];
          }
        }
        while(i<n)mergeArray[k++]=arr1[i++];
        while(j<m)mergeArray[k++]=arr2[j++];
    }
    //main function of mergeSort
    public static void mergeSortfunction(int []newarray){
        int n=newarray.length;
        if (n==1)return;//base case
        //array divided into two part of array n,n-n/2,array size odd
        //first create two sub array
        int []arr1=new int[n/2];
        int []arr2=new int[n-n/2];
        //copy element in small arrays
        for(int i=0;i<n/2;i++){
            arr1[i]=newarray[i];
        }
        for(int i=0;i<n-n/2;i++) {
            arr2[i]=newarray[i+n/2];
        }
        //call function
        mergeSortfunction(arr1);
        mergeSortfunction(arr2);
        inversion(arr1,arr2);
        //merge tow sorted arrays
        mergeTwoSortedArray(arr1,arr2,newarray);
    }

    public static void main(String[] args) {
        count=0;
       int []array={8,2,5,3,1,4};
        System.out.println(" my array");
        printArray(array);
        System.out.println("Number of inversion");
        mergeSortfunction(array);
        System.out.print(count);

    }
}
