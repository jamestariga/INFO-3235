package ShoppingCart;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class totalAmountTest {
    private final ShoppingCart cart = new ShoppingCart();

    @Test
    @Category(priceTest.class)
    public void testTotalAmount() {
        Item i1 = new Item("Olive Oil 1l", 3, 100.0);
        cart.addToCart(i1);
        double price = 300.0;
        double total = cart.getTotalAmount();

        assertEquals(price, total);
    }
}
