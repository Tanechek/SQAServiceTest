import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        int min = 200;
        int max = 300;

        SQRService service = new SQRService();
        int sumNumberOfSquare = service.squareAmount(min, max);

        System.out.println(sumNumberOfSquare);
    }
}
