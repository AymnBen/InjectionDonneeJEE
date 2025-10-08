
## Compte rendu de l'activite : Injection de dependances en JEE 
Dans cette activite, j'ai mis en place une application JEE structuree en trois couches : DAO, Metier et Presentation. 
La couche DAO s'occupe de la recuperation des donnees, la couche Metier realise le traitement, et la couche Presentation affiche le resultat. 
 
J'ai commence par creer les interfaces IDao et IMetier, puis leurs implementations correspondantes. 
Ensuite, j'ai teste deux methodes d'injection de dependances : 
 
1. Injection statique : instanciation manuelle des classes et injection via setter. 
2. Injection dynamique : utilisation de la reflexion et d'un fichier config.txt pour un couplage faible. 
 
Ces deux approches m'ont permis de comprendre la difference entre couplage fort et faible, et l'importance de l'injection de dependances. 

Après avoir réalisé les injections statique et dynamique, j’ai pu constater la différence entre les deux approches.  
L’injection statique nécessite de modifier le code à chaque changement de classe DAO ou Métier, ce qui crée un couplage fort.  
En revanche, l’injection dynamique permet de charger les classes à partir d’un fichier de configuration externe, ce qui rend l’application plus flexible et plus facilement extensible.

Cette expérience m’a permis de mieux comprendre le principe du **couplage faible** et la manière dont l’injection de dépendances facilite la maintenance et l’évolution d’une application Java.  
C’est une étape importante avant de passer à l’utilisation d’un framework comme **Spring**, qui automatise entièrement ce processus d’injection.
## Injection de dépendances avec Spring (XML et Annotations)

Dans la dernière partie de cette activité, j’ai utilisé le framework **Spring** pour automatiser l’injection de dépendances.  
Spring permet de gérer le cycle de vie des objets et leurs relations grâce à un conteneur d’inversion de contrôle (IoC Container).

### 🧩 1. Configuration avec XML
J’ai créé un fichier `config.xml` dans lequel j’ai déclaré les beans `d`, `d2` et `metier`, ainsi que leur liaison :
- Le conteneur Spring se charge automatiquement de créer les instances.
- L’injection se fait sans avoir besoin de modifier le code Java.
Cette approche montre la puissance de la configuration déclarative de Spring.

### 🧩 2. Configuration avec les annotations
Ensuite, j’ai remplacé la configuration XML par des **annotations Spring** :
- `@Component` pour déclarer les classes comme des beans.
- `@Repository` pour la couche **DAO** (accès aux données).
- `@Service` pour la couche **métier** (logique de traitement).
- `@Autowired` pour indiquer à Spring quelle dépendance injecter automatiquement.

Grâce à ces annotations, Spring détecte et lie automatiquement les différentes couches du projet sans qu’on ait besoin de les instancier manuellement.

### ✅ Résultat final
Les deux approches (XML et annotations) donnent le même résultat :  
Spring se charge de l’injection sans instanciation manuelle ni fichier de configuration externe complexe.

### 🧠 Conclusion générale
L’utilisation de Spring m’a permis de comprendre comment le framework facilite la gestion des dépendances à grande échelle.  
Grâce à lui, le **couplage faible** est entièrement respecté, et le code devient plus **modulaire, réutilisable et maintenable**.


