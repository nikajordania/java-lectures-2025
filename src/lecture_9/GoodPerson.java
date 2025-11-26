package lecture_9;

import java.util.Objects;

class GoodPerson {
    private final String name;
    private final int age;

    public GoodPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GoodPerson)) return false;
        GoodPerson that = (GoodPerson) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
