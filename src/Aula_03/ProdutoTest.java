package Aula_03;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2500.00, 10);
        
        produto.exibirInfo();
        
        produto.setNome("Notebook");
        produto.setPreco(3500.00);
        produto.setQuantidade(5);
        
        System.out.println("\nInformações atualizadas do produto:");
        produto.exibirInfo();

    }
}
