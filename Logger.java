public class Logger implements Observador {
    @Override
    public void actualizar(String mensaje, String tipoNotif) {
        System.out.println("[AUDITORÍA] Notificación enviada - Tipo: " + tipoNotif + " | Mensaje: " + mensaje);
    }
}