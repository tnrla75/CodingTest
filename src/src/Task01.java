/*import java.util.Stack;
import java.util.Scanner;
// 중위표기법 후위표기법 전환
public class Task01 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      Stack<Character> st = new Stack<>();
      int top = -1;
      String a = sc.next();
      
      for(int i = 0; i < a.length(); i++ )
      {   
         char b = a.charAt(i);
            switch (b){
            case '(':
               st.push(b);
               continue;
            case ')':
               while (!st.isEmpty() && st.peek() != '(') {
                  System.out.print(st.pop());
               }
               st.pop();
               break;
            case '+':
               while (!st.isEmpty() && st.peek() != '(') {
                  System.out.print(st.pop());
               }
               st.push(b);
               break;
            case '-':
               while (!st.isEmpty() && st.peek() != '(') {
                  System.out.print(st.pop());
               }
               st.push(b);
               break;
            case '*':
               while (!st.isEmpty() && st.peek() != '(') {
                  System.out.print(st.pop());
               }
               st.push(b);
               break;
            case '/':
               while (!st.isEmpty() && st.peek() != '(') {
                  System.out.print(st.pop());
               }
               st.push(b);
               break;
            default:
            System.out.print(b);
            while(!st.isEmpty()) {
               System.out.print(st.peek());
            }

            }

         }
      }      
   }*/