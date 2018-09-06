package tallercomposite;

import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {
    Componente calle1 = new Calle("Calle 1", 5.4, 6.2, 8.1, 1.7, 15, 12);
    Componente calle2 = new Calle("Calle 2", 6.2, 9.5, 8.4, 1.12, 20, 12);
    Componente calle3 = new Calle("Calle 3", 5.4, 6.2, 8.1, 1.7, 10, 12);
    Componente calle4 = new Calle("Calle 4", 1.82, 6.2, 8.1, 1.7, 25, 12);
    
    Ruta ruta1 = new Ruta("Ruta 1");
    
    ruta1.add(calle1);
    ruta1.add(calle2);
    ruta1.add(calle3);
    ruta1.add(calle4);
    
    Ruta ruta2 = new Ruta("Ruta 2");
    Componente calle5 = new Calle("Calle 5", 5.4, 6.3, 8.1, 1.7, 30, 20);
    
    ruta2.add(ruta1);
    ruta2.add(calle5);
    
    JOptionPane.showMessageDialog(null, ruta2.obtenerInformacion());
  }

}
