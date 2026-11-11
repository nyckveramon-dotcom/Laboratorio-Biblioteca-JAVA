public abstract class Material implements Catalogable {

    private String titulo;
    private String codigo;
    private int anioPublicacion;
    private boolean disponibilidad;

    public Material(String titulo, String codigo, int anioPublicacion, boolean disponibilidad){
        if (titulo == null || titulo.isBlank() ){
            throw new IllegalArgumentException("El titulo del libro requiere diligenciamiento.");
        }
        if (codigo == null || codigo.isBlank() ){
            throw new IllegalArgumentException("El codigo requiere diligenciamiento.");
        }

        if (anioPublicacion <= 0){
            throw new IllegalArgumentException("El año de publicación debe ser mayor a 0");
        }
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.disponibilidad = disponibilidad;
        this.codigo = codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getAnioPublicacion(){
        return anioPublicacion;
    }
    public boolean isDisponibilidad(){
        return disponibilidad;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public abstract String getTipo();

    public String mostrarInfo(){
        return "Tipo de material: " + getTipo() + ", Titulo: " + getTitulo() +
                ", Año de publicación: " + getAnioPublicacion() + ", Disponible: " + isDisponibilidad();
    }
}
