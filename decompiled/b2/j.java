package b2;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;
import y1.h0;
import y1.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements e {
    public static final boolean B = !d.f1224e.a();
    public static final Canvas C;
    public final boolean A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2.a f1269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y1.p f1270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f1271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f1272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f1273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f1274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Picture f1275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2.c f1276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y1.p f1277j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f1279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f1285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1286t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f1287u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f1288v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f1289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f1290x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f1291y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f1292z;

    static {
        C = Build.VERSION.SDK_INT >= 23 ? new i() : (Canvas) new c2.b();
    }

    public j(c2.a aVar) {
        y1.p pVar = new y1.p();
        a2.c cVar = new a2.c();
        this.f1269b = aVar;
        this.f1270c = pVar;
        p pVar2 = new p(aVar, pVar, cVar);
        this.f1271d = pVar2;
        this.f1272e = aVar.getResources();
        this.f1273f = new Rect();
        boolean z10 = B;
        this.f1275h = z10 ? new Picture() : null;
        this.f1276i = z10 ? new a2.c() : null;
        this.f1277j = z10 ? new y1.p() : null;
        aVar.addView(pVar2);
        pVar2.setClipBounds(null);
        this.f1279m = 0L;
        View.generateViewId();
        this.f1283q = 3;
        this.f1284r = 0;
        this.f1285s = 1.0f;
        this.f1287u = 1.0f;
        this.f1288v = 1.0f;
        long j5 = q.f14948b;
        this.f1290x = j5;
        this.f1291y = j5;
        this.A = z10;
    }

    @Override // b2.e
    public final float A() {
        return 0.0f;
    }

    @Override // b2.e
    public final long B() {
        return this.f1291y;
    }

    @Override // b2.e
    public final void C(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1290x = j5;
            this.f1271d.setOutlineAmbientShadowColor(h0.C(j5));
        }
    }

    @Override // b2.e
    public final float D() {
        return this.f1271d.getCameraDistance() / this.f1272e.getDisplayMetrics().densityDpi;
    }

    @Override // b2.e
    public final float E() {
        return 0.0f;
    }

    @Override // b2.e
    public final void F(boolean z10) {
        boolean z11 = false;
        this.f1282p = z10 && !this.f1281o;
        this.f1280n = true;
        if (z10 && this.f1281o) {
            z11 = true;
        }
        this.f1271d.setClipToOutline(z11);
    }

    @Override // b2.e
    public final float G() {
        return 0.0f;
    }

    @Override // b2.e
    public final void H(int i7) {
        this.f1284r = i7;
        Q();
    }

    @Override // b2.e
    public final void I(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1291y = j5;
            this.f1271d.setOutlineSpotShadowColor(h0.C(j5));
        }
    }

    @Override // b2.e
    public final Matrix J() {
        return this.f1271d.getMatrix();
    }

    @Override // b2.e
    public final boolean K() {
        return this.A;
    }

    @Override // b2.e
    public final float L() {
        return this.f1289w;
    }

    @Override // b2.e
    public final float M() {
        return this.f1288v;
    }

    @Override // b2.e
    public final int N() {
        return this.f1283q;
    }

    public final void O(int i7) {
        p pVar = this.f1271d;
        boolean z10 = true;
        if (i7 == 1) {
            pVar.setLayerType(2, this.f1274g);
        } else if (i7 == 2) {
            pVar.setLayerType(0, this.f1274g);
            z10 = false;
        } else {
            pVar.setLayerType(0, this.f1274g);
        }
        pVar.setCanUseCompositingLayer$ui_graphics_release(z10);
    }

    public final void P() {
        try {
            y1.p pVar = this.f1270c;
            Canvas canvas = C;
            y1.b bVar = pVar.f14945a;
            Canvas canvas2 = bVar.f14875a;
            bVar.f14875a = canvas;
            c2.a aVar = this.f1269b;
            p pVar2 = this.f1271d;
            aVar.a(bVar, pVar2, pVar2.getDrawingTime());
            pVar.f14945a.f14875a = canvas2;
        } catch (ClassCastException unused) {
        }
    }

    public final void Q() {
        int i7 = this.f1284r;
        if (i7 != 1 && this.f1283q == 3) {
            O(i7);
        } else {
            O(1);
        }
    }

    @Override // b2.e
    public final float a() {
        return this.f1285s;
    }

    @Override // b2.e
    public final void b(float f10) {
        this.f1292z = f10;
        this.f1271d.setRotation(f10);
    }

    @Override // b2.e
    public final void c(int i7) {
        this.f1283q = i7;
        Paint paint = this.f1274g;
        if (paint == null) {
            paint = new Paint();
            this.f1274g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(h0.G(i7)));
        Q();
    }

    @Override // b2.e
    public final void d() {
        this.f1269b.removeViewInLayout(this.f1271d);
    }

    @Override // b2.e
    public final void e(float f10) {
        this.f1288v = f10;
        this.f1271d.setScaleY(f10);
    }

    @Override // b2.e
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // b2.e
    public final void g() {
        this.f1271d.setRotationX(0.0f);
    }

    @Override // b2.e
    public final void h(float f10) {
        this.f1285s = f10;
        this.f1271d.setAlpha(f10);
    }

    @Override // b2.e
    public final void i() {
        this.f1271d.setTranslationY(0.0f);
    }

    @Override // b2.e
    public final void j() {
        this.f1271d.setRotationY(0.0f);
    }

    @Override // b2.e
    public final void k() {
        Paint paint = this.f1274g;
        if (paint == null) {
            paint = new Paint();
            this.f1274g = paint;
        }
        paint.setColorFilter(null);
        Q();
    }

    @Override // b2.e
    public final void l(float f10) {
        this.f1287u = f10;
        this.f1271d.setScaleX(f10);
    }

    @Override // b2.e
    public final void m() {
        this.f1271d.setTranslationX(0.0f);
    }

    @Override // b2.e
    public final void n(float f10) {
        this.f1271d.setCameraDistance(f10 * this.f1272e.getDisplayMetrics().densityDpi);
    }

    @Override // b2.e
    public final float o() {
        return this.f1287u;
    }

    @Override // b2.e
    public final void p(float f10) {
        this.f1289w = f10;
        this.f1271d.setElevation(f10);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // b2.e
    public final void q(Outline outline, long j5) {
        boolean z10;
        Method declaredMethod;
        p pVar = this.f1271d;
        pVar.f1298e = outline;
        d dVar = d.f1221b;
        if (Build.VERSION.SDK_INT < 22) {
            try {
                synchronized (dVar) {
                    try {
                        if (d.f1223d) {
                            declaredMethod = d.f1222c;
                        } else {
                            d.f1223d = true;
                            declaredMethod = View.class.getDeclaredMethod("rebuildOutline", null);
                            if (declaredMethod != null) {
                                declaredMethod.setAccessible(true);
                                d.f1222c = declaredMethod;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (declaredMethod != null) {
                    declaredMethod.invoke(pVar, null);
                }
                if (declaredMethod == null) {
                    z10 = false;
                }
            } catch (Throwable unused) {
            }
            if ((this.f1282p || this.f1271d.getClipToOutline()) && outline != null) {
                this.f1271d.setClipToOutline(true);
                if (this.f1282p) {
                    this.f1282p = false;
                    this.f1280n = true;
                }
            }
            this.f1281o = outline != null;
            if (z10) {
            }
            this.f1271d.invalidate();
            P();
        }
        pVar.invalidateOutline();
        z10 = true;
        if (this.f1282p) {
            this.f1271d.setClipToOutline(true);
            if (this.f1282p) {
                this.f1282p = false;
                this.f1280n = true;
            }
        } else {
            this.f1271d.setClipToOutline(true);
            if (this.f1282p) {
                this.f1282p = false;
                this.f1280n = true;
            }
        }
        this.f1281o = outline != null;
        if (z10) {
            this.f1271d.invalidate();
            P();
        }
    }

    @Override // b2.e
    public final int r() {
        return this.f1284r;
    }

    @Override // b2.e
    public final y1.k s() {
        return null;
    }

    @Override // b2.e
    public final void t(int i7, int i10, long j5) {
        boolean zA = n3.m.a(this.f1279m, j5);
        p pVar = this.f1271d;
        if (zA) {
            int i11 = this.k;
            if (i11 != i7) {
                pVar.offsetLeftAndRight(i7 - i11);
            }
            int i12 = this.f1278l;
            if (i12 != i10) {
                pVar.offsetTopAndBottom(i10 - i12);
            }
        } else {
            if (this.f1282p || pVar.getClipToOutline()) {
                this.f1280n = true;
            }
            int i13 = (int) (j5 >> 32);
            int i14 = (int) (4294967295L & j5);
            pVar.layout(i7, i10, i7 + i13, i10 + i14);
            this.f1279m = j5;
            if (this.f1286t) {
                pVar.setPivotX(i13 / 2.0f);
                pVar.setPivotY(i14 / 2.0f);
            }
        }
        this.k = i7;
        this.f1278l = i10;
    }

    @Override // b2.e
    public final float u() {
        return 0.0f;
    }

    @Override // b2.e
    public final void v(y1.o oVar) {
        Rect rect;
        boolean z10 = this.f1280n;
        p pVar = this.f1271d;
        if (z10) {
            if ((this.f1282p || pVar.getClipToOutline()) && !this.f1281o) {
                rect = this.f1273f;
                rect.left = 0;
                rect.top = 0;
                rect.right = pVar.getWidth();
                rect.bottom = pVar.getHeight();
            } else {
                rect = null;
            }
            pVar.setClipBounds(rect);
        }
        Canvas canvasA = y1.c.a(oVar);
        if (canvasA.isHardwareAccelerated()) {
            this.f1269b.a(oVar, pVar, pVar.getDrawingTime());
            return;
        }
        Picture picture = this.f1275h;
        if (picture != null) {
            canvasA.drawPicture(picture);
        }
    }

    @Override // b2.e
    public final float w() {
        return this.f1292z;
    }

    @Override // b2.e
    public final void x(long j5) {
        long j10 = 9223372034707292159L & j5;
        p pVar = this.f1271d;
        if (j10 != 9205357640488583168L) {
            this.f1286t = false;
            pVar.setPivotX(Float.intBitsToFloat((int) (j5 >> 32)));
            pVar.setPivotY(Float.intBitsToFloat((int) (j5 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                pVar.resetPivot();
                return;
            }
            this.f1286t = true;
            pVar.setPivotX(((int) (this.f1279m >> 32)) / 2.0f);
            pVar.setPivotY(((int) (this.f1279m & 4294967295L)) / 2.0f);
        }
    }

    @Override // b2.e
    public final long y() {
        return this.f1290x;
    }

    @Override // b2.e
    public final void z(n3.c cVar, n3.o oVar, c cVar2, a aVar) {
        p pVar = this.f1271d;
        if (pVar.getParent() == null) {
            this.f1269b.addView(pVar);
        }
        pVar.f1300g = cVar;
        pVar.f1301h = oVar;
        pVar.f1302i = aVar;
        pVar.f1303j = cVar2;
        if (pVar.isAttachedToWindow()) {
            pVar.setVisibility(4);
            pVar.setVisibility(0);
            P();
            Picture picture = this.f1275h;
            if (picture != null) {
                long j5 = this.f1279m;
                Canvas canvasBeginRecording = picture.beginRecording((int) (j5 >> 32), (int) (j5 & 4294967295L));
                try {
                    y1.p pVar2 = this.f1277j;
                    if (pVar2 != null) {
                        y1.b bVar = pVar2.f14945a;
                        Canvas canvas = bVar.f14875a;
                        bVar.f14875a = canvasBeginRecording;
                        a2.c cVar3 = this.f1276i;
                        if (cVar3 != null) {
                            a2.b bVar2 = cVar3.f16b;
                            long jM0 = n3.n.M0(this.f1279m);
                            n3.c cVarC = bVar2.C();
                            n3.o oVarH = bVar2.H();
                            y1.o oVarZ = bVar2.z();
                            long J = bVar2.J();
                            c cVar4 = (c) bVar2.f13c;
                            bVar2.Z(cVar);
                            bVar2.a0(oVar);
                            bVar2.Y(bVar);
                            bVar2.b0(jM0);
                            bVar2.f13c = cVar2;
                            bVar.h();
                            try {
                                aVar.invoke(cVar3);
                                bVar.r();
                                bVar2.Z(cVarC);
                                bVar2.a0(oVarH);
                                bVar2.Y(oVarZ);
                                bVar2.b0(J);
                                bVar2.f13c = cVar4;
                            } catch (Throwable th) {
                                bVar.r();
                                a2.b bVar3 = cVar3.f16b;
                                bVar3.Z(cVarC);
                                bVar3.a0(oVarH);
                                bVar3.Y(oVarZ);
                                bVar3.b0(J);
                                bVar3.f13c = cVar4;
                                throw th;
                            }
                        }
                        bVar.f14875a = canvas;
                    }
                    picture.endRecording();
                } catch (Throwable th2) {
                    picture.endRecording();
                    throw th2;
                }
            }
        }
    }
}
