package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount accaunt = new BankAccount();

        accaunt.setAmount(20000);

        while(true) {
            double remainAmount = 0;
            try{
                accaunt.withDraw(6000);
                System.out.println("Вы сняли со счета 6000 сом");
                System.out.println("Остаток на счете: " + accaunt.getAmount());
            }catch (LimitException le){
                System.out.println(le.getMessage());
                System.out.println("Вы сняли всю сумму со счета: " + accaunt.getAmount());
                remainAmount = accaunt.getAmount()- accaunt.getAmount();

                break;
            }


        }

    }
}
