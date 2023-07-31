package employeeApp;

public enum Plan {
    AXA("Axa Sigorta", 16599.00),
    ALLIANZ("Allianz Sigorta", 12499.99),
    METLIFE("Metlife Workintech", 3599.00);

    private String name;
    private double price;

    Plan(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}



