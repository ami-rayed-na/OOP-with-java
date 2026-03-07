public class SimpleSeries {

    public static class Odd{
        public static void oddSeriesFor(int limit){
            for(int i=0; i <= limit; i++){
                System.out.print(2*i+1 + " ");
            }
        }
        public static void oddSeriesWhile(int limit){
            int i=0;
            while(i<= limit){
                System.out.print(2*i+1+" ");
                i++;
            }
        }
        public static void oddSeriesDoWhile(int limit){
            int i=0;
            do{
                System.out.print(2*i+1 + " ");
                i++;
            }while(i<= limit);
        }
    }

    public static class Even{
        public static void evenSeriesFor(int limit){
            for(int i=0; i <= limit; i++){
                System.out.print(2*i + " ");
            }
        }
        public static void evenSeriesWhile(int limit){
            int i=0;
            while(i<= limit){
                System.out.print(2*i+" ");
                i++;
            }
        }
        public static void evenSeriesDoWhile(int limit){
            int i=0;
            do{
                System.out.print(2*i + " ");
                i++;
            }while(i<= limit);
        }
    }
}
