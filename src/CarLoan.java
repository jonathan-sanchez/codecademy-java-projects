//CarLoan class
public class CarLoan {
    //This program calculates your monthly payment after taking out a car loan.
    public static void main(String[] args) {
        //invoke instances here
        int carLoan = 25000;
        int loanLength = 5;
        int interestRate = 5;
        int downPayment = 5000;

        //if statement to calculate monthly payment.
        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan."); //Helpful error message for the user.
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full."); //Helpful message for the user

            //if none of the previous boolean expressions evaluate to true, calculate monthly payment.
        } else {
            int remainingBalance = carLoan - downPayment;
            //Convert loan length from years to months.
            int months = loanLength * 12;
            //This represents the monthly payment without interest included
            int monthlyBalance = remainingBalance / months;
            //The user needs to pay interest on the loan borrowed.
            int interest = monthlyBalance * interestRate / 100;
            //Here we calculate the final payment.
            int monthlyPayment = monthlyBalance + interest;
            //Print monthlyPayment
            System.out.println(monthlyPayment);
        }
    }
}
