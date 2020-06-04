package com.lijingrong.user;

public class UserServiceProxyImpl implements UserService {

    private final UserService userService;

    public UserServiceProxyImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String getUsername() {
        //可在此处检查权限
        return userService.getUsername();
    }
}
