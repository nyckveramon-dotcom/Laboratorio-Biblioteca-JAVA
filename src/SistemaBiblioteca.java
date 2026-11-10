import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SistemaBiblioteca {
    private final HashMap<String, Material> catalogo = new HashMap<>();

    //Se registra un material y se añade el elemento al map utilizando clave (getcodigo) y valor (m)
    public void registrarMaterial(Material m) {
        catalogo.put(m.getCodigo(), m);
    }

    public Material buscarMaterial(String codigo){
        return catalogo.get(codigo);
    }
}
