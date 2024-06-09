public class Node4 {
    class Customer {
        String name;
        String address;
        String customerAccountNumber;
    
        public void Customer(String name, String address, String customerAccountNumber) {
            this.name = name;
            this.address = address;
            this.customerAccountNumber = customerAccountNumber;
        }
    
        public String toString() {
            return "Name: " + name + ", Address: " + address + ", Account Number: " + customerAccountNumber;
        }
    }
    
    class CustomerNode {
        Customer data;
        CustomerNode next;
    
        public void CustomerNode(Customer data, CustomerNode next) {
            this.data = data;
            this.next = next;
        }
    }
    
}
