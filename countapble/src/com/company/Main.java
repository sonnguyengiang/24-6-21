package com.company;

public class Main {

    public static void main(String[] args) {
        Count<String> a = new Count<>();
        a.add("0");
        a.add("0");
        a.add("0");
        a.add("0");
        a.add("0");
        a.show();
        System.out.println();
        a.remove(1);

        a.show();
        System.out.println();
        a.edit(1, "asd");
        a.show();

    }
}
