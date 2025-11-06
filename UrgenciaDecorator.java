public class UrgenciaDecorator extends DecoradorNotif {
    public UrgenciaDecorator(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar("🔥 ¡URGENTE! 🔥 " + mensaje);
    }
}