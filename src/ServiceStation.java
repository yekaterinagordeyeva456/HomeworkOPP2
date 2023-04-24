public class ServiceStation {
    public void check(Maintainable maintainable) {
        maintainable.service();
    }
    public void check(Car car) {
        System.out.println("Обслуживаем: " + car.getModelName());
        checkTyre(car);
        car.checkEngine();
    }

    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем: " + bicycle.getModelName());
            checkTyre(bicycle);
    }

    public void check(Truck truck) {
        System.out.println("Обслуживаем: " + truck.getModelName());
        checkTyre(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    private void checkTyre(WheeledTransport wheeledTransport) {
        for (int i = 0; i < wheeledTransport.getWheelCount(); i++) {
            wheeledTransport.updateTyre();
        }
    }
}
