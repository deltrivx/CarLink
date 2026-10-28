package r3;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.i0;
import c.l0;
import c.m0;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlifevehicle.R;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends c.q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h9.a f11590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f11591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f11592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f11593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11594h;

    public t(h9.a aVar, s sVar, View view, n3.o oVar, n3.c cVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), sVar.f11588e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f11590d = aVar;
        this.f11591e = sVar;
        this.f11592f = view;
        float f10 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        g5.a.i0(window, this.f11591e.f11588e);
        window.setGravity(17);
        if (!this.f11591e.f11588e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                m.f11572a.a(attributes);
            }
            if (i7 >= 30) {
                n nVar = n.f11573a;
                nVar.a(attributes, 0);
                nVar.b(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        r rVar = new r(getContext(), window);
        setTitle(this.f11591e.f11589f);
        rVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        rVar.setClipChildren(false);
        rVar.setElevation(cVar.R(f10));
        rVar.setOutlineProvider(new b2.o(2));
        this.f11593g = rVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            c(viewGroup);
        }
        setContentView(rVar);
        i0.h(rVar, i0.e(view));
        rVar.setTag(R.id.view_tree_view_model_store_owner, i0.f(view));
        rVar.setTag(R.id.view_tree_saved_state_registry_owner, g5.a.E(view));
        e(this.f11590d, this.f11591e, oVar);
        l0 l0Var = this.f1791c;
        a aVar2 = new a(this, 1);
        i9.l.e(l0Var, "<this>");
        l0Var.a(this, new m0(aVar2));
    }

    public static final void c(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof r) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                c(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void e(h9.a aVar, s sVar, n3.o oVar) {
        int i7;
        this.f11590d = aVar;
        this.f11591e = sVar;
        a0 a0Var = sVar.f11586c;
        boolean zB = l.b(this.f11592f);
        int iOrdinal = a0Var.ordinal();
        int i10 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    throw new cc.s();
                }
                zB = false;
            }
        }
        Window window = getWindow();
        i9.l.b(window);
        window.setFlags(zB ? ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT : -8193, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
        int iOrdinal2 = oVar.ordinal();
        if (iOrdinal2 == 0) {
            i7 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new cc.s();
            }
            i7 = 1;
        }
        r rVar = this.f11593g;
        rVar.setLayoutDirection(i7);
        boolean z10 = sVar.f11588e;
        boolean z11 = sVar.f11587d;
        Window window2 = rVar.f11579i;
        boolean z12 = (rVar.f11582m && z11 == rVar.k && z10 == rVar.f11581l) ? false : true;
        rVar.k = z11;
        rVar.f11581l = z10;
        if (z12) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i11 = z11 ? -2 : -1;
            if (i11 != attributes.width || !rVar.f11582m) {
                window2.setLayout(i11, -2);
                rVar.f11582m = true;
            }
        }
        setCanceledOnTouchOutside(sVar.f11585b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z10) {
                i10 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i10);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (!this.f11591e.f11584a || !keyEvent.isTracking() || keyEvent.isCanceled() || i7 != 111) {
            return super.onKeyUp(i7, keyEvent);
        }
        this.f11590d.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iM;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f11591e.f11585b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.f11594h = false;
            return zOnTouchEvent;
        }
        r rVar = this.f11593g;
        rVar.getClass();
        float x8 = motionEvent.getX();
        if (!Float.isInfinite(x8) && !Float.isNaN(x8)) {
            float y5 = motionEvent.getY();
            if (!Float.isInfinite(y5) && !Float.isNaN(y5) && (childAt = rVar.getChildAt(0)) != null) {
                int left = childAt.getLeft() + rVar.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + rVar.getTop();
                int height = childAt.getHeight() + top;
                int iM2 = k9.a.M(motionEvent.getX());
                if (left <= iM2 && iM2 <= width && top <= (iM = k9.a.M(motionEvent.getY())) && iM <= height) {
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                        this.f11594h = false;
                        return zOnTouchEvent;
                    }
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.f11594h = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.f11594h = false;
                return zOnTouchEvent;
            }
        } else if (this.f11594h) {
            this.f11590d.invoke();
            this.f11594h = false;
            return true;
        }
        return zOnTouchEvent;
    }
}
