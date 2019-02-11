package ua.hillel.antonova.lesson18;

public class Main {
    public static void main(String[] args) {

        Object[] arr = {1,2,3,4};
        OwnCollection ownCollection = new OwnCollection(arr);
        System.out.println(ownCollection.size());
        System.out.println(ownCollection.isEmpty());

        System.out.println(ownCollection.contains(5));
        for (int i = 0; i < ownCollection.size(); i++) {
            System.out.println(ownCollection.toArray()[i]);
        }
    }
}
