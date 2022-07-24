// Generated by view binder compiler. Do not edit!
package project.application.homeatz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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

public final class ActivityMapsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout bottomLayout;

  @NonNull
  public final TextView changeTxtV;

  @NonNull
  public final LinearLayout mapLayout;

  @NonNull
  public final TextView tvFullAddress;

  @NonNull
  public final TextView tvLocality;

  @NonNull
  public final TextView tvLocation;

  private ActivityMapsBinding(@NonNull RelativeLayout rootView, @NonNull LinearLayout bottomLayout,
      @NonNull TextView changeTxtV, @NonNull LinearLayout mapLayout,
      @NonNull TextView tvFullAddress, @NonNull TextView tvLocality, @NonNull TextView tvLocation) {
    this.rootView = rootView;
    this.bottomLayout = bottomLayout;
    this.changeTxtV = changeTxtV;
    this.mapLayout = mapLayout;
    this.tvFullAddress = tvFullAddress;
    this.tvLocality = tvLocality;
    this.tvLocation = tvLocation;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMapsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMapsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_maps, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMapsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom_layout;
      LinearLayout bottomLayout = ViewBindings.findChildViewById(rootView, id);
      if (bottomLayout == null) {
        break missingId;
      }

      id = R.id.change_txtV;
      TextView changeTxtV = ViewBindings.findChildViewById(rootView, id);
      if (changeTxtV == null) {
        break missingId;
      }

      id = R.id.map_layout;
      LinearLayout mapLayout = ViewBindings.findChildViewById(rootView, id);
      if (mapLayout == null) {
        break missingId;
      }

      id = R.id.tvFullAddress;
      TextView tvFullAddress = ViewBindings.findChildViewById(rootView, id);
      if (tvFullAddress == null) {
        break missingId;
      }

      id = R.id.tvLocality;
      TextView tvLocality = ViewBindings.findChildViewById(rootView, id);
      if (tvLocality == null) {
        break missingId;
      }

      id = R.id.tvLocation;
      TextView tvLocation = ViewBindings.findChildViewById(rootView, id);
      if (tvLocation == null) {
        break missingId;
      }

      return new ActivityMapsBinding((RelativeLayout) rootView, bottomLayout, changeTxtV, mapLayout,
          tvFullAddress, tvLocality, tvLocation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}