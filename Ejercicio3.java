package ejerciciosComplementariosLevel3;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Ejercicio3 {

    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");

        List<String> palabra = palabras;
        //palabra= null;

        Optional op =  Optional.ofNullable(palabra);

        if(op.isEmpty()){
            System.out.println("La lista está vacía");
        }else{
            Predicate<String> predicate = element -> element.toUpperCase().startsWith("B");
            long contarB = palabra.stream().filter(predicate).count();
            System.out.println("La cantidad de 'B' encontradas es: " + contarB);
        }
    }
}
