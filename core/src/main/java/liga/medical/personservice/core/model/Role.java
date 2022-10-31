package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Role {

    @Id
    private long id;

    private String name;

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
