import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
// Não recebe parametro e retorna do tipo do parametro

public class Fornecedor {

    public static void main(String[] args) {


        Supplier<List<String>> umaLista =
                () -> Arrays.asList("Ana", "Nanda", "Bia", "Gui");

        System.out.println(umaLista.get());
        System.out.println(umaLista.toString());
    }

}
