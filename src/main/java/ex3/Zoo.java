package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String nom;
    private List<String> typeAnimal = new ArrayList<>();
    private List<String> noms = new ArrayList<>();
    private List<String> comportements = new ArrayList<>();

    public Zoo(String nom){
        this.nom = nom;
    }

    public void addAnimal(String nomAnimal, String typeAnimal, String comportement){
        this.typeAnimal.add(typeAnimal);
        this.noms.add(nomAnimal);
        this.comportements.add(comportement);
    }

    public void afficherListeAnimaux(){
        for (int i=0; i<typeAnimal.size(); i++) {
            System.out.println(this.noms.get(i)+" "+this.typeAnimal.get(i)+" "+this.comportements.get(i));
        }
    }

    public int taille() {
        return this.typeAnimal.size();
    }

    /** Getter for nom
     * @return the nom
     */
    public String getNom() {
        return this.nom;
    }

    /** Setter
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
