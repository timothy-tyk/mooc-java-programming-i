
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object other){
        if(this==other)return true;
        if(!(other instanceof Book))return false;
        Book otherBook = (Book)other;
        if(this.name.equals(otherBook.name) && this.publicationYear==otherBook.publicationYear){
            return true;
        }
        return false;
    }

}
