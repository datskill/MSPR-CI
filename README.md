# Preudhomme-erp-back

## Prérequis

Avant de lancer l'application Java la base de donnée doit être disponible.

Pour installer la base donnée MySQL : 

Si vous avez un terminal linux lancer ces commandes

```
cd scripts
chmod +x ./prepare_env.sh
./prepare_env.sh
```

Si vous êtes sur Windows : 


```
docker pull mysql:5.7
docker run -p 3306:3306 --name preudhomme -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=preudhomme -d mysql:5.7
```