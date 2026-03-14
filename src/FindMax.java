public class FindMax {
    public static double whoIsMax(double[] arr, int n){
        double max=arr[0];

        for(int i=1; i<n; i++){
            if(max<arr[i]) max=arr[i];
        }
        return max;
    }
}
