package r2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends View implements q2.p1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b2.o f11402r = new b2.o(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static Method f11403s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Field f11404t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f11405u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f11406v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f11407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f11408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h9.n f11409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h9.a f11410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2 f11411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f11413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f7.q f11415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11416j;
    public final y1.p k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k2.e f11417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f11418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11419n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11420o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f11421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11422q;

    public s2(u uVar, o1 o1Var, h9.n nVar, h9.a aVar) {
        super(uVar.getContext());
        this.f11407a = uVar;
        this.f11408b = o1Var;
        this.f11409c = nVar;
        this.f11410d = aVar;
        this.f11411e = new a2();
        this.k = new y1.p();
        this.f11417l = new k2.e(g1.f11237d);
        this.f11419n = y1.p0.f14946a;
        this.f11420o = true;
        setWillNotDraw(false);
        o1Var.addView(this);
        this.f11421p = View.generateViewId();
    }

    private final y1.e0 getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        a2 a2Var = this.f11411e;
        if (!a2Var.f11148g) {
            return null;
        }
        a2Var.e();
        return a2Var.f11146e;
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f11414h) {
            this.f11414h = z10;
            this.f11407a.A(this, z10);
        }
    }

    @Override // q2.p1
    public final void a(float[] fArr) {
        y1.a0.e(fArr, this.f11417l.c(this));
    }

    @Override // q2.p1
    public final void b(h9.n nVar, h9.a aVar) {
        if (Build.VERSION.SDK_INT >= 23 || f11406v) {
            this.f11408b.addView(this);
        } else {
            setVisibility(0);
        }
        k2.e eVar = this.f11417l;
        eVar.f7202a = false;
        eVar.f7203b = false;
        eVar.f7205d = true;
        eVar.f7204c = true;
        y1.a0.d((float[]) eVar.f7208g);
        y1.a0.d((float[]) eVar.f7209h);
        this.f11412f = false;
        this.f11416j = false;
        this.f11419n = y1.p0.f14946a;
        this.f11409c = nVar;
        this.f11410d = aVar;
        setInvalidated(false);
    }

    @Override // q2.p1
    public final void c(x1.a aVar, boolean z10) {
        k2.e eVar = this.f11417l;
        if (!z10) {
            float[] fArrC = eVar.c(this);
            if (eVar.f7205d) {
                return;
            }
            y1.a0.c(fArrC, aVar);
            return;
        }
        float[] fArrB = eVar.b(this);
        if (fArrB != null) {
            if (eVar.f7205d) {
                return;
            }
            y1.a0.c(fArrB, aVar);
        } else {
            aVar.f14517a = 0.0f;
            aVar.f14518b = 0.0f;
            aVar.f14519c = 0.0f;
            aVar.f14520d = 0.0f;
        }
    }

    @Override // q2.p1
    public final void d(y1.i0 i0Var) {
        h9.a aVar;
        int i7 = i0Var.f14903a | this.f11422q;
        if ((i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
            long j5 = i0Var.f14912j;
            this.f11419n = j5;
            setPivotX(y1.p0.a(j5) * getWidth());
            setPivotY(y1.p0.b(this.f11419n) * getHeight());
        }
        if ((i7 & 1) != 0) {
            setScaleX(i0Var.f14904b);
        }
        if ((i7 & 2) != 0) {
            setScaleY(i0Var.f14905c);
        }
        if ((i7 & 4) != 0) {
            setAlpha(i0Var.f14906d);
        }
        if ((i7 & 8) != 0) {
            setTranslationX(0.0f);
        }
        if ((i7 & 16) != 0) {
            setTranslationY(0.0f);
        }
        if ((i7 & 32) != 0) {
            setElevation(i0Var.f14907e);
        }
        if ((i7 & 1024) != 0) {
            setRotation(i0Var.f14910h);
        }
        if ((i7 & 256) != 0) {
            setRotationX(0.0f);
        }
        if ((i7 & 512) != 0) {
            setRotationY(0.0f);
        }
        if ((i7 & 2048) != 0) {
            setCameraDistancePx(i0Var.f14911i);
        }
        boolean z10 = getManualClipPath() != null;
        boolean z11 = i0Var.f14913l;
        y1.g0 g0Var = y1.h0.f14898a;
        boolean z12 = z11 && i0Var.k != g0Var;
        if ((i7 & 24576) != 0) {
            this.f11412f = z11 && i0Var.k == g0Var;
            l();
            setClipToOutline(z12);
        }
        boolean zD = this.f11411e.d(i0Var.f14918q, i0Var.f14906d, z12, i0Var.f14907e, i0Var.f14914m);
        a2 a2Var = this.f11411e;
        Paint paint = null;
        if (a2Var.f11147f) {
            setOutlineProvider(a2Var.b() != null ? f11402r : null);
        }
        boolean z13 = getManualClipPath() != null;
        if (z10 != z13 || (z13 && zD)) {
            invalidate();
        }
        if (!this.f11416j && getElevation() > 0.0f && (aVar = this.f11410d) != null) {
            aVar.invoke();
        }
        if ((i7 & 7963) != 0) {
            this.f11417l.e();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            if ((i7 & 64) != 0) {
                setOutlineAmbientShadowColor(y1.h0.C(i0Var.f14908f));
            }
            if ((i7 & 128) != 0) {
                setOutlineSpotShadowColor(y1.h0.C(i0Var.f14909g));
            }
        }
        if (i10 >= 31 && (131072 & i7) != 0) {
            setRenderEffect(null);
        }
        boolean z14 = ((262144 & i7) == 0 && (524288 & i7) == 0) ? false : true;
        if ((i7 & 32768) != 0 || z14) {
            if (z14) {
                if (z14) {
                    f7.q qVarH = this.f11415i;
                    if (qVarH == null) {
                        qVarH = y1.h0.h();
                        this.f11415i = qVarH;
                    }
                    qVarH.l(null);
                    qVarH.j(i0Var.f14917p);
                    paint = (Paint) qVarH.f5447c;
                }
                setLayerType(2, paint);
            } else {
                setLayerType(0, null);
            }
            this.f11420o = true;
        }
        this.f11422q = i0Var.f14903a;
    }

    @Override // q2.p1
    public final void destroy() {
        setInvalidated(false);
        u uVar = this.f11407a;
        uVar.G = true;
        this.f11409c = null;
        this.f11410d = null;
        boolean zI = uVar.I(this);
        if (Build.VERSION.SDK_INT >= 23 || f11406v || !zI) {
            this.f11408b.removeViewInLayout(this);
        } else {
            setVisibility(8);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        y1.p pVar = this.k;
        y1.b bVar = pVar.f14945a;
        Canvas canvas2 = bVar.f14875a;
        bVar.f14875a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z10 = false;
        } else {
            bVar.h();
            this.f11411e.a(bVar);
            z10 = true;
        }
        h9.n nVar = this.f11409c;
        if (nVar != null) {
            nVar.invoke(bVar, null);
        }
        if (z10) {
            bVar.r();
        }
        pVar.f14945a.f14875a = canvas2;
        setInvalidated(false);
    }

    @Override // q2.p1
    public final void e(y1.o oVar, b2.c cVar) {
        boolean z10 = getElevation() > 0.0f;
        this.f11416j = z10;
        if (z10) {
            oVar.s();
        }
        this.f11408b.a(oVar, this, getDrawingTime());
        if (this.f11416j) {
            oVar.i();
        }
    }

    @Override // q2.p1
    public final boolean f(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j5));
        if (this.f11412f) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f11411e.c(j5);
        }
        return true;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // q2.p1
    public final long g(long j5, boolean z10) {
        k2.e eVar = this.f11417l;
        if (!z10) {
            return !eVar.f7205d ? y1.a0.b(j5, eVar.c(this)) : j5;
        }
        float[] fArrB = eVar.b(this);
        if (fArrB == null) {
            return 9187343241974906880L;
        }
        return !eVar.f7205d ? y1.a0.b(j5, fArrB) : j5;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final o1 getContainer() {
        return this.f11408b;
    }

    public float getFrameRate() {
        return this.f11418m;
    }

    public long getLayerId() {
        return this.f11421p;
    }

    public final u getOwnerView() {
        return this.f11407a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f11407a.getUniqueDrawingId();
        }
        return -1L;
    }

    @Override // q2.p1
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo26getUnderlyingMatrixsQKQjiQ() {
        return this.f11417l.c(this);
    }

    @Override // q2.p1
    public final void h(long j5) {
        int i7 = (int) (j5 >> 32);
        int i10 = (int) (j5 & 4294967295L);
        if (i7 == getWidth() && i10 == getHeight()) {
            return;
        }
        setPivotX(y1.p0.a(this.f11419n) * i7);
        setPivotY(y1.p0.b(this.f11419n) * i10);
        setOutlineProvider(this.f11411e.b() != null ? f11402r : null);
        layout(getLeft(), getTop(), getLeft() + i7, getTop() + i10);
        l();
        this.f11417l.e();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f11420o;
    }

    @Override // q2.p1
    public final void i(float[] fArr) {
        float[] fArrB = this.f11417l.b(this);
        if (fArrB != null) {
            y1.a0.e(fArr, fArrB);
        }
    }

    @Override // android.view.View, q2.p1
    public final void invalidate() {
        if (this.f11414h) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f11407a.invalidate();
    }

    @Override // q2.p1
    public final void j(long j5) {
        int i7 = (int) (j5 >> 32);
        int left = getLeft();
        k2.e eVar = this.f11417l;
        if (i7 != left) {
            offsetLeftAndRight(i7 - getLeft());
            eVar.e();
        }
        int i10 = (int) (j5 & 4294967295L);
        if (i10 != getTop()) {
            offsetTopAndBottom(i10 - getTop());
            eVar.e();
        }
    }

    @Override // q2.p1
    public final void k() {
        if (!this.f11414h || f11406v) {
            return;
        }
        j0.x(this);
        setInvalidated(false);
    }

    public final void l() {
        Rect rect;
        if (this.f11412f) {
            Rect rect2 = this.f11413g;
            if (rect2 == null) {
                this.f11413g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                i9.l.b(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f11413g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    public void setFrameRate(float f10) {
        this.f11418m = f10;
    }

    public void setFrameRateFromParent(boolean z10) {
    }
}
