/*import java.util.Scanner;

public class Task03 {
// ¿¹Á¦ 4-1
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      sc.nextLine();
      if(1<=N && N<=100) {
   
      int X=1;
      int Y=1;
      if(1<=X && X<=N && 1<=Y && Y<=N) {
         int i;
         
         String str[] = sc.nextLine().split(" ");
         for(i=0; i<str.length; i++) {
         switch (str[i]) {

         case "U" :
            if(0<X || X<=N || 0<Y || Y<=N) {
            X=X-1;
            }else
            continue;
         case "D" :
            if(0<X || X<=N || 0<Y || Y<=N) {
            X=X-1;
            }else
            continue;
         case "R" :
            if(0<X || X<=N || 0<Y || Y<=N) {
            X=X-1;
            }else
            continue;
         case "L" :
            if(0<X || X<=N || 0<Y || Y<=N) {
            X=X-1;
            }else
            continue;
         case "." :
            break;
         }
         }
      System.out.print(X+' '+Y);
         }   
      }
   }
}*/
