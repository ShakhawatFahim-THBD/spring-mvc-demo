package net.therap.command;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
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

    @NotNull
    @Size(max = 1000)
    private String description;

    private Date startDate;
    private Date endDate;

    private double budget;

    private ProjectType projectType;

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

    public ProjectType getProjectType() {
        return projectType;
    }

    public void setProjectType(ProjectType projectType) {
        this.projectType = projectType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "</br> name='" + name + '\'' +
                "</br> description: '" + description + '\'' +
                "</br> startDate: " + startDate +
                "</br> endDate: " + endDate +
                "</br> budget: " + budget +
                "</br> projectType: " + projectType +
                "</br> manager: " + manager +
                "</br> assignees: " + assignees;
    }
}
