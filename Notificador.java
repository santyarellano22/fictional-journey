import java.util.*;

public class Notificador {
    private List<Observador> observadores = new ArrayList<>();

    public void adjuntar(Observador obs) {
        observadores.add(obs);
    }

    public void notificar(String mensaje, String tipo) {
        for (Observador obs : observadores) {
            obs.actualizar(mensaje, tipo);
        }
    }

    public void enviarNotificacion(Notificacion notif, String mensaje, String tipo) {
        notif.enviar(mensaje);
        notificar(mensaje, tipo);
    }
}