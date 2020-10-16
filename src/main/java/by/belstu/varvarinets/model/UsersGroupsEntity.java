package by.belstu.varvarinets.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users_groups", schema = "datastud")
public class UsersGroupsEntity {
    private UsersEntity usersByIdUser;
    private GroupsEntity groupsByIdGroup;
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "login", nullable = false)
    public UsersEntity getUsersByIdUser() {
        return usersByIdUser;
    }

    public void setUsersByIdUser(UsersEntity usersByIdUser) {
        this.usersByIdUser = usersByIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "id_group", referencedColumnName = "id", nullable = false)
    public GroupsEntity getGroupsByIdGroup() {
        return groupsByIdGroup;
    }

    public void setGroupsByIdGroup(GroupsEntity groupsByIdGroup) {
        this.groupsByIdGroup = groupsByIdGroup;
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
        UsersGroupsEntity that = (UsersGroupsEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
