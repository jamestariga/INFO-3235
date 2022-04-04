package ShoppingCart;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.Arrays;

public class addItemTest {
    private final ShoppingCart cart = new ShoppingCart();

    @Test
    @Category(itemHandlingTest.class)
    public void testAddToCart() {
        Item i1 = new Item("Olive Oil 1l", 3, 100.0);
        String[] expected = {"Olive Oil 1l"};
        cart.addToCart(i1);
        cart.showCart();
        System.out.println(cart.item);

        assertEquals(Arrays.toString(expected), cart.item.toString());
    }
}
