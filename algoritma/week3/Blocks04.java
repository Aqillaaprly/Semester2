public class Blocks04 {
    public int width, length, height;

    public Blocks04(int p, int l, int t){
        length = p;
        width = l;
        height = t;
    }

    public int countVolume(){
        return length*width*height;
    }
}
