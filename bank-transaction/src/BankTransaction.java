abstract class BankTransaction {
    abstract protected void askOfCard();
    abstract protected void askOfPIN();
    abstract protected void moneyPaymant();
    abstract protected void cashOutsite();
    abstract protected void thanks();
    protected void confirmAsk() {
        System.out.println("Potwierdzenie przyjęcia zlecenia...");
    }
    protected void checkAccount() {
        System.out.print("Sprawdzanie stanu dostępnych środków...");
        try {
            int i = 10;
            while (i > 0) {
                System.out.print("$");
                Thread.sleep(1000);
                i -= 1;
            }
            System.out.println();
        } catch (InterruptedException e) {}
    }
    protected void confirmAccount() {
        System.out.println("Możliwa wypłata środków.");
    }
}

class BankATM extends BankTransaction {
    protected void askOfCard() {
        System.out.println("Proszę o wprowadzenie karty do bankomatu.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
    }
    protected void askOfPIN() {
        System.out.println("Wprowadź PIN");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
    }
    protected void moneyPaymant() {
        System.out.println("Wybrałeś opcję wypłaty");
    }
    protected void cashOutsite() {
        System.out.print("Wypłata gotówki w toku... ");
        try {
            int i = 10;
            while (i > 0) {
                System.out.print("$");
                Thread.sleep(1000);
                i -= 1;
            }
            System.out.println("\nPamiętaj, aby zabrać swoją kartę!");
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

    }
    protected void thanks() {
        System.out.println("Dziękujemy za skorzystanie z usług naszego banku.");
    }
}

class Application9 {
    public static void main(String[] arhs) {
        BankATM myCash = new BankATM();
        myCash.askOfCard();
        myCash.askOfPIN();
        myCash.moneyPaymant();
        myCash.confirmAsk();
        myCash.checkAccount();
        myCash.confirmAccount();
        myCash.cashOutsite();
        myCash.thanks();
    }
}
