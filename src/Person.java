public class Person {

    private final String name;
    private final String surname;
    private int age = -1;
    private String city = null;

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    boolean hasAge() {
        return age >= 0;
    }

    boolean hasAddress() {
        return city != null;
    }

    void setAddress(String city) {
        this.city = city;
    }

    public void happyBirthday() {
        if (age >= 0) {
            age++;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return city;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(city);
    }

    @Override
    public String toString() {
        return "(" +
                name + ", " +
                surname + ", " +
                (hasAge() ? age : "возраст неизвестен") + ", " +
                (hasAddress() ? city : "город неизвестен") +
                ")";
    }
}
