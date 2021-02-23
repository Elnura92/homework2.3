package com.company;

public class BankAccount {
    private double amount;

    public void setAmount(double amount){
        this.amount = amount;
    }



    public double getAmount(){
        return amount;
    }

    public void deposit(double sum){
        amount += sum;


    }

    public void withDraw(int sum) throws LimitException {
        if(amount < sum){
            throw new LimitException("Запрашиваемая вами сумма больше остатка на счете", amount);
        }
        amount -= sum;

    }
}
