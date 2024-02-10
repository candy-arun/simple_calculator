import java.util.Scanner;
// 'X' or 'x' to Exit the calculator

public class Calculator {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        // opeaning a infinity  for loop 
        while (true){
            int ans = 0;
            System.out.print("Enter the operator :");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op =='-' || op == '%' || op== '*' || op =='/'){
                System.out.print("Enter the number1 :");
                int n1 = in.nextInt();
                System.out.print("Enter the number2 :");
                int n2 = in.nextInt();
                if(op == '+'){
                    ans = n1 + n2;
                }
                if(op == '*'){
                    ans = n1 * n2;
                }
                if(op == '-'){
                    ans = n1 - n2;
                }
                if(op == '/' && n2 >0){
                    ans = n1/n2;
                }
                if(op =='%'){
                    ans = n1%n2;
                }
            }
            else if(op == 'X' || op =='x'){
                break;
            }
            else{
                System.out.println("invalid operator");
            }
            System.out.println(ans);

        }
    }
}
