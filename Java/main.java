public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Agregar algunos libros
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

        // Listar los libros
        library.listBooks();

        // Buscar libros
        Book foundBook = library.findBookByTitle("1984");
        if (foundBook != null) {
            System.out.println("Libro encontrado: " + foundBook);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}

