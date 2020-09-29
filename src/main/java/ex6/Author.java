package ex6;

class Author {
    private String _name;
    private String _mail;

    public Author(String _name, String _mail) {
        this._name = _name;
        this._mail = _mail;
    }

    public String getName() {
        return _name;
    }

    public String getMail() {
        return _mail;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setMail(String _mail) {
        this._mail = _mail;
    }
}
