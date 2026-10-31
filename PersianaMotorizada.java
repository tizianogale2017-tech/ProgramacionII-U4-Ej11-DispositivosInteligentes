package Ejercicio11_DispositivosInteligentes;

public class PersianaMotorizada implements Controlable {
    private int apertura;

    @Override
    public String ejecutarAccion(String comando) {
        switch (comando) {
            case "encender":
                apertura = 100;
                return "Persiana: subiendo, abierta al " + apertura + "%";
            case "apagar":
                apertura = 0;
                return "Persiana: bajando, cerrada al " + apertura + "%";
            case "ajustar":
                apertura = 50;
                return "Persiana: ajustada a media altura (" + apertura + "%)";
            default:
                return "Persiana: comando desconocido '" + comando + "'";
        }
    }
}
