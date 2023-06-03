package ex5;

import java.util.ArrayList;
import java.util.List;
/** Inventaire d’encaissement */
public class Inventaire {
    /** Ensemble de caisses exploitées */
    private final List<Caisse> caisses;

    /**
     * Construction de l’inventaire.
     */
    public Inventaire() {
        this.caisses = new ArrayList<>(3);
        final String[] noms = {"Petits", "Moyens", "Grands"};
        final int[] extrema = {Integer.MIN_VALUE, 5, 20, Integer.MAX_VALUE};
        for(int i=0; i<3; i++){
            this.caisses.add(new Caisse(noms[i] + " objets",
                    extrema[i],
                    extrema[i+1]));
        }
    }

    /**
     * Ajouter un article.
     * @param item Article
     */
    public void addItem(Item item) {

        //TODO Faites évoluer ce code (idée: c'est la caisse qui doit
        // "savoir" si elle peut accepter un objet ou non)
        caisses.forEach(caisse -> caisse.add(item));
    }

    /**
     * Taille de l’inventaire en articles.
     * @return Total d’articles
     */
    public int taille() {

        //TODO faites évoluer ce code.
        int total = 0;
        for(Caisse caisse: this.caisses){
            total += caisse.total();
        }
        return total;

    }
}
