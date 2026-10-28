package a8;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f293e;

    public /* synthetic */ z(h9.k kVar, m5.l lVar, h9.k kVar2, f1.b1 b1Var) {
        this.f289a = 5;
        this.f292d = kVar;
        this.f291c = lVar;
        this.f293e = kVar2;
        this.f290b = b1Var;
    }

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f289a = i7;
        this.f292d = obj;
        this.f290b = obj2;
        this.f291c = obj3;
        this.f293e = obj4;
    }

    public /* synthetic */ z(ArrayList arrayList, i9.v vVar, List list, int i7, g0.n nVar) {
        this.f289a = 2;
        this.f292d = arrayList;
        this.f290b = vVar;
        this.f291c = list;
        this.f293e = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x006b  */
    @Override // h9.k
    public final Object invoke(Object obj) {
        long jC;
        int i7 = this.f289a;
        t8.z zVar = t8.z.f12851a;
        Object obj2 = this.f293e;
        Object obj3 = this.f291c;
        Object obj4 = this.f290b;
        Object obj5 = this.f292d;
        switch (i7) {
            case 0:
                f1.b1 b1Var = (f1.b1) obj4;
                f1.b1 b1Var2 = (f1.b1) obj3;
                l8.j0 j0Var = (l8.j0) obj;
                i9.l.e(j0Var, "it");
                b1Var.setValue(j0Var.f8197b.b());
                b1Var2.setValue(j0Var.f8196a);
                ((h9.n) obj5).invoke((String) b1Var.getValue(), (String) b1Var2.getValue());
                ((f1.b1) obj2).setValue(Boolean.FALSE);
                return zVar;
            case 1:
                p1.p pVar = (p1.p) obj5;
                f1.b1 b1Var3 = (f1.b1) obj3;
                f1.h1 h1Var = (f1.h1) obj2;
                String str = (String) obj;
                c8.n nVar = c8.n.f2521a;
                if (zb.j.r0(str, ((l8.j0) ((f1.b1) obj4).getValue()).f8197b.b(), false)) {
                    if (pVar.size() > 200) {
                        pVar.remove(0);
                    }
                    if (((Boolean) b1Var3.getValue()).booleanValue()) {
                        pVar.add(str);
                        h1Var.g(pVar.size() * 300);
                    }
                }
                return zVar;
            case 2:
                List list = (List) obj5;
                i9.v vVar = (i9.v) obj4;
                List list2 = (List) obj3;
                g0.n nVar2 = (g0.n) obj2;
                h0.s0 s0Var = (h0.s0) obj;
                o2.f1 f1Var = s0Var.f6377e;
                int iB = f1Var != null ? f1Var.b() : 0;
                int i10 = 0;
                for (int i11 = 0; i11 < iB; i11++) {
                    if (nVar2.f5690q == z.x0.f15591a) {
                        o2.f1 f1Var2 = s0Var.f6377e;
                        jC = (f1Var2 != null ? f1Var2.c(i11) : 0L) & 4294967295L;
                    } else {
                        o2.f1 f1Var3 = s0Var.f6377e;
                        jC = (f1Var3 != null ? f1Var3.c(i11) : 0L) >> 32;
                    }
                    i10 += (int) jC;
                }
                if (list != null) {
                    list.add(Integer.valueOf(i10));
                }
                if (vVar.f6686a != list2.size()) {
                    vVar.f6686a++;
                }
                return zVar;
            case 3:
                h0.i0 i0Var = (h0.i0) obj5;
                i0Var.f6325c = new f1.t0((h0.t) obj4, (o2.h1) obj3, (h0.t0) obj2);
                return new e8.p(3, i0Var);
            case 4:
                l0.u0 u0Var = (l0.u0) obj5;
                g3.x xVar = (g3.x) obj4;
                g3.w wVar = (g3.w) obj3;
                g3.k kVar = (g3.k) obj2;
                if (u0Var.b()) {
                    android.support.v4.media.session.r rVar = u0Var.f7851d;
                    l0.s sVar = u0Var.f7868v;
                    l0.s sVar2 = u0Var.f7869w;
                    i9.x xVar2 = new i9.x();
                    u0 u0Var2 = new u0(rVar, sVar, xVar2, 2);
                    g3.r rVar2 = xVar.f5892a;
                    rVar2.d(wVar, kVar, u0Var2, sVar2);
                    g3.c0 c0Var = new g3.c0(xVar, rVar2);
                    xVar.f5893b.set(c0Var);
                    xVar2.f6688a = c0Var;
                    u0Var.f7852e = c0Var;
                }
                return new l0.a0();
            case 5:
                h9.k kVar2 = (h9.k) obj5;
                m5.l lVar = (m5.l) obj3;
                h9.k kVar3 = (h9.k) obj2;
                f1.b1 b1Var4 = (f1.b1) obj4;
                n3.m mVar = (n3.m) obj;
                i9.l.e(lVar, "$controller");
                i9.l.e(kVar3, "$setup");
                i9.l.e(b1Var4, "$initialized$delegate");
                long j5 = mVar.f8746a;
                if (((int) (j5 >> 32)) != 0 && ((int) (4294967295L & j5)) != 0) {
                    kVar2.invoke(mVar);
                    long jM0 = n3.n.M0(mVar.f8746a);
                    f1.k1 k1Var = lVar.f8484c;
                    if (!x1.e.a(jM0, lVar.f8483b)) {
                        long j10 = ((x1.b) k1Var.getValue()).f14521a;
                        k1Var.setValue(new x1.b(n3.r.a((x1.e.d(jM0) * x1.b.d(j10)) / x1.e.d(lVar.f8483b), (x1.e.b(jM0) * x1.b.e(j10)) / x1.e.b(lVar.f8483b))));
                        lVar.f8483b = jM0;
                    }
                    if (!((Boolean) b1Var4.getValue()).booleanValue()) {
                        kVar3.invoke(lVar);
                        b1Var4.setValue(Boolean.TRUE);
                    }
                }
                return zVar;
            case 6:
                v.c cVar = (v.c) obj5;
                v.k kVar4 = (v.k) obj4;
                h9.k kVar5 = (h9.k) obj3;
                i9.t tVar = (i9.t) obj2;
                v.i iVar = (v.i) obj;
                v.d.l(iVar, cVar.f13326c);
                f1.k1 k1Var2 = iVar.f13372e;
                Object objA = v.c.a(cVar, k1Var2.getValue());
                if (!i9.l.a(objA, k1Var2.getValue())) {
                    cVar.f13326c.f13387b.setValue(objA);
                    kVar4.f13387b.setValue(objA);
                    if (kVar5 != null) {
                        kVar5.invoke(cVar);
                    }
                    iVar.f13376i.setValue(Boolean.FALSE);
                    iVar.f13371d.invoke();
                    tVar.f6684a = true;
                } else if (kVar5 != null) {
                    kVar5.invoke(cVar);
                }
                return zVar;
            case 7:
                i9.u uVar = (i9.u) obj5;
                z.h hVar = (z.h) obj2;
                v.i iVar2 = (v.i) obj;
                float fFloatValue = ((Number) iVar2.f13372e.getValue()).floatValue() - uVar.f6685a;
                float fA = ((z.p1) obj4).a(fFloatValue);
                uVar.f6685a = ((Number) iVar2.f13372e.getValue()).floatValue();
                ((i9.u) obj3).f6685a = ((Number) iVar2.f13368a.f13472b.invoke(iVar2.f13373f)).floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    iVar2.f13376i.setValue(Boolean.FALSE);
                    iVar2.f13371d.invoke();
                }
                hVar.getClass();
                return zVar;
            default:
                i9.u uVar2 = (i9.u) obj5;
                z.w0 w0Var = (z.w0) obj4;
                z.r1 r1Var = (z.r1) obj3;
                l0.c1 c1Var = (l0.c1) obj2;
                v.i iVar3 = (v.i) obj;
                f1.k1 k1Var3 = iVar3.f13372e;
                h9.a aVar = iVar3.f13371d;
                f1.k1 k1Var4 = iVar3.f13376i;
                float fFloatValue2 = ((Number) k1Var3.getValue()).floatValue() - uVar2.f6685a;
                if (z.p0.a(fFloatValue2)) {
                    if (((Boolean) c1Var.invoke(Float.valueOf(uVar2.f6685a))).booleanValue()) {
                        k1Var4.setValue(Boolean.FALSE);
                        aVar.invoke();
                    }
                } else if (z.p0.a(fFloatValue2 - w0Var.c(r1Var, fFloatValue2))) {
                    uVar2.f6685a += fFloatValue2;
                    if (((Boolean) c1Var.invoke(Float.valueOf(uVar2.f6685a))).booleanValue()) {
                        k1Var4.setValue(Boolean.FALSE);
                        aVar.invoke();
                    }
                } else {
                    k1Var4.setValue(Boolean.FALSE);
                    aVar.invoke();
                }
                return zVar;
        }
    }
}
