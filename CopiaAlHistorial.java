public class CopiaAlHistorial extends DecoradorNotif {
    public CopiaAlHistorial(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("[HISTORIAL] Guardando copia en el historial del usuario.");
    }
}