import java.util.Scanner;
public class House {
    private String address;//Street, Town, State, zip (as a single String)
    private int squareFeet;
    private int cost;
    private int lotSize; //in square feet
    private int bedrooms;
    private double bathrooms;
    private double costPerSquareFoot;

// deffault
    public House() {
        // address = "unknown";
        // squareFeet = 0;
        // cost = 0;
        // lotSize = 0;
        // bedrooms = 0;
        // bathrooms = 0.0;
        // costPerSquareFoot = 0.0;
        this.setAddress("uknown");
        this.setSquareFeet(0);
        this.setCost(0);
        this.setLotSize(0);
        this.setBedrooms(0);
        this.setBathrooms(0.0);
        this.setCostPerSquareFoot();
    }
// non default
    public House(String addressPassed, int squareFeetPassed, int costPassed,
    int lotSizePassed, int bedroomsPassed, double bathroomsPassed) {
        // address = addressPassed;
        // squareFeet = squareFeetPassed;
        // cost = costPassed;
        // lotSize = lotSizePassed;
        // bedrooms = bedroomsPassed;
        // bathrooms = bathroomsPassed;
        // costPerSquareFoot = getCostPerSquareFoot();
        this.setAddress(addressPassed);
        this.setSquareFeet(squareFeetPassed);
        this.setCost(costPassed);
        this.setLotSize(lotSizePassed);
        this.setBedrooms(bedroomsPassed);
        this.setBathrooms(bathroomsPassed);
        this.setCostPerSquareFoot();
    }


    public void setAddress(String addressPassed) {
        this.address = addressPassed;
    }

    public void setSquareFeet(int squareFeetPassed) {
        Scanner keyboard = new Scanner(System.in);
        while (squareFeetPassed < 0) {
            System.out.println("Square feet must be greater than 0, please re-enter.");
            squareFeetPassed = keyboard.nextInt();
        }
        this.squareFeet = squareFeetPassed;
    }

    public void setCost(int costPassed) {
        Scanner keyboard = new Scanner(System.in);
        while (costPassed < 0) {
            System.out.println("Cost must be greater than 0, please re-enter.");
            costPassed = keyboard.nextInt();
        }
        this.cost = costPassed;
    }

    public void setLotSize(int lotSizePassed) {
        Scanner keyboard = new Scanner(System.in);
        while (lotSizePassed < 0) {
            System.out.println("Lot must be greater than 0, please re-enter.");
            lotSizePassed = keyboard.nextInt();
        }
        this.lotSize = lotSizePassed;
    }

    public void setBedrooms(int bedroomsPassed) {
        Scanner keyboard = new Scanner(System.in);
        while (bedroomsPassed < 0) {
            System.out.println("Bedrooms must be greater than 0, please re-enter.");
            bedroomsPassed = keyboard.nextInt();
        }
        this.bedrooms = bedroomsPassed;
    }

    public void setBathrooms(double bathroomsPassed) {
        Scanner keyboard = new Scanner(System.in);
        while (bathroomsPassed < 0) {
            System.out.println("Bathrooms must be greater than 0, please re-enter.");
            bathroomsPassed = keyboard.nextDouble();
        }
        this.bathrooms = bathroomsPassed;
    }

    public void setCostPerSquareFoot() {
        if (this.squareFeet == 0) {
            this.costPerSquareFoot = cost;
        }
        else {
            this.costPerSquareFoot = this.cost / this.squareFeet;
        }
    }

    public String getAddress() {
        return this.address;
    }
    
    public int getSquareFeet() {
        return this.squareFeet;
    }
    
    public int getCost() {
        return this.cost;
    }
    
    public int getLotSize() {
        return this.lotSize;
    }
    
    public int getBedrooms() {
        return this.bedrooms;
    }
    
    public double getBathrooms() {
        return this.bathrooms;
    }
    
    public double getCostPerSquareFoot() {
        return this.costPerSquareFoot;
    }
    
    public String toString() {
        return "\nAddress: " + this.getAddress() +
        "\nSquare feet: " + this.getSquareFeet() +
        "\nCost: " + this.getCost() +
        "\nLot size: " + this.getLotSize() +
        "\nBedrooms: " + this.getBedrooms() +
        "\nBathrooms: " + this.getBathrooms() +
        "\nCost per square foot: " + getCostPerSquareFoot();
    }

    public boolean equals(House housePassed) {
        return
        this.address.equals(housePassed.address) &&
        this.cost == housePassed.cost &&
        this.squareFeet == housePassed.squareFeet &&
        this.lotSize == housePassed.lotSize &&
        this.bedrooms == housePassed.bedrooms &&
        this.bathrooms == housePassed.bathrooms &&
        this.costPerSquareFoot == housePassed.costPerSquareFoot;
    }

}// end class
