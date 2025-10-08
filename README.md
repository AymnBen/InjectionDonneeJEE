
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

Enfin, j’ai testé le bon fonctionnement de l’application en affichant les résultats à partir de la couche de présentation, ce qui a confirmé la communication correcte entre les couches DAO, Métier et Présentation.
