// Generated by view binder compiler. Do not edit!
package project.application.homeatz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public final class BestSellerItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView bestSellerIv;

  @NonNull
  public final CardView bestSellerLayout;

  @NonNull
  public final TextView sellerAddressTv;

  @NonNull
  public final ImageView sellerIv;

  @NonNull
  public final TextView storeNameTv;

  private BestSellerItemBinding(@NonNull LinearLayout rootView, @NonNull ImageView bestSellerIv,
      @NonNull CardView bestSellerLayout, @NonNull TextView sellerAddressTv,
      @NonNull ImageView sellerIv, @NonNull TextView storeNameTv) {
    this.rootView = rootView;
    this.bestSellerIv = bestSellerIv;
    this.bestSellerLayout = bestSellerLayout;
    this.sellerAddressTv = sellerAddressTv;
    this.sellerIv = sellerIv;
    this.storeNameTv = storeNameTv;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BestSellerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BestSellerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.best_seller_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BestSellerItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bestSellerIv;
      ImageView bestSellerIv = ViewBindings.findChildViewById(rootView, id);
      if (bestSellerIv == null) {
        break missingId;
      }

      id = R.id.bestSellerLayout;
      CardView bestSellerLayout = ViewBindings.findChildViewById(rootView, id);
      if (bestSellerLayout == null) {
        break missingId;
      }

      id = R.id.sellerAddressTv;
      TextView sellerAddressTv = ViewBindings.findChildViewById(rootView, id);
      if (sellerAddressTv == null) {
        break missingId;
      }

      id = R.id.sellerIv;
      ImageView sellerIv = ViewBindings.findChildViewById(rootView, id);
      if (sellerIv == null) {
        break missingId;
      }

      id = R.id.storeNameTv;
      TextView storeNameTv = ViewBindings.findChildViewById(rootView, id);
      if (storeNameTv == null) {
        break missingId;
      }

      return new BestSellerItemBinding((LinearLayout) rootView, bestSellerIv, bestSellerLayout,
          sellerAddressTv, sellerIv, storeNameTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}