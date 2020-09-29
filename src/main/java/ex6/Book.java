package ex6;

public class Book {
    private String _title;
    private String _isbn;
    private String _price;
    private Author _author;

    public Book(String _title,
                String _isbn,
                String _price,
                String _authorName,
                String _authorMail) {
        this._title = _title;
        this._isbn = _isbn;
        this._price = _price;
        this._author = new Author(_authorName, _authorMail);
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public String getIsbn() {
        return _isbn;
    }

    public void setIsbn(String _isbn) {
        this._isbn = _isbn;
    }

    public String getPrice() {
        return _price;
    }

    public void setPrice(String _price) {
        this._price = _price;
    }

    public String getAuthorName() {
        return _author.getName();
    }

    public void setAuthorName(String _authorName) {
        this._author.setName(_authorName);
    }

    public String getAuthorMail() {
        return _author.getMail();
    }

    public void setAuthorMail(String _authorMail) {
        this._author.setName(_authorMail);
    }

    public String toXml() {
        String author = tag("author", tag("name", _author.getName()) + tag("mail", _author.getMail()));
        String book = tag("book", tag("title", _title) + tag("isbn", _isbn) + tag("price", _price) + author);
        return book;
    }

    private String tag(String element, String content) {
        return "<" + element + ">" + content + "</" + element + ">";
    }
}
