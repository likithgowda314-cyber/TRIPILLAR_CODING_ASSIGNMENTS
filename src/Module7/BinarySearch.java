package Module7;
public class BinarySearch {
    public static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        for(int i :arr){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end = mid-1;
            }if(arr[mid]<target){
                start = mid+1;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        int target = 6;
        int index = search(arr,target);
        if (index == -1)
        {
            System.out.println("Element Not Found");
        }
        else
        {
            System.out.println(target + " is present in  " + index + " position of array");
        }
    }
}
