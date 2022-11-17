package com.main.model;

import java.sql.*;
import java.sql.SQLException;

public class BdManager {
    // Declaraci�n del metodo que permite conectar con la base de datos.
    public Statement abrirBD() throws SQLException, ClassNotFoundException {

        // Se conecta con el controlador y se crea la conexión con la base de datos en
        // MariaDB.
        Class.forName("org.mariadb.jdbc.Driver");
        String urlCon = "jdbc:mariadb://localhost:3306/visor";
        Connection conexBD = DriverManager.getConnection(urlCon, "root", "root");
        return conexBD.createStatement();
    }
}
