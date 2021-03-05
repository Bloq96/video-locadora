import java.util.Enumeration;

public abstract class Statement {
   public String value(Customer aCustomer) {
     Enumeration rentals = aCustomer.getRentals();
     String result = headerText(aCustomer.getName());
     while (rentals.hasMoreElements()) {
        Rental each = (Rental) rentals.nextElement();

        //show figures for this rental
        result += dataText(each.getMovie().getTitle(),
        String.valueOf(each.getCharge()));
     }
     //add footer lines
     result +=  footerText(String.valueOf(aCustomer.getTotalCharge()),
     String.valueOf(aCustomer.getTotalFrequentRenterPoints()));
     return result;
   }

   public abstract String headerText(String name);

   public abstract String dataText(String title, String rentalPrice);

   public abstract String footerText(String debt, String bonus);
}