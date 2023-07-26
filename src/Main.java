public class Main {
    public static void main(String[] args) {
        BmiService service= new BmiService();
        float tall = 1.87F;
        int weight = 98;
        int index = service.calculate(tall, weight);
        System.out.println(index);
        }
    }