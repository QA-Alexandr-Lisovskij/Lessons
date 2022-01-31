package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CaseBuilder {
    private String date;
    private String description;
    private String title;
    private int parent_id;
    private boolean checkbox;
}
