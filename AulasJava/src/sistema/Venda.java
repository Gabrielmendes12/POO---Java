package sistema;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    // Atributos da classe Venda
    private Date data; // Data da venda
    private String cliente; // Nome do cliente
    private List<ItemVenda> itens; // Lista de itens vendidos

    // Construtor da classe Venda
    public Venda(Date data, String cliente, List<ItemVenda> itens) {
        this.data = data;
        this.cliente = cliente;
        this.itens = itens;
    }

    // Métodos getters para acessar os atributos

    public Date getData() {
        return data;
    }

    public String getCliente() {
        return cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    // Método para calcular o total da venda
    public double getTotal() {
        double total = 0.0;
        for (ItemVenda item : itens) {
            total += item.getQuantidade() * item.getProduto().getPreco(); // Calcula o total com base na quantidade e preço dos produtos
        }
        return total;
    }

    // Método toString para representar o objeto Venda como uma string
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append(sdf.format(data)).append(";").append(cliente);
        for (ItemVenda item : itens) {
            sb.append(";").append(item.getProduto().getCodigo()).append(";").append(item.getQuantidade());
        }
        return sb.toString();
    }

    // Método estático fromString para criar um objeto Venda a partir de uma string
    public static Venda fromString(String linha, List<Produto> produtos) {
        String[] partes = linha.split(";");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date data = sdf.parse(partes[0]); // Converte a primeira parte para Date
            String cliente = partes[1]; // Segunda parte é o nome do cliente
            List<ItemVenda> itens = new ArrayList<>();
            for (int i = 2; i < partes.length; i += 2) {
                int codigoProduto = Integer.parseInt(partes[i]); // Converte a parte atual para int (código do produto)
                int quantidade = Integer.parseInt(partes[i + 1]); // Converte a próxima parte para int (quantidade)
                Produto produto = produtos.stream().filter(p -> p.getCodigo() == codigoProduto).findFirst().orElse(null);
                if (produto != null) {
                    itens.add(new ItemVenda(produto, quantidade)); // Adiciona um novo ItemVenda à lista de itens
                }
            }
            return new Venda(data, cliente, itens); // Retorna um novo objeto Venda com os valores extraídos
        } catch (ParseException | NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }
}
