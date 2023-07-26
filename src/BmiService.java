public class BmiService {
    public int calculate (float tall, int weight) {
        float bmi;
        bmi = weight / (tall * tall);
        return (int) bmi;
    }
}
