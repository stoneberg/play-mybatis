package kr.co.cesco.econtract.web.users.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String password;
    private String fullname;
    private String deptname;
    private String position;
    private String email;
    private String userType;
}
