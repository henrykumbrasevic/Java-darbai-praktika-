import ibank.Account;

import java.math.BigDecimal;

public abstract class BankAccount implements Account {

    private String accountNumber;
    private String name;
    private BigDecimal balance;

    public BankAccount(String name, String accountNumber, BigDecimal balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String getNumber() {
        return accountNumber;
    }

    @Override
    public String getHolderName() {
        return name;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public boolean deposit(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(BigDecimal.ZERO) <= 0) {
            return false;
        } else {
            balance = balance.add(bigDecimal);
            return true;
        }
    }

    @Override
    public boolean withdraw(BigDecimal bigDecimal) {
        balance = balance.subtract(bigDecimal);
        return true;
    }
}