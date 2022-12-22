/*2) create a class called Book which can hold publisher name,author name, book name and isbc number of the book
and use getter and setter method and create another class McGrawhill and inherit the book class and another class
Packt and inherit the class and another MainBook class to initialize the variable and display the information*/


import java.io.*;
class Book
{
    String publisher;
    String author;
    String bookName;
    int isbcNumber;
	
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }
    public void setIsbcNumber(int isbcNumber)
    {
        this.isbcNumber = isbcNumber;
    }
    public String getPublisher()
    {
        return publisher;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getBookName()
    {
        return bookName;
    }
    public int getIsbcNumber()
    {
        return isbcNumber;
    }
}

public class MainBook
{
    public static void main(String[] args)
    {
        Packt obj = new Packt();
        obj.setBookName("Java Full Stack Development with Angular");
        obj.setAuthor("Arun Kumar");
        obj.setIsbcNumber(3679);
        obj.setPublisher("Anudip");
        System.out.println("Book Name  : "+obj.getBookName());
        System.out.println("Author     : "+obj.getAuthor());
        System.out.println("ISBC Number: "+obj.getIsbcNumber());
        System.out.println("Publisher  : "+obj.getPublisher());
    }
}