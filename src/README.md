# code-propre
## Nettoyage de code

### Exercice 2

Le livret A n’était pas documenté.

Le compte courant ne semble pas exister.
Le compte bancaire devrait être une classe abstraite dont héritent le compte
courant et le livret A.

Si le livret A est le seul à avoir un taux de rémunération annuel le compte
bancaire n’est pas sensé en avoir.

Appeler la classe mère `Object` par le constructeur `super` est inutile dans
la classe `CompteBancaire`: il est implicite.

La méthode `debiterMontant` ne sera vraiment appliquée que dans les classes
filles.
~~Autant qu’elle soit abstraite dans `CompteBancaire` et définies dans chaque
classe fille.~~ Elle peut être simplifiée puisque l’absence de découvert
peut être illustrée par `decouvert=0`.
De plus sa documentation est incorrecte.

La méthode `appliquerRemunerationAnnuelle` est mal nommée et devrait être
définie dans la classe `LivretA`.

Le solde `solde` n’a pas besoin de mutateur `setSolde`.
Les méthodes `ajouterMontant` et `debiterMontant` gèrent son évolution avec
plus de contrôle.

Autre détail : tabulation convertie en 4 espaces pour indenter.
