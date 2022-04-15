package PLN_2022;
import java.util.Scanner;

public class QuestionC {
    public static void main(String[] args) {

        //First line is number (n) of cases (1 until 1000)
        //The next n lines has 2 integer, a and b (1 until 10⁹)
        //a = total steps jogged
        //b = indicats divisor choosen
        
        int n, i, j, k=0, case1, case2, total=0;
        int[] sum = new int[1000];
        int[] div = new int[10000];
        String[] strDiv = new String[10000];
        String theCase;
        char hold;
        Scanner input = new Scanner(System.in);
        
        //Prompt user enter number of cases
        n = input.nextInt();
        input.nextLine();
        
        for(i=0; i<n; i++){
            //Prompt user to enter the value of a and b
            theCase = input.nextLine();
            
            //Split the case into 2
            String[] twoCase = theCase.split(" ");
            case1 = Integer.parseInt(twoCase[0]);
            case2 = Integer.parseInt(twoCase[1]);
            
            //Finding the divisors
            k = 0;
            total = 0;
            for(j=1; j<=case1; j++){

                if(j%case2 == 0){

                    div[k] = j;
                    strDiv[k] = String.valueOf(div[k]);
                    hold = strDiv[k].charAt(strDiv[k].length() - 1);
                    total = total + Character.getNumericValue(hold);
                    k++;

                }
            }
            //Store the total sum inside an array to be printed later
            sum[i] = total;
        }
        
        //Printing the all sums
        System.out.println("");
        for(i=0; i<n; i++){
            System.out.println(sum[i]);
        }

    }
}
