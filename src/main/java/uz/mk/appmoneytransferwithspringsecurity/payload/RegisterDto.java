package uz.mk.appmoneytransferwithspringsecurity.payload;

import lombok.Data;

@Data
public class RegisterDto {
    private String firstname;
    private String lastname;
    private String username;
    private String password;
}
