package com.example.demo;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.sql.*;

public class ConnectionPostgree {

    //Definimos la URL con la que vamos a trabajar

    List<Float> tiempos = new ArrayList<Float>();

    public List<Float> HacerConsulta(String consulta) {

        List<String> dbList = Arrays.asList("bdb_cica", "bdb_cisa", "bdb_sica", "bdb_sisa");
        for (int i = 0; i < dbList.size(); i++) {
            String connectionString = "jdbc:postgresql://localhost:5432/" + dbList.get(i) + "?user=postgres&password=name&autoReconnect=true&useSSL=false";

            //Inicializamos los parámetros necesarios
            Connection connection = null;
            Statement statement = null;
            ResultSet result = null;
            String selectSql = "";

                try {
                    //Iniciamos el driver
                    Class.forName("org.postgresql.Driver");
                    //Abrimos la conexión
                    connection = DriverManager.getConnection(connectionString);
                    //Crea un objeto SQLServerStatement para enviar instrucciones SQL a la base de datos.
                    statement = connection.createStatement();
                    //Guardamos la consulta que queremos en una variable
                    long start = System.currentTimeMillis();
                    Thread.sleep(2000);
                    selectSql = consulta;
                    //Ejecuta la instrucción SQL especificada y devuelve una sola SQLServerResultSet objeto.
                    result = statement.executeQuery(selectSql);
                    while (result.next()) {
                    }
                    long elapsedTimeMillis = System.currentTimeMillis() - start;
                    float elapsedTimeSec = elapsedTimeMillis / 1000F;
                    tiempos.add(elapsedTimeSec);

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (result != null) try {
                        result.close();
                    } catch (Exception e) {
                    }
                    if (statement != null) try {
                        statement.close();
                    } catch (Exception e) {
                    }
                    if (connection != null) try {
                        connection.close();
                    } catch (Exception e) {
                    }
                }

        }
        return tiempos;
    }
}