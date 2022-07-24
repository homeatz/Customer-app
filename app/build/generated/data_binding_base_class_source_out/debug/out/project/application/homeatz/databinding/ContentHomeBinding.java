// Generated by view binder compiler. Do not edit!
package project.application.homeatz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import project.application.homeatz.R;

public final class ContentHomeBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppBarLayout appbarlayoutId;

  @NonNull
  public final BottomNavigationView bottomNavigationView;

  @NonNull
  public final ImageView ivLogout;

  @NonNull
  public final ImageView loginIv;

  @NonNull
  public final ImageView menuIv;

  @NonNull
  public final FragmentContainerView navHostFragment;

  @NonNull
  public final LinearLayout searchLayout;

  @NonNull
  public final Toolbar toolbar;

  private ContentHomeBinding(@NonNull RelativeLayout rootView, @NonNull AppBarLayout appbarlayoutId,
      @NonNull BottomNavigationView bottomNavigationView, @NonNull ImageView ivLogout,
      @NonNull ImageView loginIv, @NonNull ImageView menuIv,
      @NonNull FragmentContainerView navHostFragment, @NonNull LinearLayout searchLayout,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.appbarlayoutId = appbarlayoutId;
    this.bottomNavigationView = bottomNavigationView;
    this.ivLogout = ivLogout;
    this.loginIv = loginIv;
    this.menuIv = menuIv;
    this.navHostFragment = navHostFragment;
    this.searchLayout = searchLayout;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbarlayout_id;
      AppBarLayout appbarlayoutId = ViewBindings.findChildViewById(rootView, id);
      if (appbarlayoutId == null) {
        break missingId;
      }

      id = R.id.bottomNavigationView;
      BottomNavigationView bottomNavigationView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigationView == null) {
        break missingId;
      }

      id = R.id.ivLogout;
      ImageView ivLogout = ViewBindings.findChildViewById(rootView, id);
      if (ivLogout == null) {
        break missingId;
      }

      id = R.id.login_iv;
      ImageView loginIv = ViewBindings.findChildViewById(rootView, id);
      if (loginIv == null) {
        break missingId;
      }

      id = R.id.menuIv;
      ImageView menuIv = ViewBindings.findChildViewById(rootView, id);
      if (menuIv == null) {
        break missingId;
      }

      id = R.id.nav_host_fragment;
      FragmentContainerView navHostFragment = ViewBindings.findChildViewById(rootView, id);
      if (navHostFragment == null) {
        break missingId;
      }

      id = R.id.searchLayout;
      LinearLayout searchLayout = ViewBindings.findChildViewById(rootView, id);
      if (searchLayout == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ContentHomeBinding((RelativeLayout) rootView, appbarlayoutId, bottomNavigationView,
          ivLogout, loginIv, menuIv, navHostFragment, searchLayout, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
