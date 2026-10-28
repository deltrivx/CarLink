package u0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import b3.g0;
import b3.o0;
import b3.q0;
import g3.w;
import n3.r;
import y1.a0;
import y1.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f12996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f12997b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f13005j;
    public o0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g3.q f13006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x1.c f13007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x1.c f13008n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12998c = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f13009o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f13010p = a0.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Matrix f13011q = new Matrix();

    public m(a aVar, k kVar) {
        this.f12996a = aVar;
        this.f12997b = kVar;
    }

    public final void a() {
        int iE;
        int iE2;
        k kVar = this.f12997b;
        InputMethodManager inputMethodManagerU0 = kVar.U0();
        View view = (View) kVar.f12990b;
        if (!inputMethodManagerU0.isActive(view) || this.f13005j == null || this.f13006l == null || this.k == null || this.f13007m == null || this.f13008n == null) {
            return;
        }
        float[] fArr = this.f13010p;
        a0.d(fArr);
        o2.w wVar = (o2.w) this.f12996a.f12966i.f12995r.getValue();
        if (wVar != null) {
            if (!wVar.isAttached()) {
                wVar = null;
            }
            if (wVar != null) {
                wVar.k(fArr);
            }
        }
        x1.c cVar = this.f13008n;
        i9.l.b(cVar);
        float f10 = -cVar.f14523a;
        x1.c cVar2 = this.f13008n;
        i9.l.b(cVar2);
        a0.f(fArr, f10, -cVar2.f14524b);
        Matrix matrix = this.f13011q;
        h0.u(matrix, fArr);
        w wVar2 = this.f13005j;
        i9.l.b(wVar2);
        long j5 = wVar2.f5890b;
        g3.q qVar = this.f13006l;
        i9.l.b(qVar);
        o0 o0Var = this.k;
        i9.l.b(o0Var);
        b3.p pVar = o0Var.f1409b;
        x1.c cVar3 = this.f13007m;
        i9.l.b(cVar3);
        float f11 = cVar3.f14526d;
        float f12 = cVar3.f14524b;
        x1.c cVar4 = this.f13008n;
        i9.l.b(cVar4);
        boolean z10 = this.f13001f;
        boolean z11 = this.f13002g;
        boolean z12 = this.f13003h;
        boolean z13 = this.f13004i;
        CursorAnchorInfo.Builder builder = this.f13009o;
        builder.reset();
        builder.setMatrix(matrix);
        q0 q0Var = wVar2.f5891c;
        int iF = q0.f(j5);
        builder.setSelectionRange(iF, q0.e(j5));
        m3.j jVar = m3.j.f8417b;
        if (z10 && iF >= 0) {
            int iB = qVar.b(iF);
            x1.c cVarC = o0Var.c(iB);
            float fL = r.l(cVarC.f14523a, 0.0f, (int) (o0Var.f1410c >> 32));
            boolean zP = r.p(cVar3, fL, cVarC.f14524b);
            boolean zP2 = r.p(cVar3, fL, cVarC.f14526d);
            boolean z14 = o0Var.a(iB) == jVar;
            int i7 = (zP || zP2) ? 1 : 0;
            if (!zP || !zP2) {
                i7 |= 2;
            }
            if (z14) {
                i7 |= 4;
            }
            float f13 = cVarC.f14524b;
            float f14 = cVarC.f14526d;
            builder.setInsertionMarkerLocation(fL, f13, f14, f14, i7);
        }
        CursorAnchorInfo.Builder builder2 = builder;
        if (z11) {
            int iF2 = q0Var != null ? q0.f(q0Var.f1430a) : -1;
            int iE3 = q0Var != null ? q0.e(q0Var.f1430a) : -1;
            if (iF2 >= 0 && iF2 < iE3) {
                builder2.setComposingText(iF2, wVar2.f5889a.f1353b.subSequence(iF2, iE3));
                int iB2 = qVar.b(iF2);
                int iB3 = qVar.b(iE3);
                float[] fArr2 = new float[(iB3 - iB2) * 4];
                pVar.a(g0.b(iB2, iB3), fArr2);
                while (iF2 < iE3) {
                    int iB4 = qVar.b(iF2);
                    int i10 = (iB4 - iB2) * 4;
                    float f15 = fArr2[i10];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f16 = fArr2[i10 + 1];
                    int i11 = iB2;
                    float f17 = fArr2[i10 + 2];
                    float f18 = fArr2[i10 + 3];
                    int i12 = iE3;
                    int i13 = (cVar3.f14523a < f17 ? 1 : 0) & (f15 < cVar3.f14525c ? 1 : 0) & (f12 < f18 ? 1 : 0) & (f16 < f11 ? 1 : 0);
                    if (!r.p(cVar3, f15, f16) || !r.p(cVar3, f17, f18)) {
                        i13 |= 2;
                    }
                    if (o0Var.a(iB4) == jVar) {
                        i13 |= 4;
                    }
                    int i14 = iF2;
                    builder3.addCharacterBounds(i14, f15, f16, f17, f18, i13);
                    builder2 = builder3;
                    iF2 = i14 + 1;
                    iB2 = i11;
                    iE3 = i12;
                }
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 33 && z12) {
            builder2.setEditorBoundsInfo(f.b().setEditorBounds(h0.A(cVar4)).setHandwritingBounds(h0.A(cVar4)).build());
        }
        if (i15 >= 34 && z13 && !cVar3.f() && (iE = pVar.e(f12)) <= (iE2 = pVar.e(f11))) {
            while (true) {
                builder2.addVisibleLineBounds(o0Var.e(iE), pVar.f(iE), o0Var.f(iE), pVar.b(iE));
                if (iE == iE2) {
                    break;
                } else {
                    iE++;
                }
            }
        }
        kVar.U0().updateCursorAnchorInfo(view, builder2.build());
        this.f13000e = false;
    }
}
