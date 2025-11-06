public abstract class DecoradorNotif implements Notificacion {
    protected Notificacion notificacion;

    public DecoradorNotif(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public void enviar(String mensaje) {
        notificacion.enviar(mensaje);
    }
}