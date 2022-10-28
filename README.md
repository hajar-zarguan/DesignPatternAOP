# DesignPattern


## Diagramme de classe 
![image](https://user-images.githubusercontent.com/82539023/198561477-6b516007-c4df-4df7-b6cb-28ea981ad543.png)

## Consignes
On souhaite concevoir et développer une application qui permet manipuler des dessins. Un Dessin
contient un ensemble de figures géométriques qui peuvent être soit des rectangles ou des cercles.
Pour chaque figure on souhaite calculer son périmètre et sa surface et on souhaite définir une méthode
qui permet de dessiner la figure (Afficher l’état de la figure). Un cercle est défini par son centre qui est
un point et par son rayon R. Un rectangle est défini par un point qui représente le coin supérieur
gauche, sa largeur L et sa hauteur H. Un point est définit par ses coordonnées X et Y. Pour le cercle, sa
surface veut π * R
2 alors sa surface vaut 2 * π *R. Pour le rectangle, sa surface veut L * H alors sa surface
vaut 2 *(L+H)

### Dans ce modèle, on voudrait aussi respecter les critères suivants :
- Donner la possibilité de Créer un groupe de figures. Chaque groupe peut contenir d’autres
groupes.  
-- Composite
![image](https://user-images.githubusercontent.com/82539023/198566111-acdff8b2-a2c1-4772-9b44-4fec44e129ef.png)

--- Implementation 

-- Figure
![image](https://user-images.githubusercontent.com/82539023/198567136-81ef56ea-cb3e-488c-a6fb-00001dd75ffd.png)

-- Cercle
![image](https://user-images.githubusercontent.com/82539023/198567068-d3f760e8-3ce6-4cd8-9049-31929c54654a.png)

-- Rectangle 
![image](https://user-images.githubusercontent.com/82539023/198567408-7b65b79f-a357-4469-9158-4002b262e8df.png)



- Nous introduisons un Objet Paramétrage dont l’état est défini par attributs par défaut comme
l’épaisseur du contour, la couleur du contour et la couleur de remplissage. On voudrait qu’à
chaque fois que l’état de cet objet change, toutes les figures doivent être notifiées pour se
mettre à jour.
-- Observer 
![image](https://user-images.githubusercontent.com/82539023/198568193-9869761a-a0ed-48f8-ae3f-aa62cbe345ec.png)

-- Implementation
![image](https://user-images.githubusercontent.com/82539023/198567855-1af7fbfe-1b6f-43b6-87ed-9a140c42e742.png)



- Pour l’objet dessin, on voudrait définir les opérations suivantes :
o Une méthode « traiter » qui permet de traiter le contenu du dessin en utilisant une
famille d’algorithmes qui sont interchangeables dynamiquement. Ce signifie qu’au
moment de l’exécution, l’objet dessin pour changer d’algorithme avec un autre de la
même famille. Chaque algorithme peut évoluer indépendamment de la classe dessin
qui les utilise.
 - Les méthodes qui permettent d’ajouter et supprimer des figures du dessin.
 - Une méthode qui permet d’afficher toutes les figures du dessin.
 - Une méthode qui permet de sérialiser le dessin dans un fichier binaire
 
 --- Strategy
 ![image](https://user-images.githubusercontent.com/82539023/198568555-8cc8c688-760b-43c6-856f-9c0833dd6a27.png)

