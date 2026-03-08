public class SeriesSum {
    int sum =0;
    public int evenSeries(int limit){
        sum =0;
        for(int i=2; i<=limit; i+=2){
            sum+=i;
        }
        return sum;
    }

    public int oddSeries(int limit){
        sum=0;
        for(int i=1; i<=limit; i+=2){
            sum+=i;
        }
        return sum;
    }
}
