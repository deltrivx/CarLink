package x;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends q2.m implements q2.o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14359q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f14360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b0 f14361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f14362t;

    public f0(k2.m0 m0Var, h hVar, b0 b0Var) {
        this.f14360r = hVar;
        this.f14361s = b0Var;
        A0(m0Var);
    }

    public f0(k2.m0 m0Var, h hVar, b0 b0Var, d0.h0 h0Var) {
        this.f14360r = hVar;
        this.f14361s = b0Var;
        this.f14362t = h0Var;
        A0(m0Var);
    }

    public static boolean D0(float f10, EdgeEffect edgeEffect, Canvas canvas) {
        if (f10 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f10);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean E0(float f10, long j5, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f10);
        canvas.translate(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final /* synthetic */ void G0() {
    }

    private final /* synthetic */ void H0() {
    }

    public RenderNode F0() {
        RenderNode renderNode = (RenderNode) this.f14362t;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeD = q1.d();
        this.f14362t = renderNodeD;
        return renderNodeD;
    }

    @Override // q2.o
    public final /* synthetic */ void H() {
        int i7 = this.f14359q;
    }

    @Override // q2.o
    public final void x(q2.j0 j0Var) {
        boolean zE0;
        long j5;
        char c10;
        a2.b bVar;
        h hVar;
        boolean zD0;
        boolean z10;
        char c11;
        switch (this.f14359q) {
            case 0:
                d0.h0 h0Var = (d0.h0) this.f14362t;
                a2.c cVar = j0Var.f10720a;
                long J = cVar.f16b.J();
                h hVar2 = this.f14360r;
                hVar2.i(J);
                if (x1.e.e(cVar.f16b.J())) {
                    j0Var.b();
                    return;
                }
                j0Var.b();
                hVar2.f14374d.getValue();
                Canvas canvasA = y1.c.a(cVar.f16b.z());
                b0 b0Var = this.f14361s;
                if (b0.f(b0Var.f14319f)) {
                    zE0 = E0(270.0f, (((long) Float.floatToRawIntBits(j0Var.R(h0Var.a(j0Var.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (j0Var.g() & 4294967295L)))) << 32), b0Var.c(), canvasA);
                } else {
                    zE0 = false;
                }
                if (b0.f(b0Var.f14317d)) {
                    j5 = 4294967295L;
                    c10 = ' ';
                    zE0 = E0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(j0Var.R(h0Var.f3572b))) & 4294967295L), b0Var.e(), canvasA) || zE0;
                } else {
                    j5 = 4294967295L;
                    c10 = ' ';
                }
                if (b0.f(b0Var.f14320g)) {
                    zE0 = E0(90.0f, (((long) Float.floatToRawIntBits(j0Var.R(h0Var.b(j0Var.getLayoutDirection())) + (-((float) k9.a.M(Float.intBitsToFloat((int) (j0Var.g() >> c10))))))) & j5) | (((long) Float.floatToRawIntBits(0.0f)) << c10), b0Var.d(), canvasA) || zE0;
                }
                if (b0.f(b0Var.f14318e)) {
                    zE0 = E0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (j0Var.g() >> c10)))) << c10) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (j0Var.g() & j5))) + j0Var.R(h0Var.f3574d))) & j5), b0Var.b(), canvasA) || zE0;
                }
                if (zE0) {
                    hVar2.d();
                    return;
                }
                return;
            default:
                a2.c cVar2 = j0Var.f10720a;
                long J2 = cVar2.f16b.J();
                h hVar3 = this.f14360r;
                hVar3.i(J2);
                Canvas canvasA2 = y1.c.a(cVar2.f16b.z());
                hVar3.f14374d.getValue();
                a2.b bVar2 = cVar2.f16b;
                if (x1.e.e(bVar2.J())) {
                    j0Var.b();
                    return;
                }
                boolean zIsHardwareAccelerated = canvasA2.isHardwareAccelerated();
                b0 b0Var2 = this.f14361s;
                if (!zIsHardwareAccelerated) {
                    EdgeEffect edgeEffect = b0Var2.f14317d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = b0Var2.f14318e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = b0Var2.f14319f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = b0Var2.f14320g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = b0Var2.f14321h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = b0Var2.f14322i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = b0Var2.f14323j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = b0Var2.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    j0Var.b();
                    return;
                }
                float fR = j0Var.R(t.f14476a);
                boolean z11 = b0.f(b0Var2.f14317d) || b0.g(b0Var2.f14321h) || b0.f(b0Var2.f14318e) || b0.g(b0Var2.f14322i);
                boolean z12 = b0.f(b0Var2.f14319f) || b0.g(b0Var2.f14323j) || b0.f(b0Var2.f14320g) || b0.g(b0Var2.k);
                if (z11 && z12) {
                    F0().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else if (z11) {
                    F0().setPosition(0, 0, (k9.a.M(fR) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    if (!z12) {
                        j0Var.b();
                        return;
                    }
                    F0().setPosition(0, 0, canvasA2.getWidth(), (k9.a.M(fR) * 2) + canvasA2.getHeight());
                }
                RecordingCanvas recordingCanvasBeginRecording = F0().beginRecording();
                boolean zG = b0.g(b0Var2.f14323j);
                z.x0 x0Var = z.x0.f15592b;
                if (zG) {
                    EdgeEffect edgeEffectA = b0Var2.f14323j;
                    if (edgeEffectA == null) {
                        edgeEffectA = b0Var2.a(x0Var);
                        b0Var2.f14323j = edgeEffectA;
                    }
                    D0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (b0.f(b0Var2.f14319f)) {
                    EdgeEffect edgeEffectC = b0Var2.c();
                    zD0 = D0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (b0.g(b0Var2.f14319f)) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (hVar3.c() & 4294967295L));
                        EdgeEffect edgeEffectA2 = b0Var2.f14323j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = b0Var2.a(x0Var);
                            b0Var2.f14323j = edgeEffectA2;
                        }
                        bVar = bVar2;
                        int i7 = Build.VERSION.SDK_INT;
                        float fB = i7 >= 31 ? k.b(edgeEffectC) : 0.0f;
                        hVar = hVar3;
                        float f10 = 1 - fIntBitsToFloat;
                        if (i7 >= 31) {
                            k.c(edgeEffectA2, fB, f10);
                        } else {
                            edgeEffectA2.onPull(fB, f10);
                        }
                    } else {
                        bVar = bVar2;
                        hVar = hVar3;
                    }
                } else {
                    bVar = bVar2;
                    hVar = hVar3;
                    zD0 = false;
                }
                boolean zG2 = b0.g(b0Var2.f14321h);
                z.x0 x0Var2 = z.x0.f15591a;
                if (zG2) {
                    EdgeEffect edgeEffectA3 = b0Var2.f14321h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = b0Var2.a(x0Var2);
                        b0Var2.f14321h = edgeEffectA3;
                    }
                    D0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (b0.f(b0Var2.f14317d)) {
                    EdgeEffect edgeEffectE = b0Var2.e();
                    boolean z13 = D0(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zD0;
                    if (b0.g(b0Var2.f14317d)) {
                        z10 = z12;
                        c11 = ' ';
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (hVar.c() >> 32));
                        EdgeEffect edgeEffectA4 = b0Var2.f14321h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = b0Var2.a(x0Var2);
                            b0Var2.f14321h = edgeEffectA4;
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        float fB2 = i10 >= 31 ? k.b(edgeEffectE) : 0.0f;
                        if (i10 >= 31) {
                            k.c(edgeEffectA4, fB2, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fB2, fIntBitsToFloat2);
                        }
                    } else {
                        fR = fR;
                        z10 = z12;
                        c11 = ' ';
                    }
                    zD0 = z13;
                } else {
                    fR = fR;
                    z10 = z12;
                    c11 = ' ';
                }
                if (b0.g(b0Var2.k)) {
                    EdgeEffect edgeEffectA5 = b0Var2.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = b0Var2.a(x0Var);
                        b0Var2.k = edgeEffectA5;
                    }
                    D0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (b0.f(b0Var2.f14320g)) {
                    EdgeEffect edgeEffectD = b0Var2.d();
                    boolean z14 = D0(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zD0;
                    if (b0.g(b0Var2.f14320g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (hVar.c() & 4294967295L));
                        EdgeEffect edgeEffectA6 = b0Var2.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = b0Var2.a(x0Var);
                            b0Var2.k = edgeEffectA6;
                        }
                        int i11 = Build.VERSION.SDK_INT;
                        float fB3 = i11 >= 31 ? k.b(edgeEffectD) : 0.0f;
                        if (i11 >= 31) {
                            k.c(edgeEffectA6, fB3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fB3, fIntBitsToFloat3);
                        }
                    }
                    zD0 = z14;
                }
                if (b0.g(b0Var2.f14322i)) {
                    EdgeEffect edgeEffectA7 = b0Var2.f14322i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = b0Var2.a(x0Var2);
                        b0Var2.f14322i = edgeEffectA7;
                    }
                    D0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                }
                if (b0.f(b0Var2.f14318e)) {
                    EdgeEffect edgeEffectB = b0Var2.b();
                    boolean z15 = D0(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zD0;
                    if (b0.g(b0Var2.f14318e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (hVar.c() >> c11));
                        EdgeEffect edgeEffectA8 = b0Var2.f14322i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = b0Var2.a(x0Var2);
                            b0Var2.f14322i = edgeEffectA8;
                        }
                        int i12 = Build.VERSION.SDK_INT;
                        float fB4 = i12 >= 31 ? k.b(edgeEffectB) : 0.0f;
                        float f11 = 1 - fIntBitsToFloat4;
                        if (i12 >= 31) {
                            k.c(edgeEffectA8, fB4, f11);
                        } else {
                            edgeEffectA8.onPull(fB4, f11);
                        }
                    }
                    zD0 = z15;
                }
                if (zD0) {
                    hVar.d();
                }
                float f12 = z10 ? 0.0f : fR;
                float f13 = z11 ? 0.0f : fR;
                n3.o layoutDirection = j0Var.getLayoutDirection();
                y1.b bVar3 = new y1.b();
                bVar3.f14875a = recordingCanvasBeginRecording;
                long J3 = bVar.J();
                n3.c cVarC = cVar2.f16b.C();
                n3.o oVarH = cVar2.f16b.H();
                y1.o oVarZ = cVar2.f16b.z();
                long J4 = cVar2.f16b.J();
                a2.b bVar4 = cVar2.f16b;
                b2.c cVar3 = (b2.c) bVar4.f13c;
                bVar4.Z(j0Var);
                bVar4.a0(layoutDirection);
                bVar4.Y(bVar3);
                bVar4.b0(J3);
                bVar4.f13c = null;
                bVar3.h();
                try {
                    ((a2.d) cVar2.f16b.f12b).B(f12, f13);
                    try {
                        j0Var.b();
                        float f14 = -f12;
                        float f15 = -f13;
                        ((a2.d) cVar2.f16b.f12b).B(f14, f15);
                        bVar3.r();
                        a2.b bVar5 = cVar2.f16b;
                        bVar5.Z(cVarC);
                        bVar5.a0(oVarH);
                        bVar5.Y(oVarZ);
                        bVar5.b0(J4);
                        bVar5.f13c = cVar3;
                        F0().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f14, f15);
                        canvasA2.drawRenderNode(F0());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        ((a2.d) cVar2.f16b.f12b).B(-f12, -f13);
                        throw th;
                    }
                } catch (Throwable th2) {
                    bVar3.r();
                    a2.b bVar6 = cVar2.f16b;
                    bVar6.Z(cVarC);
                    bVar6.a0(oVarH);
                    bVar6.Y(oVarZ);
                    bVar6.b0(J4);
                    bVar6.f13c = cVar3;
                    throw th2;
                }
        }
    }
}
