package lab_lis_ordinario;

final public class Notebook extends Laptop{
    public Notebook(String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight){
        super(model, manufacturer, operatingSystem, batteryCapacity, weight);
    }
    @Override public int calculatePortabilityScore() {
        return 1;
    }

    @Override public String getComputerType(){
        return "Computadora-laptop: NOTEBOOK";
    }
    @Override public String toString(){
        return super.toString().replace("Tipo " + "Computadora portatil", " Tipo " + getComputerType() + " Portabilidad " + calculatePortabilityScore());
    }
}
