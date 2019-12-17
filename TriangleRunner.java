import static java.lang.Math.sqrt;

public class TriangleRunner {
    public static void main(String[] args) {
        Triangle triangle[] = {new Triangle(2, 2, 5, 6, 8, 8), new Triangle(4, 6, 7, 6, 8, 2), new Triangle(5, 7, 9, 11, 17, 21)};
        double area = 0;
        for (int i = 0; i < triangle.length; i++) {
            double AB = sqrt((triangle[i].X2 - triangle[i].X1) * (triangle[i].X2 - triangle[i].X1) + (triangle[i].Y2 - triangle[i].Y1) * (triangle[i].Y2 - triangle[i].Y1));
            double BC = sqrt((triangle[i].X3 - triangle[i].X2) * (triangle[i].X3 - triangle[i].X2) + (triangle[i].Y3 - triangle[i].Y2) * (triangle[i].Y3 - triangle[i].Y2));
            double CA = sqrt((triangle[i].X3 - triangle[i].X1) * (triangle[i].X3 - triangle[i].X1) + (triangle[i].Y3 - triangle[i].Y1) * (triangle[i].Y3 - triangle[i].Y1));
            double angles[] = TriangleProcessor.angleFounder(AB, BC, CA);
            boolean isRight = false;
            for (int j = 0; j < angles.length; j++) {
                if (angles[j] == 0)
                    isRight = true;
            }
            area = TriangleProcessor.countArea(AB, BC, CA);
            double perimeter = TriangleProcessor.countPerimeter(AB, BC, CA);
            int triangleNum = i + 1;
            System.out.println("Area of the " + triangleNum + " triangle is: " + area + ", perimeter is: " + perimeter);

            if(AB == BC && AB == CA && BC == CA){
                System.out.println("Triangle number " + triangleNum + " is equilateral!!!");
            }
            else if(AB == BC || AB == CA || BC == CA){
                System.out.println("Triangle number " + triangleNum + " is isosceles!!!");
            }
            else if(isRight == true){
                System.out.println("Triangle number " + triangleNum + " is right triangle!!!");
            }
            else if(isRight != true && AB == BC && AB == CA && BC == CA){
                System.out.println("Triangle number " + triangleNum + " is random triangle!!!");
            }
        }
    }
}
