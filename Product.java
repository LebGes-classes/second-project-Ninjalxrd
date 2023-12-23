package Storage;
import java.util.Scanner;
public class Product {
    private String id;
    private String name;
    private String description;
    private String price;
    private int size;

    Scanner scan = new Scanner(System.in);

    public void setData() { // устанавливаешь всю инфу по товару

        System.out.println("Введите айди товара:");
        String temp = scan.next();
        scan.nextLine();
        setId(temp);
        System.out.println("Введите название товара:");
        temp = scan.nextLine();
        setName(temp);
        System.out.println("Введите описание товара:");
        temp = scan.nextLine();
        setDescription(temp);
        System.out.println("Введите цену товара:");
        temp = scan.next();
        scan.nextLine();
        setPrice(temp);
        System.out.println("Введите вес товара в граммах:");
        int razmer = scan.nextInt();
        setSize(razmer);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String returnInfo() { //вводишь айди, по айди получаешь всю информацию о конкретном товаре
        return " Айди: " + getId() + " Наименование продукта: " + getName() + " Цена: " + getPrice() + " Вес: " + getSize() + " ";
    }
}
