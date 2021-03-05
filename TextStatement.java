import java.util.Enumeration;

public class TextStatement extends Statement {
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

   private String headerText(String name) {
      return "Rental Record for " + name + "\n";
   }

   private String dataText(String title, String rentalPrice){
      return "\t" + title + "\t" + rentalPrice + "\n";
   }

   private String footerText(String debt, String bonus) {
      return "Amount owed is " + debt + "\n" +
      "You earned " + bonus + " frequent renter points";
   }
}