package p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.baidu.carlifevehicle.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static h3 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static h3 f9767l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f9769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g3 f9771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g3 f9772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i3 f9775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9776i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9777j;

    /* JADX WARN: Type inference failed for: r0v0, types: [p.g3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [p.g3] */
    public h3(View view, CharSequence charSequence) {
        final int i7 = 0;
        this.f9771d = new Runnable(this) { // from class: p.g3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h3 f9747b;

            {
                this.f9747b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.f9747b.c(false);
                        break;
                    default:
                        this.f9747b.a();
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f9772e = new Runnable(this) { // from class: p.g3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h3 f9747b;

            {
                this.f9747b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f9747b.c(false);
                        break;
                    default:
                        this.f9747b.a();
                        break;
                }
            }
        };
        this.f9768a = view;
        this.f9769b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = e4.m0.f4377a;
        this.f9770c = Build.VERSION.SDK_INT >= 28 ? a4.b.i(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f9777j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(h3 h3Var) {
        h3 h3Var2 = k;
        if (h3Var2 != null) {
            h3Var2.f9768a.removeCallbacks(h3Var2.f9771d);
        }
        k = h3Var;
        if (h3Var != null) {
            h3Var.f9768a.postDelayed(h3Var.f9771d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        h3 h3Var = f9767l;
        View view = this.f9768a;
        if (h3Var == this) {
            f9767l = null;
            i3 i3Var = this.f9775h;
            if (i3Var != null) {
                View view2 = (View) i3Var.f9786c;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) i3Var.f9785b).getSystemService("window")).removeView(view2);
                }
                this.f9775h = null;
                this.f9777j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            b(null);
        }
        view.removeCallbacks(this.f9772e);
    }

    public final void c(boolean z10) {
        int height;
        int i7;
        int i10;
        char c10;
        long longPressTimeout;
        long j5;
        long j10;
        View view = this.f9768a;
        if (view.isAttachedToWindow()) {
            b(null);
            h3 h3Var = f9767l;
            if (h3Var != null) {
                h3Var.a();
            }
            f9767l = this;
            this.f9776i = z10;
            i3 i3Var = new i3(view.getContext());
            View view2 = (View) i3Var.f9786c;
            Context context = (Context) i3Var.f9785b;
            this.f9775h = i3Var;
            int width = this.f9773f;
            int i11 = this.f9774g;
            boolean z11 = this.f9776i;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) i3Var.f9788e;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) i3Var.f9787d).setText(this.f9769b);
            int[] iArr = (int[]) i3Var.f9791h;
            int[] iArr2 = (int[]) i3Var.f9790g;
            Rect rect = (Rect) i3Var.f9789f;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i11 + dimensionPixelOffset2;
                i7 = i11 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i7 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z11 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i12 = width;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i10 = 0;
                    c10 = 1;
                } else {
                    Resources resources = context.getResources();
                    c10 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i10 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i13 = iArr2[i10] - iArr[i10];
                iArr2[i10] = i13;
                iArr2[c10] = iArr2[c10] - iArr[c10];
                layoutParams.x = (i13 + i12) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, i10);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i14 = iArr2[c10];
                int i15 = ((i14 + i7) - dimensionPixelOffset3) - measuredHeight;
                int i16 = i14 + height + dimensionPixelOffset3;
                if (z11) {
                    if (i15 >= 0) {
                        layoutParams.y = i15;
                    } else {
                        layoutParams.y = i16;
                    }
                } else if (measuredHeight + i16 <= rect.height()) {
                    layoutParams.y = i16;
                } else {
                    layoutParams.y = i15;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f9776i) {
                j10 = 2500;
            } else {
                WeakHashMap weakHashMap = e4.l0.f4369a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j5 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j5 = 15000;
                }
                j10 = j5 - longPressTimeout;
            }
            g3 g3Var = this.f9772e;
            view.removeCallbacks(g3Var);
            view.postDelayed(g3Var, j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f9775h == null || !this.f9776i) {
            View view2 = this.f9768a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f9777j = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f9775h == null) {
                    int x8 = (int) motionEvent.getX();
                    int y5 = (int) motionEvent.getY();
                    if (this.f9777j) {
                        this.f9773f = x8;
                        this.f9774g = y5;
                        this.f9777j = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x8 - this.f9773f);
                        int i7 = this.f9770c;
                        if (iAbs > i7 || Math.abs(y5 - this.f9774g) > i7) {
                            this.f9773f = x8;
                            this.f9774g = y5;
                            this.f9777j = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f9773f = view.getWidth() / 2;
        this.f9774g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
