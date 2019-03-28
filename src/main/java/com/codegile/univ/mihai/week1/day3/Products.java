package com.codegile.univ.mihai.week1.day3;

import java.util.*;

class ProductsComparator implements Comparator<String> {
    private HashMap<String, Product> prods = null;

    public ProductsComparator(HashMap<String, Product> p) {
        prods = p;
    }

    public int compare(String a, String b) {
        return prods.get(a).getDescription().compareTo(prods.get(b).getDescription());

    }
}


public class Products {
    //public ArrayList<Product> prods = null;

    public HashMap<String, Product> prods = null;

    public Products() {
        prods = new HashMap<>();
    }

    public void addProduct(Product p) {
        Product tmp = prods.get(p.getCod());
        if (tmp != null) {
            //exista deja
            tmp.setCount(tmp.getCount() + 1);
            prods.put(tmp.getCod(), tmp);
        } else {
            p.setCount(1);
            prods.put(p.getCod(), p);
        }
    }

    public void showReport() {
        ProductsComparator cmp = new ProductsComparator(prods);
        TreeMap<String, Product> sorted = new TreeMap<>(cmp);

        sorted.putAll(prods);

        for (String c : sorted.keySet()) {
            System.out.println(sorted.get(c).getDescription() + " , " + sorted.get(c).getCount() + " Products.");
        }
    }


    public static void main(String args[]) {
        Products prods = new Products();

        Product p = new Product("1s01", "tricou rosu 1s01");
        Product p2 = new Product("1s01", "tricou rosu 1s01");
        Product p3 = new Product("1s02", "tricou negru 1s02");
        Product p4 = new Product("1m01", "tricou galben 1m01");
        Product p5 = new Product("1m01", "tricou galben 1m01");

        prods.addProduct(p);
        prods.addProduct(p2);
        prods.addProduct(p3);
        prods.addProduct(p4);
        prods.addProduct(p5);

        prods.showReport();

    }


}
