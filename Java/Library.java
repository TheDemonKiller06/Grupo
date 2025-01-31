import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Funcionalidad para agregar un libro
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Libro agregado: " + book);
    }

    // Funcionalidad para listar todos los libros
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No hay libros para mostrar.");
        } else {
            Collections.sort(books, (book1, book2) -> book1.getTitle().compareToIgnoreCase(book2.getTitle()));
            System.out.println("Lista de libros ordenados por título:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Funcionalidad para buscar un libro por título
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Funcionalidad para eliminar un libro por título
    public void removeBook(String title) {
        Book bookToRemove = findBookByTitle(title);
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Libro eliminado: " + bookToRemove);
        } else {
            System.out.println("No se encontró el libro con el título: " + title);
        }
    }
}
