import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Consumer aceito um parametro e nao retorna nada, usado pelo forEach

public class Consumidor {
    public static void main(String[] args) {

        //Construindo um Consumer do tipo produto chamado imprime nome
        // recebe p como parametro e imprime o nome do produto
        Consumer<Produto> imprimirNome = p -> System.out.println("Produto: " + p.nome);

        Produto p1 = new Produto("Caneta", 12.50, 0.10);
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Notebook", 3500.50, 0.20);
        Produto p3 = new Produto("Borracha", 0.50, 0.05);
        Produto p4 = new Produto("Lapis", 1.50, 0.05);
        Produto p5 = new Produto("Fone", 52.50, 0.10);

        List<Produto> produtoList = Arrays.asList(p1,p2,p3,p4,p5);

        produtoList.forEach(imprimirNome);
        //passando lambda
        produtoList.forEach(p -> System.out.println("Preço: " + p.preco));
        //passando method reference
        produtoList.forEach(System.out::println);

    }
}
