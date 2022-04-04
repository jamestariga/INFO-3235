package ShoppingCart;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class removeItemTest {
    private final ShoppingCart cart = new ShoppingCart();

    @Test
    @Category(itemHandlingTest.class)
    public void testRemoveFromCart() {
        Item i1 = new Item("Olive Oil 1l", 3, 100.0);
        Item i2 = new Item("Cheese Slices", 2, 50.0);
        cart.addToCart(i1);
        cart.removeFromCart(i1);
        cart.addToCart(i2);
        cart.showCart();

    }
}
