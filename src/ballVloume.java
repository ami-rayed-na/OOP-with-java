public class ballVloume {
    public static double volumeOfBall(int r){
        double PIE=3.14;
        return 4/3 * PIE * Math.pow(r,3); 
    }

    public static void main (String[] args){
        double ans= volumeOfBall(5);

        System.out.println("Answer is "+ ans);
    }
}
