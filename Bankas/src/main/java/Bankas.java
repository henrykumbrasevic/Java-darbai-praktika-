import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Bankas implements Bank {

    private Set<Account> bankAccounts = new HashSet<>();

    @Override
    public int getNumberOfAccounts() {
        return bankAccounts.size();
    }

    @Override
    public BigDecimal getTotalReserves() {
        return bankAccounts.stream().map(Account::getBalance).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
    }

    @Override
    public Collection<Account> getAllAccounts() {
        return bankAccounts;
    }

    @Override
    public Account openDebitAccount(String s) {

        for (Account bankaccount : bankAccounts) {
            if (bankaccount.getHolderName().equals(s)) {
                return null;
            }
        }
        Account account = new DebitAccount(s, accNumber(), BigDecimal.ZERO);
        bankAccounts.add(account);
        return account;
    }

    @Override
    public Account openCreditAccount(String s, BigDecimal bigDecimal) {
        for (Account bankaccount : bankAccounts) {
            if (bankaccount.getHolderName().equals(s)) {
                return null;
            }
        }
        Account account = new CreditAccount(s, accNumber(), BigDecimal.ZERO, bigDecimal);
        bankAccounts.add(account);
        return account;
    }

    @Override
    public Account getAccountByHolderName(String s) {
        return bankAccounts.stream().filter(person -> person.getHolderName().equals(s)).findAny().get();
    }

    @Override
    public Account getAccountByNumber(String s) {
        return bankAccounts.stream().filter(person -> person.getNumber().equals(s)).findAny().get();
    }

    @Override
    public void closeAccount(Account account) {
        bankAccounts.remove(account);
    }

    private String accNumber() {
        Random rand = new Random();
        StringBuilder card = new StringBuilder("LT");
        for (int i = 0; i < 14; i++) {
            int n = rand.nextInt(10);
            card.append(Integer.toString(n));
        }
        for (int i = 0; i < 16; i++) {
            if (i % 4 == 0) System.out.print(" ");
            System.out.print(card.charAt(i));
        }
        return card.toString();
    }
}