package com.nethmal.SpringSecurityJWT.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.nethmal.SpringSecurityJWT.entity.Product;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReqRes {

    private int statusCode;
    private String errorMessage;
    private String message;
    private String accessToken;
    private String refreshToken;
    private String expirationTime;

    private String fullName;
    private String email;
    private String role;
    private String password;

    private List<Product> productList;
    private String userReference;

}
