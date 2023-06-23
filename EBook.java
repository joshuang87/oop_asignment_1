public class EBook extends Book {
    
    private String fileFormat;
    EBook(String title,String author,double price,int quantity,String fileFormat) {
        super(title, author, price, quantity);
        this.fileFormat = fileFormat;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public void openBook() {
        System.out.println("The book is opened. You may start reading.");
    }

    public void downloadBook() {
        System.out.println("The book is downloading...");
    }

    public boolean validateFormat(String fileFormat) {
        if(fileFormat == ".pdf" || fileFormat == ".epub") {
            return true;
        }
        else {
            return false;
        }
    }

    // @Override
    // public String toString() {
    //     return super.toString() + "\nFile Format : " + fileFormat;
    // }
}
