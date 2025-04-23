package Views;

import Models.Book;

public class ViewConsole {
    
    private Book book;

    public void mostrarArreglo(Book[] books){
        for (Book libro : books) {
            System.out.println(libro);
        }
    }

    public void showMessage(String menssage){
        System.out.println(menssage);
    }
    public Book showBook(Book book){
        System.out.println(book);
        return book;
    }


}
