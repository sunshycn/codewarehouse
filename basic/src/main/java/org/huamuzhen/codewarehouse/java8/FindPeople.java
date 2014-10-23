package org.huamuzhen.codewarehouse.java8;

/**
 * 五百个人排成圈，依次序喊 1 2 3， 喊道3的退出。求最后剩的那个人原来的初始位置。
 * 
 * */
public class FindPeople {

	public static void main(String[] args) {

		//int i = 0;
		Node<Integer> firstNode = new Node<>(1);
		Node<Integer> prevNode = firstNode;
		for(int i=2;i<501;i++){
			Node<Integer> node = new Node<>(i);
			addNode(prevNode,node);
			prevNode = node;
		}
		Node<Integer> lastNode = prevNode;
		lastNode.next = firstNode;
		firstNode.prev = lastNode;
		////
		
		Node<Integer> nullNode = new Node<>(null);
		nullNode.next = firstNode;
		
		Node<Integer> pointer = nullNode;
		//Node<>
		while(!onlyOneNodeLeft(pointer)){
			
			Node<Integer> toBeRemoved = pointer.next.next.next;
			removeNode(toBeRemoved);
			pointer = toBeRemoved;
		}
		  System.out.println(pointer.item);
	}
	
	public static boolean onlyOneNodeLeft(Node<Integer> pointer){
		if(pointer.next == pointer && pointer.prev == pointer){
			return Boolean.TRUE;
		}else{
			return Boolean.FALSE;
		}
		
	}
	
	public static void addNode(Node<Integer> prevNode, Node<Integer> node){
		prevNode.next = node;
		node.prev = prevNode;
	}
	
	public static void removeNode(Node<Integer> node){
		Node<Integer> prevNode = node.prev;
		Node<Integer> nextNode = node.next;
		
		prevNode.next = nextNode;
		nextNode.prev = prevNode;
	}
	
	 private static class Node<E> {
	        E item;
	        Node<E> next;
	        Node<E> prev;
	        
	        Node(E element){
	        	this.item = element;
	        }

	       /* Node(Node<E> prev, E element, Node<E> next) {
	            this.item = element;
	            this.next = next;
	            this.prev = prev;
	        }*/
	    }

}
