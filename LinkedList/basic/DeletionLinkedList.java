class Node{
public int data;
Node next;
Node(int val){
data=val;
next=null;
}
}
class LinkedList{
Node head,temp;
public void node(int val){
Node newNode=new Node(val);
if(head==null){
head=newNode;
temp=newNode;
}
else{
temp.next=newNode;
temp=newNode;
}
}
void deleteAtHead(){
temp=head;
if(head==null){
System.out.println("list is empty");
}
else{
head=head.next;
}
}
void deleteAtTail(){
temp=head;
if(head==null){
System.out.println("list is empty");
return;
}
if(null==head.next){
head=null;
temp=null;
return;
}
else{
while(null!=temp.next.next){
temp=temp.next;
}
temp.next=null;
}
}
void display(){
temp=head;
while(temp!=null){
System.out.println(temp.data);
temp=temp.next;
}
}
}
class DeletionLinkedList{
public static void main(String args[]){
LinkedList list =new LinkedList();
list.node(10);
list.node(20);
list.node(30);
list.node(40);
list.node(50);
System.out.println("list before operation");
list.display();
list.DeleteAtHead();
System.out.println("list after deletion at head");
list.display();
list.DeleteAtTail();
System.out.println("list after deletion at tail");
list.display();
}
}