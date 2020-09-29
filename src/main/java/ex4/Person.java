package ex4;

public class Person {
    private final Label _name;
    private final Label _mail;

    public Person(Label _name, Label _mail) {
        this._name = _name;
        this._mail = _mail;
    }

    public Person(Label name) {
        this(name, Label.newNull());
    }

    public void display() {
        _name.display();
        _mail.display();
    }

    public String toString() {
        return "[ Person : name=" + _name + " mail=" + _mail + " ]";
    }

}
