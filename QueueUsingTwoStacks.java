/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queueusingtwostacks;
import java.util.Stack;
public class QueueUsingTwoStacks {
 private Stack<Integer> stack1 = new Stack<>();
 private Stack<Integer> stack2 = new Stack<>();
 // O(1)
 public void enqueue(int item) {
 stack1.push(item);
 }
 // O(n)
 public int dequeue() {
 if (isEmpty()) {
 throw new IllegalStateException();
 }
 moveStack1ToStack2();
 return stack2.pop();
 }
 private void moveStack1ToStack2() {
 if (stack2.isEmpty()) {
 while (!stack1.isEmpty()) {
 stack2.push(stack1.pop());
 }
 }
 }
 public int peek() {
 if (isEmpty()) {
 throw new IllegalStateException();
 }
 moveStack1ToStack2();
 return stack2.peek();
 }
 public boolean isEmpty() {
 return stack1.isEmpty() && stack2.isEmpty();
 }
 public static void main(String[] args) {
 QueueUsingTwoStacks q1 = new QueueUsingTwoStacks();
 q1.enqueue(10);
 q1.enqueue(20);
 q1.enqueue(30);
 q1.enqueue(40);
 q1.enqueue(50);
 System.out.println(q1.stack1);
 //[10, 20, 30, 40, 50]
 System.out.println(q1.dequeue());
 //10
 System.out.println(q1.dequeue());
 //20
 System.out.println(q1.dequeue());
 //30
 System.out.println(q1.dequeue());
 //40
 System.out.println(q1.dequeue());
 //50
 }
}