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


        System.out.println(criptomonedas.containsValue("Estaphirium"));
    }
}