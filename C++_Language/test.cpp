// Created by Idzhans Khairi
#include <iostream>
#include <fstream> // A library used to create and write a .txt file
using namespace std;
double DisplayMenu(double a);
double WithdrawMoney(double b);
double EnterMoney(double c);
void CurrentBalance(double d);

int main()
{
    int choose = 1;
    double amountMoney = 200.00;
    
    cout << "\n\t-----------------------------";
    cout << "\n\tWELCOME TO THE BANK SYSTEM!!!";
    cout << "\n\t-----------------------------\n\n";
    while (choose != 0)
    {
        // When the code runs, it will enter DisplayMenu function first to display menu 
        amountMoney = DisplayMenu(amountMoney);
        
        cout << "\n\tPress 1 to continue and press 0 to terminate the program : ";
        cin >> choose;
    }

    cout << "\n\t-----------------------------------";
    cout << "\n\tThank you for choosing our service!";
    cout << "\n\t-----------------------------------\n\n";
    return 0;
}

// This function allows user to see and choose either to :
// i.   Withdraw Money
// ii.  Check Current Balance
// iii. Enter Money
double DisplayMenu(double money)
{
    char choice;
    
    cout << "\t-----------------------------------------------------\n";
	cout << "\t|                    System                         |\n";
	cout << "\t|---------------------------------------------------|\n";
	cout << "\t|            a. Withdraw money                      |\n";
    cout << "\t|            b. Enter Money                         |\n";
	cout << "\t|            c. Check current balance               |\n";
    cout << "\t-----------------------------------------------------\n";
    cout << "\n\tEnter Your Choice (a, b, c - Small Letter): ";
    
    //Prompting the user to enter their choice of services.
    cin >> choice;

    // Just incase if the user did not enter 'a', 'b' or 'c'
    while(choice != 'a' && choice != 'b' && choice != 'c')
    {
        cout << "\n\tThere is an ERROR in your input!";
        cout << "\n\tEnter Your Choice (a, b, c - Small Letter): ";
        cin >> choice;
        cin >> choice;
    }
    
    // Entering the function based on what the user has choosen
    if(choice == 'a')
    {
        money = WithdrawMoney(money);
    }
    else if(choice == 'b')
    {
        money = EnterMoney(money);
    }
    else if(choice == 'c')
    {
        CurrentBalance(money);
    }

    return money;
}

// a. This function will display current balance
// b. Asking the amount of withdrawal
// c. Update current amount 
double WithdrawMoney(double money)
{
    double withdraw;

    cout << "\n\tYour current balance: RM " << money;
    cout << "\n\tEnter the amount money that you want to withdrawl (RM): ";
    cin >> withdraw;
    
    money = money - withdraw;
    cout << "\n\tYour balance after withdrawal: RM " << money <<"\n";

    return money;
}

// a. This function will display current balance 
// b. Asking amount to enter 
// c. Update current account amount
double EnterMoney(double money)
{
    double enter;

    cout << "\n\tYour current balance: RM " << money;
    cout << "\n\tEnter the amount money that you want to enter (RM): ";
    cin >> enter;

    money = money + enter;
    cout << "\n\tYour balance after enter: RM " << money <<"\n";

    return money;
}

// This function will display current amount of the account bank
// This function allow user to print a receipt for their account balance in receipt.txt.
void CurrentBalance(double money)
{
    int printReceipt;
    cout << "\n\tYour current balance: RM " << money;

    // Prompting the user if they wanted to print the receipt or not.
    cout << "\n\tDo you want to print a receipt? (Yes=1 // No=0): ";
    cin >> printReceipt;

    if(printReceipt == 1)
    {
        // Create and open a text file
        // You may change the location for your txt file to be.
        ofstream receipt("C:/Users/Idzhans Khairi/Documents/VSCode/Programming_Notes/C++_Language/receipt.txt");

        receipt << "\n\t-------------------";
        receipt << "\n\tBANK SYSTEM RECEIPT";
        receipt << "\n\t-------------------";
        receipt << "\n\n\tYour current balance is RM " << money;
    }
}