package Problems;

import java.util.Iterator;
import java.util.LinkedList;



/*
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order, and each of their nodes contains a single digit. 
 * Add the two numbers and return the sum as a linked list.
 */
public class Q2_AddTwoNumbers {
public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	int sum = 0;
	int tens = 1;
	
	System.out.println(l1.val);
	return l2;
	
	

}

public static void main(String[] args) {
	
	ListNode list1 = new ListNode(2);
	ListNode list2 = new ListNode(3, list1);
	ListNode list3 = new ListNode(4, list2);
	
	System.out.println(list1.next);
	
	ListNode next = list3.next;
	while (next != null ) {
		System.out.println(next.val);
		next = next.next;
	}
	
}
}

