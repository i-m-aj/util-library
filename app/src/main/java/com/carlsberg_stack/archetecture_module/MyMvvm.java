package com.carlsberg_stack.archetecture_module;

import android.app.Application;

import androidx.annotation.NonNull;

import com.carlsberg_stack.architecture_module_library.BaseViewModel;

public class MyMvvm extends BaseViewModel {

    public MyMvvm(@NonNull Application application) {
        super(application);
    }
}
