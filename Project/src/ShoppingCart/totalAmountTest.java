package ShoppingCart;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class totalAmountTest {
    private final ShoppingCart cart = new ShoppingCart();

    @Test
    @Category(priceTest.class)
    public void testTotalAmount() {
        System.out.println("\nTotal Amount Test...");

        Item i1 = new Item("Olive Oil 1l", 3, 100.0);
        cart.addToCart(i1);
        double price = 300.0;
        double total = cart.getTotalAmount();

        System.out.println("\nExpected Total: " + price + "\n");
        System.out.println("Actual Total: " + total);

        assertEquals(price, total);
    }
}
