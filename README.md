# JsonCsvProject



 JsonCsvProject est un projet Open Source qui a pour but de convertir un fichier JSON donné en entré vers un fichier CSV
 il permet également de convertir un fichier CSV vers un fichier JSON. Il utilise un fichier de configuration (Mesconfig.properties) qui  permettra à l'utilisateur de parametrer son choix aux niveaux des champs à afficher.


## Pour commencer

Vous pouvez cloner le projet en suivant les instructions suivantes
- Ouvrez votre Terminal (GIT) et tapez git clone https://github.com/RachData/JsonCsvProjet.git

### Pré-requis

Ce qu'il est requis pour commencer avec l'utilisation de votre programme 

- avoir des notions de base sur l'utilisation de git en ligne de commande 
- Pouvoir entrer le chemin absolu absolu du fichier que vous desirez convertir
- Pouvoir modifier un fichier de configuration

##### Manuel utilisateur

### Installation 

Les étapes pour executer votre programme....

- Une fois le projet clonez vous pouvez executez le fichier jar en tapant java -jar json2csv-0.0.1-SNAPSHOT-jar-with-dependencies.jar

## Au Lancement

-Un menu au choix vous etes affiché pour vous permettre de choisir votre mode de conversion

 -Convertion JSON en CSV (Tapez 1)

 -Convertion CSV en JSON (Tapez 2)

 -Modifier le fichier de configuration (Tapez 3)

 -Convertion en Mode Reformatage (Tapez 4)

 -Quitter (Tapez 5)

-Dans un premier temps vous devrez renseigner le chemin de votre fichier json a convertir pour cela vous devriez tapez 1

-Convertion JSON en CSV (Tapez 1)


-Convertion CSV en JSON (Tapez 2)


-Modifier le fichier de configuration (Tapez 3)


-Convertion en Mode Reformatage (Tapez 4)


 -Quitter (Tapez 5)

1

Entrez le chemin absolu du fichier JSON

F:\EclipseProjects\newProjet\JsonCsvProjet\src\main\Ressources\Json_to_Csv\FichierJson.json

-Dans un second temps  vous devrez renseigner le chemin de votre fichier csv a convertir en json pour cela vous devriez tapez 2

#1 - Convertion JSON en CSV

#2 - Convertion CSV en JSON

#3 - Modifier le fichier de configuration

#4- Convertion en Mode Reformatage

#5 - Quitter

2

Entrez le chemin absolu du fichier CSV

F:\EclipseProjects\newProjet\JsonCsvProjet\src\main\Ressources\Csv_to_Json\FichierCsv.csv


Apres avoir renseigne le path veuillez tapez entrer :

Vous aurez a l'ecran un message qui vous dis que l"operation est bien terminer

Entrez le chemin absolu du fichier CSV

F:\EclipseProjects\newProjet\JsonCsvProjet\src\main\Ressources\Csv_to_Json\FichierCsv.csv

Operation terminer


- Aller dans votre repertoire ressource vous verrez le fichier qui a ete bien generer

## Fabriqué avec 
* Language : java
* Type de projet: Projet Maven
* API JACKSON https://github.com/FasterXML/jackson-dataformats-text/tree/master/csv
 https://www.baeldung.com/java-converting-json-to-csv
* PLUGIN ET DEPENDENCES (Voir https://maven.apache.org/plugins/maven-jar-plugin/)

## Contributions

Si vous souhaitez contribuer ou ameliorer le projet vous pouvez nous envoyer un mail 
- abdullahwin99@gmail.com
- rachidderra@gmail.com

## Versions

**Dernière version stable :** 1.0

## Auteurs
- DERRA ABDOUL RACHID
- MAiGA ABDALAH MOHAMED

## License

OPEN SOURCE

