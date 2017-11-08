package com.example.woodson.mvptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.woodson.mvptest.View.IUserView;

public class MainActivity extends AppCompatActivity implements IUserView, View.OnClickListener {
private EditText pass,userName,id;
    private Button save,load;
    private  UserPresenter userPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save = (Button) findViewById(R.id.save);
        load = (Button) findViewById(R.id.load);
        pass = (EditText) findViewById(R.id.pass);
        userName = (EditText) findViewById(R.id.username);
        id = (EditText) findViewById(R.id.id);
        save.setOnClickListener(this);
        load.setOnClickListener(this);
       userPresenter = new UserPresenter(this);
    }

    @Override
    public String getUserName() {
        return userName.getText().toString();
    }

    @Override
    public String getPassword() {
        return pass.getText().toString();
    }

    @Override
    public Void setUsername(String username) {
        userName.setText(username);
        return null;
    }

    @Override
    public Void setPssword(String password) {
        pass.setText(password);
        return null;
    }

    @Override
    public int getId() {
        return Integer.parseInt(id.getText().toString());
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.save:
                userPresenter.saveUser(getId(),getUserName(),getPassword());
                break;
            case R.id.load:
                userPresenter.loadUser(getId());
                break;
        }

    }
}
