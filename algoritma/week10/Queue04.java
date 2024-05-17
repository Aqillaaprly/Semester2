public class Queue04{
int max, size, front, rear, q;

    public Queue04(int n){
        max = n;
        Create();
    }

    public void Create(){
        q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull(){
        if(!isEmpty()){
            System.out.println("The first element : " + q[front]);
        }else{
            System.out.println("Queue is still empty");
        }
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println("The first element :" + q[front]);
        }else{
            System.out.println("Queue is still empty ");
        }
    }

    public void print(){
        if(!isEmpty()){
            System.out.println("Queue is still empty");
        }else {
            int i = front;
            while (i != rear) {
                System.out.println(q[i] +" ");
                i = (i+1) %max;
            }
            System.out.println(q[i]+"");
            System.out.println("Element amount :" +size);
        }
    }    

    public void clear(){
        
    }
}