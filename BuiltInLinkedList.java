package builtinlinkedlist;
import java.util.LinkedList;
public class BuiltInLinkedList {
 LinkedList linklist = new LinkedList();
 public void add(int item) {
 linklist.add(item);
 }
 public int remove() {
 return (int) linklist.remove();
 }
 public void printlist() {
 System.out.println(linklist);
 }
 public static void main(String[] args) {
 BuiltInLinkedList b1 = new BuiltInLinkedList();
 b1.add(10);
 b1.add(20);
 b1.add(30);
 b1.printlist();
 }
}