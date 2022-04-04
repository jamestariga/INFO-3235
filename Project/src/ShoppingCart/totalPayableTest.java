package ShoppingCart;

import org.junit.experimental.categories.Category;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class totalPayableTest {
    private final ShoppingCart cart = new ShoppingCart();

    @Test
    @Category(priceTest.class)
    public void testPayableAmount()  {
        Item i1 = new Item("Olive Oil 1l", 3, 100.0);
        Item i2 = new Item("Cheese Slices", 2, 50.0);
        cart.addToCart(i1);
        cart.addToCart(i2);
        cart.getTotalAmount();
        double price = 448.0;
        double pay = cart.getPayableAmount();

        assertEquals(price, pay);
    }
}
