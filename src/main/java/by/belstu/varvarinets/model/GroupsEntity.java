package by.belstu.varvarinets.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "groups", schema = "datastud", catalog = "")
public class GroupsEntity {
    private int id;
    private byte number;
    private byte course;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "number")
    public byte getNumber() {
        return number;
    }

    public void setNumber(byte number) {
        this.number = number;
    }

    @Basic
    @Column(name = "course")
    public byte getCourse() {
        return course;
    }

    public void setCourse(byte course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupsEntity that = (GroupsEntity) o;
        return id == that.id &&
                number == that.number &&
                course == that.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, course);
    }
}
