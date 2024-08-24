/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queuevsstack;
import java.util.ArrayDeque;
import java.util.Stack;
public class QueueVsStack 
{
 public static void main(String[] args)
 {
 long t1 = System.currentTimeMillis();
 // Version 1: push 10 elements to ArrayDeque.
 for (int i = 0; i < 10000000; i++) {
 ArrayDeque<Integer> deque = new ArrayDeque<>();
 for (int v = 0; v < 10; v++) {
 deque.push(v);
 }
 }
 long t2 = System.currentTimeMillis();
 // Version 2: push 10 elements to Stack.
 for (int i = 0; i < 10000000; i++) {
 Stack<Integer> stack = new Stack<>();
 for (int v = 0; v < 10; v++) {
 stack.push(v);
 }
 }
 long t3 = System.currentTimeMillis();
 // ... Print benchmark results.
 System.out.println(t2 - t1+"ms: ArrayDeque push");
 System.out.println(t3 - t2+"ms: Stack push");
 }
 
}