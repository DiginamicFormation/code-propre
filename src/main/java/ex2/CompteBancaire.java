package ex2;

/** Représente un compte bancaire de type compte courant (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */

abstract class CompteBancaire {

    /** solde : solde du compte */
    private double solde;

    /** decouvert : un découvert est autorisé seulement pour les comptes courants */
    private final double DECOUVERT;

    /** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
    private final String type;


    /**
     * Construction du compte bancaire
     * @param solde Solde
     * @param decouvert Découvert
     * @param type Type
     */
    public CompteBancaire(String type, double solde, double decouvert) {
        super();
        this.type = type;
        this.solde = solde;
        this.DECOUVERT = decouvert;
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
    public abstract void debiterMontant(double montant);
}
