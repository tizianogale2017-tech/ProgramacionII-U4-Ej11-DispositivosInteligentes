package Ejercicio11_DispositivosInteligentes;

public class AireAcondicionado implements Controlable {
    private static final int TEMPERATURA_AJUSTE = 24;
    private boolean encendido;
    private int temperatura = 20;

    @Override
    public String ejecutarAccion(String comando) {
        switch (comando) {
            case "encender":
                encendido = true;
                return "Aire: encendido, enfriando a " + temperatura + "°C";
            case "apagar":
                encendido = false;
                return "Aire: apagado";
            case "ajustar":
                if (!encendido) {
                    return "Aire: está apagado, no se puede ajustar la temperatura";
                }
                temperatura = TEMPERATURA_AJUSTE;
                return "Aire: temperatura ajustada a " + temperatura + "°C";
            default:
                return "Aire: comando desconocido '" + comando + "'";
        }
    }
}
