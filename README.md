# AlloMecano

Bienvenue dans le projet du Système de Recherche et Rendez-vous pour Mécaniciens en Ligne. Cette application offre une solution moderne pour la recherche de mécaniciens qualifiés, la planification de rendez-vous, et la gestion des profils utilisateur, le tout via une interface utilisateur conviviale

## Instructions pour le Développement

### Configuration de l'Environnement de Développement

1. **Backend (Spring Boot) :**
    - Assurez-vous d'avoir Java JDK installé (version recommandée : 17).
    - Utilisez un IDE de votre choix (par exemple, IntelliJ) pour ouvrir le projet situé dans le dossier `backend`.

2. **Frontend (Angular) :**
- Installez Node.js et npm sur votre machine.
- Naviguez vers le dossier `frontend` et exécutez `npm install` pour installer les dépendances.
- Exécutez la commande suivante pour vérifier l'installation de Node.js et npm: `node -v` et `npm -v`
- Installation de Angular CLI `npm install -g @angular/cli`
- vérifiez que Angular CLI est correctement installé en exécutant la commande :  `ng --version`
- Lancez l'application avec `ng serve`.

3. **Base de Données (MySQL) :**


3.1. **Installer un Serveur MySQL :**
- Assurez-vous d'avoir un serveur MySQL installé sur votre machine.
- Vous pouvez télécharger MySQL à partir du site officiel : [MySQL Downloads](https://dev.mysql.com/downloads/).

3.2. **Configurer les Paramètres de la Base de Données :**
- Ouvrez le fichier `application.properties` situé dans le dossier `src/main/resources` du projet backend.

3.3. **Exemple de Configuration `application.properties` :**

spring.datasource.url=jdbc:mysql://localhost:3306/nom_de_la_base_de_donnees
spring.datasource.username=utilisateur_mysql
spring.datasource.password=mot_de_passe_mysql

Dépendance pour Mysql :

     `<dependency> 
           <groupId>com.mysql</groupId>`
            `<artifactId>mysql-connector-j</artifactId>`
            `<scope>runtime</scope>`
        `</dependency>`
- Assurez-vous d'avoir la version 3.2.3 pour Springboot: `<version>3.2.3</version>`


**Lancement de l'Application**

1. **Backend :**
    - Démarrez le serveur Spring Boot en exécutant la classe principale `AlloMecanoBackendApplication.java`.

2. **Frontend :**
    - Accédez à `http://localhost:4200` dans votre navigateur pour l'interface Angular.

## Fonctionnalités du Projet

Consultez le fichier [Fonctionnalités.md](Fonctionnalités.md) pour une description détaillée des fonctionnalités implémentées.

## Contribuer

Si vous souhaitez contribuer à ce projet, veuillez suivre les meilleures pratiques de développement et soumettre des pull requests.

