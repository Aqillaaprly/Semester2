import java.util.Scanner;

public class ArrayofObject04 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number of rectangles: ");
        int arrayLength = sc.nextInt();

        Rectangle04[] rectangleArray = new Rectangle04[arrayLength];

        for (int i = 0; i < arrayLength; i++){
            rectangleArray[i] = new Rectangle04();
            System.out.println("Rectangle " + (i + 1));

            System.out.println("Input length : ");
            rectangleArray[i].length = sc.nextInt();

            System.out.println("Input width : ");
            rectangleArray[i].width = sc.nextInt();
        }

        for (int i = 0; i < arrayLength; i++){
            System.out.println("Rectangle " + (i + 1));
            System.out.println("width: " + rectangleArray[i].width + ", length: " + rectangleArray[i].length);
        }
    }

    

    
    
    
    
    
    
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle04[] rectangleArray = new Rectangle04[3];

        for (int i = 0; i < 3; i++){
            rectangleArray[i] = new Rectangle04();
            System.out.println("Rectangle " +i);

            System.out.println("Input length : ");
            rectangleArray[i].length = sc.nextInt();

            System.out.println("Input width : ");
            rectangleArray[i].width = sc.nextInt();
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Rectangle " + i);
            System.out.println("width: " + rectangleArray[0].width + "length : " + rectangleArray[0].length);

        }

 /**  rectangleArray[0] = new Rectangle04();
        rectangleArray[0].length = 110;
        rectangleArray[0].width = 30;

        rectangleArray[1] = new Rectangle04();
        rectangleArray[1].length = 80;
        rectangleArray[1].width = 40;

        rectangleArray[2] = new Rectangle04();
        rectangleArray[2].length = 100;
        rectangleArray[2].width = 20;

        System.out.println("First rectangle, width: " + rectangleArray[0].width + ", length: " + rectangleArray[0].length);
        System.out.println("Second rectangle, width: " + rectangleArray[1].width + ", length: " + rectangleArray[1].length);
        System.out.println("Third rectangle, width: " + rectangleArray[2].width + ", length: " + rectangleArray[2].length); /** */
    }
/** */
