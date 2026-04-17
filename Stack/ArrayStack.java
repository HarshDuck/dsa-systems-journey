class ArrayStack{
int[] stack=new int[8];
int top=-1;
int size=8;
public void push(int val){
if(top==size-1){
System.out.println("Stack Overflow");
return;
}
top++;
stack[top]=val;
}
public int pop(){
if(top==-1){
System.out.println("Stack Underflow");
return -1;
}
int value=stack[top];
top--;
return value;
}
public int peek(){
if(top==-1){
System.out.println("Stack Underflow");
return -1;
}
return stack[top];
}
public boolean isEmpty(){
return top==-1;
}
}
