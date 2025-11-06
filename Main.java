public class Main {
    public static void main(String[] args) {
        // Crear notificación base
        Notificacion notif = new NotificacionBase("usuario@ejemplo.com");

        // Decorarla
        notif = new EnviarConLog(notif);
        notif = new CopiaAlHistorial(notif);
        notif = new UrgenciaDecorator(notif); // ¡URGENTE!

        // Configurar observadores
        Notificador gestor = new Notificador();
        gestor.adjuntar(new Logger());
        gestor.adjuntar(new AdminDashboard());

        // Enviar
        gestor.enviarNotificacion(notif, "Tu pedido ha sido enviado", "EMAIL_URGENTE");
    }
}