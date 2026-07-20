class BankAccount {

  private final String accountNumber;
  private int balance;

  public BankAccount(String accountNumber, int initialBalance) {
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
  }
  public synchronized boolean withdraw(int amount) {

    System.out.println(Thread.currentThread().getName()
            + " intenta retirar $" + amount);

    if (balance >= amount) {

      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }

      balance -= amount;

      System.out.println(Thread.currentThread().getName()
              + " realizó el retiro. Saldo: $" + balance);

      return true;
    }

    System.out.println(Thread.currentThread().getName()
            + " retiro rechazado. Saldo insuficiente.");

    return false;
  }

  public int getBalance() {
    return balance;
  }

  public String getAccountNumber(){
    return accountNumber;
  }
}

public class RaceConditionExample {

  public static void main(String[] args) throws InterruptedException {

    BankAccount account = new BankAccount("ACC-1001", 100);

    Runnable task = () -> {
      boolean success = account.withdraw(80);

      System.out.println(Thread.currentThread().getName()
              + " -> Resultado: "
              + (success ? "Retiro aprobado" : "Retiro rechazado"));
    };

    Thread t1 = new Thread(task, "Cliente-1");
    Thread t2 = new Thread(task, "Cliente-2");

    System.out.println("Saldo inicial: $" + account.getBalance());
    System.out.println("--------------------------------");

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println("--------------------------------");
    System.out.println("Saldo final de la cuenta "
            + account.getAccountNumber() + ": $"
            + account.getBalance());
  }
}
