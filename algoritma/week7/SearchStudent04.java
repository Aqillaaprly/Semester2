public class SearchStudent04 {
    Student04[] listStd = new Student04[5];
    int idx;

    public SearchStudent04(int amountStudent) {
        this.listStd = new Student04[amountStudent];
        this.idx =0;
    }

    public void add(Student04 std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    public void display() {
        for (Student04 student : listStd) {
            student.display();
            System.out.println("==========================================================");
        }
    }

    public int findSeqSearch(int search) {
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].nim == search) { 
                position = i;
                break;
            }
        }
        return position;
    }

    public void showPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + x + " is found in index -" + pos);
        } else {
            System.out.println("Data: " + x + " is not found");
        }
    }

    public void showData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t: " + x);
            System.out.println("Name \t: " + listStd[pos].name);
            System.out.println("Age \t: " + listStd[pos].age);
            System.out.println("IPK \t: " + listStd[pos].gpa);
        } else {
            System.out.println("Data " + x + " is not found");
        }
    }

    public int findBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right) /2;
            if(cari == listStd[mid].nim){
                return (mid);
            }else if(listStd[mid].nim > cari){
                return findBinarySearch(cari, left, mid-1);
            } else{
                return findBinarySearch(cari, mid +1, right);
            }
        }
        return -1;
    }

    public void bubbleSort() {
        int n = listStd.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (listStd[j].nim > listStd[j+1].nim) {
                    Student04 temp = listStd[j];
                    listStd[j] = listStd[j+1];
                    listStd[j+1] = temp;
                }
            }
        }
    }

    public int findByNameSeqSearch(String name) {
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].name.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public void showPositionByName(String name, int pos) {
        if (pos != -1) {
            System.out.println("Data " + name + " is found in index-" + pos);
        } else {
            System.out.println("Data " + name + " is not found");
        }
    }

    public void showData(String name, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t : " + listStd[pos].nim);
            System.out.println("Name \t : " + name);
            System.out.println("Age \t : " + listStd[pos].age);
            System.out.println("GPA \t : " + listStd[pos].gpa);
        } else {
            System.out.println("Data : " + name + " is not found");
        }
    }
}
