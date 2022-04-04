package ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // creates new items with product name, quantity and unit price
        Item i1 = new Item("Olive Oil 1l", 3, 100.0);
        Item i2 = new Item("Cheese Slices", 2, 50.0);
        Item i3 = new Item("Bread", 1, 75.0);
        Item i4 = new Item("Eggs", 50, 10.0);
        Item i5 = new Item("Chicken Salami", 2, 100.0);

        ShoppingCart cart = new ShoppingCart();

        /* add the item to the cart */
        cart.addToCart(i1);
        cart.addToCart(i2);
        cart.addToCart(i3);
        cart.addToCart(i4);
        cart.addToCart(i5);

        /*
         * shows the list of items in the cart with quantity
         * Expected Output to the console:
         * Olive Oil 1l: 3
         * Cheese Slices: 2
         * Bread: 1
         * Eggs: 50
         * Chicken Salami: 2
         */
        cart.showCart();

        /* remove the item sent as argument from the cart */
        cart.removeFromCart(i3);

        /*
         * shows the list of items in the cart with quantity
         * Expected Output to the console:
         * Olive Oil 1l: 3
         * Cheese Slices: 2
         * Eggs: 50
         * Chicken Salami: 2
         */
        cart.showCart();

        /*
         * gets the total amount for the items in the cart
         * Expected Output:
         * 1100
         */
        double totalAmount = cart.getTotalAmount();
        System.out.println(totalAmount);

        /*
         * Gets the payable amount,
         * it deducts discount and add tax to the total amount of items in cart
         * Expected Output:
         * 1232
         */
        double payableAmount = cart.getPayableAmount();
        System.out.println(payableAmount);

        /* apply a coupon code */
        cart.applyCoupon("IND100");

        /*
         * print the items with the quantity, unit price, total amount
         * apply coupon if valid
         * add tax to the total amount after discount
         * Expected Output to the console:
         * Olive Oil 1l	3	100.0	300.0
         * Cheese Slices	2	50.0	100.0
         * Eggs	            50	10.0	500.0
         * Chicken Salami	2	100.0	200.0
         *             Total    : 1100.0
         *             Discount : 0.0
         *             Tax      : 132.0
         *             Total    : 1232.0
         *
         */
        cart.printInvoice();

        cart.applyCoupon("IND10");

        /*
         * print the items with the quantity, unit price, total amount
         * apply coupon if valid
         * add tax to the total amount after discount
         * Expected Output to the console:
         * Olive Oil 1l	3	100.0	300.0
         * Cheese Slices	2	50.0	100.0
         * Eggs	            50	10.0	500.0
         * Chicken Salami	2	100.0	200.0
         *             Total    : 1100.0
         *             Discount : 110.0
         *             Tax      : 118.8
         *             Total    : 1108.0
         *
         */
        cart.printInvoice();

        cart.addToCart(new Item("Milk", 5, 30.00));
        /*
         * print the items with the quantity, unit price, total amount
         * apply coupon if valid
         * add tax to the total amount after discount
         * Expected Output to the console:
         * Olive Oil 1l      3    100.00    300.00
         * Cheese Slices     2     50.00    100.00
         * Eggs             50     10.00    500.00
         * Chicken Salami    2    100.00    200.00
         * Milk              5     30.00    150.00
         *                          Total: 1250.00
         *                          Disc%:  125.00
         *                          Tax:    135.0
         *                          Total: 1262.50
         *
         */

        cart.printInvoice();
    }
}
