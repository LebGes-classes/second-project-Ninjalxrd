package Storage;
public class Purchaser extends Human{
    private int countOfPurchase;

    public int getCountOfPurchase() {
        return countOfPurchase;
    }

    public void setCountOfPurchase(int countOfPurchase) {
        this.countOfPurchase = countOfPurchase;
    }

    public void setData() {
        System.out.println(" ");
        System.out.println("Создание покупателя:");
        System.out.println(" ");
        super.setData();
    }

    public String getPurchases () {
        return "Количество товаров у покупателя: " + countOfPurchase;
    }
}
