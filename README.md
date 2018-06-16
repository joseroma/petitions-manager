# Gestor-BDB
## How to use this APP?
### Requirements:


- ***MongoDB***: Have MongoDB and the databases named with: bdb_cica, bdb_cisa, bdb_sica and bdb_sisa.
- ***PostgresQL***: Have PostgresQL and the databases named with: bdb_cica, bdb_cisa, bdb_sica and bdb_sisa.
- ***MySQL***: Have MySQL in the port 3307 and the databases named with: bdb_cica, bdb_cisa, bdb_sica and bdb_sisa.
- ***MariaDB***: Have MariaDB and the databases named with: bdb_cica, bdb_cisa, bdb_sica and bdb_sisa.
- ***eXistDB***: Have eXistDB in the port 9080 and the databases named with: bdb_cica, bdb_cisa, bdb_sica and bdb_sisa.

#### Ubuntu y MAC


Go to the APP folder:


```cd APP```


Install Maven dependencies:


```sudo mvn clean install```


Run the app:


```sudo mvn spring-boot:run```

## Docker 

You can get the images that we have used for ***eXistDB*** and ***MySQL*** from Docker Hub.

MySQL: https://hub.docker.com/r/joseroma/mysql_and_databases/

eXistDB: https://hub.docker.com/r/joseroma/existdbs/


 
