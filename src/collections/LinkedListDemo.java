package collections;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<Character> characters = new LinkedList(); // LINE A
    characters.add('A');
    characters.add('C');
    characters.add('D');
    System.out.println("Original list: " + characters);
    characters.add(1, 'B'); 
    System.out.println("Original list: " + characters);

}
}
