import java.util.Enumeration;

public class HtmlStatement extends Statement {
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = headerText(aCustomer.getName());
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         // show figures for each rental

         result += dataText(each.getMovie().getTitle(),
         String.valueOf(each.getCharge()));
      }
      
      // add footer lines
      result +=  footerText(String.valueOf(aCustomer.getTotalCharge()),
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()));
      return result;
   }

   private String headerText(String name) {
      return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
   }

   private String dataText(String title, String rentalPrice){
      return title + ": " + rentalPrice + "<BR>\n";
   }

   private String footerText(String debt, String bonus) {
      return "<P>You owe <EM>" + debt + "</EM><P>\n" +
      "On this rental you earned <EM>" + bonus +
      "</EM> frequent renter points<P>";
   }
}