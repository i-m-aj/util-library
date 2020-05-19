package com.carlsberg_stack.architecture_module_library.pattern.mvvm;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.carlsberg_stack.architecture_module_library.base.base.CarlsViewModel;
import com.carlsberg_stack.architecture_module_library.base.fragment.CarlsFragmentActivity;
import com.carlsberg_stack.architecture_module_library.base.fragment.CarlsFragmentBroadcastActivity;


public abstract class CarlsMvvmFragmentBroadcastActivity<T extends CarlsViewModel> extends CarlsFragmentBroadcastActivity {

    protected T mvvm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.mvvm = createViewModel();
        super.onCreate(savedInstanceState);
    }

    private T createViewModel() {
        return ViewModelProviders.of(this).get(createViewModelClass());
    }

    protected abstract Class<T> createViewModelClass();


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}