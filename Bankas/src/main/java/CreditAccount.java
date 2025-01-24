import java.math.BigDecimal;

public class CreditAccount extends BankAccount {

    private BigDecimal creditLimit;

    public CreditAccount(String name, String accountNumber, BigDecimal balance, BigDecimal creditLimit) {
        super(name, accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean withdraw(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(creditLimit) > 0) {
            return false;
        } else {
            super.withdraw(bigDecimal);
            return true;
        }
    }
}
