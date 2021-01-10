package week09d03;


import java.util.List;

public class SantaClaus {
    List<Person> person;

    public SantaClaus(List<Person> persons) {
        this.person = persons;
    }

    public void getThroughChimneys() {
        for (Person p : person) {
            p.setPresent();
        }
    }

    public List<Person> getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "SantaClaus{" +
                "person=" + person +
                '}';
    }
}

