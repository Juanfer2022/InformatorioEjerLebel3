package com.info.infox.utiles;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println(clearnullsandgaps(loadList()));
    }

    public static  List<String> loadList(){
        List<String> inputdata = new ArrayList<>();
        inputdata.add("Hola");
        inputdata.add(null);
        inputdata.add("Informatorio");
        inputdata.add("");
        return inputdata;
    }
    public static List<String> clearnullsandgaps(List<String> listaString){
        List<String> filteredlist = listaString.stream()
                .filter(element -> !(element == null || element.isEmpty()))
                .collect(Collectors.toList());
        return filteredlist;
    }
}
