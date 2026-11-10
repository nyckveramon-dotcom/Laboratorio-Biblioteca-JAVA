public class Libro extends Material {

    private String autor;
    private String isbn;

    public Libro(String titulo, String codigo, int anioPublicacion, boolean disponibilidad, String autor, String isbn) {
        super(titulo, codigo, anioPublicacion, disponibilidad);

        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String getTipo() {
        return "Libro";
    }
}
