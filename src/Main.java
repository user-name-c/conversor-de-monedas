public class Main {
    public static void main(String[] args) {
        ConsultaMonedas consultaMoneda = new ConsultaMonedas();
        Moneda dolarMoneda = consultaMoneda.buscaMoneda("USD");
        System.out.println(dolarMoneda);
        System.out.println(dolarMoneda.conversion_rates().get("ARS"));
    }
}