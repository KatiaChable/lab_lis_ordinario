package lab_lis_ordinario;

abstract class Computer {
    private String model;
    private String manufacturer;
    private String operatingSystem;

    public Computer(String model, String manufacturer, String operatingSystem){
        this.model = model;
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
    }

    // Abstract methods
    abstract String getComputerType();
    abstract int calculatePortabilityScore();

    // Getters
    public String getModel(){
        return model;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getOperatingSystem(){
        return operatingSystem;
    }

    // Setters
    public void setModel(String model){
        this.model = model;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }

    public String toString(){
        return "Modelo " + model + " Marca " + manufacturer + " SO "  + operatingSystem;
    }
}
