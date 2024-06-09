package sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Ecommerce ecommerce = new Ecommerce(); // Cria uma instância da classe Ecommerce
        Scanner scanner = new Scanner(System.in); // Cria um Scanner para entrada de dados do usuário
        String opcao; // Variável para armazenar a opção escolhida pelo usuário

        do {
            // Exibe o menu de opções
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Alterar produto");
            System.out.println("3 - Vender produto");
            System.out.println("4 - Emitir relatório");
            System.out.println("5 - Sair");
            opcao = scanner.nextLine(); // Lê a opção escolhida pelo usuário

            switch (opcao) {
                case "1":
                    // Opção de cadastrar produto
                    System.out.println("Código do produto:");
                    int codigo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Descrição do produto:");
                    String descricao = scanner.nextLine();
                    System.out.println("Preço do produto:");
                    double preco = Double.parseDouble(scanner.nextLine());
                    System.out.println("Quantidade em estoque:");
                    int quantidade = Integer.parseInt(scanner.nextLine());
                    ecommerce.cadastrarProduto(codigo, descricao, preco, quantidade); // Chama o método de cadastro de produto
                    break;

                case "2":
                    // Opção de alterar produto
                    System.out.println("Código do produto:");
                    int codigoAlt = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nova descrição do produto:");
                    String novaDescricao = scanner.nextLine();
                    System.out.println("Novo preço do produto:");
                    double novoPreco = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nova quantidade em estoque:");
                    int novaQuantidade = Integer.parseInt(scanner.nextLine());
                    ecommerce.alterarProduto(codigoAlt, novaDescricao, novoPreco, novaQuantidade); // Chama o método de alteração de produto
                    break;

                case "3":
                    // Opção de vender produto
                    System.out.println("Nome do cliente:");
                    String cliente = scanner.nextLine();
                    List<ItemVenda> itens = new ArrayList<>(); // Lista para armazenar os itens da venda
                    String continuar;
                    do {
                        System.out.println("Código do produto:");
                        int codProd = Integer.parseInt(scanner.nextLine());
                        System.out.println("Quantidade:");
                        int quant = Integer.parseInt(scanner.nextLine());
                        Produto produto = ecommerce.getProdutos().stream().filter(p -> p.getCodigo() == codProd).findFirst().orElse(null);
                        if (produto != null) {
                            itens.add(new ItemVenda(produto, quant)); // Adiciona o item à lista de itens da venda
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                        System.out.println("Adicionar mais um item? (s/n)");
                        continuar = scanner.nextLine();
                    } while (continuar.equalsIgnoreCase("s"));
                    ecommerce.venderProduto(cliente, itens); // Chama o método de venda de produto
                    break;

                case "4":
                    // Opção de emitir relatório
                    System.out.println("Tipo de relatório:");
                    System.out.println("a - Inventário");
                    System.out.println("b - Vendas do dia");
                    System.out.println("c - Vendas geral");
                    System.out.println("d - Itens mais e menos vendidos");
                    System.out.println("e - Clientes que mais compram");
                    String tipoRelatorio = scanner.nextLine();
                    System.out.println("Imprimir na tela ou arquivo (tela/arquivo)?");
                    String output = scanner.nextLine();
                    String tipo = "";
                    switch (tipoRelatorio) {
                        case "a":
                            tipo = "inventario";
                            break;
                        case "b":
                            tipo = "vendasDoDia";
                            break;
                        case "c":
                            tipo = "vendasGeral";
                            break;
                        case "d":
                            tipo = "maisMenosVendidos";
                            break;
                        case "e":
                            tipo = "clientesQueMaisCompram";
                            break;
                        default:
                            System.out.println("Opção de relatório inválida.");
                            continue;
                    }
                    ecommerce.emitirRelatorio(tipo, output); // Chama o método de emissão de relatório
                    break;

                case "5":
                    // Opção de sair do programa
                    System.out.println("Saindo...");
                    break;

                default:
                    // Caso a opção escolhida não seja válida
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (!opcao.equals("5")); // Continua executando até o usuário escolher a opção de sair

        scanner.close(); // Fecha o Scanner
    }
}
