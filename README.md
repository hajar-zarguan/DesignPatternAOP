# DesignPattern

## Diagramme de classe 
![image](https://user-images.githubusercontent.com/82539023/198571101-396ec6b4-93cb-444f-93ab-9b1537c6673b.png)

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
![image](https://user-images.githubusercontent.com/82539023/198570590-6d0a985a-f149-4508-87c1-377c8ad584a6.png)
--- Implementation 

-- Figure
![image](https://user-images.githubusercontent.com/82539023/198575757-287f0daa-a80b-4f67-8df0-1b97a566ac26.png)


-- Cercle
![image](https://user-images.githubusercontent.com/82539023/198567068-d3f760e8-3ce6-4cd8-9049-31929c54654a.png)

-- Rectangle 
![image](https://user-images.githubusercontent.com/82539023/198567408-7b65b79f-a357-4469-9158-4002b262e8df.png)

-- Groupe
![image](https://user-images.githubusercontent.com/82539023/198572659-a7bbc05f-2407-4fcc-8335-bcf6487bc127.png)



- Nous introduisons un Objet Paramétrage dont l’état est défini par attributs par défaut comme
l’épaisseur du contour, la couleur du contour et la couleur de remplissage. On voudrait qu’à
chaque fois que l’état de cet objet change, toutes les figures doivent être notifiées pour se
mettre à jour.
-- Observer 
![image](https://user-images.githubusercontent.com/82539023/198571380-d3532af9-1750-474e-89e0-c9daee00928e.png)

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
![image](https://user-images.githubusercontent.com/82539023/198571629-2b74a4b0-4e8c-4349-a94e-4b1278915f3b.png)


-- Dessin 
![Capture](https://user-images.githubusercontent.com/82539023/198574279-6e75d748-c8fd-4607-a981-60e9fae5ab85.PNG)



## Test 
![image](https://user-images.githubusercontent.com/82539023/198575436-e0cf2bd6-755f-4d93-a28f-e365313baef8.png)



