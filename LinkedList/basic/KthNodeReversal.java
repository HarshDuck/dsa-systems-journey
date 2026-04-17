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
Node getKthNode(Node start,int k){
Node temp=start;
int i=1;
while(i<k&&temp!=null){
temp=temp.next;
i++;
}
return temp;
}
public void kNodeReversal(int k){
if(head==null||k<=1)
return;
Node temp=head;
Node prevGroupEnd=null;
while(temp!=null){
Node kthNode=getKthNode(temp,k);
if(kthNode==null)
break;
Node nextGroupStart=kthNode.next;
Node groupStart=temp;
Node front=null;
Node curr=temp;
Node back=null;
for(int i=0;i<k;i++){
front=curr.next;
curr.next=back;
back=curr;
curr=front;
}
if(prevGroupEnd==null){
head=back;
}
else{
prevGroupEnd.next=back;
}
groupStart.next=nextGroupStart;
prevGroupEnd=groupStart;
temp=nextGroupStart;
}
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
class KthNodeReversal{
public static void main(String args[]){
LinkedList list=new LinkedList();
list.insert(10);
list.insert(20);
list.insert(30);
list.insert(40);
list.insert(50);
list.insert(60);
list.insert(70);
list.insert(80);
System.out.print("original : ");
list.display();
list.kNodeReversal(3);
System.out.println("After reversing in groups of 3 : ");
list.display();
}
}

