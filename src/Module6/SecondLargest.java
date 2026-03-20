package Module6;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5,2,7,55,9,67};
        int firstlargest = arr[0];
        int secondlargest = arr[1];
        for (int i = 2; i<arr.length; i++){
            if (arr[i] > firstlargest){
                secondlargest = firstlargest;
                firstlargest = arr[i];
            }
            else if (arr[i] > secondlargest && arr[i] != firstlargest){
                secondlargest = arr[i];
            }
        }
        System.out.println("The second largest number is " + secondlargest);
    }
}