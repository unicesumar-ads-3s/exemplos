/**
 * A caixa registradora calcula o total e o troco devido.
 */
public class CashRegister {
    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE=0.1;
    public static final double NICKEL_VALUE=0.05;
    public static final double PENNY_VALUE=0.01;

    private double purchase;
    private double payment;

    /**
     * Constroi uma instancia da caixa registradora sem dinheiro
     */
    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    /**
     * Registra a compra de um item.
     * 
     * @param amount o valor do item comprado
     */
    public void recordPurchase(double amount) {
        purchase = purchase + amount;
    }

    /**
     * Entra o valor recebido pelo cliente. 
     * 
     * @param dollars valor recebido em dolar
     * @param quarters quantidade de moedas de 25 cents
     * @param dimes quantidade de moedas de 10 cents
     * @param nickels quantidade de moedas de 5 cents
     * @param pennies quantidade de moedas de 1 cent
     */
    public void enterPayment(int dollars, int quarters, int dimes, int nickels, int pennies) {
        payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE + nickels * NICKEL_VALUE
                + pennies * PENNY_VALUE;
    }

    /**
     * Calcula o troco devido e zera os valores para o próximo cliente.
     * 
     * @return o valor do troco devido para o cliente.
     */
    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
