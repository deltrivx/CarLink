package g3;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import b3.g0;
import b3.o0;
import b3.q0;
import y1.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2.u f5833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2.b f5834b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f5842j;
    public o0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q f5843l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x1.c f5845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x1.c f5846o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5835c = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h9.k f5844m = b.f5825c;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f5847p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f5848q = y1.a0.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Matrix f5849r = new Matrix();

    public c(r2.u uVar, a2.b bVar) {
        this.f5833a = uVar;
        this.f5834b = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, t8.h] */
    public final void a() {
        int iE;
        int iE2;
        a2.b bVar = this.f5834b;
        ?? r8 = bVar.f13c;
        InputMethodManager inputMethodManager = (InputMethodManager) r8.getValue();
        View view = (View) bVar.f12b;
        if (inputMethodManager.isActive(view)) {
            h9.k kVar = this.f5844m;
            float[] fArr = this.f5848q;
            kVar.invoke(new y1.a0(fArr));
            this.f5833a.w(fArr);
            Matrix matrix = this.f5849r;
            h0.u(matrix, fArr);
            w wVar = this.f5842j;
            i9.l.b(wVar);
            long j5 = wVar.f5890b;
            q qVar = this.f5843l;
            i9.l.b(qVar);
            o0 o0Var = this.k;
            i9.l.b(o0Var);
            b3.p pVar = o0Var.f1409b;
            x1.c cVar = this.f5845n;
            i9.l.b(cVar);
            float f10 = cVar.f14526d;
            float f11 = cVar.f14524b;
            x1.c cVar2 = this.f5846o;
            i9.l.b(cVar2);
            boolean z10 = this.f5838f;
            boolean z11 = this.f5839g;
            boolean z12 = this.f5840h;
            boolean z13 = this.f5841i;
            CursorAnchorInfo.Builder builder = this.f5847p;
            builder.reset();
            builder.setMatrix(matrix);
            q0 q0Var = wVar.f5891c;
            int iF = q0.f(j5);
            builder.setSelectionRange(iF, q0.e(j5));
            m3.j jVar = m3.j.f8417b;
            if (z10 && iF >= 0) {
                int iB = qVar.b(iF);
                x1.c cVarC = o0Var.c(iB);
                float fL = n3.r.l(cVarC.f14523a, 0.0f, (int) (o0Var.f1410c >> 32));
                boolean zT = a.a.t(cVar, fL, cVarC.f14524b);
                boolean zT2 = a.a.t(cVar, fL, cVarC.f14526d);
                boolean z14 = o0Var.a(iB) == jVar;
                int i7 = (zT || zT2) ? 1 : 0;
                if (!zT || !zT2) {
                    i7 |= 2;
                }
                if (z14) {
                    i7 |= 4;
                }
                float f12 = cVarC.f14524b;
                float f13 = cVarC.f14526d;
                builder.setInsertionMarkerLocation(fL, f12, f13, f13, i7);
            }
            CursorAnchorInfo.Builder builder2 = builder;
            if (z11) {
                int iF2 = q0Var != null ? q0.f(q0Var.f1430a) : -1;
                int iE3 = q0Var != null ? q0.e(q0Var.f1430a) : -1;
                if (iF2 >= 0 && iF2 < iE3) {
                    builder2.setComposingText(iF2, wVar.f5889a.f1353b.subSequence(iF2, iE3));
                    int iB2 = qVar.b(iF2);
                    int iB3 = qVar.b(iE3);
                    float[] fArr2 = new float[(iB3 - iB2) * 4];
                    pVar.a(g0.b(iB2, iB3), fArr2);
                    while (iF2 < iE3) {
                        int iB4 = qVar.b(iF2);
                        int i10 = (iB4 - iB2) * 4;
                        float f14 = fArr2[i10];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f15 = fArr2[i10 + 1];
                        int i11 = iE3;
                        float f16 = fArr2[i10 + 2];
                        float f17 = fArr2[i10 + 3];
                        int i12 = iF2;
                        int i13 = (cVar.f14523a < f16 ? 1 : 0) & (f14 < cVar.f14525c ? 1 : 0) & (f11 < f17 ? 1 : 0) & (f15 < f10 ? 1 : 0);
                        if (!a.a.t(cVar, f14, f15) || !a.a.t(cVar, f16, f17)) {
                            i13 |= 2;
                        }
                        if (o0Var.a(iB4) == jVar) {
                            i13 |= 4;
                        }
                        builder3.addCharacterBounds(i12, f14, f15, f16, f17, i13);
                        builder2 = builder3;
                        iF2 = i12 + 1;
                        iE3 = i11;
                    }
                }
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33 && z12) {
                builder2.setEditorBoundsInfo(u0.f.b().setEditorBounds(h0.A(cVar2)).setHandwritingBounds(h0.A(cVar2)).build());
            }
            if (i14 >= 34 && z13 && !cVar.f() && (iE = pVar.e(f11)) <= (iE2 = pVar.e(f10))) {
                while (true) {
                    builder2.addVisibleLineBounds(o0Var.e(iE), pVar.f(iE), o0Var.f(iE), pVar.b(iE));
                    if (iE == iE2) {
                        break;
                    } else {
                        iE++;
                    }
                }
            }
            ((InputMethodManager) r8.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.f5837e = false;
        }
    }
}
