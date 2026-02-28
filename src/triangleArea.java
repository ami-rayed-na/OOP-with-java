public class triangleArea{
    public static double areaOfTriangle(int b, int h) {
        return 0.5 * b *h;
    }

    public static double areaOfTriangle_s(int a, int b, int c){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public static double areaOf_EquilateralTriangle(int a){
        return Math.sqrt(3)/4 * Math.pow(a,2);
    }

    public static void main (String[] args){
    double ans = areaOfTriangle(5,10);
    
    System.out.println("answer is " + ans);
    System.out.println("Area using Heron is " + areaOfTriangle_s(3,4,5));
    System.out.printf("Area of equilateral trianle is %.2f " , areaOf_EquilateralTriangle(3));

}
}


