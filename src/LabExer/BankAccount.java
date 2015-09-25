/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabExer;

/**
 *
 * @author armando
 */
public class BankAccount {
private int balance;
private int accountNumber;
private String accountName;

// this is the constructor

public BankAccount(int num, String name) {
balance = 0;
accountNumber = num;
accountName = name;
}


// the code for the methods starts here

public int getBalance() { return balance;}

public void credit(int

amount){balance=balance+amount; }

public void debit(int amount) {balance = balance -

amount;}

public String toString() {

return (("#######################\n" + "Account number:"
+ accountNumber + "\nAccount name: " 
+ accountName
+ "\nBalance: $" + balance ));
}
public static void main(String[] args) {
    BankAccount savings = new BankAccount(121,"John Doe");
    BankAccount cheque = new BankAccount(122,"John Perez");
      savings.credit(1000);
System.out.println(savings);
cheque.credit(500); 
System.out.println(cheque);
cheque.credit(1500); 
System.out.println(cheque);
cheque.debit(200); 
System.out.println(cheque);


BankAccount myAccount;
myAccount = cheque;
System.out.println(myAccount);
  }


}