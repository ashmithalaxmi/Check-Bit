import java.util.Scanner;

public class CheckBit {
    static int checkBit(int A, int B){
        if(A == (A | (1<<B))){
            return(1);
        }
        else{
            return(0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        int B = sc.nextInt();
        System.out.println(checkBit(A,B));
    }
}
