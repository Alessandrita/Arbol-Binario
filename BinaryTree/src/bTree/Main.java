package bTree;

import Excepciones.IsEmptyException;

public class Main {

    public static void main(String[] args) throws IsEmptyException {
        TreeB<Integer> btree = new TreeB<>(5);
        btree.add(10);
        btree.add(5);
        btree.add(1);
        btree.add(2);
        btree.add(2);
        btree.add(22);
        btree.add(32);
        btree.add(3);
        btree.add(4);
        btree.add(89);
        btree.add(85);
        btree.add(8);
        btree.add(10);
        btree.add(9);
        btree.add(2);
        btree.add(24);
        btree.add(9);
        btree.preOrder();
        btree.inOrder();
        btree.posOrder();
        btree.remove(9);
        btree.fill(btree, 5, 0, 10);
        System.out.println(btree);
        btree.printLevel();
        System.out.println(btree.beetwen(1,8));
        System.out.println("El mayor es: "+btree.bigger());
        System.out.println("El menor es: "+btree.minor());
        System.out.println("El ancho es: "+btree.width());
         System.out.println("El alto de es : "+btree.height());
        System.exit(0);
    }
}
