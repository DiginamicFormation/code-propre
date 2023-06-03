package ex5;

import java.util.ArrayList;
import java.util.List;
/** Caisse */
public class Caisse {
    /** Nom de la caisse */
    private String nom;
    /** Article encaissé */
    private List<Item> items;
    /** Poids minimal accepté d’article */
    private final int POIDS_MIN;
    /** Poids maximal accepté d’article */
    private final int POIDS_MAX;

    /**
     * Construction de la caisse.
     * @param nom Nom de la caisse
     * @param poidsMin Poids minimal accepté d’article
     * @param poidsMax Poids maximal accepté d’article
     */
    public Caisse(String nom, int poidsMin, int poidsMax) {
        super();
        this.nom = nom;
        this.items = new ArrayList<>();
        this.POIDS_MIN = poidsMin;
        this.POIDS_MAX = poidsMax;
    }

    /** Getter pour l'attribut nom
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /** Setter pour l'attribut nom
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /** Getter pour l'attribut items
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /** Setter pour l'attribut items
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * Ajouter un article.
     * @param item Article
     */
    public void add(Item item){
        if(item.getPoids() >= POIDS_MIN &&
                item.getPoids() < POIDS_MAX){
            this.items.add(item);
        }
    }

    /**
     * Total d’articles encaissés.
     * @return Total d’articles
     */
    public int total(){
        return this.items.size();
    }
}
