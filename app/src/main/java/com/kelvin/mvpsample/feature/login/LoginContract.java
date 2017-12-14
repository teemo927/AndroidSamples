package com.kelvin.mvpsample.feature.login;

import com.kelvin.mvpsample.BasePresenter;
import com.kelvin.mvpsample.BaseView;

/**
 * Authority: Asus
 * Date: 2017-12-14  16:58
 */

public interface LoginContract {
    interface View extends BaseView {
        void showLoginWaiting();

        void dismissLoginWaiting();

        void showLoginSuccessMsg();

        void showLoginFailMsg();
    }

    interface Presenter extends BasePresenter {
        void login(String account, String password);
    }
}
