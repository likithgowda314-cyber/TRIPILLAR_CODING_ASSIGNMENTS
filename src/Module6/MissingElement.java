package Module6;
public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7};
        int n = arr.length+1;
        int totalsum = n*(n+1)/2;
        int sum =0;
        for(int i : arr){
            sum+=i;
        }
        int missing = totalsum-sum;
        System.out.println("Missing Element: "+missing);
    }
}