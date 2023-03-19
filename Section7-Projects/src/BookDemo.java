public class BookDemo {
    public static void main(String[] args) {

        Book gameOfThrones = new Book("George Martin", "Game of Thrones", "Fantasy", 864);
        Book mathBook = new Book("James Stewart", "Calculus", "Math", 1392);
        Book javaBook = new Book("Joel Murach", "Murach's Java Programming", "Programming", 800);

        gameOfThrones.printBookDetails();
        mathBook.printBookDetails();
        javaBook.printBookDetails();
    }// end main

//    private static void printBookDetails(Book book){
//        System.out.println("The author is " + book.getAuthor() + " and the book is called " + book.getTitle() + ". The genre is " + book.getGenre() + " and there are " + book.getPages() + " pages.");
//    }
}// end BookDemo
