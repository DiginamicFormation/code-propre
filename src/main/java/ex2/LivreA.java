package ex2;

public class LivreA extends CompteBancaire{

    /** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
    private double tauxRemuneration;

    /**
     * Construction du livret A selon son solde et
     * son découvert maximal autorisé.
     * @param solde
     */
    public LivreA(double solde) {
        super("LA", solde, 0);
    }

    /**
     * Appliquer le calcul de la rémunération annuelle.
     */
    public void appliquerRemunerationAnnuelle(){
        this.solde = this.solde * (1 + this.tauxRemuneration / 100);
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
}
