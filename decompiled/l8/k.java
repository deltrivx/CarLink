package l8;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import f1.q1;
import h0.o0;
import x.o1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h9.n f8201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.n f8203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h9.n f8204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h9.n f8205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h9.n f8206f;

    public k(h9.n nVar, int i7, h9.n nVar2, h9.n nVar3, h9.n nVar4, h9.n nVar5) {
        this.f8201a = nVar;
        this.f8202b = i7;
        this.f8203c = nVar2;
        this.f8204d = nVar3;
        this.f8205e = nVar4;
        this.f8206f = nVar5;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        t8.z zVar;
        t8.z zVar2;
        t8.z zVar3;
        f1.s sVar = (f1.s) obj2;
        int iIntValue = ((Number) obj3).intValue();
        i9.l.e((d0.t) obj, "$this$Card");
        int i7 = iIntValue & 17;
        t8.z zVar4 = t8.z.f12851a;
        if (i7 == 16 && sVar.z()) {
            sVar.Q();
            return zVar4;
        }
        d0.d dVar = d0.h.f3569d;
        float fN = g5.a.n(16, sVar);
        r1.m mVar = r1.m.f11116a;
        r1.p pVarH = androidx.compose.foundation.layout.a.h(mVar, fN);
        r1.f fVar = r1.c.f11103m;
        d0.s sVarA = d0.q.a(dVar, fVar, sVar, 6);
        long j5 = sVar.T;
        int i10 = (int) (j5 ^ (j5 >>> 32));
        q1 q1VarL = sVar.l();
        r1.p pVarC = r1.a.c(sVar, pVarH);
        q2.j.f10719d0.getClass();
        q2.a0 a0Var = q2.i.f10705b;
        sVar.a0();
        if (sVar.S) {
            sVar.k(a0Var);
        } else {
            sVar.k0();
        }
        q2.h hVar = q2.i.f10708e;
        f1.b.w(sVar, hVar, sVarA);
        q2.h hVar2 = q2.i.f10707d;
        f1.b.w(sVar, hVar2, q1VarL);
        q2.h hVar3 = q2.i.f10709f;
        if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i10))) {
            ob.a.w(i10, sVar, i10, hVar3);
        }
        q2.h hVar4 = q2.i.f10706c;
        f1.b.w(sVar, hVar4, pVarC);
        sVar.W(1281095782);
        h9.n nVar = this.f8201a;
        if (nVar != null) {
            nVar.invoke(sVar, 0);
        }
        sVar.p(false);
        if (1.0f <= 0.0d) {
            e0.a.a("invalid weight; must be greater than zero");
        }
        r1.p pVarO = n4.h.o(new LayoutWeightElement(1.0f, false), k0.e.a(g5.a.n(12, sVar)));
        d0.b bVar = d0.h.f3568c;
        d0.s sVarA2 = d0.q.a(bVar, fVar, sVar, 0);
        long j10 = sVar.T;
        int i11 = (int) (j10 ^ (j10 >>> 32));
        q1 q1VarL2 = sVar.l();
        r1.p pVarC2 = r1.a.c(sVar, pVarO);
        sVar.a0();
        if (sVar.S) {
            sVar.k(a0Var);
        } else {
            sVar.k0();
        }
        f1.b.w(sVar, hVar, sVarA2);
        f1.b.w(sVar, hVar2, q1VarL2);
        if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i11))) {
            ob.a.w(i11, sVar, i11, hVar3);
        }
        f1.b.w(sVar, hVar4, pVarC2);
        o1 o1VarN = n3.r.N(sVar);
        int i12 = this.f8202b;
        Integer numValueOf = Integer.valueOf(i12);
        sVar.W(-1633490746);
        boolean zF = sVar.f(o1VarN) | sVar.d(i12);
        Object objK = sVar.K();
        if (zF || objK == f1.n.f5051a) {
            objK = new o0(o1VarN, i12, null, 1);
            sVar.h0(objK);
        }
        sVar.p(false);
        h9.n nVar2 = this.f8203c;
        f1.b.g(numValueOf, nVar2, (h9.n) objK, sVar);
        r1.p pVarU = n3.r.U(androidx.compose.foundation.layout.c.m(mVar, 3), o1VarN, true);
        d0.s sVarA3 = d0.q.a(bVar, fVar, sVar, 0);
        long j11 = sVar.T;
        int i13 = (int) (j11 ^ (j11 >>> 32));
        q1 q1VarL3 = sVar.l();
        r1.p pVarC3 = r1.a.c(sVar, pVarU);
        sVar.a0();
        if (sVar.S) {
            sVar.k(a0Var);
        } else {
            sVar.k0();
        }
        f1.b.w(sVar, hVar, sVarA3);
        f1.b.w(sVar, hVar2, q1VarL3);
        if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i13))) {
            ob.a.w(i13, sVar, i13, hVar3);
        }
        f1.b.w(sVar, hVar4, pVarC3);
        nVar2.invoke(sVar, 0);
        sVar.p(true);
        sVar.p(true);
        d0.b bVar2 = d0.h.f3567b;
        r1.g gVar = r1.c.f11102l;
        FillElement fillElement = androidx.compose.foundation.layout.c.f820a;
        d0.n0 n0VarA = d0.l0.a(bVar2, gVar, sVar, 54);
        long j12 = sVar.T;
        int i14 = (int) (j12 ^ (j12 >>> 32));
        q1 q1VarL4 = sVar.l();
        r1.p pVarC4 = r1.a.c(sVar, fillElement);
        sVar.a0();
        if (sVar.S) {
            sVar.k(a0Var);
        } else {
            sVar.k0();
        }
        f1.b.w(sVar, hVar, n0VarA);
        f1.b.w(sVar, hVar2, q1VarL4);
        if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i14))) {
            ob.a.w(i14, sVar, i14, hVar3);
        }
        f1.b.w(sVar, hVar4, pVarC4);
        sVar.W(-267501974);
        h9.n nVar3 = this.f8204d;
        if (nVar3 == null) {
            zVar = null;
        } else {
            nVar3.invoke(sVar, 0);
            zVar = zVar4;
        }
        sVar.p(false);
        sVar.W(-267501364);
        if (zVar != null) {
            d0.c.a(sVar, androidx.compose.foundation.layout.c.k(androidx.compose.foundation.layout.c.b(mVar, g5.a.n(64, sVar)), g5.a.n(10, sVar)));
        }
        sVar.p(false);
        sVar.W(-267490742);
        h9.n nVar4 = this.f8205e;
        if (nVar4 == null) {
            zVar2 = null;
        } else {
            nVar4.invoke(sVar, 0);
            zVar2 = zVar4;
        }
        sVar.p(false);
        sVar.W(-267490132);
        if (zVar2 != null) {
            d0.c.a(sVar, androidx.compose.foundation.layout.c.k(androidx.compose.foundation.layout.c.b(mVar, g5.a.n(64, sVar)), g5.a.n(10, sVar)));
        }
        sVar.p(false);
        sVar.W(-267479478);
        h9.n nVar5 = this.f8206f;
        if (nVar5 == null) {
            zVar3 = null;
        } else {
            nVar5.invoke(sVar, 0);
            zVar3 = zVar4;
        }
        sVar.p(false);
        sVar.W(-267479045);
        if (zVar3 != null) {
            a2.f.L(64, sVar, mVar, sVar);
        }
        sVar.p(false);
        sVar.p(true);
        sVar.p(true);
        return zVar4;
    }
}
