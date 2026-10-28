package r2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g2 implements l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f7.q f11240b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f11239a = f4.c.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11241c = 3;

    @Override // r2.l1
    public final boolean A() {
        return this.f11239a.setHasOverlappingRendering(true);
    }

    @Override // r2.l1
    public final void B(y1.p pVar, y1.e0 e0Var, b2.a aVar) {
        RecordingCanvas recordingCanvasBeginRecording = this.f11239a.beginRecording();
        y1.b bVar = pVar.f14945a;
        Canvas canvas = bVar.f14875a;
        bVar.f14875a = recordingCanvasBeginRecording;
        if (e0Var != null) {
            bVar.h();
            bVar.j(e0Var);
        }
        aVar.invoke(bVar);
        if (e0Var != null) {
            bVar.r();
        }
        pVar.f14945a.f14875a = canvas;
        this.f11239a.endRecording();
    }

    @Override // r2.l1
    public final boolean C() {
        return this.f11239a.getClipToBounds();
    }

    @Override // r2.l1
    public final int D() {
        return this.f11239a.getTop();
    }

    @Override // r2.l1
    public final void E() {
        N();
    }

    @Override // r2.l1
    public final void F(int i7) {
        this.f11239a.setAmbientShadowColor(i7);
    }

    @Override // r2.l1
    public final int G() {
        return this.f11239a.getRight();
    }

    @Override // r2.l1
    public final boolean H() {
        return this.f11239a.getClipToOutline();
    }

    @Override // r2.l1
    public final void I(boolean z10) {
        this.f11239a.setClipToOutline(z10);
    }

    @Override // r2.l1
    public final void J(int i7) {
        this.f11239a.setSpotShadowColor(i7);
    }

    @Override // r2.l1
    public final void K(Matrix matrix) {
        this.f11239a.getMatrix(matrix);
    }

    @Override // r2.l1
    public final float L() {
        return this.f11239a.getElevation();
    }

    public final void M(RenderNode renderNode, int i7) {
        if (i7 == 1) {
            f7.q qVar = this.f11240b;
            renderNode.setUseCompositingLayer(true, qVar != null ? (Paint) qVar.f5447c : null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i7 == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void N() {
        if (this.f11241c == 3) {
            M(this.f11239a, 0);
        } else {
            M(this.f11239a, 1);
        }
    }

    @Override // r2.l1
    public final float a() {
        return this.f11239a.getAlpha();
    }

    @Override // r2.l1
    public final void b(float f10) {
        this.f11239a.setRotationZ(f10);
    }

    @Override // r2.l1
    public final void c(int i7) {
        this.f11241c = i7;
        f7.q qVarH = this.f11240b;
        if (qVarH == null) {
            qVarH = y1.h0.h();
            this.f11240b = qVarH;
        }
        qVarH.j(i7);
        N();
    }

    @Override // r2.l1
    public final void d() {
        this.f11239a.discardDisplayList();
    }

    @Override // r2.l1
    public final void e(float f10) {
        this.f11239a.setScaleY(f10);
    }

    @Override // r2.l1
    public final boolean f() {
        return this.f11239a.hasDisplayList();
    }

    @Override // r2.l1
    public final void g() {
        this.f11239a.setRotationX(0.0f);
    }

    @Override // r2.l1
    public final int getHeight() {
        return this.f11239a.getHeight();
    }

    @Override // r2.l1
    public final int getWidth() {
        return this.f11239a.getWidth();
    }

    @Override // r2.l1
    public final void h(float f10) {
        this.f11239a.setAlpha(f10);
    }

    @Override // r2.l1
    public final void i() {
        this.f11239a.setTranslationY(0.0f);
    }

    @Override // r2.l1
    public final void j() {
        this.f11239a.setRotationY(0.0f);
    }

    @Override // r2.l1
    public final void k() {
        f7.q qVarH = this.f11240b;
        if (qVarH == null) {
            qVarH = y1.h0.h();
            this.f11240b = qVarH;
        }
        qVarH.l(null);
        N();
    }

    @Override // r2.l1
    public final void l(float f10) {
        this.f11239a.setScaleX(f10);
    }

    @Override // r2.l1
    public final void m() {
        this.f11239a.setTranslationX(0.0f);
    }

    @Override // r2.l1
    public final void n(float f10) {
        this.f11239a.setCameraDistance(f10);
    }

    @Override // r2.l1
    public final void o(int i7) {
        this.f11239a.offsetLeftAndRight(i7);
    }

    @Override // r2.l1
    public final int p() {
        return this.f11239a.getBottom();
    }

    @Override // r2.l1
    public final void q() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f11239a.setRenderEffect(null);
        }
    }

    @Override // r2.l1
    public final void r(Canvas canvas) {
        canvas.drawRenderNode(this.f11239a);
    }

    @Override // r2.l1
    public final int s() {
        return this.f11239a.getLeft();
    }

    @Override // r2.l1
    public final void t(float f10) {
        this.f11239a.setPivotX(f10);
    }

    @Override // r2.l1
    public final void u(boolean z10) {
        this.f11239a.setClipToBounds(z10);
    }

    @Override // r2.l1
    public final boolean v(int i7, int i10, int i11, int i12) {
        return this.f11239a.setPosition(i7, i10, i11, i12);
    }

    @Override // r2.l1
    public final void w(float f10) {
        this.f11239a.setPivotY(f10);
    }

    @Override // r2.l1
    public final void x(float f10) {
        this.f11239a.setElevation(f10);
    }

    @Override // r2.l1
    public final void y(int i7) {
        this.f11239a.offsetTopAndBottom(i7);
    }

    @Override // r2.l1
    public final void z(Outline outline) {
        this.f11239a.setOutline(outline);
    }
}
