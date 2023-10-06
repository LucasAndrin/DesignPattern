package wildcards.users;

public class Student extends User {

    private int enrollment;

    public Student() {
        super();
    }

    public Student(String name, int enrollment) {
        super(name);
        setEnrollment(enrollment);
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("uuid=").append(uuid);
        sb.append(", name='").append(name).append('\'');
        sb.append(", enrollment=").append(enrollment);
        sb.append('}');
        return sb.toString();
    }
}
