package ex2;

/** Compte courant */
public class CompteCourant extends CompteBancaire{
    /**
     * Construction du compte courant selon son solde et
     * son découvert maximal autorisé.
     * @param solde Solde
     * @param decouvert Découvert
     */
    public CompteCourant(double solde, double decouvert) {
        super("CC", solde, decouvert);
    }
}
