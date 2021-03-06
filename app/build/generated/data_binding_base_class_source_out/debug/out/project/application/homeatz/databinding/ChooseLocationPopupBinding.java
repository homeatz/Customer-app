// Generated by view binder compiler. Do not edit!
package project.application.homeatz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ChooseLocationPopupBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView tvEnableDeviceLocation;

  @NonNull
  public final TextView tvManualLocation;

  private ChooseLocationPopupBinding(@NonNull LinearLayout rootView,
      @NonNull TextView tvEnableDeviceLocation, @NonNull TextView tvManualLocation) {
    this.rootView = rootView;
    this.tvEnableDeviceLocation = tvEnableDeviceLocation;
    this.tvManualLocation = tvManualLocation;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ChooseLocationPopupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChooseLocationPopupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.choose_location_popup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChooseLocationPopupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvEnableDeviceLocation;
      TextView tvEnableDeviceLocation = ViewBindings.findChildViewById(rootView, id);
      if (tvEnableDeviceLocation == null) {
        break missingId;
      }

      id = R.id.tvManualLocation;
      TextView tvManualLocation = ViewBindings.findChildViewById(rootView, id);
      if (tvManualLocation == null) {
        break missingId;
      }

      return new ChooseLocationPopupBinding((LinearLayout) rootView, tvEnableDeviceLocation,
          tvManualLocation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
