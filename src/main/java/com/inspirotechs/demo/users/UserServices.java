package com.inspirotechs.demo.users;

import com.inspirotechs.demo.model.BaseResponse;

public interface UserServices {

    public void register(UsersRequest user);

    public BaseResponse<UsersResponse> signIn(UsersRequest user);

    public BaseResponse<UsersResponse> updateUserInfo(UsersRequest user);
}
