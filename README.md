# DesignPattern


## Diagramme de classe 
![image](https://user-images.githubusercontent.com/82539023/198561477-6b516007-c4df-4df7-b6cb-28ea981ad543.png)


### Dans ce modèle, on voudrait aussi respecter les critères suivants :
- Donner la possibilité de Créer un groupe de figures. Chaque groupe peut contenir d’autres
groupes.  
- Nous introduisons un Objet Paramétrage dont l’état est défini par attributs par défaut comme
l’épaisseur du contour, la couleur du contour et la couleur de remplissage. On voudrait qu’à
chaque fois que l’état de cet objet change, toutes les figures doivent être notifiées pour se
mettre à jour.
- Pour l’objet dessin, on voudrait définir les opérations suivantes :
o Une méthode « traiter » qui permet de traiter le contenu du dessin en utilisant une
famille d’algorithmes qui sont interchangeables dynamiquement. Ce signifie qu’au
moment de l’exécution, l’objet dessin pour changer d’algorithme avec un autre de la
même famille. Chaque algorithme peut évoluer indépendamment de la classe dessin
qui les utilise.
 - Les méthodes qui permettent d’ajouter et supprimer des figures du dessin.
 - Une méthode qui permet d’afficher toutes les figures du dessin.
 - Une méthode qui permet de sérialiser le dessin dans un fichier binaire
