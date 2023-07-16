package dasturlash.uz;

public class Assistant {
    private String name;
    private String surname;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Assistant{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

