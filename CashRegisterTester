/**
 * Esta classe testa a classe Caixa registradora.
 */
public class CashRegisterTester {
    public static void main(String[] args) {
        CashRegister register = new CashRegister();

        // Primeira compra
        register.recordPurchase(0.75);
        register.recordPurchase(1.50);
        register.enterPayment(2, 0, 5, 0, 0);
        System.out.print("Troco: ");
        System.out.println(register.giveChange());
        System.out.println("Esperado: 0.25");

        // Segunda compra
        register.recordPurchase(2.25);
        register.recordPurchase(19.25);
        register.enterPayment(23, 2, 0, 0, 0);
        System.out.print("Troco: ");
        System.out.println(register.giveChange());
        System.out.println("Esperado: 2.0");
    }
}
