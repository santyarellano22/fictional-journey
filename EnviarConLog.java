public class EnviarConLog extends DecoradorNotif {
    public EnviarConLog(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("[LOG] Registrando notificación...");
        super.enviar(mensaje);
    }
}