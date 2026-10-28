package p;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e3 implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f9704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f9706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f9707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f9708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f9709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f9711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f9712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f9713j;
    public Window.Callback k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f9715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f9717o;

    public final void a(int i7) {
        View view;
        Toolbar toolbar = this.f9704a;
        int i10 = this.f9705b ^ i7;
        this.f9705b = i7;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                if ((this.f9705b & 4) != 0) {
                    Drawable drawable = this.f9709f;
                    if (drawable == null) {
                        drawable = this.f9717o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            if ((i10 & 8) != 0) {
                if ((i7 & 8) != 0) {
                    toolbar.setTitle(this.f9711h);
                    toolbar.setSubtitle(this.f9712i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) == 0 || (view = this.f9706c) == null) {
                return;
            }
            if ((i7 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f9704a;
        if ((this.f9705b & 4) != 0) {
            if (TextUtils.isEmpty(this.f9713j)) {
                toolbar.setNavigationContentDescription(this.f9716n);
            } else {
                toolbar.setNavigationContentDescription(this.f9713j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f9705b;
        if ((i7 & 2) == 0) {
            drawable = null;
        } else if ((i7 & 1) == 0 || (drawable = this.f9708e) == null) {
            drawable = this.f9707d;
        }
        this.f9704a.setLogo(drawable);
    }
}
