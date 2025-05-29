package dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;


public class FornecedorDAO {
    private final String url = "jdbc:postgresql://localhost:5432/CRUD_java";
    private final String user = "postgres";
    private final String password = "288464";

    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public void adicionar(Fornecedor f) throws SQLException {
        String sql = "INSERT INTO fornecedores (nome_fantasia, cnpj, contato, email) VALUES (?, ?, ?, ?)";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, f.getNomeFantasia());
            stmt.setString(2, f.getCnpj());
            stmt.setString(3, f.getContato());
            stmt.setString(4, f.getEmail());
            stmt.executeUpdate();
        }
    }

    public List<Fornecedor> listar() throws SQLException {
        List<Fornecedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM fornecedores";
        try (Connection conn = conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Fornecedor f = new Fornecedor();
                f.setId(rs.getInt("id_fornecedor"));
                f.setNomeFantasia(rs.getString("nome_fantasia"));
                f.setCnpj(rs.getString("cnpj"));
                f.setContato(rs.getString("contato"));
                f.setEmail(rs.getString("email"));
                lista.add(f);
            }
        }
        return lista;
    }

    public void atualizar(Fornecedor f) throws SQLException {
        String sql = "UPDATE fornecedores SET nome_fantasia = ?, cnpj = ?, contato = ?, email = ? WHERE id_fornecedor = ?";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, f.getNomeFantasia());
            stmt.setString(2, f.getCnpj());
            stmt.setString(3, f.getContato());
            stmt.setString(4, f.getEmail());
            stmt.setInt(5, f.getId());
            stmt.executeUpdate();
        }
    }

    public void remover(int id) throws SQLException {
        String sql = "DELETE FROM fornecedores WHERE id_fornecedor = ?";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
