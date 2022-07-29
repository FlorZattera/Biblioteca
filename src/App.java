import domain.Libro;
import service.Biblioteca;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.agregarLibro(new Libro("The Lightning Thief", "Rick Riordan", 2005));
        biblioteca1.agregarLibro(new Libro("The Two Towers", "John Ronald Reuel Tolkien", 1954));
        biblioteca1.agregarLibro(new Libro("The Outsider", "Stephen King", 2020));
        biblioteca1.agregarLibro(new Libro("The Two Towers", "John Ronald Reuel Tolkien", 1954));
        biblioteca1.agregarLibro(new Libro("The Sea of Monsters", "Rick Riordan", 2006));

        biblioteca1.etiquetarLibro();
        System.out.println("-------------");

        biblioteca1.imprimirLibros();
        System.out.println("-------------");

        System.out.println(biblioteca1.buscarLibro("The Two Towers"));
        System.out.println(biblioteca1.buscarLibro("Eclipse"));
    }
}
