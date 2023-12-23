package Storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Storage {
    private boolean bool;
    private String id;
    private String address;
    private int capacity;
    private int fill;
    private final Worker worker = new Worker();
    private final List<Product> products = new ArrayList<>();

    public boolean getBool() {
        return bool;
    }

    public List<Product> getProducts() {
        return products;
    }



    public void movementOfProduct(Storage storage, Product product) { // перемещение продуктов
        if (bool) { // проверка открыт или закрыт склад
            if (storage.filling(product)) { // проверка на заполненность
                storage.products.add(product);
                for (int i = 0; i < storage.products.size(); i++) {
                    for (int j = 0; j < products.size(); j++) {
                        if (storage.products.get(i) == products.get(j)) { // находим в списке товар
                            products.remove(j); //удаляем с прежнего места
                            break;
                        }
                    }
                }
            } else {
                System.out.println();
                System.out.println("Ячейки с товаром переполнены.");
            }
        } else {
            System.out.println();
            System.out.println("Склад закрыт");
        }
    }

    public boolean filling(Product product) {
        int temp = fill;
        fill += product.getSize();
        if (fill > capacity) { // если заполненность выше дозволенной
            System.out.println("Превышен лимит вместимости.");
            fill = temp;
            return false;
        }
        return true;
    }

    Scanner scan = new Scanner(System.in);

    public void setData() { // создание
        String temp;
        int tempI;
        bool = true;
        System.out.println("||| Создание |||");
        System.out.println("Доступные данные - Айди, Адрес, Вместительность, Ответственное лицо.");
        System.out.println();
        System.out.println("Задайте Айди:");
        temp = scan.nextLine();
        if (temp.isEmpty()) {
            System.out.println("Данные не изменены.");
            System.out.println();
        } else {
            id = temp;
            System.out.println("Данные изменены.");
            System.out.println();
        }
        System.out.println("Задайте Адрес:");
        temp = scan.nextLine();
        if (temp.isEmpty()) {
            System.out.println("Данные не изменены.");
            System.out.println();
        } else {
            address = temp;
            System.out.println("Данные изменены.");
            System.out.println();
        }
        System.out.println("Задайте вместительность склада:");
        tempI = scan.nextInt();
        if (tempI < 1) {
            System.out.println("Данные не изменены.");
            System.out.println();
        } else {
            capacity = tempI;
            System.out.println("Данные изменены.");
            System.out.println();
        }
        fill = 0;
        System.out.println("Заполните данные ответственного лица:");
        worker.setData();
    }

    public void openClose() {
        bool = !bool;
    }

    public void changeWorker() {
        System.out.println("Смена ответственного лица.");
        System.out.println("Заполните новые данные ответственного лица:");
        worker.setData();
    }

    public String getInfoAboutProducts() {
        if (getProducts().isEmpty()) {
            System.out.println("Ячейки с товаром пусты.");
        } else {
            System.out.println("Кол-во ячеек - " + products.size() + ".");
            for (int i = 0; i < products.size(); i++) {
                System.out.println();
                System.out.print("Информация о ячейке под номером ");
                System.out.print(i + 1 + "."); // индексация
                System.out.println(" Айди: " + products.get(i).getId()); //обращение к конкретному продукту
                System.out.println("Название: " + products.get(i).getName());
                System.out.println("Описание товара: " + products.get(i).getDescription());
                System.out.println("Вес: " + products.get(i).getSize());
                System.out.println("Цена: " + products.get(i).getPrice());
            }
        }
        return null;
    }

    public String getInfo() {
        return " Айди: " + id + " Адрес: " + address + " Вместимость: " + capacity + " Заполненность: " + fill + " Ответственное лицо: " + worker.getName() + " Возраст: " + worker.getAge() + " Продукты: " + getInfoAboutProducts() + " ";
    }
}
