public class StudentMain{
    public static void main(String[] args) {
        StudentsQueue queue = new StudentsQueue(5);
    
        Students s1 = new Students("001", "Ana", 3, 3.5);
        Students s2 = new Students("002", "Bobi", 2, 3.8);
        Students s3 = new Students("003", "Chandra", 1, 3.2);
        Students s4 = new Students("004", "Dian", 4, 3.9);
        Students s5 = new Students("005", "Ela", 2, 3.7);
    
        queue.enqueue(s1);
        queue.enqueue(s2);
        queue.enqueue(s3);
        queue.enqueue(s4);
        queue.enqueue(s5);
    
        queue.print(); 
        queue.peek(); 
        queue.peekRear(); 
        queue.peekPosition("003"); 
        queue.printStudents(3); 
    }
}
