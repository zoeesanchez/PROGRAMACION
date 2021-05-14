import javax.swing.JOptionPane;
public class PerroLabrador {
public static void main(String[] args) {
        // TODO code application logic here
        int a = 1;
        int i;      
        
        Perro labrador[] = new Perro[a];
        
        for(i=0; i<labrador.length; i++){
            labrador[i] = new Perro();
        
            labrador[i].setNombre(JOptionPane.showInputDialog("Ingrese nombre: "));
            labrador[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese edad(en aÃ±os): ")));
            labrador[i].setRaza(JOptionPane.showInputDialog("Ingrese raza: "));
        }
        
        for(i=0; i<labrador.length; i++){
            JOptionPane.showMessageDialog(null, labrador[i].getNombre()+", "+labrador[i].getEdad()+" aÃ±os, "+labrador[i].getRaza());
        }   
    
    }
    
}
    
    
}
