package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> list = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void add() {
        System.out.print("enter a id: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.print("enter a name: ");
        String name = input.nextLine();
        System.out.print("enter a pice: ");
        int pice = Integer.parseInt(input.nextLine());
        list.add(new Product(id, name, pice));
    }

    public void remove() {
        System.out.print("enter id that you want remove: ");
        int index = Integer.parseInt(input.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == index) {
                list.remove(i);
            }
        }
    }

    public void show() {
        for (Product a : list) {
            System.out.println(a);
        }
    }

    public void findByName() {
        System.out.print("enter id that you want remove: ");
        int index = Integer.parseInt(input.nextLine());
        for (int i = 0; i < list.size(); i++) {
            String name = input.nextLine();
            list.toString();
        }
    }

    public void sortUp(){
        SortUp sortUp = new SortUp();
        Collections.sort(list,sortUp);
    }

    public void sortDown(){
        SortDown sortDown = new SortDown();
        Collections.sort(list,sortDown);
    }

    public void addSort(){
        int checklist = 0;
        while (checklist == 0){
            System.out.println("   1.show sort up to down");
            System.out.println("   2.show sort down to up");
            System.out.println("   3.back");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    sortUp();
                    break;
                case 2:
                    sortDown();
                    break;
                case 3:
                    checklist = -1;
                    break;

            }
        }
    }
}
