public class MainTicket04 {
    public static void main(String[] args) {
        TicketService04 ticketService04 = new TicketService04(5);
        ticketService04.add(new Ticket04("Airlines1", "Destination1", "Origin1", 300));
        ticketService04.add(new Ticket04("Airlines2", "Destination2", "Origin2", 200));
        ticketService04.add(new Ticket04("Airlines3", "Destination3", "Origin3", 400));
        ticketService04.add(new Ticket04("Airlines4", "Destination4", "Origin4", 100));
        ticketService04.add(new Ticket04("Airlines5", "Destination5", "Origin5", 500));

        System.out.println("========================================================================");
        System.out.println("Unsorted Tickets :");
        ticketService04.displayAll();
        System.out.println("========================================================================");

        System.out.println("========================================================================");
        ticketService04.bubbleSort();
        System.out.println("Tickets sorted by price in acending order (Bubble Sort)");
        ticketService04.displayAll();
        System.out.println("========================================================================");

        System.out.println("========================================================================");
        ticketService04.selectionSort();
        System.out.println("Tickets sorted by price in acending order (Selection Sort)");
        ticketService04.displayAll();
        System.out.println("========================================================================");
    }
    
}
