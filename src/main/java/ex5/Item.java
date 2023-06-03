package ex5;
/** Article */
public class Item {
    /** Nom de l’article */
    private String nom;
    /** Poids de l’article */
    private int poids;

    /**
     * Construction d’un article par son nom et son poids.
     * @param nom Nom
     * @param poids Poids
     */
    public Item(String nom, int poids) {
        this.nom = nom;
        this.poids = poids;
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
    /** Getter pour l'attribut poids
     * @return the poids
     */
    public int getPoids() {
        return poids;
    }
    /** Setter pour l'attribut poids
     * @param poids the poids to set
     */
    public void setPoids(int poids) {
        this.poids = poids;
    }
}
