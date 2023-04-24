public abstract class WheeledTransport extends Transport{
    private int wheelCount;

    public WheeledTransport(String modelName, int wheelCount) {
        super(modelName);
        this.wheelCount = wheelCount;

    }

    public int getWheelCount() {
        return wheelCount;
    }

    public WheeledTransport setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
        return this;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void service() {
        super.service();
        for (int i = 0; i < wheelCount; i++) {
          updateTyre();
        }
    }
}
