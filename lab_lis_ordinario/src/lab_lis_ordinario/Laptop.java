package lab_lis_ordinario;

public class Laptop extends Computer implements PortableDevice{
    private int batteryCapacity;
    private double weight;

    public Laptop (String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight){
        super(model, manufacturer, operatingSystem);
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
    }

    //Getters
    public int getBatteryCapacity(){
        return batteryCapacity;
    }
    public double getWeight(){
        return weight;
    }

    //Setters
    public void setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    //Overrides
    @Override public String getComputerType(){
        return "Computadora portatil";
    }
    @Override public int calculatePortabilityScore(){
        return (int)(weight);
    }
    @Override
    public String toString(){
        return super.toString() + " Capacidad de la batería " + batteryCapacity + " Peso " + weight;
    }
}
