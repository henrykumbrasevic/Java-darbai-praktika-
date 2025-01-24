import java.math.BigDecimal;

public class DebitAccount extends BankAccount {
    public DebitAccount(String name, String accountNumber, BigDecimal balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public boolean withdraw(BigDecimal bigDecimal){
        if (bigDecimal.compareTo(getBalance()) <= 0) {
            super.withdraw(bigDecimal);
            return true;
        } else {
            return false;
        }
    }
}
