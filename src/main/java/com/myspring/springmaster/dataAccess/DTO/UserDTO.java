package com.myspring.springmaster.dataAccess.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String userId;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;
    private Integer roleId;
}
