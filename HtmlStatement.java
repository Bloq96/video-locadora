public class HtmlStatement extends Statement {
   public String headerText(String name) {
      return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
   }

   public String dataText(String title, String rentalPrice){
      return title + ": " + rentalPrice + "<BR>\n";
   }

   public String footerText(String debt, String bonus) {
      return "<P>You owe <EM>" + debt + "</EM><P>\n" +
      "On this rental you earned <EM>" + bonus +
      "</EM> frequent renter points<P>";
   }
}