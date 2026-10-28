package r3;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.i0;
import c.g0;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlifevehicle.R;
import f1.f0;
import f1.k1;
import f1.w1;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v extends r2.a {
    public final int[] A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h9.a f11600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z f11601j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f11602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f11603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final WindowManager f11604n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WindowManager.LayoutParams f11605o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y f11606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n3.o f11607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k1 f11608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k1 f11609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n3.k f11610t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f0 f11611u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f11612v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p1.u f11613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public g0 f11614x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k1 f11615y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11616z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(h9.a aVar, z zVar, String str, View view, n3.c cVar, y yVar, UUID uuid) {
        super(view.getContext());
        x wVar = Build.VERSION.SDK_INT >= 29 ? new w() : new x();
        this.f11600i = aVar;
        this.f11601j = zVar;
        this.k = str;
        this.f11602l = view;
        this.f11603m = wVar;
        Object systemService = view.getContext().getSystemService("window");
        i9.l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f11604n = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        z zVar2 = this.f11601j;
        boolean zB = l.b(view);
        boolean z10 = zVar2.f11618b;
        int i7 = zVar2.f11617a;
        if (z10 && zB) {
            i7 |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        } else if (z10 && !zB) {
            i7 &= -8193;
        }
        layoutParams.flags = i7;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f11605o = layoutParams;
        this.f11606p = yVar;
        this.f11607q = n3.o.f8749a;
        this.f11608r = f1.b.s(null);
        this.f11609s = f1.b.s(null);
        this.f11611u = f1.b.o(new b1.a(16, this));
        this.f11612v = new Rect();
        this.f11613w = new p1.u(new j(this, 2));
        setId(android.R.id.content);
        i0.h(this, i0.e(view));
        setTag(R.id.view_tree_view_model_store_owner, i0.f(view));
        setTag(R.id.view_tree_saved_state_registry_owner, g5.a.E(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.R((float) 8));
        setOutlineProvider(new b2.o(3));
        this.f11615y = f1.b.s(q.f11578a);
        this.A = new int[2];
    }

    private final h9.n getContent() {
        return (h9.n) this.f11615y.getValue();
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o2.w getParentLayoutCoordinates() {
        return (o2.w) this.f11609s.getValue();
    }

    private final n3.k getVisibleDisplayBounds() {
        this.f11603m.getClass();
        View view = this.f11602l;
        Rect rect = this.f11612v;
        view.getWindowVisibleDisplayFrame(rect);
        return new n3.k(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(h9.n nVar) {
        this.f11615y.setValue(nVar);
    }

    private final void setParentLayoutCoordinates(o2.w wVar) {
        this.f11609s.setValue(wVar);
    }

    @Override // r2.a
    public final void a(int i7, f1.s sVar) {
        sVar.Y(-857613600);
        int i10 = (sVar.h(this) ? 4 : 2) | i7;
        if (sVar.N(i10 & 1, (i10 & 3) != 2)) {
            getContent().invoke(sVar, 0);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new c1.n(this, i7, 6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f11601j.f11619c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                h9.a aVar = this.f11600i;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // r2.a
    public final void e(boolean z10, int i7, int i10, int i11, int i12) {
        super.e(z10, i7, i10, i11, i12);
        this.f11601j.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f11605o;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f11603m.getClass();
        this.f11604n.updateViewLayout(this, layoutParams);
    }

    @Override // r2.a
    public final void f(int i7, int i10) {
        this.f11601j.getClass();
        n3.k visibleDisplayBounds = getVisibleDisplayBounds();
        super.f(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.f8743c - visibleDisplayBounds.f8741a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.f8744d - visibleDisplayBounds.f8742b, Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f11611u.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f11605o;
    }

    public final n3.o getParentLayoutDirection() {
        return this.f11607q;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final n3.m m33getPopupContentSizebOM6tXw() {
        return (n3.m) this.f11608r.getValue();
    }

    public final y getPositionProvider() {
        return this.f11606p;
    }

    @Override // r2.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f11616z;
    }

    public r2.a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.k;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void i(f1.v vVar, h9.n nVar) {
        setParentCompositionContext(vVar);
        setContent(nVar);
        this.f11616z = true;
    }

    public final void j(h9.a aVar, z zVar, String str, n3.o oVar) {
        int i7;
        this.f11600i = aVar;
        this.k = str;
        if (!i9.l.a(this.f11601j, zVar)) {
            zVar.getClass();
            this.f11601j = zVar;
            boolean zB = l.b(this.f11602l);
            boolean z10 = zVar.f11618b;
            int i10 = zVar.f11617a;
            if (z10 && zB) {
                i10 |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
            } else if (z10 && !zB) {
                i10 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f11605o;
            layoutParams.flags = i10;
            this.f11603m.getClass();
            this.f11604n.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = oVar.ordinal();
        if (iOrdinal != 0) {
            i7 = 1;
            if (iOrdinal != 1) {
                throw new cc.s();
            }
        } else {
            i7 = 0;
        }
        super.setLayoutDirection(i7);
    }

    public final void k() {
        o2.w parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.isAttached()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jL = parentLayoutCoordinates.l();
            long jD = parentLayoutCoordinates.d(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jD >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jD & 4294967295L)))) & 4294967295L);
            int i7 = (int) (jRound >> 32);
            int i10 = (int) (jRound & 4294967295L);
            n3.k kVar = new n3.k(i7, i10, ((int) (jL >> 32)) + i7, ((int) (jL & 4294967295L)) + i10);
            if (kVar.equals(this.f11610t)) {
                return;
            }
            this.f11610t = kVar;
            m();
        }
    }

    public final void l(o2.w wVar) {
        setParentLayoutCoordinates(wVar);
        k();
    }

    public final void m() {
        n3.m mVarM33getPopupContentSizebOM6tXw;
        n3.k kVar = this.f11610t;
        if (kVar == null || (mVarM33getPopupContentSizebOM6tXw = m33getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j5 = mVarM33getPopupContentSizebOM6tXw.f8746a;
        n3.k visibleDisplayBounds = getVisibleDisplayBounds();
        long j10 = (((long) (visibleDisplayBounds.f8744d - visibleDisplayBounds.f8742b)) & 4294967295L) | (((long) (visibleDisplayBounds.f8743c - visibleDisplayBounds.f8741a)) << 32);
        i9.w wVar = new i9.w();
        wVar.f6687a = 0L;
        this.f11613w.c(this, d.f11544g, new u(wVar, this, kVar, j10, j5));
        long j11 = wVar.f6687a;
        WindowManager.LayoutParams layoutParams = this.f11605o;
        layoutParams.x = (int) (j11 >> 32);
        layoutParams.y = (int) (j11 & 4294967295L);
        boolean z10 = this.f11601j.f11621e;
        x xVar = this.f11603m;
        if (z10) {
            xVar.a(this, (int) (j10 >> 32), (int) (j10 & 4294967295L));
        }
        xVar.getClass();
        this.f11604n.updateViewLayout(this, layoutParams);
    }

    @Override // r2.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11613w.d();
        if (!this.f11601j.f11619c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f11614x == null) {
            this.f11614x = new g0(3, this.f11600i);
        }
        a4.a.e(this, this.f11614x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p1.u uVar = this.f11613w;
        g4.e eVar = uVar.f10095h;
        if (eVar != null) {
            eVar.a();
        }
        uVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            a4.a.f(this, this.f11614x);
        }
        this.f11614x = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f11601j.f11620d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            h9.a aVar = this.f11600i;
            if (aVar != null) {
                aVar.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            h9.a aVar2 = this.f11600i;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i7) {
    }

    public final void setParentLayoutDirection(n3.o oVar) {
        this.f11607q = oVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m34setPopupContentSizefhxjrPA(n3.m mVar) {
        this.f11608r.setValue(mVar);
    }

    public final void setPositionProvider(y yVar) {
        this.f11606p = yVar;
    }

    public final void setTestTag(String str) {
        this.k = str;
    }
}
