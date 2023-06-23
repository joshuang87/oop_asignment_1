public class Main {
    public static void main(String[] args) {
        
        PhysicalBook physicalBook = new PhysicalBook("Discrete Mathematics and Its Applications", "Kenneth H. Rosen", 125, 5239,500);

        EBook eBook = new EBook("A Christmas Greeting", "Hans Christian Andersen", 59, 3672, ".epub");

        // physicalBook.setTitle("Discrete Mathematics and Its Applications");
        // physicalBook.setAuthor("Kenneth H. Rosen");
        // physicalBook.setPrice(125);
        // physicalBook.setQuantity(5239);
        // physicalBook.setWeight(500);

        String physicalBookName = physicalBook.getTitle();
        String physicalBookAuthor = physicalBook.getAuthor();
        double physicalBookPrice = physicalBook.getPrice();
        int physicalBookQuantity = physicalBook.getQuantity();
        double physicalBookWeight = physicalBook.getWeight();
        double physicalBookShippingCost = physicalBook.calculateShippingCost(physicalBookWeight);
        double physicalBookWeightInPounds = physicalBook.getWeightInPounds(physicalBookWeight);

        System.out.println("\n" + "Physical Book" + "\n");
        System.out.println("Title : " + physicalBookName + "\nAuthor : " + physicalBookAuthor + "\nPrice : RM " + physicalBookPrice + "\nQuantity : " + physicalBookQuantity + "\nWeight : " + physicalBookWeight + " gram\n" + "Shipping Cost : " + physicalBookShippingCost + "\nWeight in Pounds : " + physicalBookWeightInPounds + " Pounds\n");

        // eBook.setTitle("A Christmas Greeting");
        // eBook.setAuthor("Hans Christian Andersen");
        // eBook.setPrice(59);
        // eBook.setQuantity(3672);
        // eBook.setFileFormat(".epub");

        String eBookName = eBook.getTitle();
        String eBookAuthor = eBook.getAuthor();
        double eBookPrice = eBook.getPrice();
        int eBookQuantity = eBook.getQuantity();
        String eBookFileFormat = eBook.getFileFormat();
        boolean eBookValidate = eBook.validateFormat(eBookFileFormat);

        System.out.println("\n" + "EBook" + "\n");
        System.out.println("Title : " + eBookName + "\nAuthor : " + eBookAuthor + "\nPrice : RM " + eBookPrice + "\nQuantity : " + eBookQuantity + "\nFile Format : " + eBookFileFormat);

        System.out.println("\nOpen Book Method Testing\n");
        eBook.openBook();

        System.out.println("\nDownload Book Method Testing\n");
        eBook.downloadBook();

        System.out.println("\nIs the file format of the EBook validate ? " + eBookValidate);
    }
}