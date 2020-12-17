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
        address = "unknown";
        squareFeet = 0;
        cost = 0;
        lotSize = 0;
        bedrooms = 0;
        bathrooms = 0.0;
        costPerSquareFoot = 0.0;
        // setAddress("uknown");
//         setSquareFeet(0);
//         setCost(0);
//         setLotSize(0);
//         setBedrooms(0);
//         setBathrooms(0.0);
//         setCostPerSquareFoot(0.0);
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
        setAddress(addressPassed);
        setSquareFeet(squareFeetPassed);
        setCost(costPassed);
        setLotSize(lotSizePassed);
        setBedrooms(bedroomsPassed);
        setBathrooms(bathroomsPassed);
        setCostPerSquareFoot(getCostPerSquareFoot());
    }


    public void setAddress(String string) {
        // Scanner keyboard = new Scanner(System.in);
        // System.out.println("Please enter the address in one line.");
        //addressPassed = keyboard.nextLine();

    }

    public void setSquareFeet(int squareFeetPassed) {
        while (squareFeet < 0) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Square feet must be greater than 0, please re-enter.");
            squareFeetPassed = keyboard.nextInt();
            keyboard.close();
        }
        this.squareFeet = squareFeetPassed;
    }

    public void setCost(int costPassed) {
        while (costPassed < 0) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Cost must be greater than 0, please re-enter.");
            costPassed = keyboard.nextInt();
            keyboard.close();
        }
        this.cost = costPassed;
    }

    public void setLotSize(int lotSizePassed) {
        while (lotSizePassed < 0) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Lot must be greater than 0, please re-enter.");
            lotSizePassed = keyboard.nextInt();
            keyboard.close();
        }
        this.lotSize = lotSizePassed;
    }

    public void setBedrooms(int bedroomsPassed) {
        while (bedroomsPassed < 0) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Bedrooms must be greater than 0, please re-enter.");
            bedroomsPassed = keyboard.nextInt();
            keyboard.close();
        }
        this.bedrooms = bedroomsPassed;
    }

    public void setBathrooms(double bathroomsPassed) {
        while (bathroomsPassed < 0) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Bathrooms must be greater than 0, please re-enter.");
            bathroomsPassed = keyboard.nextDouble();
            keyboard.close();
        }
        this.bathrooms = bathroomsPassed;
    }
    
    public double calculateCostPerSquareFoot(int costPassed, int squareFeetPassed) {
        return cost / squareFeet;
    }

    public void setCostPerSquareFoot(double calculateCostPerSquareFoot) {
        //costPerSquareFoot = (cost / squareFeet);
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

}// end class
