package cinemabookproject;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Idzhans Khairi
 */
public class Demo_CLI_CineBook_Customer {

    public static void main(String[] args) {
        
        int option, status, statusFood, show, food, i, j, row, seat, ID;
        double total = 0;
        int[][] position = new int[7][10];
        Random num = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Online Cinema Ticket Booking System");
        System.out.println("-----------------------------------\n");
        
        System.out.println("Please enter 1 to Display Showtime");
        System.out.println("Please enter 2 to Make Booking");
        System.out.println("Please enter 3 to Exit\n");
        
        System.out.print("Enter Option : ");
        option = input.nextInt();
        
        // Option Block
        while(option != 3)
        {
            switch(option)
            {
                
                // Display the Showtime
                case 1 :
                {
                    System.out.println("-------------------------");
                    System.out.println("DISPLAY SHOWTIME SELECTED");
                    System.out.println("-------------------------\n");
                    
                    // Maybe will use spreadsheet to read from database for list of shows
                    // Show date will also be printed by lists of date
                    System.out.println("Show Number : 1");
                    System.out.println("Show Name : Shang-Chi And The Legend Of The Ten Rings");
                    System.out.println("Show Date : 21.10.2021");
                    System.out.println("Show Price : RM 17.50\n");
                    
                    System.out.println("Show Number : 2");
                    System.out.println("Show Name : Spider-man : No Way Home");
                    System.out.println("Show Date : 16.12.2021");
                    System.out.println("Show Price : RM 23.50\n");
                    
                    System.out.println("\n\nEnd of Show List");
                    System.out.println("-------------------------\n");
                    System.out.print("Enter Option : ");
                    option = input.nextInt();
                    break;
                }
                
                // Make a booking
                case 2 :
                {
                    System.out.println("---------------------");
                    System.out.println("MAKE BOOKING SELECTED");
                    System.out.println("---------------------\n");
                    
                    // Maybe will use spreadsheet to read from database for list of shows
                    // Show date will also be printed by lists of date
                    System.out.println("Show Number : 1");
                    System.out.println("Show Name : Shang-Chi And The Legend Of The Ten Rings");
                    System.out.println("Show Date : 21.10.2021");
                    System.out.println("Show Price : RM 17.50\n");
                    
                    System.out.println("Show Number : 2");
                    System.out.println("Show Name : Spider-man : No Way Home");
                    System.out.println("Show Date : 16.12.2021");
                    System.out.println("Show Price : RM 23.50\n");
                    
                    System.out.println("\n-------------------------\n");
                    
                    // Prompt user to enter the show number
                    System.out.print("Enter the Show Number : ");
                    show = input.nextInt();
                    System.out.println("\n");
                    
                    // Display the seats in hall
                    System.out.println("   | 1 2 3 4 5 6 7 8 9 10");
                    System.out.println("-------------------------");
                    for(i=0; i<7; i++)
                    {
                        System.out.printf("%d  | ", i+1);
                        for(j=0; j<10; j++)
                        {
                            System.out.printf("%d ", j+1);
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    
                    // Prompt user to enter their seat(s)
                    status = 1;
                    while(status != 2)
                    {
                        System.out.print("Enter the row  : ");
                        row = input.nextInt();
                        System.out.print("Enter the seat : ");
                        seat = input.nextInt();
                        
                        while(position[row - 1][seat - 1] == 1)
                        {
                            System.out.println("\nSorry!!! The seat is booked...");
                            System.out.println("Please enter another seat...");
                            System.out.print("Enter the row  : ");
                            row = input.nextInt();
                            System.out.print("Enter the seat : ");
                            seat = input.nextInt();
                        }
                        
                        if(position[row - 1][seat - 1] != 1)
                            position[row - 1][seat - 1] = 1;
                        
                        position[row - 1][seat - 1] = 1;
                        System.out.println("\nThe seat is now reserved for you.");
                        
                        // Calculate price of ticket
                        if(show == 1)
                            total = total + 17.50;
                        else if(show == 2)
                            total = total + 23.50;
                        
                        System.out.print("\nEnter 1 to reserve another seat or 2 to finish booking seat(s) : ");
                        status = input.nextInt();
                        
                        if(status == 2)
                            option = 4;
                    }
                    
                    // Prompt user to buy food and beverages
                    System.out.print("Enter 1 to buy food & beverages or 2 to check out : ");
                    statusFood = input.nextInt();
                    
                    // List of Foods & Beverages Offered
                    if(statusFood == 1)
                    {
                        System.out.println("----------------------------------------------------");
                        System.out.println("[1]Popcorn S                 :  RM 7.90");
                        System.out.println("[2]Popcorn L                 :  RM 10.90");
                        System.out.println("[3]Drink(coke) S             :  RM 3.70");
                        System.out.println("[4]Drink(coke) L             :  RM 5.70");
                        System.out.println("[5]Popcorn S, Drink(coke) S  :  RM 11.60");
                        System.out.println("[6]Popcorn L, Drink(coke) L  :  RM 16.60");
                        System.out.println("----------------------------------------------------");
                    }
                    
                    while(statusFood != 2)
                    {
                        System.out.print("Select your choice : ");
                        food = input.nextInt();
                        
                        switch(food)
                        {
                            case 1:
                            {
                                total = total + 7.90;
                                break;
                            }
                            case 2 :
                            {
                                total = total + 10.90;
                                break;
                            }
                            case 3 :
                            {
                                total = total + 3.70;
                                break;
                            }
                            case 4 :
                            {
                                total = total + 5.70;
                                break;
                            }
                            case 5 :
                            {
                                total = total + 11.60;
                                break;
                            }
                            case 6 :
                            {
                                total = total + 16.60;
                                break;
                            }
                        }
                        System.out.print("Enter 1 to buy more food & beverages or 2 to check out : ");
                        statusFood = input.nextInt();
                        
                        if(statusFood == 2)
                            option = 3;
                    }
                    break;
                }
            }
        }
        System.out.println("\n----------------------");
        System.out.println("Your Bill");
        System.out.println("----------------------");
        ID = 1 + num.nextInt(999);
        System.out.printf("Customer ID : %d\n", ID);
        System.out.printf("Total cost : RM %.2f\n\n", total);
    }
    
}
