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
        System.out.println("\nAdd Item Test...");

        Item i1 = new Item("Olive Oil 1l", 3, 100.0);
        String[] expected = {"Olive Oil 1l"};
        cart.addToCart(i1);

        assertEquals(Arrays.toString(expected), cart.item.toString());
    }
}
