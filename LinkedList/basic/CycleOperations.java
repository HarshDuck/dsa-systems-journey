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
void insert(int num){
Node newNode=new Node(num);
if(head==null){
head=newNode;
return;
}
Node temp=head;
while(temp.next!=null){
temp=temp.next;
}
temp.next=newNode;
}
Node meetingPoint(){
Node fast=head;
Node slow=head;
while(fast!=null&&fast.next!=null){
fast=fast.next.next;
slow=slow.next;
if(fast==slow){
return slow;
}
}
return null;
}
boolean cycleDetect(){
return meetingPoint()!=null;
}
Node cycleStart(){
Node meet=meetingPoint();
if(meet==null)
return null;
Node start=head;
while(start!=meet){
start=start.next;
meet=meet.next;
}
return start;
}
void removeCycle(){
Node start=meetingPoint();
if(start==null)
return;
Node temp=start;
while(temp.next!=start){
temp=temp.next;
}
temp.next=null;
}
public void display(){
Node temp=head;
while(temp!=null){
System.out.print(temp.data+"->");
temp=temp.next;
}
System.out.println("null");
}
}
class CycleOperations{
public static void main (String args[]){
LinkedList list=new LinkedList();
list.insert(10);
list.insert(20);
list.insert(30);
list.insert(40);
list.insert(50);
list.display();
Node temp=list.head;
Node third=null;
int count=1;
while(temp.next!=null){
if(count==3)
third=temp;
temp=temp.next;
count++;
}
temp.next=third;
System.out.println("Cycle Present"+list.cycleDetect());
Node start=list.cycleStart();
if(start!=null)
System.out.println("Cycle starts at:"+start.data);
list.removeCycle();
System.out.println("Cycle present after removal"+list.cycleDetect());
list.display();
}
}