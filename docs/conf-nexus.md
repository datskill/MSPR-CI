# Configuration de Nexus Repository OSS

Le container Docker "**Nexus3**" est normalement déjà allumé, sinon exécutez `docker-compose up -d`

Nexus va nous permettre de stocker nos artifacts générés par Jenkins dans un dépôt, ces artifacts seront ensuite téléchargeable sur les différents environnements de notre choix. 

La configuration de Nexus est très simpliste 

Vous devez récupérer le mot de passe généré aléatoirement par Nexus. 

Pour cela : 
- Exécutez `docker ps`et récupérer l'identifiant du container Nexus
- Exécutez la commande suivante pour lancer un bash dans le container Nexus `docker exec -it --user root **container-id** /bin/bash`
- Déplacez vous dans le dossier "**Nexus-data**" avec `cd nexus-data`
- Exécutez `cat admin.password`
- La commande ci-dessus devrait vous affichez le mot de passe à copier
- Quitter le container en tapant `exit`dans le terminal
- Rendez vous sur `http://localhost:8081`
- Connectez vous en cliquant sur le bouton `Sign In`en haut à droite de la page
- Dans le champ `user`rentrez "**admin**"
- Dans le champ `password`rentrez le mot de passe que vous avez copié

Maintenant il faut créer un user Jenkins pour que Jenkins puisse se connecter à Nexus et déposer l'artifact.

- Cliquez sur l'engrenage dans la barre de navigation 
- Dans le volet de gauche, cliquez sur "**Users**"
- Cliquez sur le "+" pour créer un nouveau utilisateur
- Dans les champs "**ID**", "**Last Name**", "**First Name**", rentrez "**Jenkins**"
- Pour le champ "**Email**", rentrez votre adresse email.
- Pour le champ "**Password**", rentrez "**root**"
- Pour le champ "**Status**", choisissez "**Active**"
- Pour le champ "**Rôles**", cliquez sur "**nx-admin**" puis sur la fléche ">"
- Pour finir, cliquez sur le bouton "**Create Local User**" 

L'utilisateur Jenkins est maintenant créer, il faut maintenant créer le dépôt type Maven

- Dans le volet de gauche, cliquez sur "**Repositories**"
- Cliquez sur le bouton "**+ Create repository**"
- Dans la liste, choisissez "**maven2(hosted)**"
- Dans le champ "**Name**", rentrez "**ERP-REPOSITORY**"
- Dans le champ "**Version Policy**": choisissez '"**Mixed**'
- Dans le champ "**Deployment Policy**", choisissez "**Allow Redeploy**"
- Pour finir, cliquez sur le bouton "**create repository**"

Le dépôt qui contiendra les artifacts maven est maintenant créer. 

Il reste cependant une dernière étape de configuration à réaliser sur Jenkins. Nous devons ajouter l'user Jenkins de Nexus dans les crédentials de Jenkins

* Rendez-vous sur `localhost:8080`
* Dans le volet de gauche de Jenkins, cliquez sur "**Credentials**"
* Dans le tableau, cliquez sur la ligne "**Jenkins**"
* Dans le tableau, cliquez sur la ligne "**Global Credentials**"
* Dans le volet de gauche, cliquez sur "**Add credentials**"
* Dans le champ "**Username**", rentrez "**Jenkins**"
* Dans le champ "**Password**", rentrez "**root**"
* Dans le champ "**ID**", rentrez "'**nexus-credentials**"
* Cliquez sur le bouton "**Save**"

Maintenant, Jenkins peux se connecter à notre Nexus. 

La configuration de l'intégration continue est désormais terminé.