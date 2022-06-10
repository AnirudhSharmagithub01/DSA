import java.util.*;


class Node<T>{
  T data;
  Node<T> next;
  Node(T data){
    this.data = data;
    next = null;
  }
}

class Main {
  public static final Scanner input = new Scanner(System.in);
  public static Node<Integer> takinginput(){
    Node<Integer> head = null ,tail = null;
    int data = input.nextInt();
    while(data != -1){
      Node<Integer> newNode = new Node<Integer>(data);
      if(head == null){
        head = newNode;
        tail = newNode;
      }
      else{
        tail.next = newNode;
        tail = tail.next;
      }
      data = input.nextInt();
    }
    return head;
  }
  public static void print(Node<Integer> head){
    while(head != null){
      System.out.print(head.data+" ");
      head = head.next;
    }
  }

  public static Node<Integer> insert(Node<Integer> head,int element,int position){
    if(head == null && head.next == null){
      return head;
    }
    if(position == 0){
      Node<Integer> newNode = new Node<Integer>(element);
      newNode.next = head;
      return newNode;
    }
    else{
      head.next = insert(head.next,element,position - 1);
      return head;
    }
  }

  public static void main(String[] args) {
    Node<Integer> head = takinginput();
    head = insert(head,10,10);
    print(head);    
  }

  
}