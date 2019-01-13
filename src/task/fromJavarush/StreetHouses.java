package task.fromJavarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StreetHouses {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[15];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sumOdd = 0; // нечетные дома
        int sumEven = 0; // четные дома

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                sumEven += i;
            }

            if (i % 2 == 0) {
                sumEven += i;
            } else if (i % 2 != 0) {
                sumOdd += i;
            }
        }

        if (sumOdd > sumEven) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else if (sumOdd < sumEven) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }

    }
}
