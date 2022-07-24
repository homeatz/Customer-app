// Generated by view binder compiler. Do not edit!
package project.application.homeatz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.synnapps.carouselview.CarouselView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import project.application.homeatz.R;

public final class ActivityWelcomeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout bottomLayout;

  @NonNull
  public final CarouselView carouselView;

  @NonNull
  public final TextView loginTv;

  @NonNull
  public final Button tvLocation;

  private ActivityWelcomeBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout bottomLayout,
      @NonNull CarouselView carouselView, @NonNull TextView loginTv, @NonNull Button tvLocation) {
    this.rootView = rootView;
    this.bottomLayout = bottomLayout;
    this.carouselView = carouselView;
    this.loginTv = loginTv;
    this.tvLocation = tvLocation;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWelcomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_welcome, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWelcomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom_layout;
      LinearLayout bottomLayout = ViewBindings.findChildViewById(rootView, id);
      if (bottomLayout == null) {
        break missingId;
      }

      id = R.id.carouselView;
      CarouselView carouselView = ViewBindings.findChildViewById(rootView, id);
      if (carouselView == null) {
        break missingId;
      }

      id = R.id.login_tv;
      TextView loginTv = ViewBindings.findChildViewById(rootView, id);
      if (loginTv == null) {
        break missingId;
      }

      id = R.id.tvLocation;
      Button tvLocation = ViewBindings.findChildViewById(rootView, id);
      if (tvLocation == null) {
        break missingId;
      }

      return new ActivityWelcomeBinding((LinearLayout) rootView, bottomLayout, carouselView,
          loginTv, tvLocation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}