package Ejercicio11_DispositivosInteligentes;

public class FocoInteligente implements Controlable {
    private boolean encendido;
    private int brillo = 100;

    @Override
    public String ejecutarAccion(String comando) {
        switch (comando) {
            case "encender":
                encendido = true;
                return "Foco: encendido al " + brillo + "% de brillo";
            case "apagar":
                encendido = false;
                return "Foco: apagado";
            case "ajustar":
                brillo = 50;
                return "Foco: brillo bajado a " + brillo + "%" + (encendido ? "" : " (queda apagado)");
            default:
                return "Foco: comando desconocido '" + comando + "'";
        }
    }

    public boolean isEncendido() { return encendido; }
}
