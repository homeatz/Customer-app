// Generated by view binder compiler. Do not edit!
package project.application.homeatz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.applandeo.materialcalendarview.CalendarView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import project.application.homeatz.R;

public final class CustomCalendarLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CalendarView calendarView;

  @NonNull
  public final Button cancelBtn;

  @NonNull
  public final Button okBtn;

  @NonNull
  public final Button resetBtn;

  private CustomCalendarLayoutBinding(@NonNull LinearLayout rootView,
      @NonNull CalendarView calendarView, @NonNull Button cancelBtn, @NonNull Button okBtn,
      @NonNull Button resetBtn) {
    this.rootView = rootView;
    this.calendarView = calendarView;
    this.cancelBtn = cancelBtn;
    this.okBtn = okBtn;
    this.resetBtn = resetBtn;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomCalendarLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomCalendarLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_calendar_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomCalendarLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.calendarView;
      CalendarView calendarView = ViewBindings.findChildViewById(rootView, id);
      if (calendarView == null) {
        break missingId;
      }

      id = R.id.cancel_btn;
      Button cancelBtn = ViewBindings.findChildViewById(rootView, id);
      if (cancelBtn == null) {
        break missingId;
      }

      id = R.id.ok_btn;
      Button okBtn = ViewBindings.findChildViewById(rootView, id);
      if (okBtn == null) {
        break missingId;
      }

      id = R.id.reset_btn;
      Button resetBtn = ViewBindings.findChildViewById(rootView, id);
      if (resetBtn == null) {
        break missingId;
      }

      return new CustomCalendarLayoutBinding((LinearLayout) rootView, calendarView, cancelBtn,
          okBtn, resetBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}