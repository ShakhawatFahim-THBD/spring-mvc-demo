package net.therap.command;

/**
 * @author safat
 * @since 4/1/17
 */
public enum ProjectType {

    DEMO("Demo Project"),
    PRODUCTION("Production Project");

    private String displayName;

    ProjectType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
