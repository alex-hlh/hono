package com.hu.hono.server.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author hlh
 * @version v1.0
 * @title User
 * @projectName hono
 * @description
 * @date 2023/2/21 10:30
 */
@Document(collection = "tab_user")
@Data
@AllArgsConstructor
@ToString
public class User {
    @Id
    private Long id;
    private String username;
    private String password;
    private int age;
}
