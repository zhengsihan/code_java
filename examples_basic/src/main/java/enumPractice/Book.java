package enumPractice;

public enum Book {
    BOOK_TYPE1("XX从入门到精通", "机械出版社"),
    BOOK_TYPE2("XX原理", "O\'rely")
    ;

    private final String name;
    private final String publisher;

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    Book(String name, String publisher) {
        this.name = name;
        this.publisher = publisher;
    }

}
