package com.myapplicationdev.android.tw_listview;

public class Module {
    private String module;
    private boolean type;

    public Module(String module, boolean type) {
        this.module = module;
        this.type = type;
    }

    public String getModule() {
        return module;
    }

    public boolean isType() {
        return type;
    }
}
