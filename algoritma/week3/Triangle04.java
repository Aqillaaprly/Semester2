public class Triangle04 {
    public int base;
    public int height;


    public Triangle04 (int a, int t){
        base = a;
        height = t;
    }

    public double countArea(){
        return 0.5*base*height;
    }

    public double countPerimeter(){
        double sideLength = Math.sqrt(base*base + height*height);
        return 3*sideLength;
    }
}
