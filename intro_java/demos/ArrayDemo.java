public class ArrayDemo {
    public static void main(String[] args) {
        int[] myArray; //declare
        myArray = new int[6];//create

        // int[] myArray1 = new int[6];

        // System.out.println(myArray[0]);

        // //myArray[4] = 22;
        // System.out.println(myArray[4]);

        myArray[0] = 0;
        myArray[1] = 1;
        myArray[2] = 2;
        myArray[3] = 3;
        myArray[4] = 4;
        myArray[5] = 5;

        for (int i = 0;i< myArray.length; ++i) {
            System.out.println(myArray[i]);
        }
        }
    
    public static void printArrayOfInts(int[] arrayPassed) {
        for (int i = 0;i < arrayPassed.length; ++i) {
            System.out.println(arrayPassed[i]);
    }//end method

    public static void populateArrayOfInts() {
        
    }

    }//end main
}//end class