class StackDemo{
public static void main(String args[]){
ArrayStackInt stack=new ArrayStackInt();
stack.push(10);
stack.push(10);
stack.push(20);
stack.push(30);
System.out.println("pop "+stack.pop());
System.out.println("peek "+stack.peek());
System.out.println("Is Empty"+stack.isEmpty());
}
}