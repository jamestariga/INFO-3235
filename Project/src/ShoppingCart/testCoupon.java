package ShoppingCart;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.jupiter.api.Assertions.*;

public class testCoupon {
    private final ShoppingCart cart = new ShoppingCart();


    @Test(expected = IllegalArgumentException.class)
    @Category(itemHandlingTest.class)
    public void couponTest() {
        System.out.println("\nTest Coupon Test...");

        String validCoupon = "IND10";

//        cart.applyCoupon("IND10");
        cart.applyCoupon("");

        String testingCoupon = cart.coupon;

        assertEquals(validCoupon, testingCoupon);
    }
}
