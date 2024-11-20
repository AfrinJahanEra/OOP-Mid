import java.io.FileWriter;
import java.io.IOException;

public class InvoiceGenerator {
    public void generateInvoice(Order order) throws IOException {
        try (FileWriter writer = new FileWriter("Invoice.txt")) {
            writer.write("Ice Cream Shop Invoice");
            for (Order item : order.getItems()) {
                
            }
        }
    }
}