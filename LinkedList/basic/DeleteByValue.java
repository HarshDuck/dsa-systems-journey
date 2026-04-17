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
Node deleteByValue(int x){
if(head==null)
return null;
if(head.data==x){
head=head.next;
return head;
}
Node temp=head;
while(temp.next!=null){
if(temp.next.data==x){
temp.next=temp.next.next;
return head;
}
temp=temp.next;
}
System.out.println("node to delete dont exist");
return head;
}
public void display(){
if(head==null){
System.out.println("empty list");
return;
}
Node temp=head;
while(temp!=null){
System.out.print(temp.data+"->");
temp=temp.next;
}
System.out.println("null");
}
}
class DeleteByValue{
public static void main(String args[]){
LinkedList list=new LinkedList();
list.insert(10);
list.insert(20);
list.insert(30);
list.insert(40);
list.insert(50);
list.display();
System.out.println("on deleting value 10");
list.head=list.deleteByValue(10);
list.display();
System.out.println("on deleting value 50");
list.head=list.deleteByValue(50);
list.display();
System.out.println("on deleting value 30");
list.head=list.deleteByValue(30);
list.display();
}
}
