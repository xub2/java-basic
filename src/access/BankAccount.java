package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    //public 메서드 입금 deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    //public 메서드 출금 withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        }
        else{
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    //public 메서드 잔액 보여주기
    public int getBalance(){
        return balance;
    }

    //amount 가 정상적인 값이 입력되었는지 검증하는 로직
    private boolean isAmountValid (int amount){
        return amount > 0; // 금액이 0보다 커야함
    }
}
