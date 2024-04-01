public class studentlist04 {
    student04 list[] = new student04[5];
    int idx;

    void add(student04 std) {
        if (idx < list.length) {
            list[idx] = std;
            idx++;
        } else {
            System.out.println("The Student list is already full-filled");
        }
    }

    void print() {
        for (student04 s : list) {
            s.print();
            System.out.println("========================================================");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].gpa > list[j - 1].gpa) {
                    student04 tmp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < list.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].gpa < list[idxMin].gpa) {
                    idxMin = j;
                }
            }

            student04 tmp = list[idxMin];
            list[idxMin] = list[i];
            list[i] = tmp;
        }
    }

    void insertionSort(boolean asc){
        for (int i = 0; i<list.length; i++){
            student04  tmp = list[i];
            int j = i ;
            if(asc){
            while(j>0 && list[j-i].gpa >tmp.gpa){
                list[j] = list[j-i];
                j --;
            }
        }else {
            while(j>0 && list[j-i].gpa >tmp.gpa){
                list[j] = list[j-i];
                j --;
        }
    }
    list [j+1] = tmp;
    }
}
}
