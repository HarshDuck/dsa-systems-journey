class Node{
public int data;
Node next;
Node(int val){
data=val;
next=null;
}
}
class LinkedList{
Node head;
Node current;
public void node(int no){
Node newNode=new Node(no);
if(head==null){
head=newNode;
}
else{
Node temp=head;
temp.next=newNode;
temp=newNode;
}
}
void insertAtHead(int val){
Node newNode=new Node(val);
newNode.next=head;
head=newNode;
}
void insertAtTail(int val){
Node newNode=new Node(val);
if(head==null){
head=newNode;
return;}
current=head;
while(current.next!=null){
current=current.next;
}
current.next=newNode;
}
void display(){
current=head;
while(current!=null){
System.out.println(current.data);
current=current.next;
}
}
}
class InsertionLinkedList{
public static void main(String args[]){
LinkedList list=new LinkedList();
list.node(10);
list.node(20);
list.node(30);
list.display();
list.insertAtHead(5);
list.display();
list.insertAtTail(40);
list.display();
}
}
