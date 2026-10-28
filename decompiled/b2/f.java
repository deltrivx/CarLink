package b2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;
import r2.u;
import y1.h0;
import y1.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final AtomicBoolean f1228x = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1.p f1229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.c f1230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f1231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f1233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Matrix f1234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f1236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1237j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1239m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f1240n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f1241o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f1242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f1243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f1244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f1245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f1246t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1247u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1248v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1249w;

    public f(u uVar, y1.p pVar, a2.c cVar) {
        this.f1229b = pVar;
        this.f1230c = cVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", uVar);
        this.f1231d = renderNodeCreate;
        this.f1232e = 0L;
        this.f1236i = 0L;
        if (f1228x.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                n.c(renderNodeCreate, n.a(renderNodeCreate));
                n.d(renderNodeCreate, n.b(renderNodeCreate));
            }
            if (i7 >= 24) {
                m.a(renderNodeCreate);
            } else {
                l.a(renderNodeCreate);
            }
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        P(0);
        this.f1237j = 0;
        this.k = 3;
        this.f1238l = 1.0f;
        this.f1240n = 1.0f;
        this.f1241o = 1.0f;
        long j5 = q.f14948b;
        this.f1243q = j5;
        this.f1244r = j5;
        this.f1246t = 8.0f;
    }

    @Override // b2.e
    public final float A() {
        return 0.0f;
    }

    @Override // b2.e
    public final long B() {
        return this.f1244r;
    }

    @Override // b2.e
    public final void C(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1243q = j5;
            n.c(this.f1231d, h0.C(j5));
        }
    }

    @Override // b2.e
    public final float D() {
        return this.f1246t;
    }

    @Override // b2.e
    public final float E() {
        return 0.0f;
    }

    @Override // b2.e
    public final void F(boolean z10) {
        this.f1247u = z10;
        O();
    }

    @Override // b2.e
    public final float G() {
        return 0.0f;
    }

    @Override // b2.e
    public final void H(int i7) {
        this.f1237j = i7;
        Q();
    }

    @Override // b2.e
    public final void I(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1244r = j5;
            n.d(this.f1231d, h0.C(j5));
        }
    }

    @Override // b2.e
    public final Matrix J() {
        Matrix matrix = this.f1234g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f1234g = matrix;
        }
        this.f1231d.getMatrix(matrix);
        return matrix;
    }

    @Override // b2.e
    public final /* synthetic */ boolean K() {
        return false;
    }

    @Override // b2.e
    public final float L() {
        return this.f1242p;
    }

    @Override // b2.e
    public final float M() {
        return this.f1241o;
    }

    @Override // b2.e
    public final int N() {
        return this.k;
    }

    public final void O() {
        boolean z10 = this.f1247u;
        boolean z11 = false;
        boolean z12 = z10 && !this.f1235h;
        if (z10 && this.f1235h) {
            z11 = true;
        }
        if (z12 != this.f1248v) {
            this.f1248v = z12;
            this.f1231d.setClipToBounds(z12);
        }
        if (z11 != this.f1249w) {
            this.f1249w = z11;
            this.f1231d.setClipToOutline(z11);
        }
    }

    public final void P(int i7) {
        RenderNode renderNode = this.f1231d;
        if (i7 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f1233f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i7 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f1233f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f1233f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i7 = this.f1237j;
        if (i7 != 1 && this.k == 3) {
            P(i7);
        } else {
            P(1);
        }
    }

    @Override // b2.e
    public final float a() {
        return this.f1238l;
    }

    @Override // b2.e
    public final void b(float f10) {
        this.f1245s = f10;
        this.f1231d.setRotation(f10);
    }

    @Override // b2.e
    public final void c(int i7) {
        if (this.k == i7) {
            return;
        }
        this.k = i7;
        Paint paint = this.f1233f;
        if (paint == null) {
            paint = new Paint();
            this.f1233f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(h0.G(i7)));
        Q();
    }

    @Override // b2.e
    public final void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            m.a(this.f1231d);
        } else {
            l.a(this.f1231d);
        }
    }

    @Override // b2.e
    public final void e(float f10) {
        this.f1241o = f10;
        this.f1231d.setScaleY(f10);
    }

    @Override // b2.e
    public final boolean f() {
        return this.f1231d.isValid();
    }

    @Override // b2.e
    public final void g() {
        this.f1231d.setRotationX(0.0f);
    }

    @Override // b2.e
    public final void h(float f10) {
        this.f1238l = f10;
        this.f1231d.setAlpha(f10);
    }

    @Override // b2.e
    public final void i() {
        this.f1231d.setTranslationY(0.0f);
    }

    @Override // b2.e
    public final void j() {
        this.f1231d.setRotationY(0.0f);
    }

    @Override // b2.e
    public final void k() {
        Q();
    }

    @Override // b2.e
    public final void l(float f10) {
        this.f1240n = f10;
        this.f1231d.setScaleX(f10);
    }

    @Override // b2.e
    public final void m() {
        this.f1231d.setTranslationX(0.0f);
    }

    @Override // b2.e
    public final void n(float f10) {
        this.f1246t = f10;
        this.f1231d.setCameraDistance(-f10);
    }

    @Override // b2.e
    public final float o() {
        return this.f1240n;
    }

    @Override // b2.e
    public final void p(float f10) {
        this.f1242p = f10;
        this.f1231d.setElevation(f10);
    }

    @Override // b2.e
    public final void q(Outline outline, long j5) {
        this.f1236i = j5;
        this.f1231d.setOutline(outline);
        this.f1235h = outline != null;
        O();
    }

    @Override // b2.e
    public final int r() {
        return this.f1237j;
    }

    @Override // b2.e
    public final y1.k s() {
        return null;
    }

    @Override // b2.e
    public final void t(int i7, int i10, long j5) {
        int i11 = (int) (j5 >> 32);
        int i12 = (int) (4294967295L & j5);
        this.f1231d.setLeftTopRightBottom(i7, i10, i7 + i11, i10 + i12);
        if (n3.m.a(this.f1232e, j5)) {
            return;
        }
        if (this.f1239m) {
            this.f1231d.setPivotX(i11 / 2.0f);
            this.f1231d.setPivotY(i12 / 2.0f);
        }
        this.f1232e = j5;
    }

    @Override // b2.e
    public final float u() {
        return 0.0f;
    }

    @Override // b2.e
    public final void v(y1.o oVar) {
        DisplayListCanvas displayListCanvasA = y1.c.a(oVar);
        i9.l.c(displayListCanvasA, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasA.drawRenderNode(this.f1231d);
    }

    @Override // b2.e
    public final float w() {
        return this.f1245s;
    }

    @Override // b2.e
    public final void x(long j5) {
        if ((9223372034707292159L & j5) == 9205357640488583168L) {
            this.f1239m = true;
            this.f1231d.setPivotX(((int) (this.f1232e >> 32)) / 2.0f);
            this.f1231d.setPivotY(((int) (this.f1232e & 4294967295L)) / 2.0f);
        } else {
            this.f1239m = false;
            this.f1231d.setPivotX(Float.intBitsToFloat((int) (j5 >> 32)));
            this.f1231d.setPivotY(Float.intBitsToFloat((int) (j5 & 4294967295L)));
        }
    }

    @Override // b2.e
    public final long y() {
        return this.f1243q;
    }

    @Override // b2.e
    public final void z(n3.c cVar, n3.o oVar, c cVar2, a aVar) {
        Canvas canvasStart = this.f1231d.start(Math.max((int) (this.f1232e >> 32), (int) (this.f1236i >> 32)), Math.max((int) (this.f1232e & 4294967295L), (int) (4294967295L & this.f1236i)));
        try {
            y1.b bVar = this.f1229b.f14945a;
            Canvas canvas = bVar.f14875a;
            bVar.f14875a = canvasStart;
            a2.c cVar3 = this.f1230c;
            a2.b bVar2 = cVar3.f16b;
            long jM0 = n3.n.M0(this.f1232e);
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
                bVar.f14875a = canvas;
                this.f1231d.end(canvasStart);
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
        } catch (Throwable th2) {
            this.f1231d.end(canvasStart);
            throw th2;
        }
    }
}
