package r2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements l1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f11222i = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f11223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f7.q f11224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11230h;

    public f2(u uVar) {
        RenderNode renderNodeCreate = RenderNode.create("Compose", uVar);
        this.f11223a = renderNodeCreate;
        if (f11222i) {
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
                k2.c(renderNodeCreate, k2.a(renderNodeCreate));
                k2.d(renderNodeCreate, k2.b(renderNodeCreate));
            }
            if (i7 >= 24) {
                j2.a(renderNodeCreate);
            } else {
                i2.a(renderNodeCreate);
            }
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f11222i = false;
        }
        this.f11230h = 3;
    }

    @Override // r2.l1
    public final boolean A() {
        return this.f11223a.setHasOverlappingRendering(true);
    }

    @Override // r2.l1
    public final void B(y1.p pVar, y1.e0 e0Var, b2.a aVar) {
        Canvas canvasStart = this.f11223a.start(getWidth(), getHeight());
        y1.b bVar = pVar.f14945a;
        Canvas canvas = bVar.f14875a;
        bVar.f14875a = canvasStart;
        if (e0Var != null) {
            bVar.h();
            bVar.j(e0Var);
        }
        aVar.invoke(bVar);
        if (e0Var != null) {
            bVar.r();
        }
        pVar.f14945a.f14875a = canvas;
        this.f11223a.end(canvasStart);
    }

    @Override // r2.l1
    public final boolean C() {
        return this.f11229g;
    }

    @Override // r2.l1
    public final int D() {
        return this.f11226d;
    }

    @Override // r2.l1
    public final void E() {
        N();
    }

    @Override // r2.l1
    public final void F(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            k2.c(this.f11223a, i7);
        }
    }

    @Override // r2.l1
    public final int G() {
        return this.f11227e;
    }

    @Override // r2.l1
    public final boolean H() {
        return this.f11223a.getClipToOutline();
    }

    @Override // r2.l1
    public final void I(boolean z10) {
        this.f11223a.setClipToOutline(z10);
    }

    @Override // r2.l1
    public final void J(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            k2.d(this.f11223a, i7);
        }
    }

    @Override // r2.l1
    public final void K(Matrix matrix) {
        this.f11223a.getMatrix(matrix);
    }

    @Override // r2.l1
    public final float L() {
        return this.f11223a.getElevation();
    }

    public final void M(RenderNode renderNode, int i7) {
        if (i7 == 1) {
            renderNode.setLayerType(2);
            f7.q qVar = this.f11224b;
            renderNode.setLayerPaint(qVar != null ? (Paint) qVar.f5447c : null);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        if (i7 == 2) {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void N() {
        if (this.f11230h == 3) {
            M(this.f11223a, 0);
        } else {
            M(this.f11223a, 1);
        }
    }

    @Override // r2.l1
    public final float a() {
        return this.f11223a.getAlpha();
    }

    @Override // r2.l1
    public final void b(float f10) {
        this.f11223a.setRotation(f10);
    }

    @Override // r2.l1
    public final void c(int i7) {
        this.f11230h = i7;
        f7.q qVarH = this.f11224b;
        if (qVarH == null) {
            qVarH = y1.h0.h();
            this.f11224b = qVarH;
        }
        qVarH.j(i7);
        N();
    }

    @Override // r2.l1
    public final void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            j2.a(this.f11223a);
        } else {
            i2.a(this.f11223a);
        }
    }

    @Override // r2.l1
    public final void e(float f10) {
        this.f11223a.setScaleY(f10);
    }

    @Override // r2.l1
    public final boolean f() {
        return this.f11223a.isValid();
    }

    @Override // r2.l1
    public final void g() {
        this.f11223a.setRotationX(0.0f);
    }

    @Override // r2.l1
    public final int getHeight() {
        return this.f11228f - this.f11226d;
    }

    @Override // r2.l1
    public final int getWidth() {
        return this.f11227e - this.f11225c;
    }

    @Override // r2.l1
    public final void h(float f10) {
        this.f11223a.setAlpha(f10);
    }

    @Override // r2.l1
    public final void i() {
        this.f11223a.setTranslationY(0.0f);
    }

    @Override // r2.l1
    public final void j() {
        this.f11223a.setRotationY(0.0f);
    }

    @Override // r2.l1
    public final void k() {
        f7.q qVarH = this.f11224b;
        if (qVarH == null) {
            qVarH = y1.h0.h();
            this.f11224b = qVarH;
        }
        qVarH.l(null);
        N();
    }

    @Override // r2.l1
    public final void l(float f10) {
        this.f11223a.setScaleX(f10);
    }

    @Override // r2.l1
    public final void m() {
        this.f11223a.setTranslationX(0.0f);
    }

    @Override // r2.l1
    public final void n(float f10) {
        this.f11223a.setCameraDistance(-f10);
    }

    @Override // r2.l1
    public final void o(int i7) {
        this.f11225c += i7;
        this.f11227e += i7;
        this.f11223a.offsetLeftAndRight(i7);
    }

    @Override // r2.l1
    public final int p() {
        return this.f11228f;
    }

    @Override // r2.l1
    public final void q() {
    }

    @Override // r2.l1
    public final void r(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f11223a);
    }

    @Override // r2.l1
    public final int s() {
        return this.f11225c;
    }

    @Override // r2.l1
    public final void t(float f10) {
        this.f11223a.setPivotX(f10);
    }

    @Override // r2.l1
    public final void u(boolean z10) {
        this.f11229g = z10;
        this.f11223a.setClipToBounds(z10);
    }

    @Override // r2.l1
    public final boolean v(int i7, int i10, int i11, int i12) {
        this.f11225c = i7;
        this.f11226d = i10;
        this.f11227e = i11;
        this.f11228f = i12;
        return this.f11223a.setLeftTopRightBottom(i7, i10, i11, i12);
    }

    @Override // r2.l1
    public final void w(float f10) {
        this.f11223a.setPivotY(f10);
    }

    @Override // r2.l1
    public final void x(float f10) {
        this.f11223a.setElevation(f10);
    }

    @Override // r2.l1
    public final void y(int i7) {
        this.f11226d += i7;
        this.f11228f += i7;
        this.f11223a.offsetTopAndBottom(i7);
    }

    @Override // r2.l1
    public final void z(Outline outline) {
        this.f11223a.setOutline(outline);
    }
}
