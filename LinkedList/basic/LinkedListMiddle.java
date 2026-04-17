class Node{
int data;
Node next;
Node(int val){
this.data=val;
this.next=null;
}
}
class LinkedList{
Node head;
public void insert(int val){
Node newNode=new Node(val);
if(head==null){
head=newNode;
return;
}
else{
Node temp=head;
while(temp.next!=null){
temp=temp.next;
}
temp.next=newNode;
}
}
public void middleOfLinkedList(){
if(head==null){
System.out.println("list is empty");
}
Node fast=head;
Node slow=head;
while(fast!=null&&fast.next!=null){
fast=fast.next.next;
slow=slow.next;
}
System.out.println("Middle of Linked List: "+slow.data);
}
public void display(){
Node temp=head;
if(temp==null){
System.out.println("list is empty");
}
while(temp!=null){
System.out.print(temp.data+"->");
temp=temp.next;
}
System.out.print("null");
}
}
class LinkedListMiddle{
public static void main(String args[]){
LinkedList list=new LinkedList();
list.insert(10);
list.insert(20);
list.insert(30);
list.insert(40);
/*list.insert(50);*/
list.display();
list.middleOfLinkedList();
}
}