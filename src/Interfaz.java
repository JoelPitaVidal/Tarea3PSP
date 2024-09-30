import java.util.Scanner;

public class Interfaz {

    public void solicitarComando() {
        Scanner scanner = new Scanner(System.in);

        // Pide el comando al usuario
        System.out.println("Introduce el comando a ejecutar: ");
        String comando = scanner.nextLine();

        // Pide los parámetros al usuario
        System.out.println("Introduce los parámetros (separados por espacio): ");
        String parametros = scanner.nextLine();

        // Crear una instancia de Ejecutor y pasar el comando y los parámetros
        Ejecutor ejecutor = new Ejecutor();
        int resultado = ejecutor.ejecutarComando(comando, parametros);

        // Mostrar el comando ejecutado y el resultado
        if (resultado == 0) {
            System.out.println("El comando '" + comando + "' se ejecutó correctamente.");
        } else {
            System.out.println("Error al ejecutar el comando '" + comando + "'. Código de error: " + resultado);
        }
    }
}
