package by.belstu.varvarinets.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "marks", schema = "datastud", catalog = "")
public class MarksEntity {
    private int id;
    private byte value;
    private String comment;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "value")
    public byte getValue() {
        return value;
    }

    public void setValue(byte value) {
        this.value = value;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarksEntity that = (MarksEntity) o;
        return id == that.id &&
                value == that.value &&
                Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, comment);
    }
}
