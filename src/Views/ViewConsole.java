package Views;

import Models.Book;

public class ViewConsole {
    
    public void printArreglo(Book[] libros){
        for(int i=0; i<libros.length; i++){    
            System.out.println(libros[i]);
        }
    }

    public void printMensaje(String mensaje){
        System.out.println("=== "+mensaje+" ===");
    }
}
