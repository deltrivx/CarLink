package b2;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends View {
    public static final o k = new o(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2.a f1294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1.p f1295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.c f1296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Outline f1298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n3.c f1300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n3.o f1301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h9.k f1302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f1303j;

    public p(c2.a aVar, y1.p pVar, a2.c cVar) {
        super(aVar.getContext());
        this.f1294a = aVar;
        this.f1295b = pVar;
        this.f1296c = cVar;
        setOutlineProvider(k);
        this.f1299f = true;
        this.f1300g = a2.e.f21a;
        this.f1301h = n3.o.f8749a;
        e.f1227a.getClass();
        this.f1302i = b.f1195c;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        y1.p pVar = this.f1295b;
        y1.b bVar = pVar.f14945a;
        Canvas canvas2 = bVar.f14875a;
        bVar.f14875a = canvas;
        n3.c cVar = this.f1300g;
        n3.o oVar = this.f1301h;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        c cVar2 = this.f1303j;
        h9.k kVar = this.f1302i;
        a2.c cVar3 = this.f1296c;
        n3.c cVarC = cVar3.W().C();
        n3.o oVarH = cVar3.W().H();
        y1.o oVarZ = cVar3.W().z();
        long J = cVar3.W().J();
        c cVar4 = (c) cVar3.W().f13c;
        a2.b bVarW = cVar3.W();
        bVarW.Z(cVar);
        bVarW.a0(oVar);
        bVarW.Y(bVar);
        bVarW.b0(jFloatToRawIntBits);
        bVarW.f13c = cVar2;
        bVar.h();
        try {
            kVar.invoke(cVar3);
            bVar.r();
            a2.b bVarW2 = cVar3.W();
            bVarW2.Z(cVarC);
            bVarW2.a0(oVarH);
            bVarW2.Y(oVarZ);
            bVarW2.b0(J);
            bVarW2.f13c = cVar4;
            pVar.f14945a.f14875a = canvas2;
            this.f1297d = false;
        } catch (Throwable th) {
            bVar.r();
            a2.b bVarW3 = cVar3.W();
            bVarW3.Z(cVarC);
            bVarW3.a0(oVarH);
            bVarW3.Y(oVarZ);
            bVarW3.b0(J);
            bVarW3.f13c = cVar4;
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f1299f;
    }

    public final y1.p getCanvasHolder() {
        return this.f1295b;
    }

    public final View getOwnerView() {
        return this.f1294a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f1299f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f1297d) {
            return;
        }
        this.f1297d = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z10) {
        if (this.f1299f != z10) {
            this.f1299f = z10;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z10) {
        this.f1297d = z10;
    }
}
