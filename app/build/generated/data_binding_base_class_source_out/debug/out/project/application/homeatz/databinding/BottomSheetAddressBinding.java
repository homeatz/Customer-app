// Generated by view binder compiler. Do not edit!
package project.application.homeatz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import project.application.homeatz.R;

public final class BottomSheetAddressBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final LinearLayout chooseAddressLl;

  @NonNull
  public final Button proceedBtn;

  @NonNull
  public final RecyclerView recyclerView;

  private BottomSheetAddressBinding(@NonNull CardView rootView,
      @NonNull LinearLayout chooseAddressLl, @NonNull Button proceedBtn,
      @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.chooseAddressLl = chooseAddressLl;
    this.proceedBtn = proceedBtn;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static BottomSheetAddressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottomSheetAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bottom_sheet_address, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottomSheetAddressBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chooseAddress_ll;
      LinearLayout chooseAddressLl = ViewBindings.findChildViewById(rootView, id);
      if (chooseAddressLl == null) {
        break missingId;
      }

      id = R.id.proceed_btn;
      Button proceedBtn = ViewBindings.findChildViewById(rootView, id);
      if (proceedBtn == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      return new BottomSheetAddressBinding((CardView) rootView, chooseAddressLl, proceedBtn,
          recyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
