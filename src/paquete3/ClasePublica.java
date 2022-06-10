package paquete3;

public class ClasePublica {
    //aunque no es habitual podría haber métodos privados
    private void showMessage(String message){
        System.out.println( "message");
    }
    // al ser privado solo podria usarse dentro de la clase
   public void setMessage(String message) {
       showMessage(message);
   }
}

 //public class OtraClase {
// error en la clase porque en un archivo solo puede haber una clase pública
//}

class OtraClase {
// si intentamos utilizar un método privado fuera de la clase dará error
ClasePublica variable1 = new ClasePublica();
//variable1.showMessage("Hola Mundo!); error
}

//Las clases no pueden ser privadas
// private class OtraClasePrivada {
    //error
//}
