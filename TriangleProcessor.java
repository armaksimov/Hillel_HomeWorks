import static java.lang.Math.sqrt;

public class TriangleProcessor {
    public static double countArea(double a, double b, double c){
        double perimeter = countPerimeter(a, b, c);
        double halfPerimeter = perimeter/2;
        //2 sqrtp (p−a) (p−b) (p−c)
        double height = (2 * sqrt((0.5 * halfPerimeter) * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c))) / a;
        return a * height * 0.5;
    }
    public static double countPerimeter(double a, double b, double c){
        return a + b + c;
    }
    public static double[] angleFounder(double a, double b, double c){
        double cosineOfFirstAngle = (pow(c, 2) - pow(a, 2) + pow(b, 2)) / 2 * c * b;
        double cosineOfSecondAngle = (pow(a, 2) - pow(c, 2) + pow(b, 2)) / 2 * a * b;
        double cosineOfThirdAngle = (pow(a, 2) - pow(b, 2) + pow(c, 2)) / 2 * c * a;
        double angles[] = new double[]{cosineOfFirstAngle, cosineOfSecondAngle, cosineOfThirdAngle};
        return angles;
    }
    public static double pow(double a, int pow){
        for (int i = 0; i < pow; i++) {
            a *= a;
        }
        return a;
    }
}
