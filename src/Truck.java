public class Truck extends MotorTransport {

    public Truck(String modelName) {
        super(modelName, 18);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        super.service();
        checkTrailer();
    }
}
