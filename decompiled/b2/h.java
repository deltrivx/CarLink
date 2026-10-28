package b2;

import a8.v1;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import y1.h0;
import y1.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1.p f1250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.c f1251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f1252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f1254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Matrix f1255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f1257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1258j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f1260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f1261n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1262o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f1263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f1264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1266s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1267t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1268u;

    public h() {
        y1.p pVar = new y1.p();
        a2.c cVar = new a2.c();
        this.f1250b = pVar;
        this.f1251c = cVar;
        RenderNode renderNodeA = v1.a();
        this.f1252d = renderNodeA;
        this.f1253e = 0L;
        renderNodeA.setClipToBounds(false);
        P(renderNodeA, 0);
        this.f1257i = 1.0f;
        this.f1258j = 3;
        this.k = 1.0f;
        this.f1259l = 1.0f;
        long j5 = q.f14948b;
        this.f1261n = j5;
        this.f1262o = j5;
        this.f1264q = 8.0f;
        this.f1268u = 0;
    }

    @Override // b2.e
    public final float A() {
        return 0.0f;
    }

    @Override // b2.e
    public final long B() {
        return this.f1262o;
    }

    @Override // b2.e
    public final void C(long j5) {
        this.f1261n = j5;
        this.f1252d.setAmbientShadowColor(h0.C(j5));
    }

    @Override // b2.e
    public final float D() {
        return this.f1264q;
    }

    @Override // b2.e
    public final float E() {
        return 0.0f;
    }

    @Override // b2.e
    public final void F(boolean z10) {
        this.f1265r = z10;
        O();
    }

    @Override // b2.e
    public final float G() {
        return 0.0f;
    }

    @Override // b2.e
    public final void H(int i7) {
        this.f1268u = i7;
        Q();
    }

    @Override // b2.e
    public final void I(long j5) {
        this.f1262o = j5;
        this.f1252d.setSpotShadowColor(h0.C(j5));
    }

    @Override // b2.e
    public final Matrix J() {
        Matrix matrix = this.f1255g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f1255g = matrix;
        }
        this.f1252d.getMatrix(matrix);
        return matrix;
    }

    @Override // b2.e
    public final /* synthetic */ boolean K() {
        return false;
    }

    @Override // b2.e
    public final float L() {
        return this.f1260m;
    }

    @Override // b2.e
    public final float M() {
        return this.f1259l;
    }

    @Override // b2.e
    public final int N() {
        return this.f1258j;
    }

    public final void O() {
        boolean z10 = this.f1265r;
        boolean z11 = false;
        boolean z12 = z10 && !this.f1256h;
        if (z10 && this.f1256h) {
            z11 = true;
        }
        if (z12 != this.f1266s) {
            this.f1266s = z12;
            this.f1252d.setClipToBounds(z12);
        }
        if (z11 != this.f1267t) {
            this.f1267t = z11;
            this.f1252d.setClipToOutline(z11);
        }
    }

    public final void P(RenderNode renderNode, int i7) {
        if (i7 == 1) {
            renderNode.setUseCompositingLayer(true, this.f1254f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i7 == 2) {
            renderNode.setUseCompositingLayer(false, this.f1254f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f1254f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i7 = this.f1268u;
        if (i7 != 1 && this.f1258j == 3) {
            P(this.f1252d, i7);
        } else {
            P(this.f1252d, 1);
        }
    }

    @Override // b2.e
    public final float a() {
        return this.f1257i;
    }

    @Override // b2.e
    public final void b(float f10) {
        this.f1263p = f10;
        this.f1252d.setRotationZ(f10);
    }

    @Override // b2.e
    public final void c(int i7) {
        this.f1258j = i7;
        Paint paint = this.f1254f;
        if (paint == null) {
            paint = new Paint();
            this.f1254f = paint;
        }
        paint.setBlendMode(h0.x(i7));
        Q();
    }

    @Override // b2.e
    public final void d() {
        this.f1252d.discardDisplayList();
    }

    @Override // b2.e
    public final void e(float f10) {
        this.f1259l = f10;
        this.f1252d.setScaleY(f10);
    }

    @Override // b2.e
    public final boolean f() {
        return this.f1252d.hasDisplayList();
    }

    @Override // b2.e
    public final void g() {
        this.f1252d.setRotationX(0.0f);
    }

    @Override // b2.e
    public final void h(float f10) {
        this.f1257i = f10;
        this.f1252d.setAlpha(f10);
    }

    @Override // b2.e
    public final void i() {
        this.f1252d.setTranslationY(0.0f);
    }

    @Override // b2.e
    public final void j() {
        this.f1252d.setRotationY(0.0f);
    }

    @Override // b2.e
    public final void k() {
        Paint paint = this.f1254f;
        if (paint == null) {
            paint = new Paint();
            this.f1254f = paint;
        }
        paint.setColorFilter(null);
        Q();
    }

    @Override // b2.e
    public final void l(float f10) {
        this.k = f10;
        this.f1252d.setScaleX(f10);
    }

    @Override // b2.e
    public final void m() {
        this.f1252d.setTranslationX(0.0f);
    }

    @Override // b2.e
    public final void n(float f10) {
        this.f1264q = f10;
        this.f1252d.setCameraDistance(f10);
    }

    @Override // b2.e
    public final float o() {
        return this.k;
    }

    @Override // b2.e
    public final void p(float f10) {
        this.f1260m = f10;
        this.f1252d.setElevation(f10);
    }

    @Override // b2.e
    public final void q(Outline outline, long j5) {
        this.f1252d.setOutline(outline);
        this.f1256h = outline != null;
        O();
    }

    @Override // b2.e
    public final int r() {
        return this.f1268u;
    }

    @Override // b2.e
    public final y1.k s() {
        return null;
    }

    @Override // b2.e
    public final void t(int i7, int i10, long j5) {
        this.f1252d.setPosition(i7, i10, ((int) (j5 >> 32)) + i7, ((int) (4294967295L & j5)) + i10);
        this.f1253e = n3.n.M0(j5);
    }

    @Override // b2.e
    public final float u() {
        return 0.0f;
    }

    @Override // b2.e
    public final void v(y1.o oVar) {
        y1.c.a(oVar).drawRenderNode(this.f1252d);
    }

    @Override // b2.e
    public final float w() {
        return this.f1263p;
    }

    @Override // b2.e
    public final void x(long j5) {
        if ((9223372034707292159L & j5) == 9205357640488583168L) {
            this.f1252d.resetPivot();
        } else {
            this.f1252d.setPivotX(Float.intBitsToFloat((int) (j5 >> 32)));
            this.f1252d.setPivotY(Float.intBitsToFloat((int) (j5 & 4294967295L)));
        }
    }

    @Override // b2.e
    public final long y() {
        return this.f1261n;
    }

    @Override // b2.e
    public final void z(n3.c cVar, n3.o oVar, c cVar2, a aVar) {
        a2.c cVar3 = this.f1251c;
        RecordingCanvas recordingCanvasBeginRecording = this.f1252d.beginRecording();
        try {
            y1.p pVar = this.f1250b;
            y1.b bVar = pVar.f14945a;
            Canvas canvas = bVar.f14875a;
            bVar.f14875a = recordingCanvasBeginRecording;
            a2.b bVar2 = cVar3.f16b;
            bVar2.Z(cVar);
            bVar2.a0(oVar);
            bVar2.f13c = cVar2;
            bVar2.b0(this.f1253e);
            bVar2.Y(bVar);
            aVar.invoke(cVar3);
            pVar.f14945a.f14875a = canvas;
        } finally {
            this.f1252d.endRecording();
        }
    }
}
