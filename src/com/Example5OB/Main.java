package com.Example5OB;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        cocheCrud.delete();
        cocheCrud.findAll();
        cocheCrud.save();
    }

}
