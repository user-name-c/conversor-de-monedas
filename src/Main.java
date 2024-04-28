public class Main {
    public static void main(String[] args) {
        Double cantidadAConvertir = 20.0;
        String claveMonedaOriginal = "USD";
        String claveMonedaNueva = "MXN";


        ConsultaMonedas consultaMoneda = new ConsultaMonedas();
        Moneda monedaOriginal = consultaMoneda.buscaMoneda(claveMonedaOriginal);
        System.out.println(monedaOriginal);
        System.out.println(monedaOriginal.conversion_rates().get(claveMonedaNueva));

        //convertir una canditad

        ConversorDeMoneda conversorMoneda = new ConversorDeMoneda();
        Double nuevaCantidad = conversorMoneda.converir(cantidadAConvertir, monedaOriginal, claveMonedaNueva);
        System.out.println("La cantidad que quieres convertir es: " + cantidadAConvertir + " " + claveMonedaOriginal);
        System.out.println("la nueva cantidad es: " + nuevaCantidad + " " + claveMonedaNueva);
    }
}