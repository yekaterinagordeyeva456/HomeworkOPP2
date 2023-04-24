public abstract class Transport implements Maintainable {
    private String modelName;
    public Transport(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }
    public Transport setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем: " + modelName);
    }
}
