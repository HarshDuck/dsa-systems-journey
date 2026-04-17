class Node{
public int data;
Node next;
public Node(int data){
this.data=data;
this.next=null;
}
}
class LinkedList{
Node head;
Node current;
public void insertAtTail(int val){
Node newNode=new Node(val);
if(head==null){
head=newNode;
current=newNode;
}
else{
current.next=newNode;
current=newNode;
}
}
public void linkedListReverse(){
Node back=null,front=null,cur=head;
while(cur!=null){
front=cur.next;
cur.next=back;
back=cur;
cur=front;
}
head=back;
}
public void display(){
Node temp=head;
while(temp!=null){
System.out.print(temp.data);
if(temp.next!=null){
System.out.print("->");}
else{
System.out.println("-> null");}
temp=temp.next;
}
}
}
class ReversalOfLinkedList{
public static void main(String args[]){
LinkedList list=new LinkedList();
list.insertAtTail(10);
list.insertAtTail(20);
list.insertAtTail(30);
list.insertAtTail(40);
System.out.println("list before reversal");
list.display();
list.linkedListReverse();
System.out.println("list after reversal");
list.display();
}
}