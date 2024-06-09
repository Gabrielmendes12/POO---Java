package sistema;

import java.io.Serializable;

public class ItemVenda implements Serializable {
    private Produto produto;   // Produto vendido
    private int quantidade;    // Quantidade do produto vendida

    // Construtor da classe que inicializa os atributos
    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    // Método getter para o produto
    public Produto getProduto() {
        return produto;
    }

    // Método getter para a quantidade
    public int getQuantidade() {
        return quantidade;
    }

    // Método que retorna uma representação em String do item vendido
    @Override
    public String toString() {
        return produto.getCodigo() + ";" + quantidade;
    }

    // Método estático que cria um ItemVenda a partir de uma linha de texto e um produto
    public static ItemVenda fromString(String line, Produto produto) {
        String[] parts = line.split(";");          // Divide a linha pelo delimitador ";"
        int quantidade = Integer.parseInt(parts[1]); // Converte a quantidade para inteiro
        return new ItemVenda(produto, quantidade);  // Retorna uma nova instância de ItemVenda
    }
}
