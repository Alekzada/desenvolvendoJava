package arrays_listas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author alexandre
 */
public class ArraysListas {
    public static void main(String[] args) {

        // Arrays --> São estruturas que guardam vários itens do mesmo tipo. O tamanho é
        // fixo: uma vez criado, não muda.
        int[] numerosFixos = { 10, 20, 30 };
        System.out.println("Array de tamanho fixo: " + Arrays.toString(numerosFixos));

        // ArrayList --> É uma lista dinâmica que "cresce" sozinha. Você pode adicionar
        // quantos itens quiser sem se preocupar com o tamanho.
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Block"); // O método .add() coloca nomes na lista.
        listaNomes.add("Javinha");

        System.out.println("O primeiro nome da nossa lista é: " + listaNomes.get(0));

    }
}
