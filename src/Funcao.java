import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        Function<String, String> oResultadoE =  valor -> "O resultdo é: " + valor;

        Function<String, String> empolgado = empolg -> empolg + " !!!";


        System.out.println(oResultadoE.apply(parOuImpar.apply(33)));
        System.out.println(parOuImpar.apply(32));

        String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(10);
        System.out.println(resultadoFinal);
        System.out.println(empolgado.apply("Oi"));
    }
}
