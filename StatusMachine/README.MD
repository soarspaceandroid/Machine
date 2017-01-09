allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}



dependencies {
	        compile 'com.github.soarspaceandroid:Machine:1.0'
	}



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