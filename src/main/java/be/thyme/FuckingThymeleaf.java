package be.thyme;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FuckingThymeleaf implements Serializable {
    private List<FuckingThymeleafChild> kids = new ArrayList<>();
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public List<FuckingThymeleafChild> getKids() {
        return kids;
    }

    public void setKids(final List<FuckingThymeleafChild> kids) {
        this.kids = kids;
    }
}
