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
    
  }










  
  public static void main(String[] args) {
    Node<Integer> head = takinginput();
    print(head);    
  }

  public static void MovesZeros(int[] arr){
   int k = 0;
    for(int i = 1; i<arr.length; i++){
      if(arr[k] != 0) k++;
      else if(arr[i] != 0){
        arr[k++] = arr[i];
        arr[i] = 0;
      }
    }
  }







  
   public String maxProduct(int[] arr) {
        // TODO
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > firstmax){
                secondmax = firstmax;
                firstmax  = arr[i];
            }
        }
        System.out.println(firstmax);
        System.out.println(secondmax);
        int maxProduct = firstmax * secondmax;
        String s = String.valueOf(maxProduct);
        return s;
    }

  
  public int[] ReverseArray(int[] arr){
    for(int i = 0; i<arr.length/2; i++){
      int other = arr.length - i -1;
      int temp = arr[other];
      arr[other] = arr[i];
      arr[i] = temp;
    }
    return arr;
  }
  public List<Integer> spofArray(int[] arr){
    List<Integer> list = new ArrayList<>();
    int sum = 0;
    int product = 1;
    for(int i = 0;i<arr.length; i++){
      sum += arr[i];
      product *= arr[i];
    }
    list.add(sum);
    list.add(product);
    return list;
  }

  // factorial function
  public int factorial(int n){
    if(n == 0){
      return 1;
    }
    return n * factorial(n-1);
  }

  // this function calculate the sum of digit in n;
  public int sumofdigits(int n){
    
    if(n == 0  || n<0){
      return 0;
    }
    return n % 10 + sumofdigits(n/10);
  }

  // this function give the power of the given input
  public int power(int x,int n){
    if(n == 0){
      return 1;
    }
    if(n == 1){
      return x;
    }
    return x * power(x,n-1);
  }

  // this function give the greatest common divisor
  public int GCD(int a,int b){
    if(b == 0){
      return a;
    }
    return GCD(b,a%b);
  }

  // this function Decimal to binary
  public int Decimal_to_Binary(int n){
    if(n == 0){
      return 0;
    }
    return n % 2 + 10 * Decimal_to_Binary(n/2);
  }


  // this function is Binary to Decimal
  public int BinarytoDecimal(int n){
    if(n == 0){
      return 0;
    }
   
    return  n % 10 + 2 * BinarytoDecimal(n/10);
  }

  
}