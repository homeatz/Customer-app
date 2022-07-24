// Generated by view binder compiler. Do not edit!
package project.application.homeatz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import project.application.homeatz.R;

public final class ActivityVerificationBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText ed1;

  @NonNull
  public final EditText ed2;

  @NonNull
  public final EditText ed3;

  @NonNull
  public final EditText ed4;

  @NonNull
  public final EditText ed5;

  @NonNull
  public final EditText ed6;

  @NonNull
  public final TextView phoneNumberTv;

  @NonNull
  public final TextView tvOtp;

  private ActivityVerificationBinding(@NonNull LinearLayout rootView, @NonNull EditText ed1,
      @NonNull EditText ed2, @NonNull EditText ed3, @NonNull EditText ed4, @NonNull EditText ed5,
      @NonNull EditText ed6, @NonNull TextView phoneNumberTv, @NonNull TextView tvOtp) {
    this.rootView = rootView;
    this.ed1 = ed1;
    this.ed2 = ed2;
    this.ed3 = ed3;
    this.ed4 = ed4;
    this.ed5 = ed5;
    this.ed6 = ed6;
    this.phoneNumberTv = phoneNumberTv;
    this.tvOtp = tvOtp;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVerificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVerificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_verification, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVerificationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ed1;
      EditText ed1 = ViewBindings.findChildViewById(rootView, id);
      if (ed1 == null) {
        break missingId;
      }

      id = R.id.ed2;
      EditText ed2 = ViewBindings.findChildViewById(rootView, id);
      if (ed2 == null) {
        break missingId;
      }

      id = R.id.ed3;
      EditText ed3 = ViewBindings.findChildViewById(rootView, id);
      if (ed3 == null) {
        break missingId;
      }

      id = R.id.ed4;
      EditText ed4 = ViewBindings.findChildViewById(rootView, id);
      if (ed4 == null) {
        break missingId;
      }

      id = R.id.ed5;
      EditText ed5 = ViewBindings.findChildViewById(rootView, id);
      if (ed5 == null) {
        break missingId;
      }

      id = R.id.ed6;
      EditText ed6 = ViewBindings.findChildViewById(rootView, id);
      if (ed6 == null) {
        break missingId;
      }

      id = R.id.phoneNumber_tv;
      TextView phoneNumberTv = ViewBindings.findChildViewById(rootView, id);
      if (phoneNumberTv == null) {
        break missingId;
      }

      id = R.id.tv_otp;
      TextView tvOtp = ViewBindings.findChildViewById(rootView, id);
      if (tvOtp == null) {
        break missingId;
      }

      return new ActivityVerificationBinding((LinearLayout) rootView, ed1, ed2, ed3, ed4, ed5, ed6,
          phoneNumberTv, tvOtp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
