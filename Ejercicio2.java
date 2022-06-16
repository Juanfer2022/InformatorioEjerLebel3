package ejerciciosComplementariosLevel3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio2 {
    /*Dada una lista que contiene números enteros, se deberá generar otra lista que contendrá
    el resultado de aplicar la operación de potencia a 2.
     */
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 2,3,4,5);
        List<Integer> lista2 = new ArrayList<Integer>();

        lista2 = lista1.stream()
                .map(numero -> numero * numero)
                .collect(Collectors.toList());

       /*lista1.stream().map(n -> n).forEach(n -> {
           lista2.add(n * n);
       });*/
        System.out.println(lista2);

        // creating a Stream of strings
        Stream<String> s = Stream.of("1", "2", "3", "4");

        // using Collectors toList() function
        List<String> myList = s.collect(Collectors.toList());

        // printing the elements
        System.out.println(myList);
    }
}
