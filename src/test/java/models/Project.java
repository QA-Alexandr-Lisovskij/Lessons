package models;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;
import java.util.Random;

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

    public Project getRandomProject() {
        Random random = new Random();
        var list = Arrays.asList("suite_mode_single_baseline", "suite_mode_single", "suite_mode_multi");
        var randomElement = list.get(random.nextInt(list.size()));
        return new Project()
                .setProjectName(RandomStringUtils.randomAlphanumeric(5))
                .setProjectAnnouncement(RandomStringUtils.randomAlphanumeric(5))
                .setProjectType(randomElement)
                .setShowAnnouncement(random.nextBoolean());
    }

}
