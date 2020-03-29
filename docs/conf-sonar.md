<img src="https://github.com/datskill/MSPR-CI/blob/master/images/sonarqube.png" width="100">

## SonarQube

Normalement, le container SonarQube est déjà lancé à l'adresse suivante : http://localhost:9000/. Si ce n'est pas le cas, éxécuter "docker-compose up -d"

Rendez-vous à l'adresse : http://localhost:9000/

- Connectez vous avec les identifiants par défauts

- **Nom d'utilisateur** : `admin`

- **Mots de passe** : `admin`

- Nous allons installer le plugin **SonarJava** pour que Sonar puisse analyser notre code Java

- Dans la barre de navigation, cliquez sur "**Administration**"

- Dans la barre, au dessous de la barre de navigation cliquez sur "'**Marketplace**"

- Dans le barre de recherche du Marketplace, recherchez "**SonarJava**"

- Cliquez sur "**Installer**", attendez que l'installation finisse puis rendez-vous sur la page d'accueil de SonarQube


SonarQube est maintenant configuré. Nous allons créer un Token sur Sonar pour que Jenkins et Sonar puissent communiquer entre eux. 

- Dans la barre de navigation, sur la gauche, cliquez sur votre profil, puis cliquez sur "**My Account**"

- Cliquez sur "'**Security**"

- Générez un nouveau token qui a pour label "**sonar-scanner**".

- **Copiez** la clé secréte fournit par Sonar

Retournez dans Jenkins

- Retournez à la configuration d'un SonarQube Server (**Manage Jenkins --> Manage System**)

- Dans "**Server authentication token**", cliquez sur le bouton "**Add**"

- Dans "'**Kind**", mettez "**Secret Text**"

- Dans "**Secret**", coller la clé précédemment copié sur Sonar

- Dans "**Id**", rentrez "**sonar-server**"

- Laissez "Description" vide

- Cliquez sur "**Add**"

- Dans la liste déroulante, sélectionnez le token vous avez créez

- Cliquez sur "**Save**" puis "**Apply**"

Maintenant, SonarQube pourra envoyer le résultat de l'analyse de code à Jenkins. 
