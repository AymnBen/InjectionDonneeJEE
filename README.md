
## Compte rendu de l'activite : Injection de dependances en JEE 
Dans cette activite, j'ai mis en place une application JEE structuree en trois couches : DAO, Metier et Presentation. 
La couche DAO s'occupe de la recuperation des donnees, la couche Metier realise le traitement, et la couche Presentation affiche le resultat. 
 
J'ai commence par creer les interfaces IDao et IMetier, puis leurs implementations correspondantes. 
Ensuite, j'ai teste deux methodes d'injection de dependances : 
 
1. Injection statique : instanciation manuelle des classes et injection via setter. 
2. Injection dynamique : utilisation de la reflexion et d'un fichier config.txt pour un couplage faible. 
 
Ces deux approches m'ont permis de comprendre la difference entre couplage fort et faible, et l'importance de l'injection de dependances. 
