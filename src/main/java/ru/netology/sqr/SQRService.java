package ru.netology.sqr;

public class SQRService {

    public int squareAmount(int min, int max) {
        int sumNumberOfSquare = 0;

        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= min && square <= max) {
                sumNumberOfSquare++;
            }
        }
        return sumNumberOfSquare;
    }

}
