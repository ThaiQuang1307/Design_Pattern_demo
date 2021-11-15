package abstractfactory;

public class BussinessLoan extends Loan{

    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}


