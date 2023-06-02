package ex2;
/** Représente un compte bancaire de type livret A (type=LA)
 * @author DIGINAMIC
 */
public class LivretARate extends CompteBancaireRate {
    public LivretARate(String type,
                       double solde,
                       double tauxRemuneration) {
        super(type,
                solde,
                0,
                tauxRemuneration);
    }
}
