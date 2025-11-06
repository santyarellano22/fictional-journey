public class NotificacionBase implements Notificacion {
    private String destino;

    public NotificacionBase(String destino) {
        this.destino = destino;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("📧 Notificación base enviada a " + destino + ": " + mensaje);
    }
}