public class circleArea {
    public static double areaOfCircle (int r){
        double PIE= 3.14;
        return PIE *Math.pow(r, 2);
    }

    public static void main (String[] args){
        System.out.println("Answer is "+ areaOfCircle(5));
    }
}
