class NextGreaterElement{
public int[] findNextGreater(int[]arr){
int n=arr.length;
int[] result=new int[n];
ArrayStackInt stack=new ArrayStackInt();
for(int i=0;i<n;i++){
while(!stack.isEmpty()&&arr[stack.peek()]<arr[i]){
int index=stack.pop();
result[index]=arr[i];
}
stack.push(i);
}
while(!stack.isEmpty()){
result[stack.pop()]=-1;
}
return result;
}
}
class NextGreaterElementDemo{
public static void main(String args[]){
NextGreaterElement nge=new NextGreaterElement();
int[] arr={4,2,10,8};
int[] result=nge.findNextGreater(arr);
for(int i=0;i<result.length;i++){
System.out.print(result[i]+" ");
}
}
}