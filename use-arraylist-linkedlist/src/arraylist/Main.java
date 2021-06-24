package arraylist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1.add");
            System.out.println("2.remove");
            System.out.println("3.find");
            System.out.println("4.show");
            System.out.println("5.sort");
            System.out.println("0.exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.remove();
                    break;
                case 3:
                    productManager.findByName();
                    break;
                case 4:
                    productManager.show();
                    break;
                case 5:
                    productManager.addSort();
                    break;
                case 0:
                    System.exit(0);
            }

        }
    }
}
