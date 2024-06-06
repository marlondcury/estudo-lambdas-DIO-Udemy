import java.util.function.UnaryOperator;

public class OperadorUnario {

    //recebe um parametro e retorna algo do mesmo tipo do parametro

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n+2;
        UnaryOperator<Integer> vezesDois = n -> n*2;
        UnaryOperator<Integer> aoQuadrado = n -> n*n;

        int resultado1 = maisDois.andThen(vezesDois.andThen(aoQuadrado)).apply(0);
        System.out.println(resultado1);

        //Compose ler ao contrado do andThen
        int resultado2 = aoQuadrado.compose(vezesDois.compose(maisDois)).apply(0);
        System.out.println(resultado2);

    }
}
