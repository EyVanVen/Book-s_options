package book_recourses;

public class Book {
    public void output(String book_name, String author_name, String content_of_book){
        System.out.println(book_name);
        System.out.println(author_name);
        System.out.println(content_of_book);
    }
    public Book (String book_name, String author_name, String content_of_book){

    }

    public static void main(String[] args) {
        Title name = new Title();
        Author creator = new Author();
        Content story = new Content();

        name.show(name.getBook_name());
        creator.show(creator.getAuthor_name());
        story.show(story.getPlot());

        System.out.println("");
        System.out.println("============================");
        System.out.println("");

        name.setBook_name("Dora the explorer");
        creator.setAuthor_name("Vlad Belik");
        story.setPlot("Dora's bizarre adventure plot");

        name.show(name.getBook_name());
        creator.show(creator.getAuthor_name());
        story.show(story.getPlot());

        System.out.println("");
        System.out.println("============================");
        System.out.println("");

        Book book = new Book("Great Man", "Dio Brando", "The story about Great Man");

        book.output("Great Man", "Dio Brando", "The story about Great Man");
    }
}

class Title{
    public String book_name = "Someone's Bizarre Adventure";

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void show (String book_name){
        System.out.println(book_name);
    }
}

class Author{
    public String author_name = "Grigory Chaos";
    public void show (String author_name){
        System.out.println("By " + author_name);
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }
}

class Content{
    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String plot = "A plot of Someone's Bizarre Adventure written by Grigory Chaos";
    public void show (String plot){
        System.out.println(plot);
    }
}
