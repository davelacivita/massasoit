import java.util.Scanner;

public class NodeLinkedList {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Boolean again;
        String descriptionEntered;
        NodeDemo p = null;
        NodeDemo q = null;
        NodeDemo r;

        System.out.println("Add a Node? True or false");
        again = keyboard.nextBoolean();
        keyboard.nextLine();

        if (!again) {
            System.out.println("Program will end.");
        }

        else {
            System.out.println("Please enter some data");
            descriptionEntered = keyboard.nextLine();
            p = new NodeDemo(descriptionEntered, null);
            q = p;
            r = null;
        }

        System.out.println("Add another Node? True or false");
        again = keyboard.nextBoolean();
        keyboard.nextLine();

        while (again) {
            System.out.println("Please enter some data");
            descriptionEntered = keyboard.nextLine();
            r = new NodeDemo(descriptionEntered, null);
            q.setLink(r);
            q = r;

            System.out.println("Add another Node? True or false");
            again = keyboard.nextBoolean();
            keyboard.nextLine();
        }

        NodeDemo currentNode = p;
        while (currentNode != null) {
            System.out.println(currentNode.getDesciption());
            currentNode = currentNode.getLink();
        }

    }
}
