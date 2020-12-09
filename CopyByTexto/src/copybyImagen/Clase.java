
package copybyImagen;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author YO
 */
public class Clase {
    public static void ArchivoCopia(String nombre){
        File name;
        FileInputStream org=null;
        FileOutputStream copia=null;
        name=new File(nombre);
        try{
            int content;
            org=new FileInputStream(name);
            copia=new FileOutputStream("foto2.jpg",true);
            while((content=org.read()) != -1){
                copia.write(content);
            }
        }catch(IOException e){
            System.out.println("error con un archivo");
        }finally{
            try{
               if(org != null){
                   org.close();
               } 
               if(copia != null){
                   copia.close();
               } 
            }catch(IOException e2){
                System.out.println("error al cerrar los archivos");
            }
        }
    }
}