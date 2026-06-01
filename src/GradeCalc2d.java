public class GradeCalc2d {
    public static void main(String[] args){
        String student[]={"tania","sadia","samia","sumaiya","jui"};

        double[][] grade={
            {4.0, 3.7, 3.3, 4.0, 3.0},
            {3.3, 3.0, 2.7, 3.7, 4.0},
            {2.7, 3.3, 4.0, 3.0, 3.7},
            {4.0, 4.0, 3.7, 3.3, 3.0},
            {3.0, 2.7, 3.3, 4.0, 3.7}
        };

        int[] credit= {4,3,2,4,3};

        int totalCre=0;
        for(int c: credit) totalCre+=c;

        System.out.println("Result: \n-----------------------------");

        for(int i=0; i<5; i++){
            double sum=0;
            for(int j=0; j<5; j++){
                sum+= grade[i][j]*credit[j];
            }
            double cg= sum/totalCre;
            System.out.printf("%s: %.2f%n", student[i], cg);
        }
    }
}
