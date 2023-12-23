package Storage;
public class PointOfSell extends Warehouse {
    int countOfSale;

    public void getCountOfSale() {
    }
    public void sale(Product product, Purchaser purchaser) {
        if (getBool()) {
            if (getProducts().isEmpty()) {
                System.out.println("В пункте продаж нет товара.");
            } else {
                for (int i = 0; i < getProducts().size(); i++) {
                    if (getProducts().get(i).getId().equals(product.getId())) { //если айди товара совпадает с нужным
                        getProducts().remove(i); // очищаем из прежнего списка, как бы продали
                        purchaser.setCountOfPurchase(purchaser.getCountOfPurchase() + 1); //покупок у покупателя на 1 больше
                        countOfSale++;
                        break;
                    } else {
                        System.out.println("Такого товара нет.");
                    }
                }

            }
        } else {
            System.out.println("Пункт продаж закрыт.");
        }
    }

    public void setData() {
        System.out.println("Создание пункта продаж:");
        super.setData();
    }

    public String getInfo() {
        System.out.println("Информация о пункте продаж:");
        return super.getInfo();
    }

}
