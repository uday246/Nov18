package Nov1;

class Book {

private String title;

private String author;

private String publisher;

private String copyrightDate;

public Book() {

}

public Book(String aTitle, String aAuthor, String aPublisher, String aCopyrightDate) {

super();

title = aTitle;

author = aAuthor;

publisher = aPublisher;

copyrightDate = aCopyrightDate;

}

public String getTitle() {

return title;

}

public void setTitle(String aTitle) {

title = aTitle;

}

public String getAuthor() {

return author;

}

public void setAuthor(String aAuthor) {

author = aAuthor;

}

public String getPublisher() {

return publisher;

}

public void setPublisher(String aPublisher) {

publisher = aPublisher;

}

public String getCopyrightDate() {

return copyrightDate;

}

public void setCopyrightDate(String aCopyrightDate) {

copyrightDate = aCopyrightDate;

}

public String toString() {

String str = "Title : " + title + "\n";

str = str + "Author: " + author + "\n";

str = str + "Publisher: " + publisher + "\n";

str = str + "Copyright Date: " + copyrightDate + "\n";

return str;

}

}

public class Bookshelf {

public static void main(String[] args) {

Book b1=new Book("Love of Life", "Koti", "RGV", "11/13/2018");

System.out.println(b1);

}

}
