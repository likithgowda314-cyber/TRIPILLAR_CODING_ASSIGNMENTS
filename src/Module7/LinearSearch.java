package Module7;

public class LinearSearch {
    public static int search(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1,4,2,5,6};
        int target = 6;
        int index = search(arr,target);
        if (index == -1){
            System.out.println("Not Found");
        }else {
            System.out.println(target + " is present in  " + index + " position of array");
        }
    }
}
