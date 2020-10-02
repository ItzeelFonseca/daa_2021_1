
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class DosOctubre {

    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        
        File archiv= new File ("C:\\Users\\itzee\\Documents\\NetBeansProjects\\SistemaMeteorologico\\2017Precip.csv");
        File archiv1= new File("C:\\Users\\itzee\\Documents\\NetBeansProjects\\SistemaMeteorologico\\2018Precip.csv");
 
        
        FileReader fr = new FileReader("C:\\Users\\itzee\\Documents\\NetBeansProjects\\SistemaMeteorologico\\2017Precip.csv");
        BufferedReader bf = new BufferedReader(fr);
        String sCadena;
        while ((sCadena = bf.readLine())!=null) {
           System.out.println(sCadena);
}
        
        FileReader frr = new FileReader("C:\\Users\\itzee\\Documents\\NetBeansProjects\\SistemaMeteorologico\\2018Precip.csv");
        BufferedReader bff = new BufferedReader(frr);
        while ((sCadena = bf.readLine())!=null) {
            System.out.println(sCadena);
}
        
    }

    public static void main(String[] args) throws IOException {
        int año;
        String estado,mes;
        //muestraContenido("C:\\Users\\itzee\\Documents\\NetBeansProjects\\DosOctubre\\2017Precip.csv");
        //muestraContenido("C:\\Users\\itzee\\Documents\\NetBeansProjects\\DosOctubre\\2018Precip.csv");
        
        año=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el año"));
        estado=(JOptionPane.showInputDialog("Introduce el estado"));
        mes=(JOptionPane.showInputDialog("Introduce el mes"));
        
        
        
    }


}
