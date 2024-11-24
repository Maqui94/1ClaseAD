import java.io.File;
import java.io.IOException;

public class Entrada {

    public static void main(String[] ars) {

        // FILE -> fichero logico --> Fisico
    // absoluta    File ficheroSinPuntero=new File("C:\\Users\\khalaih\\Desktop\\UNIR\\DAM\\Segundo\\acceso a datos\\1ClaseAD\\tema 1\\FicheroMaqui\\src\\resources\\directorio\\ejemplo_fichero.txt");
        File ficheroSinPuntero=new File("src/resources/directorio/");
        File[] FicheroConPuntero= ficheroSinPuntero.listFiles(); //File [] porque es un array de carpetas, nombre, e igual al array que queremos.
        System.out.println(ficheroSinPuntero.getName());
        System.out.println(ficheroSinPuntero.getParent());
        System.out.println(ficheroSinPuntero.length());
        System.out.println(ficheroSinPuntero.exists());
        System.out.println(ficheroSinPuntero.isDirectory());
        for (File FicherConPuntero: FicheroConPuntero) //bucle for para recorrer uno a uno, sing:plural
        System.out.println(FicherConPuntero.getName());

        ficheroSinPuntero.listFiles();//Devuelve un arrive de files., todos los ficheros que estan en el directorio.
        ficheroSinPuntero.list();  //Te devuelve todas las rutas de los ficheros que estan dentro del directorio
        if (!ficheroSinPuntero.exists()){
            try{
            ficheroSinPuntero.createNewFile();
        } catch (IOException e) {
                System.out.println("Error");
            }
    }}


}
