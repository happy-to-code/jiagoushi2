package com.yida.jwt_test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author admin
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;

    
    private String username;

    private String password;

}
