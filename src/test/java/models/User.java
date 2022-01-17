package models;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString(exclude = "email")
public class User {
    private String email;
    private String password;
}
