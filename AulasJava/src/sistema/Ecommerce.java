package sistema;

import java.io.*; 
import java.text.SimpleDateFormat;
import java.util.*;

public class Ecommerce {
    private List<Produto> produtos;    // Lista de produtos cadastrados
    private List<Venda> vendas;        // Lista de vendas realizadas
    private final String cadastroFile = "cadastro.txt"; // Nome do arquivo de produtos
    private final String vendasFile = "vendas.txt";     // Nome do arquivo de vendas

    // Construtor da classe
    public Ecommerce() {
        produtos = new ArrayList<>();
        vendas = new ArrayList<>();
        carregarProdutos(); // Carrega os produtos do arquivo de cadastro
        carregarVendas();   // Carrega as vendas do arquivo de vendas
    }

    // Carrega os produtos do arquivo de cadastro
    private void carregarProdutos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(cadastroFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                produtos.add(Produto.fromString(line)); // Adiciona cada produto à lista
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar produtos: " + e.getMessage());
        }
    }

    // Carrega as vendas do arquivo de vendas
    private void carregarVendas() {
        try (BufferedReader reader = new BufferedReader(new FileReader(vendasFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Venda venda = Venda.fromString(line, produtos);
                if (venda != null) {
                    vendas.add(venda); // Adiciona cada venda à lista
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar vendas: " + e.getMessage());
        }
    }

    // Retorna a lista de produtos cadastrados
    public List<Produto> getProdutos() {
        return produtos;
    }

    // Cadastra um novo produto
    public void cadastrarProduto(int codigo, String descricao, double preco, int quantidade) {
        // Verifica se já existe um produto com o mesmo código
        if (produtos.stream().anyMatch(p -> p.getCodigo() == codigo)) {
            System.out.println("Produto com o código " + codigo + " já existe.");
            return;
        }
        Produto produto = new Produto(codigo, descricao, preco, quantidade);
        produtos.add(produto); // Adiciona o novo produto à lista
        salvarProdutos(); // Salva os produtos no arquivo
    }

    // Altera os dados de um produto existente
    public void alterarProduto(int codigo, String descricao, double preco, int quantidade) {
        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) {
                p.setDescricao(descricao);
                p.setPreco(preco);
                p.setQuantidade(quantidade);
                salvarProdutos(); // Salva as alterações no arquivo
                return;
            }
        }
        System.out.println("Produto com o código " + codigo + " não encontrado.");
    }

    // Salva a lista de produtos no arquivo
    private void salvarProdutos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(cadastroFile))) {
            for (Produto p : produtos) {
                writer.write(p.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar produtos: " + e.getMessage());
        }
    }

    // Realiza uma venda de produtos
    public void venderProduto(String cliente, List<ItemVenda> itens) {
        // Verifica se há estoque suficiente para cada item da venda
        for (ItemVenda item : itens) {
            Produto produto = item.getProduto();
            if (produto.getQuantidade() < item.getQuantidade()) {
                System.out.println("Estoque insuficiente para o produto " + produto.getDescricao());
                return;
            }
        }
        // Atualiza a quantidade em estoque para cada item da venda
        for (ItemVenda item : itens) {
            Produto produto = item.getProduto();
            produto.setQuantidade(produto.getQuantidade() - item.getQuantidade());
        }
        Venda venda = new Venda(new Date(), cliente, itens);
        vendas.add(venda); // Adiciona a venda à lista
        salvarVendas();    // Salva as vendas no arquivo
        salvarProdutos();  // Atualiza o estoque no arquivo de produtos
    }

    // Salva a lista de vendas no arquivo
    private void salvarVendas() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(vendasFile))) {
            for (Venda v : vendas) {
                writer.write(v.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar vendas: " + e.getMessage());
        }
    }

    // Emite um relatório específico
    public void emitirRelatorio(String tipo, String output) {
        switch (tipo) {
            case "inventario":
                emitirRelatorioInventario(output); // relatório dos produtos em estoque
                break;
            case "vendasDoDia":
                emitirRelatorioVendasDoDia(output); // vendas diárias
                break;
            case "vendasGeral":
                emitirRelatorioVendasGeral(output); // vendas totais
                break;
            case "maisMenosVendidos":
                emitirRelatorioMaisMenosVendidos(output); // produtos mais e menos vendidos
                break;
            case "clientesQueMaisCompram":
                emitirRelatorioClientesQueMaisCompram(output);
                break;
            default:
                System.out.println("Tipo de relatório desconhecido.");
        }
    }

    // Emite o relatório de inventário
    private void emitirRelatorioInventario(String output) {
        PrintWriter writer = null;
        try {
            if (output.equals("tela")) {
                writer = new PrintWriter(System.out, true); // Imprime na tela
            } else {
                writer = new PrintWriter(new FileWriter("relatorio.txt")); // Escreve no arquivo
            }
            for (Produto p : produtos) {
                writer.println(p);
            }
        } catch (IOException e) {
            System.out.println("Erro ao gerar relatório de inventário: " + e.getMessage());
        } finally {
            if (writer != null && !output.equals("tela")) {
                writer.close();
            }
        }
    }

    // Emite o relatório de vendas do dia
    private void emitirRelatorioVendasDoDia(String output) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String hoje = sdf.format(new Date());
        PrintWriter writer = null;
        try {
            if (output.equals("tela")) {
                writer = new PrintWriter(System.out, true); // Imprime na tela
            } else {
                writer = new PrintWriter(new FileWriter("relatorio.txt")); // Escreve no arquivo
            }
            for (Venda v : vendas) {
                if (sdf.format(v.getData()).equals(hoje)) {
                    writer.println(v);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao gerar relatório de vendas do dia: " + e.getMessage());
        } finally {
            if (writer != null && !output.equals("tela")) {
                writer.close();
            }
        }
    }

    // Emite o relatório de vendas geral
    private void emitirRelatorioVendasGeral(String output) {
        PrintWriter writer = null;
        try {
            if (output.equals("tela")) {
                writer = new PrintWriter(System.out, true); // Imprime na tela
            } else {
                writer = new PrintWriter(new FileWriter("relatorio.txt")); // Escreve no arquivo
            }
            for (Venda v : vendas) {
                writer.println(v);
            }
        } catch (IOException e) {
            System.out.println("Erro ao gerar relatório de vendas geral: " + e.getMessage());
        } finally {
            if (writer != null && !output.equals("tela")) {
                writer.close();
            }
        }
    }

    // Emite o relatório de itens mais e menos vendidos
    private void emitirRelatorioMaisMenosVendidos(String output) {
        Map<Produto, Integer> vendasPorProduto = new HashMap<>();

        for (Venda v : vendas) {
            for (ItemVenda item : v.getItens()) {
                vendasPorProduto.put(item.getProduto(), vendasPorProduto.getOrDefault(item.getProduto(), 0) + item.getQuantidade());
            }
        }

        if (vendasPorProduto.isEmpty()) {
            System.out.println("Não há vendas registradas.");
            return;
        }

        int maxVendas = Collections.max(vendasPorProduto.values());
        int minVendas = Collections.min(vendasPorProduto.values());

        List<Produto> maisVendidos = new ArrayList<>();
        List<Produto> menosVendidos = new ArrayList<>();

        for (Map.Entry<Produto, Integer> entry : vendasPorProduto.entrySet()) {
            if (entry.getValue() == maxVendas) {
                maisVendidos.add(entry.getKey());
            }
            if (entry.getValue() == minVendas) {
                menosVendidos.add(entry.getKey());
            }
        }

        PrintWriter writer = null;
        try {
            if (output.equals("tela")) {
                writer = new PrintWriter(System.out, true); // Imprime na tela
            } else {
                writer = new PrintWriter(new FileWriter("relatorio.txt")); // Escreve no arquivo
            }
            writer.println("Produtos mais vendidos:");
            for (Produto p : maisVendidos) {
                writer.println(p.getDescricao() + " - Quantidade vendida: " + maxVendas);
            }

            writer.println("\nProdutos menos vendidos:");
            for (Produto p : menosVendidos) {
                writer.println(p.getDescricao() + " - Quantidade vendida: " + minVendas);
            }
        } catch (IOException e) {
            System.out.println("Erro ao gerar relatório de itens mais e menos vendidos: " + e.getMessage());
        } finally {
            if (writer != null && !output.equals("tela")) {
                writer.close();
            }
        }
    }

    // Emite o relatório de clientes que mais compram
    private void emitirRelatorioClientesQueMaisCompram(String output) {
        Map<String, Double> totalComprasPorCliente = new HashMap<>();

        for (Venda v : vendas) {
            totalComprasPorCliente.put(v.getCliente(), totalComprasPorCliente.getOrDefault(v.getCliente(), 0.0) + v.getTotal());
        }

        if (totalComprasPorCliente.isEmpty()) {
            System.out.println("Não há vendas registradas.");
            return;
        }

        double maxCompra = Collections.max(totalComprasPorCliente.values());

        List<String> clientesQueMaisCompram = new ArrayList<>();
        for (Map.Entry<String, Double> entry : totalComprasPorCliente.entrySet()) {
            if (entry.getValue() == maxCompra) {
                clientesQueMaisCompram.add(entry.getKey());
            }
        }

        PrintWriter writer = null;
        try {
            if (output.equals("tela")) {
                writer = new PrintWriter(System.out, true); // Imprime na tela
            } else {
                writer = new PrintWriter(new FileWriter("relatorio.txt")); // Escreve no arquivo
            }
            writer.println("Clientes que mais compram:");
            for (String cliente : clientesQueMaisCompram) {
                writer.println(cliente + " - Total comprado: R$ " + maxCompra);
            }
        } catch (IOException e) {
            System.out.println("Erro ao gerar relatório de clientes que mais compram: " + e.getMessage());
        } finally {
            if (writer != null && !output.equals("tela")) {
                writer.close();
            }
        }
    }
}