package com.inspirotechs.demo.users;

import org.springframework.stereotype.Service;

import com.inspirotechs.demo.model.BaseResponse;

@Service
public class UserServicesImpl implements UserServices {
    @Override
    public void register(UsersRequest user) {
        // TODO Auto-generated method stub

    }

    @Override
    public BaseResponse<UsersResponse> signIn(UsersRequest user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BaseResponse<UsersResponse> updateUserInfo(UsersRequest user) {
        // TODO Auto-generated method stub
        return null;
    }

}
