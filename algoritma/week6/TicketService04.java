public class TicketService04 {
    Ticket04[] tickets;
    int size;

    public TicketService04(int capacity) {
        tickets = new Ticket04[capacity];
        size = 0;
    }

    public void add(Ticket04 t) {
        if (size < tickets.length) {
            tickets[size++] = t;
        } else {
            System.out.println("Ticket service already full");
        }
    }

    public void displayAll() {
        for (Ticket04 t : tickets) {
            System.out.println("Airlines: " + t.airlines + ", Destination: " + t.destination +
                    ", Origin: " + t.origin + ", Price: " + t.price);
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (tickets[j].price > tickets[j + 1].price) {
                    Ticket04 tmp = tickets[j];
                    tickets[j] = tickets[j + 1];
                    tickets[j + 1] = tmp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < size; j++) {
                if (tickets[j].price < tickets[minIdx].price) {
                    minIdx = j;
                }
            }
            Ticket04 tmp = tickets[minIdx];
            tickets[minIdx] = tickets[i];
            tickets[i] = tmp;
        }
    }
}
