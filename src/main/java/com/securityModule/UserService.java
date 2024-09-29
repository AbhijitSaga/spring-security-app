package com.securityModule;

public interface UserService {
    String login(LoginDto loginDto);
    User getUser();

    User signup(User registerUser);
}
