public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();

        item1.id = 1;
        item1.descr = "Product 1";
        item1.price = 5.35;
        item1.quantity = 10;

        item2.id = 2;
        item2.descr = "Product 2";
        item2.price = 6.4;
        item2.quantity = 6;

        System.out.println(item1.descr);
        System.out.println(item2.descr);

    }
}
