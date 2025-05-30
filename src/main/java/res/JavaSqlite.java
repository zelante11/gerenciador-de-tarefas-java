package res;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

/**
 * Classe responsável por conectar ao banco SQLite e listar as tarefas.
 * Certifique-se de que o banco `gentaf.db` existe e tem a tabela `tarefa`.
 */
public class JavaSqlite {

    public static void main(String[] args) {
        JavaSqlite app = new JavaSqlite();
        app.selectAll();
    }

    /**
     * Conecta ao banco de dados SQLite e retorna a conexão.
     * @return Connection objeto de conexão ou null se falhar.
     */
    public Connection connect() {
        String url = "jdbc:sqlite:gentaf.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
        return conn;
    }

    /**
     * Busca e imprime todas as tarefas da tabela `tarefa`.
     */
    public void selectAll() {
        String sql = "SELECT * FROM tarefas";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String tafID = rs.getString("tafID");
                String titulo = rs.getString("titulo");
                String descricao = rs.getString("descricao");
                String data = rs.getString("data");
                
                System.out.println(tafID + "\t" + titulo + "\t" + descricao + "\t" + data);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar tarefas: " + e.getMessage());
        }
    }
}
