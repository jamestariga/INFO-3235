package ShoppingCart;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class testCSV {

    @ParameterizedTest
    @CsvFileSource(resources = "../csvTest.csv", numLinesToSkip = 1)
    void testWithCSV(String productName, int quantity, int unitPrice) {
        Item item = new Item(productName, quantity, unitPrice);

        String expected = item.getProductName() + "," + item.getQuantity() + "," + item.getUnitPrice();
        String actual = ItemUtil.getItemAsString(item);

        assertEquals(expected, actual);
    }
}
