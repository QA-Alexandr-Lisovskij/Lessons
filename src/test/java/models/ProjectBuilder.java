package models;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ProjectBuilder {
    private String name;
    private String projectAnnouncement;
    private String projectType;
    private boolean showAnnouncement;
    private boolean isCompleted;


}
