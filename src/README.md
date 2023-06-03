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

### Exercice 3

« Je comprends que tu as un parc zoologique où tu accueilles toute sorte
d’animaux.
Du coup, je me serais attendu à croiser au moins une classe `Animal` en plus de
la classe `Zoo`.
Plus encore, j’aurais fait des sous-classes suivant l’arbre phylogénique des
bêtes citées dans la classe exécutable `ZooApplication`.

Après si ces bêtes ne sont qu’une source de donnée, on peut juste les
rassembler sous forme d’un dictionnaire `HashMap<Integer, String[3]>` selon les
attributs `types`, `noms` et `comportements`.
La raison est que ça permet de mettre en avant la corrélation des attributs,
mais aussi de distinguer chaque bête partageant les mêmes attributs.
La ligne `0` peut être réservée comme en-tête d’un tableau futur.

Après, je ne connais pas l’application exacte.

Je fais juste une petite correction en assignant tes attributs à des objets
`ArrayList` vides et en renommant `types` en `typeAnimal`…
Voilà, la méthode `afficherListeAnimaux` remarche. »