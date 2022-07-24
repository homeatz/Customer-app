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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import project.application.homeatz.R;

public final class FragmentRestaurantBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout belowHeaderLl;

  @NonNull
  public final LinearLayout bottomLl;

  @NonNull
  public final TextView cartCountTxtV;

  @NonNull
  public final ImageView cartImg;

  @NonNull
  public final TextView cartPriceTxtV;

  @NonNull
  public final RecyclerView catRecyclerView;

  @NonNull
  public final ImageView ivRegionBanner;

  @NonNull
  public final LinearLayout ll1;

  @NonNull
  public final TextView recommendedTv;

  @NonNull
  public final TextView viewCartTv;

  private FragmentRestaurantBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout belowHeaderLl, @NonNull LinearLayout bottomLl,
      @NonNull TextView cartCountTxtV, @NonNull ImageView cartImg, @NonNull TextView cartPriceTxtV,
      @NonNull RecyclerView catRecyclerView, @NonNull ImageView ivRegionBanner,
      @NonNull LinearLayout ll1, @NonNull TextView recommendedTv, @NonNull TextView viewCartTv) {
    this.rootView = rootView;
    this.belowHeaderLl = belowHeaderLl;
    this.bottomLl = bottomLl;
    this.cartCountTxtV = cartCountTxtV;
    this.cartImg = cartImg;
    this.cartPriceTxtV = cartPriceTxtV;
    this.catRecyclerView = catRecyclerView;
    this.ivRegionBanner = ivRegionBanner;
    this.ll1 = ll1;
    this.recommendedTv = recommendedTv;
    this.viewCartTv = viewCartTv;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRestaurantBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRestaurantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_restaurant, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRestaurantBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.belowHeader_ll;
      LinearLayout belowHeaderLl = ViewBindings.findChildViewById(rootView, id);
      if (belowHeaderLl == null) {
        break missingId;
      }

      id = R.id.bottom_ll;
      LinearLayout bottomLl = ViewBindings.findChildViewById(rootView, id);
      if (bottomLl == null) {
        break missingId;
      }

      id = R.id.cartCount_txtV;
      TextView cartCountTxtV = ViewBindings.findChildViewById(rootView, id);
      if (cartCountTxtV == null) {
        break missingId;
      }

      id = R.id.cart_img;
      ImageView cartImg = ViewBindings.findChildViewById(rootView, id);
      if (cartImg == null) {
        break missingId;
      }

      id = R.id.cartPrice_txtV;
      TextView cartPriceTxtV = ViewBindings.findChildViewById(rootView, id);
      if (cartPriceTxtV == null) {
        break missingId;
      }

      id = R.id.cat_recyclerView;
      RecyclerView catRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (catRecyclerView == null) {
        break missingId;
      }

      id = R.id.ivRegionBanner;
      ImageView ivRegionBanner = ViewBindings.findChildViewById(rootView, id);
      if (ivRegionBanner == null) {
        break missingId;
      }

      id = R.id.ll1;
      LinearLayout ll1 = ViewBindings.findChildViewById(rootView, id);
      if (ll1 == null) {
        break missingId;
      }

      id = R.id.recommended_tv;
      TextView recommendedTv = ViewBindings.findChildViewById(rootView, id);
      if (recommendedTv == null) {
        break missingId;
      }

      id = R.id.viewCart_tv;
      TextView viewCartTv = ViewBindings.findChildViewById(rootView, id);
      if (viewCartTv == null) {
        break missingId;
      }

      return new FragmentRestaurantBinding((LinearLayout) rootView, belowHeaderLl, bottomLl,
          cartCountTxtV, cartImg, cartPriceTxtV, catRecyclerView, ivRegionBanner, ll1,
          recommendedTv, viewCartTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
