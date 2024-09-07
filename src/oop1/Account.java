package oop1;

public class Account {
    int balance;

    int deposit(int amount){
        balance += amount;
        System.out.println(amount + "원이 입금 되었습니다.\n 현재 잔액 : " + balance);
        return balance;
    }

    int withdraw(int amount){
        if(balance > amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금 되었습니다.\n 현재 잔액 : " + balance);
        }
        else{
            System.out.println("잔액 부족");
        }
        return balance;
    }
}
