import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer,String> criptomonedas = new HashMap<>();

        criptomonedas.put(1, "Bitcoin");
        criptomonedas.put(2, "Etherium");
        criptomonedas.put(3, "Binance");
        criptomonedas.put(4, "Cardano");
        criptomonedas.put(5, "Tether");
        criptomonedas.put(6, "Estaphium");
        criptomonedas.put(7, "Estaphirium");
       // System.out.println("Clave: " + criptomonedas.getOrDefault(8, "Spiriphira"));
       // criptomonedas.getOrDefault(8, "Spiriphira");
        System.out.println("Con un foreach: ");
        criptomonedas.forEach((k,v) -> System.out.println("Clave: " + k + ". Valor: " + v));
        System.out.println("\nCon un sout normal: ");
        System.out.println(criptomonedas);

        //Obtener solo valores
        System.out.println("Solo valores: ");
        criptomonedas.entrySet().stream().forEach(e -> System.out.println("Clave: " + e.getKey()));


    }
}