package crud;

import java.sql.SQLException;	
import java.util.Scanner;
import model.Fornecedor;
import dao.FornecedorDAO;


public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        FornecedorDAO dao = new FornecedorDAO();

        while (true) {
            System.out.println("\n1. Adicionar\n2. Listar\n3. Atualizar\n4. Remover\n5. Sair");
            int opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            if (opcao == 1) {
                Fornecedor f = new Fornecedor();
                System.out.print("Nome Fantasia: ");
                f.setNomeFantasia(sc.nextLine());
                System.out.print("CNPJ: ");
                f.setCnpj(sc.nextLine());
                System.out.print("Contato: ");
                f.setContato(sc.nextLine());
                System.out.print("Email: ");
                f.setEmail(sc.nextLine());
                dao.adicionar(f);
            } else if (opcao == 2) {
                for (Fornecedor f : dao.listar()) {
                    System.out.println(f.getId() + " - " + f.getNomeFantasia() + " - " + f.getCnpj());
                }
            } else if (opcao == 3) {
                Fornecedor f = new Fornecedor();
                System.out.print("ID do Fornecedor: ");
                f.setId(sc.nextInt());
                sc.nextLine();
                System.out.print("Novo Nome Fantasia: ");
                f.setNomeFantasia(sc.nextLine());
                System.out.print("Novo CNPJ: ");
                f.setCnpj(sc.nextLine());
                System.out.print("Novo Contato: ");
                f.setContato(sc.nextLine());
                System.out.print("Novo Email: ");
                f.setEmail(sc.nextLine());
                dao.atualizar(f);
            } else if (opcao == 4) {
                System.out.print("ID do Fornecedor a remover: ");
                int id = sc.nextInt();
                dao.remover(id);
            } else if (opcao == 5) {
                break;
            }
        }
        sc.close();
    }
}
