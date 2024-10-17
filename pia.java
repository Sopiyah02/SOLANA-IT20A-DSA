import java.util.Stack;

public class pia {

    public static void main(String[] args) {

        Stack<Integer> person = new Stack<>();
        
        // Push elements onto the stack
        person.push(52);
        person.push(26);
        person.push(13);
        person.push(45);

        System.out.println("Stack: " + person);

        // Pop and display the top element
        int topElement = person.pop();
        System.out.println("Popped: " + topElement);
        
        // Peek at the top element without removing it
        int peekedElement = person.peek();
        System.out.println("Peeked: " + peekedElement);

        // Check if the stack is empty
        boolean isEmpty = person.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);

        // Get the size of the stack
        int stackSize = person.size();
        System.out.println("Stack Size: " + stackSize);
    }
}
