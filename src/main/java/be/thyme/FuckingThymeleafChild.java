package be.thyme;

import java.io.Serializable;

public class FuckingThymeleafChild implements Serializable {
    private String naam;
    private String age;

    public String getNaam() {
        return naam;
    }

    public void setNaam(final String naam) {
        this.naam = naam;
    }

    public String getAge() {
        return age;
    }

    public void setAge(final String age) {
        this.age = age;
    }
}
