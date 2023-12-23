package Storage;
import java.awt.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // fileReader
        //fileWriter
        File file = new File("testFile.txt");
        PrintWriter pw = new PrintWriter(file);
        Warehouse warehouse = new Warehouse();
        warehouse.setData();
        PointOfSell pointOfSell = new PointOfSell();ч
        pointOfSell.setData();
        warehouse.purchase();
        //warehouse.changeWorker();
        warehouse.movementOfProduct(pointOfSell,warehouse.getProducts().get(0));
        Purchaser purchaser = new Purchaser();
        purchaser.setData();
        //pointOfSell.sale(pointOfSell.getProducts().get(0), purchaser);
        String info = warehouse.getInfo();
        String infoAboutPOS = pointOfSell.getInfo();
        String purchasingByPurchaser = purchaser.getPurchases();
        warehouse.getInfo();
        pointOfSell.getInfoAboutProducts();
        pointOfSell.getCountOfSale();
        pw.println(info);
        pw.println(infoAboutPOS);//info about point of sale
        pw.println(purchasingByPurchaser);
        pw.close();


    }
}