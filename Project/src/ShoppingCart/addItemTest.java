package ShoppingCart;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class addItemTest {
    private final ShoppingCart cart = new ShoppingCart();

    @Test
    @Category(itemHandlingTest.class)
    public void testAddToCart() {
        Item i1 = new Item("Olive Oil 1l", 3, 100.0);
        cart.addToCart(i1);
        cart.showCart();
    }
}
