// Generated by view binder compiler. Do not edit!
package com.HyperSync.hypersync.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.HyperSync.hypersync.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPollDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button Discard;

  @NonNull
  public final TextInputEditText option1;

  @NonNull
  public final TextInputEditText option2;

  @NonNull
  public final TextInputEditText option3;

  @NonNull
  public final TextInputEditText option4;

  @NonNull
  public final TextInputEditText poll;

  @NonNull
  public final Button post;

  private FragmentPollDialogBinding(@NonNull LinearLayout rootView, @NonNull Button Discard,
      @NonNull TextInputEditText option1, @NonNull TextInputEditText option2,
      @NonNull TextInputEditText option3, @NonNull TextInputEditText option4,
      @NonNull TextInputEditText poll, @NonNull Button post) {
    this.rootView = rootView;
    this.Discard = Discard;
    this.option1 = option1;
    this.option2 = option2;
    this.option3 = option3;
    this.option4 = option4;
    this.poll = poll;
    this.post = post;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPollDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPollDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_poll_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPollDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Discard;
      Button Discard = ViewBindings.findChildViewById(rootView, id);
      if (Discard == null) {
        break missingId;
      }

      id = R.id.option1;
      TextInputEditText option1 = ViewBindings.findChildViewById(rootView, id);
      if (option1 == null) {
        break missingId;
      }

      id = R.id.option2;
      TextInputEditText option2 = ViewBindings.findChildViewById(rootView, id);
      if (option2 == null) {
        break missingId;
      }

      id = R.id.option3;
      TextInputEditText option3 = ViewBindings.findChildViewById(rootView, id);
      if (option3 == null) {
        break missingId;
      }

      id = R.id.option4;
      TextInputEditText option4 = ViewBindings.findChildViewById(rootView, id);
      if (option4 == null) {
        break missingId;
      }

      id = R.id.poll;
      TextInputEditText poll = ViewBindings.findChildViewById(rootView, id);
      if (poll == null) {
        break missingId;
      }

      id = R.id.post;
      Button post = ViewBindings.findChildViewById(rootView, id);
      if (post == null) {
        break missingId;
      }

      return new FragmentPollDialogBinding((LinearLayout) rootView, Discard, option1, option2,
          option3, option4, poll, post);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
