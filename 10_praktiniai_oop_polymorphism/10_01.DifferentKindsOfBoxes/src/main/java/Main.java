

public class Main {

    public static void main(String[] args) {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 1));
        coffeeBox.add(new Item("Pirrka", 1));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirrka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));


    }

}
