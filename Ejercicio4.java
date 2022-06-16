package ejerciciosComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        List<Integer> numeros2 = new ArrayList<Integer>();

        numeros2 = numeros.stream()
                .map(number -> IntStream.rangeClosed(1, number).reduce(1, (x, y) -> x * y))
                .distinct().collect(Collectors.toList());
        System.out.println(numeros2);
    }
}
