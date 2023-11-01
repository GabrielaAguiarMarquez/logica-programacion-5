import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> palabras = new HashMap<>();
        palabras.put("GATO", "CAT");
        palabras.put("PERRO", "DOG");
        palabras.put("LOVE", "AMOR");
        palabras.put("YELLOW", "AMARILLO");
        palabras.put("MOTHER", "MADRE");
        palabras.put("SON", "HIJO");
        palabras.put("SISTER", "HERMANA");
        palabras.put("BROTHER", "HERMANO");
        palabras.put("PINK", "ROSA");
        palabras.put("RED", "ROJO");
        palabras.put("SUGAR", "AZUCAR");
        palabras.put("KIDS", "NIÑOS");
        palabras.put("TIGER", "TIGRE");
        palabras.put("ORANGE", "NARANJA");
        palabras.put("GET", "OBTENER");
        palabras.put("DELETE", "ELIMINAR");
        palabras.put("ONE", "UNO");
        palabras.put("TWO", "DOS");
        palabras.put("GRANDMOTHER", "ABUELA");
        palabras.put("BLACK", "NEGRO");

        List<String> palabrasAzar = new ArrayList<>(palabras.keySet());
        Collections.shuffle(palabrasAzar);

        int correcto = 0;
        int fallido = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String palabraAlAzar = palabrasAzar.get(i);
            System.out.println("Traduce la siguiente palabra: " + palabraAlAzar);
            String respuesta = scanner.nextLine();

            if (palabras.get(palabraAlAzar).equalsIgnoreCase(respuesta)) {
                correcto++;
            } else {
                fallido++;
            }
        }
        
        System.out.println("Lograste " + correcto + " de 5");
    }
}
