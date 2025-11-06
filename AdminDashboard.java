public class AdminDashboard implements Observador {
    @Override
    public void actualizar(String mensaje, String tipoNotif) {
        System.out.println("[DASHBOARD] Alerta para admin: nueva notificación de tipo " + tipoNotif);
    }
}