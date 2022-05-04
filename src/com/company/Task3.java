package com.company;


import javax.naming.InsufficientResourcesException;

class AccountDzumbunu56874 {
    String ownerDzumbunu56874, AccountNumberDzumbunu56874;
    int BalanceDzumbunu56874;
//constr
    public AccountDzumbunu56874(String james, String s, int i) {
    }

    public void AccountDzumbunu56874(String ownerDzumbunu56874, String AccountNumberDzumbunu56874, int BalanceDzumbunu56874) {
        this.ownerDzumbunu56874 = ownerDzumbunu56874;
        this.AccountNumberDzumbunu56874 = AccountNumberDzumbunu56874;
        this.BalanceDzumbunu56874 = BalanceDzumbunu56874;
    }

    public String getOwnerDzumbunu56874() {
        return ownerDzumbunu56874;
    }

    public void setOwnerDzumbunu56874(String owner) {
        this.ownerDzumbunu56874 = ownerDzumbunu56874;
    }

    public String getAccountNumberDzumbunu56874() {
        return AccountNumberDzumbunu56874;
    }

    public void setAccountNumberDzumbunu56874(String accountnumber2Dzumbunu56874) {
        AccountNumberDzumbunu56874 = accountnumber2Dzumbunu56874;
    }

    public int getBalanceDzumbunu56874() {
        return BalanceDzumbunu56874;
    }

    public void setBalanceDzumbunu56874(int balanceDzumbunu56874) {
        BalanceDzumbunu56874 = balanceDzumbunu56874;
    }

    public void Transfer(int amount) throws InsufficientFundsException
    {
        if (BalanceDzumbunu56874 > amount)
        {
            BalanceDzumbunu56874 -= amount;
        } else
        {
            throw new InsufficientFundsException ("Insufficient Funds");
        }
    }

}

public  class Task3 {
    public static void main(String[]args) throws InsufficientFundsException {
        AccountDzumbunu56874 User1 = new AccountDzumbunu56874("James", "0000 1111 0000 5555 0008", 10000);
        AccountDzumbunu56874 User2 = new AccountDzumbunu56874("Samuel","3535 0404 3535 0404 3535",10000);
        try{
            User2.Transfer(4000);
        }
        catch(InsufficientFundsException tj){
            System.out.println(tj);
        }
        finally{
            System.out.println("New balance is "+User2.BalanceDzumbunu56874);
        }

    }
}
