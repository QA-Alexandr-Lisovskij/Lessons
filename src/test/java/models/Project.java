package models;

public class Project {
    private String projectName;
    private String projectAnnouncement;
    private String projectType;
    private boolean showAnnouncement;


    public Project() {
    }

    public String getProjectName() {
        return projectName;
    }

    public Project setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getProjectAnnouncement() {
        return projectAnnouncement;
    }

    public Project setProjectAnnouncement(String projectAnnouncement) {
        this.projectAnnouncement = projectAnnouncement;
        return this;
    }

    public String getProjectType() {
        return projectType;
    }

    public Project setProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }

    public boolean isShowAnnouncement() {
        return showAnnouncement;
    }

    public Project setShowAnnouncement(boolean showAnnouncement) {
        this.showAnnouncement = showAnnouncement;
        return this;
    }

}
