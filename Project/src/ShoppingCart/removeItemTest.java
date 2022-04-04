package ShoppingCart;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class removeItemTest {
    private final ShoppingCart cart = new ShoppingCart();

    @Test
    @Category(itemHandlingTest.class)
    public void testRemoveFromCart() {
        System.out.println("\nRemove Item Test...");

        Item i1 = new Item("Olive Oil 1l", 3, 100.0);
        Item i2 = new Item("Cheese Slices", 2, 50.0);
        Item i3 = new Item("Bread", 1, 75.0);
        Item i4 = new Item("Eggs", 50, 10.0);
        String[] expected = {"Cheese Slices", "Bread"};
        cart.addToCart(i1);
        cart.addToCart(i2);
        cart.addToCart(i3);
        cart.addToCart(i4);
        cart.removeFromCart(i1);
        cart.removeFromCart(i4);

        assertEquals(Arrays.toString(expected), cart.item.toString());

    }
}
