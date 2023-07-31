package employeeApp;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    private void checkGiro(double giro) {
        this.giro = giro < 0 ? 0 : giro;
    }

    private void checkId(int id) {
        this.id = id < 0 ? 0 : id;
    }

    public Company(int id, String name, double giro, String[] developerNames) {
        checkId(id);
        this.name = name;
        checkGiro(giro);
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void addEmployee(int index, String name) {
        try {
            if (developerNames[index] == null) {
                developerNames[index] = name;
            } else {
                System.out.println("İlgili indexte developer mevcut");
            }
        } catch (Exception ex) {
            System.out.println("Hata...");
        }
    }

    @Override
    public String toString(){
        return "Name: " + name + " Giro: " + giro + " developers: " + Arrays.toString(developerNames);
    }
}
