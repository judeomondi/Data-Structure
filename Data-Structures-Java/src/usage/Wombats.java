package usage;

public class Wombats implements Comparable<Wombats>{
    private int age;

    private int length;

    private String name;


    public Wombats(int age, int length, String name) {
        this.age = age;
        this.length = length;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wombats{" +
                "age=" + age +
                ", length=" + length +
                ", name=" + name +
                '}';
    }

    @Override
    public int compareTo(Wombats wombat) {
        int ageComparison = Integer.compare(wombat.age, this.age);
        if (ageComparison == 0) {
            return Integer.compare(wombat.length, this.length);
        }
        return ageComparison;
    }
}
