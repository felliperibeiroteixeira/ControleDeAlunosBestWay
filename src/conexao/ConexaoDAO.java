/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Fellipe Ribeiro Teixeira
 */
public class ConexaoDAO {

    public static Connection conector() {
        java.sql.Connection conn = null;
        String driver = "org.sqlite.JDBC";
        String url = "jdbc:sqlite:db/bestway.db";
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url);
            return conn;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Sem acesso ao servidor, verifica a rede ou a disponibilidade do servidor", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
