public class TextStatement extends Statement {
   public String headerText(String name) {
      return "Rental Record for " + name + "\n";
   }

   public String dataText(String title, String rentalPrice){
      return "\t" + title + "\t" + rentalPrice + "\n";
   }

   public String footerText(String debt, String bonus) {
      return "Amount owed is " + debt + "\n" +
      "You earned " + bonus + " frequent renter points";
   }
}