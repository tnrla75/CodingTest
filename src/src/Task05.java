/*import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Task05 ta = new Task05();

        System.out.print("문장을 입력하시오: ");
        String str = Sc.nextLine();
        System.out.print("숫자를 입력하시오: ");
        int num = Sc.nextInt();

        ta.str1(str,num);
        Sc.close();
    }

    void str1(String a, int b) {
        char[] array = a.toCharArray();
        int[] intArray = new int[array.length];
        for(int i=0; i< array.length; i++) {
            if(array[i]>=65 && array[i]<= 90) {             
                intArray[i]= ((int) array[i]) + b;
                if(intArray[i]>90) {
                    intArray[i] -= 25;
                }
                array[i] = (char) intArray[i];
            }

            else if(array[i]>=97 && array[i]<= 122) {       
                intArray[i]= ((int) array[i]) + b;
                if(intArray[i]>122) {
                    intArray[i] -= 25;
                }
                array[i] = (char) intArray[i];
            }
            System.out.print(array[i]);
        }
    }
}*/