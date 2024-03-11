public class MBankAccount {
    public static void main(String[] args){
        BankAccount BA = new BankAccount(1_000_000);
        System.out.println("Saldo awal : " + BA.getBalance());

        BA.deposit(700_000);
        BA.withdraw(700_000);

        double saldo = BA.getBalance();
        System.out.println("Saldo akhir : " + saldo);
    }
}
