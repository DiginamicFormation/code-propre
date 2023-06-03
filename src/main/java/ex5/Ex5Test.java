package ex5;

public class Ex5Test {
    public static void main(String[] args){
        final Inventaire inventaire = new Inventaire();
        inventaire.addItem(new Item("Article0", 7));
        inventaire.addItem(new Item("Article1", 15));
        inventaire.addItem(new Item("Article2", 1));
        System.out.println("Taille de l’inventaire: " +
                inventaire.taille());
    }
}
