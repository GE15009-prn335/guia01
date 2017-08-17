package sv.edu.uesocc.ingenieria.prn335_2017;
public class Utilities {
    /**
     * 
     * @param texto
     * @return 
     */
    public String getResume(String texto){
        String salida="";
        char cadena;
        texto="Cadena de texto que contiene la introducción de un determinado post.";
        for (int contador=0; contador<31; contador++){
            cadena=texto.charAt(contador);
            salida=salida+cadena;
        }
        return "";
    }
}