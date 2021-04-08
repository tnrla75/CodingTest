/*import java.util.Scanner;
// 후위표기법 계산
public class Task02 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] str = sc.nextLine().split(" ");
      int[] stack = new int[str.length];
      int top = -1;
      
      for(int i =0 ; i<str.length ; i++) {
         char a = str[i].charAt(0);
         int b, c;
         
         switch (a) {
         case '+' :
            b = stack[top--];
            c = stack[top--];
            stack[++top] = b + c;
            break;
            
         case '-' :
            b = stack[top--];
            c = stack[top--];
            stack[++top] = b - c;
            break;
            
         case '*' :
            b = stack[top--];
            c = stack[top--];
            stack[++top] = b * c;
            break;
            
         case '/' :
            b = stack[top--];
            c = stack[top--];
            stack[++top] = b / c;
            break;
         }
         
      }
      System.out.print(stack[top--]);

   }

}
*/