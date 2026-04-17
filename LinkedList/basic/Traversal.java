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
Node temp;
public void node(int no){
Node newNode=new Node(no);
if(head==null){
head=newNode;
temp=newNode;
}
else{
temp.next=newNode;
temp=newNode;
}
}
public void display(){
temp=head;
while(temp!=null){
System.out.println(temp.data);
temp=temp.next;
}
}
}
class Traversal{
public static void main(String args[]){
LinkedList list=new LinkedList();
list.node(10);
list.node(20);
list.node(30);
list.display();
}
}
