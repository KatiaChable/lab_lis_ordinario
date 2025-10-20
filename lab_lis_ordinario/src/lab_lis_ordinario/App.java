package lab_lis_ordinario;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Computer> computers  = new ArrayList<>();
        computers.add(new Desktop("2020", "Apple", "MacOS", 40.0));
        computers.add(new Laptop("2025", "HP", "Windows", 50, 3.5));
        computers.add(new Notebook("2024", "IBM", "Linux", 60, 2.5));
    
        System.out.printf("%-3s %-8s %-10s %-10s %-30s%n", "No","Modelo", "Marca", "SO", "Tipo");

        int i = 1;
        for(Computer comp : computers){
            System.out.printf("%-3d %-8s %-10s %-10s %-30s%n", i, comp.getModel(), comp.getManufacturer(), comp.getOperatingSystem(), comp.getComputerType());
            i++;
        }

        
    }
}
