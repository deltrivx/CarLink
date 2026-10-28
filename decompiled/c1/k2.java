package c1;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1.p f1968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1.l0 f1969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f1971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f1972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1.c f1973f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(r1.p pVar, y1.l0 l0Var, long j5, float f10, float f11, n1.c cVar) {
        super(2);
        this.f1968a = pVar;
        this.f1969b = l0Var;
        this.f1970c = j5;
        this.f1971d = f10;
        this.f1972e = f11;
        this.f1973f = cVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        int iIntValue = ((Number) obj2).intValue() & 3;
        t8.z zVar = t8.z.f12851a;
        if (iIntValue == 2 && sVar.z()) {
            sVar.Q();
            return zVar;
        }
        r1.p pVarA = m2.a(this.f1968a, this.f1969b, m2.b(this.f1970c, this.f1971d, sVar), ((n3.c) sVar.j(r2.j1.f11276h)).R(this.f1972e));
        g gVar = g.f1886d;
        AtomicInteger atomicInteger = y2.k.f15015a;
        r1.p pVarA2 = pVarA.a(new AppendedSemanticsElement(gVar, false)).a(new SuspendPointerInputElement(t8.z.f12851a, null, new k2.g0(new j2(2, null, 0)), 6));
        o2.m0 m0VarD = d0.m.d(r1.c.f11092a, true);
        int iP = f1.b.p(sVar);
        f1.q1 q1VarL = sVar.l();
        r1.p pVarC = r1.a.c(sVar, pVarA2);
        q2.j.f10719d0.getClass();
        q2.a0 a0Var = q2.i.f10705b;
        sVar.a0();
        if (sVar.S) {
            sVar.k(a0Var);
        } else {
            sVar.k0();
        }
        f1.b.w(sVar, q2.i.f10708e, m0VarD);
        f1.b.w(sVar, q2.i.f10707d, q1VarL);
        q2.h hVar = q2.i.f10709f;
        if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP))) {
            ob.a.w(iP, sVar, iP, hVar);
        }
        f1.b.w(sVar, q2.i.f10706c, pVarC);
        this.f1973f.invoke(sVar, 0);
        sVar.p(true);
        return zVar;
    }
}
