public class Book {

    private String author;
    private String title;
    private String genre;
    private int pages;


    public Book(String author, String title, String genre, int pages) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }// end Book ctor

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public int getPages(){
        return pages;
    }

    public void printBookDetails(){
        System.out.println("The author is " + author + " and the book is called " + title + ". The genre is " + genre + " and there are " + pages + " pages.");
    }

}// end Book
