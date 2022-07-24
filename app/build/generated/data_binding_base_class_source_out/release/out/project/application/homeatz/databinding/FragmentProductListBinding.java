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
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import project.application.homeatz.R;

public final class FragmentProductListBinding implements ViewBinding {
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
  public final ImageView emptyCartIv;

  @NonNull
  public final ImageView ivRegionBanner;

  @NonNull
  public final LinearLayout ll1;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final LinearLayout noDataLayout;

  @NonNull
  public final TextView recommendedTv;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final LinearLayout sortLayout;

  @NonNull
  public final TextView viewCartTv;

  private FragmentProductListBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout belowHeaderLl, @NonNull LinearLayout bottomLl,
      @NonNull TextView cartCountTxtV, @NonNull ImageView cartImg, @NonNull TextView cartPriceTxtV,
      @NonNull ImageView emptyCartIv, @NonNull ImageView ivRegionBanner, @NonNull LinearLayout ll1,
      @NonNull NestedScrollView nestedScrollView, @NonNull LinearLayout noDataLayout,
      @NonNull TextView recommendedTv, @NonNull RecyclerView recyclerView,
      @NonNull LinearLayout sortLayout, @NonNull TextView viewCartTv) {
    this.rootView = rootView;
    this.belowHeaderLl = belowHeaderLl;
    this.bottomLl = bottomLl;
    this.cartCountTxtV = cartCountTxtV;
    this.cartImg = cartImg;
    this.cartPriceTxtV = cartPriceTxtV;
    this.emptyCartIv = emptyCartIv;
    this.ivRegionBanner = ivRegionBanner;
    this.ll1 = ll1;
    this.nestedScrollView = nestedScrollView;
    this.noDataLayout = noDataLayout;
    this.recommendedTv = recommendedTv;
    this.recyclerView = recyclerView;
    this.sortLayout = sortLayout;
    this.viewCartTv = viewCartTv;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProductListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProductListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_product_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProductListBinding bind(@NonNull View rootView) {
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

      id = R.id.emptyCart_iv;
      ImageView emptyCartIv = ViewBindings.findChildViewById(rootView, id);
      if (emptyCartIv == null) {
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

      id = R.id.nestedScrollView;
      NestedScrollView nestedScrollView = ViewBindings.findChildViewById(rootView, id);
      if (nestedScrollView == null) {
        break missingId;
      }

      id = R.id.noDataLayout;
      LinearLayout noDataLayout = ViewBindings.findChildViewById(rootView, id);
      if (noDataLayout == null) {
        break missingId;
      }

      id = R.id.recommended_tv;
      TextView recommendedTv = ViewBindings.findChildViewById(rootView, id);
      if (recommendedTv == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.sortLayout;
      LinearLayout sortLayout = ViewBindings.findChildViewById(rootView, id);
      if (sortLayout == null) {
        break missingId;
      }

      id = R.id.viewCart_tv;
      TextView viewCartTv = ViewBindings.findChildViewById(rootView, id);
      if (viewCartTv == null) {
        break missingId;
      }

      return new FragmentProductListBinding((LinearLayout) rootView, belowHeaderLl, bottomLl,
          cartCountTxtV, cartImg, cartPriceTxtV, emptyCartIv, ivRegionBanner, ll1, nestedScrollView,
          noDataLayout, recommendedTv, recyclerView, sortLayout, viewCartTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
