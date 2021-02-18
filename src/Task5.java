public class Task5 {

    public static double triangleArea(int a, int b, int c){
        double s = (a+b+c) / 2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
