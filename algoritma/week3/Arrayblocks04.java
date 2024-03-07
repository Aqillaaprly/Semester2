public class Arrayblocks04 {
    public static void main(String[] args) {
        Blocks04[]blArray = new Blocks04[3];

        blArray[0] = new Blocks04(100, 30, 12);
        blArray[1] = new Blocks04(120, 40, 15);
        blArray[2] = new Blocks04(210, 50, 25);

        for(int i = 0; i<3; i++){
            System.out.println("Volume blocks = " + i + ":" + blArray[i].countVolume());
        }
    }
    
}
