import java.util.*;

public class RestaurantQueue
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        while (true) {
            System.out.println("\n1. Add Order");
            System.out.println("2. Serve Order");
            System.out.println("3. View Next Order");
            System.out.println("4. Display All Orders");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter order: ");
                    String order = sc.nextLine();
                    queue.add(order);
                    System.out.println("Order added: " + order);
                    break;

                case 2:
                    if (!queue.isEmpty()) {
                        String served = queue.remove();
                        System.out.println("Served order: " + served);
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;

                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("Next order: " + queue.peek());
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;

                case 4:
                    System.out.println("Pending orders: " + queue);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}