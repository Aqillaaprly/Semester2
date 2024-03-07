public class TriangleMain04 {

    public static void main(String[] args) {
        Triangle04[] TriangleArray = new Triangle04[4];

        TriangleArray[0] = new Triangle04(10, 4);
        TriangleArray[1] = new Triangle04(20, 10);
        TriangleArray[2] = new Triangle04(15, 6);
        TriangleArray[3] = new Triangle04(25, 10);


        for(int i=0; i < 4; i++){
        System.out.println("Area " +  TriangleArray[i].countArea());
        System.out.println("Perimeter " + TriangleArray[i].countPerimeter());
        }
    }
    
    
}
