import java.util.Scanner;
import java.util.Stack;

class MathExpression{
    public static void checkExpression(String str){
        Stack<Character> s=new Stack<>();
        char c[]=str.toCharArray();
        boolean isvalid=false;
        char symbol[]={'+','-','*','%','/'};
        for(int i=0;i<str.length();i++){
            if(c[i]=='('){
                s.push(c[i]);
            }
            else if(c[i]==')'){
                s.pop();
            }
            if(Character.isAlphabetic(c[i]) && i<str.length()-2){
                Character op=c[i+1];
                Character temp=c[i+2];
                if(Character.isAlphabetic(temp)){
                    outer:
                    for(int j=0;j<symbol.length;j++){
                        if(op==symbol[j]){
                            i+=2;
                            isvalid=true; 
                            break outer;
                        }
                        isvalid=false;
                    }
                }
            }
        }
        if(s.isEmpty() && isvalid){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
        String str="(ab)";
        checkExpression(str);
    }
}