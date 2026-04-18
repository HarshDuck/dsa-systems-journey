class ArrayStackChar{
char[] stack=new char[8];
int top=-1;
int capacity=8;
public void push(char val){
if(top==capacity-1){
System.out.println("Stack Overflow");
return;
}
top++;
stack[top]=val;
}
public char pop(){
if(top==-1){
System.out.println("Stack Underflow");
return 0;
}
char value=stack[top];
top--;
return value;
}
public char peek(){
if(top==-1){
System.out.println("Stack Underflow");
return 0;
}
return stack[top];
}
public boolean isEmpty(){
return top==-1;
}
}
