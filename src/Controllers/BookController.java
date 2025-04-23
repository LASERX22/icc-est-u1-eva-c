package Controllers;

import java.lang.reflect.Array;

import Models.Book;

public class BookController {
    public void sortByName(Book[] libros){
        Array.sort
        /*for(int i=1;i<libros.length;i++){
            Book aux=libros[i];
            int j=i-1;
            while(j>=0 && libros[j].getName().equals(aux.getName())){
                libros[j+1]=libros[i];
                j--;
            }
            libros[j+1]=aux;
        }*/

    }

    public Book searchByName(Book[] libros, String name){
        int bajo=0;
        int alto=libros.length-1;
        while(alto>=bajo){
            int central=(alto+bajo)/2;

            if(libros[central].getName().equals(name)){
                return libros[central];
            }

            if(libros[central].getName().equals(libros[central+1].getName())){
                bajo=central+1;
            }
            
            if(libros[central].getName().equals(libros[central-1].getName())){
                alto=central-1;
            }
        }
        return null;

    }
}
