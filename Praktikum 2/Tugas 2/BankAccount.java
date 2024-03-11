public class BankAccount {
    //deklarasi atribut
    private float balance;

    //deklarasi konstruktor
    public BankAccount(){
        balance = 0;
    }

    //deklarasi overloading
    public BankAccount(float initialBalance){
        balance = initialBalance;
    }

    //deklarasi methode
    public void setBalance(float b){
        balance = b;
    }

    public float getBalance(){
        return balance;
    }

    public void deposit(float jumlah){
        if ( jumlah > 0){
            balance += jumlah;
        }
    }
    public void withdraw(float jumlah){
        if (jumlah > 0 && jumlah <= balance){
            balance += jumlah;
        }
    }

}
