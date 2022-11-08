package liga.medical.personservice.core.dto;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class LogAuthDto {
    private long id;
    private String login;
    private Date date;
    private Time time;


    @Override
    public String toString() {
        return  "id = " + id
                + "; login = " + login
                + "; date = " + date
                + "; time =" + time + ";";
    }
}
