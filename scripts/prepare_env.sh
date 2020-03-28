# Prérequis ajouter les permissions au fichier: chmod +x ./prepare_env.sh
# docker pull mysql:5.7
docker run -p 3306:3306 --name preudhomme -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=preudhomme -d mysql:5.7