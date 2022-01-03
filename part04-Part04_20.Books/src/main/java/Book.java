public class Book {
    private String title;
    private int pages;
    private int pubYear;

    public Book(String title, int pages, int pubYear){
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }

    public int getPages(){
        return this.pages;
    }

    public String getTitle(){
        return this.title;
    }

    public int getPubYear(){
        return this.pubYear;
    }

    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.pubYear;
    }
}
