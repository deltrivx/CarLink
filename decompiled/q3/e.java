package q3;

import android.graphics.Canvas;
import i9.x;
import l0.o0;
import q2.c2;
import q2.d2;
import q2.h0;
import q2.q1;
import r2.u;
import t8.z;
import w1.s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10882a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(x xVar, u1.d dVar, o0 o0Var) {
        super(1);
        this.f10883b = xVar;
        this.f10884c = dVar;
        this.f10885d = o0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, h0 h0Var, q qVar2) {
        super(1);
        this.f10883b = qVar;
        this.f10885d = h0Var;
        this.f10884c = qVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(s sVar, w1.j jVar, h9.k kVar) {
        super(1);
        this.f10883b = sVar;
        this.f10884c = jVar;
        this.f10885d = (i9.n) kVar;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [h9.k, i9.n] */
    @Override // h9.k
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        switch (this.f10882a) {
            case 0:
                q qVar = (q) this.f10883b;
                h0 h0Var = (h0) this.f10885d;
                q qVar2 = (q) this.f10884c;
                y1.o oVarZ = ((a2.g) obj).W().z();
                if (qVar.getView().getVisibility() != 8) {
                    qVar.f10918x = true;
                    q1 q1Var = h0Var.f10678m;
                    u uVar = q1Var instanceof u ? (u) q1Var : null;
                    if (uVar != null) {
                        Canvas canvasA = y1.c.a(oVarZ);
                        uVar.getAndroidViewsHandler$ui_release().getClass();
                        qVar2.draw(canvasA);
                    }
                    qVar.f10918x = false;
                }
                return z.f12851a;
            case 1:
                d2 d2Var = (d2) obj;
                u1.d dVar = (u1.d) d2Var;
                if (!((u1.a) ((u) q2.f.w((u1.d) this.f10884c)).m30getDragAndDropManager()).f13037b.contains(dVar) || !n4.h.i(dVar, n3.l.B((o0) this.f10885d))) {
                    return c2.f10601a;
                }
                ((x) this.f10883b).f6688a = d2Var;
                return c2.f10603c;
            default:
                s sVar = (s) obj;
                if (i9.l.a(sVar, (s) this.f10883b)) {
                    zBooleanValue = false;
                } else {
                    if (i9.l.a(sVar, ((w1.j) this.f10884c).f14044c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((i9.n) this.f10885d).invoke(sVar)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
        }
    }
}
