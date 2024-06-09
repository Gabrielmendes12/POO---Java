package sistema;
import java.io.Serializable;

public class Produto implements Serializable {
    // Atributos da classe Produto
    private int codigo; // Código do produto
    private String descricao; // Descrição do produto
    private double preco; // Preço do produto
    private int quantidade; // Quantidade em estoque

    // Construtor da classe Produto
    public Produto(int codigo, String descricao, double preco, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos getters e setters para acessar e modificar os atributos

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método toString para representar o objeto Produto como uma string
    @Override
    public String toString() {
        return codigo + ";" + descricao + ";" + preco + ";" + quantidade;
    }

    // Método estático fromString para criar um objeto Produto a partir de uma string
    public static Produto fromString(String line) {
        // Divide a string em partes usando o delimitador ';'
        String[] parts = line.split(";");
        int codigo = Integer.parseInt(parts[0]); // Converte a primeira parte para int
        String descricao = parts[1]; // Segunda parte é a descrição
        double preco = Double.parseDouble(parts[2]); // Converte a terceira parte para double
        int quantidade = Integer.parseInt(parts[3]); // Converte a quarta parte para int
        // Retorna um novo objeto Produto com os valores extraídos
        return new Produto(codigo, descricao, preco, quantidade);
    }
}
