public class Main {
    public static void main(String[] args) {
        Maintainable[] maintainables = {
                new Bicycle("Кама"),
                new Car("BMW"),
                new Truck("MAN")};
        ServiceStation station = new ServiceStation();
        for (Maintainable maintainable : maintainables) {
            station.check(maintainable);
        }
    }
}