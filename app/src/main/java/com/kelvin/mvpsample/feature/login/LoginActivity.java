package com.kelvin.mvpsample.feature.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.kelvin.mvpsample.BasePresenter;
import com.kelvin.mvpsample.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends Activity implements LoginContract.View{

    private LoginContract.Presenter mPresenter;

    @BindView(R.id.et_account)
    private EditText mEtAccount;
    @BindView(R.id.progress_bar)
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        init();
    }

    private void init() {
        mEtAccount.setText("wodddddd");
    }

    @Override
    public void showLoginWaiting() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismissLoginWaiting() {
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void showLoginSuccessMsg() {
        Toast.makeText(this,"Login Success",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoginFailMsg() {
        Toast.makeText(this,"Login Fail",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(BasePresenter presenter) {

    }
}



















