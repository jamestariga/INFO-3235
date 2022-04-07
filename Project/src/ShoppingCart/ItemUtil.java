package ShoppingCart;

public class ItemUtil {
    public static String getItemAsString(Item item) {
        if (item == null) {
            return "none";
        }

        return item.getProductName() + "," + item.getQuantity() + "," + item.getUnitPrice();
    }
}
