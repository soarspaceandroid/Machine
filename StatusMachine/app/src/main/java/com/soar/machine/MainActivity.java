package com.soar.machine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    public final static int STATE_NONE = 0;
    public final static int STATE_PLAY = 1;
    public final static int STATE_SETTING = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BaseStatesMachine machine = new BaseStatesMachine("tag");

        List<BaseStatesMachine.BaseState> list = new ArrayList<>();
        list.add(machine.new BaseState(STATE_NONE));
        list.add(machine.new BaseState(STATE_PLAY));
        list.add(machine.new BaseState(STATE_SETTING));
        machine.setStatesData(list);
        machine.setUIUpdateInter(new UIUpdateInter() {
            @Override
            public void updateUIByStatus(int state) {
                switch (state){
                    case STATE_PLAY:

                        break;
                    case STATE_SETTING:

                        break;
                    case STATE_NONE:
                        break;
                }

            }
        });
        machine.start();
        machine.changeToState(STATE_NONE);



    }
}
