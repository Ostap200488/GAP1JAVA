public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("001", "Alice", 5000);
        Account acc2 = new Account("002", "Bob", 4000);

        System.out.println("Initial Balances:");
        System.out.println(acc1.getName() + "'s balance: $" + acc1.getBalance());
        System.out.println(acc2.getName() + "'s balance: $" + acc2.getBalance());

        System.out.println("\nTransferring $1000 from " + acc1.getName() + " to " + acc2.getName() + "...");
        acc1.transferTo(acc2, 1000);

        System.out.println("\nBalances after transfer:");
        System.out.println(acc1.getName() + "'s balance: $" + acc1.getBalance());
        System.out.println(acc2.getName() + "'s balance: $" + acc2.getBalance());
    }
}
