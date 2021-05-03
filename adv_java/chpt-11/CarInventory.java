public class CarInventory {
    public static void main(String[] args) {
        String[][] data = { 
            { "New", "Used" }, 
            { "BMW", "Mercedes", "Porche" }, 
            { "Hardtop", "Convertible" }, 
            { "Red", "Champaigne", "Silver", "Black" } 
        };

        String[] oneline = new String[data.length];

        computeProduct(data, oneline, 0);
    }// end main

    public static void computeProduct(String[][] dataPassed, String[] oneLinePassed, int groupPassed) {
        if (groupPassed >= dataPassed.length) {
            return;
        }

        for (int i = 0; i < dataPassed[groupPassed].length; ++i) {
            oneLinePassed[groupPassed] = dataPassed[groupPassed][i];
            computeProduct(dataPassed, oneLinePassed, groupPassed + 1);
            if (groupPassed == dataPassed.length - 1) {
                printItems(oneLinePassed);
            }
        }

    }// end method

    public static void printItems(String[] oneLinePassed) {
        for (int i = 0; i < oneLinePassed.length; ++i) {
            System.out.print(oneLinePassed[i] + " ");
        }
        System.out.println();
    }

}// end class
