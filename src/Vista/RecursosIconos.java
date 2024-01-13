package Vista;


import javax.swing.ImageIcon;
import java.util.ArrayList;

public class RecursosIconos {
    private ArrayList<ImageIcon> baseIconos;
    private ArrayList<ImageIcon> j1Iconos;
    private ArrayList<ImageIcon> j2Iconos;

    public RecursosIconos() {
        // Inicializar y cargar los iconos
        baseIconos = new ArrayList<>();
        j1Iconos = new ArrayList<>();
        j2Iconos = new ArrayList<>();

        // Rellenar las listas con los iconos correspondientes
        baseIconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\BCIRCULO ABAJO DERECHA.png"));
        baseIconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\BCIRCULO IZQUIERDA DERECHA ABAJO.png"));

        j1Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J1CIRCULO ABAJO DERECHA.png"));  // Reemplaza "rutaJ1_1" con la ruta real de tu icono
        j1Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J1CIRCULO IZQUIERDA DERECHA ABAJO.png"));  // Reemplaza "rutaJ1_2" con la ruta real de tu icono

        j2Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J2CIRCULO ABAJO DERECHA.png"));  // Reemplaza "rutaJ2_1" con la ruta real de tu icono
        j2Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J2CIRCULO IZQUIERDA DERECHA ABAJO.png"));  // Reemplaza "rutaJ2_2" con la ruta real de tu icono
    }

    public ArrayList<ImageIcon> getBaseIcono() {
        return baseIconos;
    }

    public ArrayList<ImageIcon> getJ1Icono() {
        return j1Iconos;
    }

    public ArrayList<ImageIcon> getJ2Icono() {
        return j2Iconos;
    }
}
