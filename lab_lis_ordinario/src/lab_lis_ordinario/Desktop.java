package lab_lis_ordinario;

public class Desktop extends Computer{
    private double caseHeight;

    public Desktop(String model, String manufacturer, String operatingSystem, double caseHeight){
        super(model, manufacturer, operatingSystem);
        this.caseHeight = caseHeight;
    }

    //Getter
    public double getCaseHeight(){
        return caseHeight;
    }

    //Setter
    public void setCaseHeight(double caseHeight){
        this.caseHeight = caseHeight;
    }

    //Overrides
    @Override String getComputerType(){
        return "Computadora de escritorio";
    }
    @Override int calculatePortabilityScore(){
        return (int)( 5 + caseHeight / 20);
    }
    @Override public String toString(){
        return super.toString() + " Altura de la torre " + caseHeight;
    }
}
