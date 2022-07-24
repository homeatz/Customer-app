// Generated by view binder compiler. Do not edit!
package project.application.homeatz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import project.application.homeatz.R;

public final class RegionItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView itemLayout;

  @NonNull
  public final ImageView regionIv;

  @NonNull
  public final TextView regionTv;

  private RegionItemBinding(@NonNull CardView rootView, @NonNull CardView itemLayout,
      @NonNull ImageView regionIv, @NonNull TextView regionTv) {
    this.rootView = rootView;
    this.itemLayout = itemLayout;
    this.regionIv = regionIv;
    this.regionTv = regionTv;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static RegionItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RegionItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.region_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RegionItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView itemLayout = (CardView) rootView;

      id = R.id.regionIv;
      ImageView regionIv = ViewBindings.findChildViewById(rootView, id);
      if (regionIv == null) {
        break missingId;
      }

      id = R.id.regionTv;
      TextView regionTv = ViewBindings.findChildViewById(rootView, id);
      if (regionTv == null) {
        break missingId;
      }

      return new RegionItemBinding((CardView) rootView, itemLayout, regionIv, regionTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}