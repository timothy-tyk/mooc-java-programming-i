import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();
        while(true){
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title,pages,publicationYear));
       
        }
        System.out.print("What information will be printed? ");
        String answer = scanner.nextLine();
        if(answer.equals("everything")){
            for(Book b:books){
                System.out.println(b.getTitle()+", "+b.getPages()+" pages, "+b.getPublicationYear());
            }
        }else if(answer.equals("name")){
            for(Book b:books){
                System.out.println(b.getTitle());
            }
        }

    }
}
