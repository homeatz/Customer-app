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

public final class ActivityOrderDetailsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView billTotalTv;

  @NonNull
  public final TextView deliveredTv;

  @NonNull
  public final TextView discountTv;

  @NonNull
  public final TextView dlvryPartFeeTv;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final LinearLayout mainLayout;

  @NonNull
  public final TextView onTimeTv;

  @NonNull
  public final RecyclerView orderDetailsRv;

  @NonNull
  public final TextView orderIdTv;

  @NonNull
  public final TextView orderOnTv;

  @NonNull
  public final TextView paidViaTv;

  @NonNull
  public final TextView sellerAddTv;

  @NonNull
  public final TextView sellerNameTv;

  @NonNull
  public final TextView taxTv;

  @NonNull
  public final TextView userAddTv;

  @NonNull
  public final TextView userAddTypeTv;

  private ActivityOrderDetailsBinding(@NonNull LinearLayout rootView, @NonNull TextView billTotalTv,
      @NonNull TextView deliveredTv, @NonNull TextView discountTv, @NonNull TextView dlvryPartFeeTv,
      @NonNull ImageView ivBack, @NonNull LinearLayout mainLayout, @NonNull TextView onTimeTv,
      @NonNull RecyclerView orderDetailsRv, @NonNull TextView orderIdTv,
      @NonNull TextView orderOnTv, @NonNull TextView paidViaTv, @NonNull TextView sellerAddTv,
      @NonNull TextView sellerNameTv, @NonNull TextView taxTv, @NonNull TextView userAddTv,
      @NonNull TextView userAddTypeTv) {
    this.rootView = rootView;
    this.billTotalTv = billTotalTv;
    this.deliveredTv = deliveredTv;
    this.discountTv = discountTv;
    this.dlvryPartFeeTv = dlvryPartFeeTv;
    this.ivBack = ivBack;
    this.mainLayout = mainLayout;
    this.onTimeTv = onTimeTv;
    this.orderDetailsRv = orderDetailsRv;
    this.orderIdTv = orderIdTv;
    this.orderOnTv = orderOnTv;
    this.paidViaTv = paidViaTv;
    this.sellerAddTv = sellerAddTv;
    this.sellerNameTv = sellerNameTv;
    this.taxTv = taxTv;
    this.userAddTv = userAddTv;
    this.userAddTypeTv = userAddTypeTv;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOrderDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOrderDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_order_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOrderDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bill_total_tv;
      TextView billTotalTv = ViewBindings.findChildViewById(rootView, id);
      if (billTotalTv == null) {
        break missingId;
      }

      id = R.id.delivered_tv;
      TextView deliveredTv = ViewBindings.findChildViewById(rootView, id);
      if (deliveredTv == null) {
        break missingId;
      }

      id = R.id.discount_tv;
      TextView discountTv = ViewBindings.findChildViewById(rootView, id);
      if (discountTv == null) {
        break missingId;
      }

      id = R.id.dlvry_part_fee_tv;
      TextView dlvryPartFeeTv = ViewBindings.findChildViewById(rootView, id);
      if (dlvryPartFeeTv == null) {
        break missingId;
      }

      id = R.id.ivBack;
      ImageView ivBack = ViewBindings.findChildViewById(rootView, id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.main_layout;
      LinearLayout mainLayout = ViewBindings.findChildViewById(rootView, id);
      if (mainLayout == null) {
        break missingId;
      }

      id = R.id.on_time_tv;
      TextView onTimeTv = ViewBindings.findChildViewById(rootView, id);
      if (onTimeTv == null) {
        break missingId;
      }

      id = R.id.order_details_rv;
      RecyclerView orderDetailsRv = ViewBindings.findChildViewById(rootView, id);
      if (orderDetailsRv == null) {
        break missingId;
      }

      id = R.id.order_id_tv;
      TextView orderIdTv = ViewBindings.findChildViewById(rootView, id);
      if (orderIdTv == null) {
        break missingId;
      }

      id = R.id.order_on_tv;
      TextView orderOnTv = ViewBindings.findChildViewById(rootView, id);
      if (orderOnTv == null) {
        break missingId;
      }

      id = R.id.paid_via_tv;
      TextView paidViaTv = ViewBindings.findChildViewById(rootView, id);
      if (paidViaTv == null) {
        break missingId;
      }

      id = R.id.seller_add_tv;
      TextView sellerAddTv = ViewBindings.findChildViewById(rootView, id);
      if (sellerAddTv == null) {
        break missingId;
      }

      id = R.id.seller_name_tv;
      TextView sellerNameTv = ViewBindings.findChildViewById(rootView, id);
      if (sellerNameTv == null) {
        break missingId;
      }

      id = R.id.tax_tv;
      TextView taxTv = ViewBindings.findChildViewById(rootView, id);
      if (taxTv == null) {
        break missingId;
      }

      id = R.id.user_add_tv;
      TextView userAddTv = ViewBindings.findChildViewById(rootView, id);
      if (userAddTv == null) {
        break missingId;
      }

      id = R.id.user_add_type_tv;
      TextView userAddTypeTv = ViewBindings.findChildViewById(rootView, id);
      if (userAddTypeTv == null) {
        break missingId;
      }

      return new ActivityOrderDetailsBinding((LinearLayout) rootView, billTotalTv, deliveredTv,
          discountTv, dlvryPartFeeTv, ivBack, mainLayout, onTimeTv, orderDetailsRv, orderIdTv,
          orderOnTv, paidViaTv, sellerAddTv, sellerNameTv, taxTv, userAddTv, userAddTypeTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
