public class Revista extends Material{

    private String edicion;
    private String tematica;

    public Revista(String titulo, String codigo, int anioPublicacion, boolean disponibilidad, String edicion, String tematica) {
        super(titulo, codigo, anioPublicacion, disponibilidad);

        this.edicion = edicion;
        this.tematica = tematica;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getTematica() {
        return tematica;
    }

    @Override
    public String getTipo() {
        return "Revista";
    }
}
