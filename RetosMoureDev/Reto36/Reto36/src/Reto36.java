import java.util.Arrays;

/*
 * Crea un programa que sea capaz de generar e imprimir todas las
 * permutaciones disponibles formadas por las letras de una palabra.
 * - Las palabras generadas no tienen por qué existir.
 * - Deben usarse todas las letras en cada permutación.
 * - Ejemplo: sol, slo, ols, osl, los, lso
 */
public class Reto36 {
    public static void main(String[] args) {

        String text = "sol";
        permutar(text, "");

    }

    public static void permutar(String text, String response){

        if(text.isBlank() || text.length()<1) {
            System.out.println(response);
            return;
        }

        for (int i = 0; i < text.length(); i++) {
            String current_letter = String.valueOf(text.charAt(i));
            String left = text.substring(0,i);
            String rigth = text.substring(i+1);
            permutar(left+rigth, response+current_letter);
        }
    }

}