package c8;

import androidx.compose.foundation.layout.FillElement;
import f1.b1;
import f1.q1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f2461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f2462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f2464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h9.k f2465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f2466f;

    public a0(float f10, float f11, int i7, List list, h9.k kVar, b1 b1Var) {
        this.f2461a = f10;
        this.f2462b = f11;
        this.f2463c = i7;
        this.f2464d = list;
        this.f2465e = kVar;
        this.f2466f = b1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            float f10 = this.f2461a;
            float f11 = this.f2462b;
            r1.p pVarD = androidx.compose.foundation.layout.c.d(r1.m.f11116a, 0.0f, f10 + f11, 1);
            d0.s sVarA = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
            long j5 = sVar.T;
            int i7 = (int) (j5 ^ (j5 >>> 32));
            q1 q1VarL = sVar.l();
            r1.p pVarC = r1.a.c(sVar, pVarD);
            q2.j.f10719d0.getClass();
            q2.a0 a0Var = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, q2.i.f10708e, sVarA);
            f1.b.w(sVar, q2.i.f10707d, q1VarL);
            q2.h hVar = q2.i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i7))) {
                ob.a.w(i7, sVar, i7, hVar);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC);
            FillElement fillElement = androidx.compose.foundation.layout.c.f820a;
            g0.a aVar = new g0.a(this.f2463c);
            d0.f fVarG = d0.h.g(f11);
            d0.f fVarG2 = d0.h.g(f11);
            sVar.W(-1746271574);
            List list = this.f2464d;
            boolean zH = sVar.h(list);
            h9.k kVar = this.f2465e;
            boolean zF = zH | sVar.f(kVar);
            Object objK = sVar.K();
            if (zF || objK == f1.n.f5051a) {
                objK = new s(list, this.f2466f, kVar);
                sVar.h0(objK);
            }
            sVar.p(false);
            o9.e0.c(aVar, fillElement, null, null, fVarG2, fVarG, null, false, null, (h9.k) objK, sVar, 48);
            sVar.p(true);
        }
        return t8.z.f12851a;
    }
}
