package Ejercicio11_DispositivosInteligentes;

public class Main {
    public static void main(String[] args) {
        HubCentral hub = new HubCentral();
        hub.conectar(new FocoInteligente());
        hub.conectar(new AireAcondicionado());
        hub.conectar(new PersianaMotorizada());

        hub.enviarComando("ajustar");
        hub.enviarComando("encender");
        hub.enviarComando("ajustar");
        hub.enviarComando("apagar");
        hub.enviarComando("reiniciar");
    }
}
