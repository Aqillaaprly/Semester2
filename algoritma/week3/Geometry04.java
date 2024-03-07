import java.util.Scanner;

public class Geometry04 {
    public static void main(String[] args) {
        Sphere04[] sp = new Sphere04[3];
        SquarePyramid04 sqp[] = new SquarePyramid04[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.print("radius sphere : ");
            int rSphere = sc.nextInt();
            sp[i] = new Sphere04(rSphere);

            System.out.print("Side square pyramid : ");
            int ssPyramid = sc.nextInt();
            System.out.print("Height square pyramid :  ");
            int hPyramid = sc.nextInt();
            sqp[i] = new SquarePyramid04(ssPyramid,hPyramid);
        }
        for(int i=0;i<3;i++){
            System.out.println("Sphere volume "+i+":"+sqp[i].calcVol());
            System.out.println("Surface of Sphere "+i+":"+sqp[i].calcSurface());
            System.out.println("Square pyramid volume"+i+":"+sp[i].calcVol());
            System.out.println("Surface of Square Pyramyd"+i+":"+sp[i].calcSurface());
        }
    }
}
    

