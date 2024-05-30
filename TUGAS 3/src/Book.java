class Book {
    private String id;
    private String title;
    private String author;
    private String category;
    private int stock;
    private int duration;
    //Constructor 
    public Book(String id, String title, String author, String category, int stock,int duration) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.stock = stock;
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }
    public int getDuration() {
        return duration;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}