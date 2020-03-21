package com.rafcoding.simple_mvp.presenter;

public interface LoginView
{
    void setUsernameError();
    void setPasswordError();
    void showProgressbar();
    void hideProgressbar();
    void onLoginSuccess(String username);
    void onLoginError();
}
