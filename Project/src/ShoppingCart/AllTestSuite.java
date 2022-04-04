package ShoppingCart;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
//@Categories.IncludeCategory(priceTest.class)
@Suite.SuiteClasses({
        addItemTest.class,
        removeItemTest.class,
        testCoupon.class,
        totalAmountTest.class,
        totalPayableTest.class
})

public class AllTestSuite {

}
