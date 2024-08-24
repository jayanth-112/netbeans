/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circularqueueusingarray;
import java.util.Arrays;
class ArrayQueue {
 private final int[] items;
 private int rear;
 private int front;
 private int count;
 public ArrayQueue(int capacity) {
 items = new int[capacity];
 }
 public void enqueue(int item) {
 if (isFull()) {
 throw new IllegalStateException();
 }
 items[rear] = item;
 rear = (rear + 1) % items.length;
 // System.out.println("Rear -->" + rear);
 count++;
 // System.out.println("count -->" + count);
 }
 public int dequeue() {
 if (isEmpty()) {
 throw new IllegalStateException();
 }
 var item = items[front];
 items[front] = 0;
 front = (front + 1) % items.length;
 //System.out.println("front --> " + front);
 count--;
 return item;
 }
 public int peek() {
 if (isEmpty()) {
 throw new IllegalStateException();
 }
 return items[front];
 }
 public boolean isEmpty() {
 return count == 0;
 }
 public boolean isFull() {
 return count == items.length;
 }
 @Override
 public String toString() {
 return Arrays.toString(items);
 }
 public int getRear() {
 return rear;
 }
 public int getFront() {
 return front;
 }
}
public class CircularQueueUsingArray {
 public static void main(String[] args) {
 ArrayQueue queue = new ArrayQueue(5);
 queue.enqueue(10);
 queue.enqueue(20);
 queue.enqueue(30);
 System.out.println(queue);
 System.out.println("Front = " + queue.getFront());
 System.out.println("rear = " + queue.getRear());
 //[10, 20, 30, 0, 0]
 System.out.println("deleted item = " + queue.dequeue());
 System.out.println(queue);
 System.out.println("Front = " + queue.getFront());
 System.out.println("rear = " + queue.getRear());
 System.out.println("deleted item = " + queue.dequeue());
 System.out.println(queue);
 System.out.println("Front = " + queue.getFront());
 System.out.println("rear = " + queue.getRear());
 queue.enqueue(40);
 System.out.println(queue);
 System.out.println("Front = " + queue.getFront());
 System.out.println("rear = " + queue.getRear());
 queue.enqueue(50);
 System.out.println(queue);
 System.out.println("Front = " + queue.getFront());
 System.out.println("rear = " + queue.getRear());
 queue.enqueue(60);
 System.out.println(queue);
 queue.enqueue(70);
 System.out.println(queue);
 //queue.enqueue(80);
 System.out.println("deleted item = " + queue.dequeue());
 System.out.println(queue);
 System.out.println("Front = " + queue.getFront());
 System.out.println("rear = " + queue.getRear());
 }
}