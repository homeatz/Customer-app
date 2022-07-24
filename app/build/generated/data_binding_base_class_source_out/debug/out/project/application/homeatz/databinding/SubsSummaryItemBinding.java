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

public final class SubsSummaryItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView subsDateTv;

  @NonNull
  public final TextView subsItemTv;

  private SubsSummaryItemBinding(@NonNull LinearLayout rootView, @NonNull TextView subsDateTv,
      @NonNull TextView subsItemTv) {
    this.rootView = rootView;
    this.subsDateTv = subsDateTv;
    this.subsItemTv = subsItemTv;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SubsSummaryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SubsSummaryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.subs_summary_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SubsSummaryItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.subsDateTv;
      TextView subsDateTv = ViewBindings.findChildViewById(rootView, id);
      if (subsDateTv == null) {
        break missingId;
      }

      id = R.id.subsItemTv;
      TextView subsItemTv = ViewBindings.findChildViewById(rootView, id);
      if (subsItemTv == null) {
        break missingId;
      }

      return new SubsSummaryItemBinding((LinearLayout) rootView, subsDateTv, subsItemTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
