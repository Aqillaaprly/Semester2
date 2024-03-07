import java.util.Scanner;

public class Array2D04 {
    public static void main(String[] args) {
        
        Rectangle2D[][] rectangleGrid = new Rectangle2D[3][3];

        rectangleGrid[0][0] = new Rectangle2D(10, 20);
        rectangleGrid[0][1] = new Rectangle2D(15, 25);
        rectangleGrid[0][2] = new Rectangle2D(20, 30);
        rectangleGrid[1][0] = new Rectangle2D(25, 35);
        rectangleGrid[1][1] = new Rectangle2D(30, 40);
        rectangleGrid[1][2] = new Rectangle2D(35, 45);
        rectangleGrid[2][0] = new Rectangle2D(40, 50);
        rectangleGrid[2][1] = new Rectangle2D(45, 55);
        rectangleGrid[2][2] = new Rectangle2D(50, 60);

        System.out.println("Rectangle at (0, 0): length=" + rectangleGrid[0][0].length + ", width=" + rectangleGrid[0][0].width);
        System.out.println("Rectangle at (1, 2): length=" + rectangleGrid[1][2].length + ", width=" + rectangleGrid[1][2].width);
        System.out.println("Rectangle at (2, 1): length=" + rectangleGrid[2][1].length + ", width=" + rectangleGrid[2][1].width);
    }
}
