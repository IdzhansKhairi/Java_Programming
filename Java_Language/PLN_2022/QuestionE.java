package PLN_2022;
import java.util.Scanner;

public class QuestionE {
    public static void main(String[] args) {
        
        //First line is number of cases (1 until 1000)
        //Next n line is 2 integers n and r (n=different flavours, r=number of scoops)
        int testNum, n, r, i, j, fact1, fact2, fact3;
        long f1, f2, f3;
        Scanner input = new Scanner(System.in);
        String[] comb = new String[1000];
        long[] answ = new long[1000];
        
        testNum = input.nextInt();
        input.nextLine();
        
        for(i=0; i<testNum; i++){
            comb[i] = input.nextLine();
            
            String[] twoComb = comb[i].split(" ");
            n = Integer.parseInt(twoComb[0]);
            r = Integer.parseInt(twoComb[1]);
            
            fact1 = r + n - 1;
            fact2 = r;
            fact3 = n - 1;
            
            //Find the factorial 1
            f1=1;
            for(j=1; j<=fact1; j++){
                f1 = (long) f1 * j;
            }
            
            //Find the factorial 2
            f2=1;
            for(j=1; j<=fact2; j++){
                f2 = (long) f2 * j;
            }
            
            //Find the factorial 3
            f3=1;
            for(j=1; j<=fact3; j++){
                f3 = (long) f3 * j;
            }
            
            //Calculate Combinations
            answ[i] = f1/(f2 * f3);
        }
        //Printing answer
        System.out.println("");
        for(i=0; i<testNum; i++){
            System.out.println(answ[i]);
        }

    }
}
