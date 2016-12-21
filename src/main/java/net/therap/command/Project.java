package net.therap.command;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * @author safat
 * @since 12/23/16
 */
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    @NotNull
    @Size(max = 32)
    private String name;

    private Login manager;
    private List<Login> assignees;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Login> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<Login> assignees) {
        this.assignees = assignees;
    }

    public Login getManager() {
        return manager;
    }

    public void setManager(Login manager) {
        this.manager = manager;
    }
}
