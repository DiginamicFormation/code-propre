package ex2;

/** Représente un compte bancaire de type compte courant (type=CC)
 * ou livret A (type=LA)
 * @author DIGINAMIC
 * @author FYHenry
 */
abstract class CompteBancaire {

    /** solde : solde du compte */
    protected double solde;

    /** decouvert : un découvert est autorisé seulement pour les
     * comptes courants.
     */
    protected double decouvert;

    /** Le type vaut soit "CC" (Compte courant), soit "LA" (Livret A) */
    private final String type;


    /**
     * Construction du compte courant selon son solde et
     * son découvert maximal autorisé.
     * @param solde Solde
     * @param decouvert Découvert
     * @param type Type
     */
    public CompteBancaire(String type, double solde, double decouvert) {
        super();
        this.type = type;
        this.solde = solde;
        this.decouvert = decouvert;
    }

    /** Ajoute un montant au solde
     * @param montant Montant
     */
    public void ajouterMontant(double montant){
        this.solde += montant;
    }

    /** Débite un montant au solde
     * @param montant
     */
    public void debiterMontant(double montant) {
        if (this.solde - montant > this.decouvert){
            this.solde = this.solde - montant;
        }
    }

    /**
     * Obtenir le solde.
     * @return Solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Obtenir le découvert maximal autorisé.
     * @return Découvert
     */
    public double getdecouvert() {
        return decouvert;
    }

    /**
     * Obtenir le type du compte bancaire : "CC" pour le compte
     * courant ou "LA" pour le livret A.
     * @return Type de compte
     */
    public String getType() {
        return type;
    }

    /**
     * Redéfinir le découvert maximal autorisé.
     * @param decouvert Découvert
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
