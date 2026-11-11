import java.util.*;

public class SistemaBiblioteca {
    private final Map<String, Material> catalogo = new HashMap<>();
    private final Set<String> miembros = new HashSet<>();
    private final Map<String, List<String>> listaEspera = new HashMap<>();

    //Se registra un material en el catalogo utilizando su código como clave
    // y el objeto completo como valor
    public void registrarMaterial(Material m) {
        catalogo.put(m.getCodigo(), m);
    }

    public Material buscarMaterial(String codigo){
        return catalogo.get(codigo);
    }

    public void mostrarCatalogo(){
        //Map.Entry<String, Material> = Representa cada pareja clave y valor
        // entrada = es el nombre que se le da a cada pareja
        // catalogo.entrySet() = permite recorrer todas las parejas almacenadas

        for(Map.Entry<String, Material> entrada : catalogo.entrySet()){
            //entrada.getKey() obtiene el codigo del material
            //entrada.getValue() obtiene el objeto completo almacenado
            System.out.println(entrada.getKey() + ": " + entrada.getValue().mostrarInfo());
        }
    }

    //Registra un usuario en el conjunto de miembros
    //Devuelve true si se agrego correctamente o false si ya existia
    public boolean registrarMiembro(String usuario){
        return miembros.add(usuario);
    }

    // Comprueba si un usuario está registrado en el conjunto de miembros.
    // Devuelve true si existe o false si no está registrado.
    public boolean tieneMembresia(String usuario){
        return miembros.contains(usuario);
    }

    public void agregarEspera(String codigoMaterial, String usuario){
        if (!listaEspera.containsKey(codigoMaterial)){
            listaEspera.put(codigoMaterial, new ArrayList<>());
        }

        listaEspera.get(codigoMaterial).add(usuario);
    }

    public String siguienteEnEspera(String codigoMaterial) {

        List<String> usuarios = listaEspera.get(codigoMaterial);
        if (usuarios == null || usuarios.isEmpty()) {
            return null;
        }
        return usuarios.remove(0);
    }

}
