// Generated by view binder compiler. Do not edit!
package com.example.android.camerax.video.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.example.android.camerax.video.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivityMainXvideoBinding implements ViewBinding {
  @NonNull
  private final FragmentContainerView rootView;

  @NonNull
  public final FragmentContainerView fragmentContainer;

  private ActivityMainXvideoBinding(@NonNull FragmentContainerView rootView,
      @NonNull FragmentContainerView fragmentContainer) {
    this.rootView = rootView;
    this.fragmentContainer = fragmentContainer;
  }

  @Override
  @NonNull
  public FragmentContainerView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainXvideoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainXvideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main_xvideo, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainXvideoBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    FragmentContainerView fragmentContainer = (FragmentContainerView) rootView;

    return new ActivityMainXvideoBinding((FragmentContainerView) rootView, fragmentContainer);
  }
}
