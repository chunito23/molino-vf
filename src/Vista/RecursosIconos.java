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
        baseIconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\BCIRCULO ABAJO IZQUIERDA.png"));
        baseIconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\BCIRCULO ARRIBA ABAJO DERECHA.png"));
        baseIconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\BCIRCULO ARRIBA ABAJO IZQUIERDA.png"));
        baseIconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\BCIRCULO ARRIBA DERECHA.png"));
        baseIconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\BCIRCULO ARRIBA IZQUIERDA.png"));
        baseIconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\BCIRCULO IZQUIERDA DERECHA ARRIBA.png"));
        baseIconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\BCIRCULO TOTAL.png"));

        j1Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J1CIRCULO ABAJO DERECHA.png"));
        j1Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J1CIRCULO IZQUIERDA DERECHA ABAJO.png"));
        j1Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J1CIRCULO ABAJO IZQUIERDA.png"));
        j1Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J1CIRCULO ARRIBA ABAJO DERECHA.png"));
        j1Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J1CIRCULO ARRIBA ABAJO IZQUIERDA.png"));
        j1Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J1CIRCULO ARRIBA DERECHA.png"));
        j1Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J1CIRCULO ARRIBA IZQUIERDA.png"));
        j1Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J1CIRCULO IZQUIERDA DERECHA ARRIBA.png"));
        j1Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J1CIRCULO TOTAL.png"));

        j2Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J2CIRCULO ABAJO DERECHA.png"));
        j2Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J2CIRCULO IZQUIERDA DERECHA ABAJO.png"));
        j2Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J2CIRCULO ABAJO IZQUIERDA.png"));
        j2Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J2CIRCULO ARRIBA ABAJO DERECHA.png"));
        j2Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J2CIRCULO ARRIBA ABAJO IZQUIERDA.png"));
        j2Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J2CIRCULO ARRIBA DERECHA.png"));
        j2Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J2CIRCULO ARRIBA IZQUIERDA.png"));
        j2Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J2CIRCULO IZQUIERDA DERECHA ARRIBA.png"));
        j2Iconos.add(new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J2CIRCULO TOTAL.png"));
    }

    public ArrayList<ImageIcon> getBaseIconos() {
        return baseIconos;
    }

    public ArrayList<ImageIcon> getJ1Iconos() {
        return j1Iconos;
    }

    public ArrayList<ImageIcon> getJ2Iconos() {
        return j2Iconos;
    }
}