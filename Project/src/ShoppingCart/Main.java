package ShoppingCart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // creates new items with product name, quantity and unit price
        Item i1 = new Item("Olive Oil 1l", 1, 100.0);
        Item i2 = new Item("Cheese Slices", 1, 50.0);
        Item i3 = new Item("Bread", 1, 75.0);
        Item i4 = new Item("Eggs", 1, 10.0);
        Item i5 = new Item("Chicken Salami", 1, 100.0);

        ShoppingCart cart = new ShoppingCart();
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;

        int choice;

        while(mainLoop) {
            System.out.println("\nPlease Select an option from the menu below");
            System.out.println("\n------------------------------------------------------------------");
            System.out.println("\nBefore selecting option '5' make sure to enter coupon code 'IND10'");
            System.out.println("\n------------------------------------------------------------------");
            System.out.println("\n1.) Add Item To Cart");
            System.out.println("\n2.) Remove Item From Cart");
            System.out.println("\n3.) View Cart");
            System.out.println("\n4.) Apply Coupon");
            System.out.println("\n5.) View Invoice");
            System.out.println("\n6.) View Total");
            System.out.println("\n7.) View Payable");
            System.out.println("\n8.) Exit");
            System.out.print("\nEnter Selection Here: ");
            choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    int add;
                    System.out.println("\nSelect Item");
                    System.out.println("\n1.) " + i1);
                    System.out.println("\n2.) " + i2);
                    System.out.println("\n3.) " + i3);
                    System.out.println("\n4.) " + i4);
                    System.out.println("\n5.) " + i5);
                    System.out.print("\nEnter Selection Here: ");
                    add = input.nextInt();
                    if (add == 1) cart.addToCart(i1);
                    if (add == 2) cart.addToCart(i2);
                    if (add == 3) cart.addToCart(i3);
                    if (add == 4) cart.addToCart(i4);
                    if (add == 5) cart.addToCart(i5);
                }

                case 2 -> {
                    int delete;
                    System.out.println("\nSelect Item");
                    System.out.println("\n1.) " + i1);
                    System.out.println("\n2.) " + i2);
                    System.out.println("\n3.) " + i3);
                    System.out.println("\n4.) " + i4);
                    System.out.println("\n5.) " + i5);
                    System.out.print("\nEnter Selection Here: ");
                    delete = input.nextInt();
                    if (delete == 1) cart.removeFromCart(i1);
                    if (delete == 2) cart.removeFromCart(i2);
                    if (delete == 3) cart.removeFromCart(i3);
                    if (delete == 4) cart.removeFromCart(i4);
                    if (delete == 5) cart.removeFromCart(i5);
                }

                case 3 -> {
                    System.out.println("Cart:");
                    cart.showCart();
                    System.out.println("\n");
                }

                case 4 -> {
                    String coupon;
                    System.out.print("Enter Coupon: ");
                    coupon = input.next();
                    cart.applyCoupon(coupon);
                }

                case 5 -> cart.printInvoice();

                case 6 -> {
                    double totalAmount = cart.getTotalAmount();
                    System.out.println(totalAmount);
                }

                case 7 -> {
                    cart.getTotalAmount();
                    double payableAmount = cart.getPayableAmount();
                    System.out.println(payableAmount);
                }

                case 8 -> mainLoop = false;
            }
        }

//        /* add the item to the cart */
//        cart.addToCart(i1);
//        cart.addToCart(i2);
//        cart.addToCart(i3);
//        cart.addToCart(i4);
//        cart.addToCart(i5);
//
//        /*
//         * shows the list of items in the cart with quantity
//         * Expected Output to the console:
//         * Olive Oil 1l: 3
//         * Cheese Slices: 2
//         * Bread: 1
//         * Eggs: 50
//         * Chicken Salami: 2
//         */
//        cart.showCart();
//
//        /* remove the item sent as argument from the cart */
//        cart.removeFromCart(i3);
//
//        /*
//         * shows the list of items in the cart with quantity
//         * Expected Output to the console:
//         * Olive Oil 1l: 3
//         * Cheese Slices: 2
//         * Eggs: 50
//         * Chicken Salami: 2
//         */
//        cart.showCart();
//
//        /*
//         * gets the total amount for the items in the cart
//         * Expected Output:
//         * 1100
//         */
//        double totalAmount = cart.getTotalAmount();
//        System.out.println(totalAmount);
//
//        /*
//         * Gets the payable amount,
//         * it deducts discount and add tax to the total amount of items in cart
//         * Expected Output:
//         * 1232
//         */
//        double payableAmount = cart.getPayableAmount();
//        System.out.println(payableAmount);
//
//        /* apply a coupon code */
//        cart.applyCoupon("IND100");
//
//        /*
//         * print the items with the quantity, unit price, total amount
//         * apply coupon if valid
//         * add tax to the total amount after discount
//         * Expected Output to the console:
//         * Olive Oil 1l	3	100.0	300.0
//         * Cheese Slices	2	50.0	100.0
//         * Eggs	            50	10.0	500.0
//         * Chicken Salami	2	100.0	200.0
//         *             Total    : 1100.0
//         *             Discount : 0.0
//         *             Tax      : 132.0
//         *             Total    : 1232.0
//         *
//         */
//        cart.printInvoice();
//
//        cart.applyCoupon("IND10");
//
//        /*
//         * print the items with the quantity, unit price, total amount
//         * apply coupon if valid
//         * add tax to the total amount after discount
//         * Expected Output to the console:
//         * Olive Oil 1l	3	100.0	300.0
//         * Cheese Slices	2	50.0	100.0
//         * Eggs	            50	10.0	500.0
//         * Chicken Salami	2	100.0	200.0
//         *             Total    : 1100.0
//         *             Discount : 110.0
//         *             Tax      : 118.8
//         *             Total    : 1108.0
//         *
//         */
//        cart.printInvoice();
//
//        cart.addToCart(new Item("Milk", 5, 30.00));
//        /*
//         * print the items with the quantity, unit price, total amount
//         * apply coupon if valid
//         * add tax to the total amount after discount
//         * Expected Output to the console:
//         * Olive Oil 1l      3    100.00    300.00
//         * Cheese Slices     2     50.00    100.00
//         * Eggs             50     10.00    500.00
//         * Chicken Salami    2    100.00    200.00
//         * Milk              5     30.00    150.00
//         *                          Total: 1250.00
//         *                          Disc%:  125.00
//         *                          Tax:    135.0
//         *                          Total: 1262.50
//         *
//         */
//
//        cart.printInvoice();
    }
}
