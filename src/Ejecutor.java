import java.io.IOException;

public class Ejecutor {

    public int ejecutarComando(String comando, String parametros) {
        try {
            // Construye el proceso para ejecutar el comando
            ProcessBuilder builder = new ProcessBuilder();
            builder.command(comando,parametros);

            // Inicia el proceso
            Process proceso = builder.start();

            // Espera a que el proceso termine y captura el valor de salida
            int exitCode = proceso.waitFor();

            return exitCode;
        } catch (IOException e) {
            System.err.println("Error al ejecutar el comando: " + e.getMessage());
            return -1; // Error en la ejecución del comando
        } catch (InterruptedException e) {
            System.err.println("El proceso fue interrumpido: " + e.getMessage());
            return -1; // Error en la ejecución por interrupción
        }
    }
}
