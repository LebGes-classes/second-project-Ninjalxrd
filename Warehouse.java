package Storage;
import java.util.UUID;

public class Warehouse extends Storage {

    public void purchase() { // закупка товара
        if (getBool()) {// если склад не закрыт
            Product newProduct = new Product();
            newProduct.setData();
            if (filling(newProduct)) { //если есть место
                getProducts().add(newProduct);
            }
        }else{
            System.out.println("Склад закрыт.");
        }
        }
}
