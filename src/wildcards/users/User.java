package wildcards.users;

import java.util.UUID;

public class User {

    protected UUID uuid;

    protected String name;

    public User() {
        setUuid();
    }

    public User(String name) {
        setUuid();
        setName(name);
    }

    public UUID getUuid() {
        return uuid;
    }

    private void setUuid() {
        this.uuid = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("uuid=").append(uuid);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
