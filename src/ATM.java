
public class ATM {
    
    public static int totalMoney = 0;
    public static int numATMs = 0;

    public int money;

    public ATM(int inputMoney) {
        this.money = inputMoney;
    }

    public void withrawalMoney(int amountToWithdraw) {

        if(amountToWithdraw <= this.money) {
            this.money -= amountToWithdraw;
        }
    }

    public static void main(String[] args) {

        ATM firstATM = new ATM(1000);
        ATM secondATM = new ATM(500);

        System.out.println(firstATM.money);
        System.out.println(secondATM.money);

        System.out.println(ATM.totalMoney);
        System.out.println(firstATM.totalMoney);
        System.out.println(secondATM.totalMoney);
    }
}
