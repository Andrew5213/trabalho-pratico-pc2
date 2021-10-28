package program_users.endities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
    private String username;
    private Date moment;

    public LogEntry(String username, Date moment) {
        this.username = username;
        this.moment = moment;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogEntry)) return false;
        LogEntry logEntry = (LogEntry) o;
        return username.equals(logEntry.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
