import java.util.function.Predicate;

public class Predicado {
    //Todo predicado recebe apenas um unico parametro e retorna um boolean

    public static void main(String[] args) {

        Predicate<Produto> isCaro =
                prod -> (prod.preco * (1-prod.desconto)) >= 750;

        Produto produto = new Produto("Notebook", 893.89, 0.10);
        System.out.println(isCaro.test(produto));
    }
}
