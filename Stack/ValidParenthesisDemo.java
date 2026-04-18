class ValidParenthesis{
ArrayStack stack=new ArrayStack();


boolean isValid(String str){
for(int i=0;i<str.length();i++){
char c=str.charAt(i);
if(c=='['||c=='{'||c=='('){
stack.push(c);
}
else{
 if(stack.isEmpty())
return false;
char topChar=stack.peek();
if(topChar == '[' && c == ']'||
   topChar == '{' && c == '}'||
   topChar == '(' && c == ')'){
    stack.pop();
}
else{
    return false;
}
}
}
return stack.isEmpty();
}
}
class ValidParenthesisDemo{
public static void main(String args[]){
ValidParenthesis validator=new ValidParenthesis();
String input="[{()}]";
boolean result=validator.isValid(input);
if(result){
System.out.println("Valid Parenthesis");
}
else{
System.out.println("Invalid Parenthesis");
}
}
}
