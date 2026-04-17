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
}
else{
Node temp=head;
while(temp.next!=null){
temp=temp.next;
}
temp.next=newNode;
}
}
Node nthNode(int n){
if(head==null||n<=0)
return null;
Node fast=head;
Node slow=head;
for(int i=0;i<n;i++){
if(fast==null)
return null;
fast=fast.next;
}
while(fast!=null){
fast=fast.next;
slow=slow.next;
}
return slow;
}
public void display(){
Node temp=head;
while(temp!=null){
System.out.print(temp.data+"->");
temp=temp.next;
}
System.out.print("null");
}
}
class NthNode{
public static void main(String args[]){
LinkedList list=new LinkedList();
list.insert(10);
list.insert(20);
list.insert(30);
list.insert(40);
list.insert(50);
list.insert(60);
list.insert(70);
list.display();
Node result=list.nthNode(3);
System.out.println(" "+result.data);
}
}