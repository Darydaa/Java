package by.belstu.varvarinets.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users_subjects", schema = "datastud")
public class UsersSubjectsEntity {
    private UsersEntity usersByIdUser;
    private SubjectsEntity subjectsByIdSubject;
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "login")
    public UsersEntity getUsersByIdUser() {
        return usersByIdUser;
    }

    public void setUsersByIdUser(UsersEntity usersByIdUser) {
        this.usersByIdUser = usersByIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "id_subject", referencedColumnName = "id", nullable = false)
    public SubjectsEntity getSubjectsByIdSubject() {
        return subjectsByIdSubject;
    }

    public void setSubjectsByIdSubject(SubjectsEntity subjectsByIdSubject) {
        this.subjectsByIdSubject = subjectsByIdSubject;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersSubjectsEntity that = (UsersSubjectsEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
