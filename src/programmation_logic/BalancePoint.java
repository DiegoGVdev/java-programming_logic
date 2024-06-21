package programmation_logic;

public class BalancePoint {
    public static void main(String[] args) {
        int[] arrayBalancePoint = {1, 7, 3, 6, 5, 6};
        int[] arrayNoBalancePoint = {1, 2, 3, 4, 5};

        var result = BalancePoint.balancePoint(arrayBalancePoint);
        if (result == 0) {
            System.out.println("Balance point not found");
        } else {
            System.out.println("The balance point is in index " + result);
        }

    }

    public static int balancePoint(int[] array) {
        int sumLeft = 0;
        int sumRight = 0;

        for (int number : array) {
            sumRight += number;
        }

        for (int i = 0; i < array.length; i++) {
            sumRight -= array[i];
            if (sumLeft == sumRight) {
                return i;
            } else {
                sumLeft += array[i];
            }

        }
        return 0;
    }

}
