/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackexample;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack of integers
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Displaying the stack
        System.out.println("Stack: " + stack);

        // Peeking at the top element
        System.out.println("Top element: " + stack.peek());

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Searching for an element in the stack (returns 1-based position)
        int position = stack.search(20);
        if (position != -1) {
            System.out.println("Element 20 found at position: " + position);
        } else {
            System.out.println("Element 20 not found in the stack");
        }
    }
}
