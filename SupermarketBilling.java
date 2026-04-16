import java.util.*;

public class SupermarketBilling 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        while (true) {
            System.out.println("\n1. Add Item");
            System.out.println("2. Undo Last Item");
            System.out.println("3. View Last Scanned Item");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String item = sc.nextLine();
                    stack.push(item);
                    System.out.println("Item added: " + item);
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        String removed = stack.pop();
                        System.out.println("Removed last scanned item: " + removed);
                    } else {
                        System.out.println("Stack is empty!");
                    }
                    break;

                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Last scanned item: " + stack.peek());
                    } else {
                        System.out.println("Stack is empty!");
                    }
                    break;

                case 4:
                    System.out.println("Scanned items: " + stack);
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