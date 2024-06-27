import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList {
    public static void main(String[] args) {
        // Menggunakan ArrayList dengan tipe spesifik Integer
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);


        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d\n", 
                          l.get(0), l.size(), l.get(l.size() - 1));

        l.add(4);
        l.remove(0);

        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d\n", 
                          l.get(0), l.size(), l.get(l.size() - 1));

        LinkedList<String> names = new LinkedList<>();
        names.push("Mei-mei");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
        names.getFirst(), names.size(), names.getLast());
        System.out.println("Names: " + names.toString());

        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shanum");
        names.add("Uwais");
        names.add("Al-Qarni");

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", 
                          names.get(0), names.size(), names.get(names.size() - 1));

        names.set(0, "My kid");

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", 
                          names.get(0), names.size(), names.get(names.size() - 1));

        System.out.println("Names: " + names.toString());
    }
}