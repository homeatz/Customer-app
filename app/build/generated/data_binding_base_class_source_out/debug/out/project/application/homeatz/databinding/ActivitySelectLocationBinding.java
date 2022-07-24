// Generated by view binder compiler. Do not edit!
package project.application.homeatz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import project.application.homeatz.R;

public final class ActivitySelectLocationBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView ivLoading;

  @NonNull
  public final TextView tvFindLocationg;

  @NonNull
  public final TextView tvPleaseWait;

  private ActivitySelectLocationBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView ivLoading, @NonNull TextView tvFindLocationg,
      @NonNull TextView tvPleaseWait) {
    this.rootView = rootView;
    this.ivLoading = ivLoading;
    this.tvFindLocationg = tvFindLocationg;
    this.tvPleaseWait = tvPleaseWait;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySelectLocationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySelectLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_select_location, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySelectLocationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivLoading;
      ImageView ivLoading = ViewBindings.findChildViewById(rootView, id);
      if (ivLoading == null) {
        break missingId;
      }

      id = R.id.tvFindLocationg;
      TextView tvFindLocationg = ViewBindings.findChildViewById(rootView, id);
      if (tvFindLocationg == null) {
        break missingId;
      }

      id = R.id.tvPleaseWait;
      TextView tvPleaseWait = ViewBindings.findChildViewById(rootView, id);
      if (tvPleaseWait == null) {
        break missingId;
      }

      return new ActivitySelectLocationBinding((RelativeLayout) rootView, ivLoading,
          tvFindLocationg, tvPleaseWait);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
