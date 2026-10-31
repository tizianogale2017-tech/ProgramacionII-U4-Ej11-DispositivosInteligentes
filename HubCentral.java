package Ejercicio11_DispositivosInteligentes;

import java.util.ArrayList;
import java.util.List;

public class HubCentral {
    private final List<Controlable> dispositivos = new ArrayList<>();

    public void conectar(Controlable dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void enviarComando(String comando) {
        System.out.println(">> Comando enviado a todos: " + comando);
        for (Controlable d : dispositivos) {
            System.out.println("   " + d.ejecutarAccion(comando));
        }
    }
}
