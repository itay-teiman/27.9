public class SavingAccount {

  public  static  double AnnualInterestRate;
  private  double SavingBalance;

  public  SavingAccount(){

  }

    public SavingAccount(double savingBalance) {
        SavingBalance = savingBalance;
    }

    public double getSavingBalance() {
        return SavingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        SavingBalance = savingBalance;
    }

    public  double CalculateMounthlyInterest(){
      return (AnnualInterestRate/12)*SavingBalance;
    }
}
