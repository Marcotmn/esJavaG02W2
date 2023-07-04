package es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListUtils {
    public static List<Integer> generateRandomList(int N) {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            int randomNumber = random.nextInt(101); // Genera un numero casuale da 0 a 100
            randomList.add(randomNumber);
        }

        return randomList;
    }

    public static List<Integer> combineWithReverse(List<Integer> inputList) {
        List<Integer> combinedList = new ArrayList<>(inputList);
        Collections.reverse(inputList);
        combinedList.addAll(inputList);
        return combinedList;
    }

    public static void printValuesByPosition(List<Integer> inputList, boolean evenPositions) {
        for (int i = evenPositions ? 0 : 1; i < inputList.size(); i += 2) {
            System.out.println(inputList.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> randomList = generateRandomList(10);
        System.out.println("Lista generata casualmente: " + randomList);

        List<Integer> combinedList = combineWithReverse(randomList);
        System.out.println("Lista combinata con ordine inverso: " + combinedList);

        System.out.println("Stampa valori in posizione pari:");
        printValuesByPosition(combinedList, true);

        System.out.println("Stampa valori in posizione dispari:");
        printValuesByPosition(combinedList, false);
    }
}