package Controllers;

import Models.Book;

public class BoookControler {
    
    public void sortByName(Book[] books){
        for (int i = 0; i < books.length -1; i++) {
            for (int j = 0; j < books.length- i -1; j++) {
                boolean cambio = false;

                if (books[j].getName().compareToIgnoreCase(books[j+1].getName())>0) {
                    Book temporal = books[j];
                    books[j] = books[j+1];
                    books[j+1] = temporal;
                    cambio = true;
                }
                if (!cambio) {
                    break;
                }
            }
        }
    }


    public Book searchByName(Book[] books, String name){

        int inicio = 0;
        int fin = books.length -1;

        while(inicio<=fin){
            int medio = (inicio + fin) / 2;

            String bookMedio = books[medio].getName();

            if (bookMedio.equalsIgnoreCase(name)) {
              return books[medio];
            }else if (bookMedio.compareTo(name)<0) {
                inicio = medio + 1;
            }else{
                fin = medio - 1;
            }

        }

        return null;
    }
}
