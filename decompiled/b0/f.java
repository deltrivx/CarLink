package b0;

import b8.c2;
import b8.m2;
import c1.x2;
import cc.b0;
import cc.y;
import d8.s;
import f1.b1;
import fc.p;
import i9.v;
import i9.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.j0;
import t8.z;
import y1.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1109c;

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.f1107a = i7;
        this.f1108b = obj;
        this.f1109c = obj2;
    }

    public f(fc.c cVar, x xVar, fc.e eVar) {
        this.f1107a = 5;
        this.f1108b = xVar;
        this.f1109c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x0131  */
    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        s sVar;
        fc.b bVar;
        p pVar;
        f fVar;
        switch (this.f1107a) {
            case 0:
                j jVar = (j) obj;
                ArrayList arrayList = (ArrayList) this.f1108b;
                if (jVar instanceof d) {
                    arrayList.add(jVar);
                } else if (jVar instanceof e) {
                    arrayList.remove(((e) jVar).f1106a);
                }
                ((b1) this.f1109c).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return z.f12851a;
            case 1:
                j jVar2 = (j) obj;
                b1.b bVar2 = (b1.b) this.f1108b;
                if (jVar2 instanceof m) {
                    m mVar = (m) jVar2;
                    b1.i iVarI = bVar2.f1128h;
                    if (iVarI == null) {
                        iVarI = g5.a.i(bVar2.f1127g);
                        bVar2.f1128h = iVarI;
                    }
                    b1.k kVarA = iVarI.a(bVar2);
                    kVarA.b(mVar, bVar2.f1123c, bVar2.k, bVar2.f1131l, ((q) bVar2.f1125e.getValue()).f14960a, ((b1.g) bVar2.f1126f.getValue()).f1157d, bVar2.f1132m);
                    bVar2.f1129i.setValue(kVarA);
                } else if (jVar2 instanceof n) {
                    b1.k kVar = (b1.k) bVar2.f1129i.getValue();
                    if (kVar != null) {
                        kVar.d();
                    }
                } else if (jVar2 instanceof l) {
                    b1.k kVar2 = (b1.k) bVar2.f1129i.getValue();
                    if (kVar2 != null) {
                        kVar2.d();
                    }
                } else {
                    bVar2.f1122b.e(jVar2, (y) this.f1109c);
                }
                return z.f12851a;
            case 2:
                j jVar3 = (j) obj;
                b1.c cVar2 = (b1.c) this.f1108b;
                if (!(jVar3 instanceof o)) {
                    y yVar = (y) this.f1109c;
                    b1.q qVar = cVar2.f1138t;
                    if (qVar == null) {
                        qVar = new b1.q(cVar2.f1137s, cVar2.f1134p);
                        q2.f.l(cVar2);
                        cVar2.f1138t = qVar;
                    }
                    qVar.e(jVar3, yVar);
                } else if (cVar2.f1141w) {
                    cVar2.A0((o) jVar3);
                } else {
                    cVar2.f1142x.a(jVar3);
                }
                return z.f12851a;
            case 3:
                j jVar4 = (j) obj;
                v vVar = (v) this.f1108b;
                if (jVar4 instanceof m) {
                    vVar.f6686a++;
                } else if ((jVar4 instanceof n) || (jVar4 instanceof l)) {
                    vVar.f6686a--;
                }
                boolean z10 = vVar.f6686a > 0;
                x2 x2Var = (x2) this.f1109c;
                if (x2Var.f2314q != z10) {
                    x2Var.f2314q = z10;
                    q2.f.m(x2Var);
                }
                return z.f12851a;
            case 4:
                if (cVar instanceof s) {
                    sVar = (s) cVar;
                    int i7 = sVar.f3836b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        sVar.f3836b = i7 - Integer.MIN_VALUE;
                    } else {
                        sVar = new s(this, cVar);
                    }
                } else {
                    sVar = new s(this, cVar);
                }
                Object obj2 = sVar.f3835a;
                int i10 = sVar.f3836b;
                if (i10 == 0) {
                    t8.a.e(obj2);
                    fc.e eVar = (fc.e) this.f1108b;
                    c2 c2Var = (c2) obj;
                    List list = (List) this.f1109c;
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (i9.l.a(((m2) it.next()).f1617d, c2Var)) {
                                sVar.f3836b = 1;
                                Object objH = eVar.h(obj, sVar);
                                z8.a aVar = z8.a.f15774a;
                                if (objH == aVar) {
                                    return aVar;
                                }
                            }
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj2);
                }
                return z.f12851a;
            case 5:
                x xVar = (x) this.f1108b;
                if (cVar instanceof fc.b) {
                    bVar = (fc.b) cVar;
                    int i11 = bVar.f5521c;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        bVar.f5521c = i11 - Integer.MIN_VALUE;
                    } else {
                        bVar = new fc.b(this, cVar);
                    }
                } else {
                    bVar = new fc.b(this, cVar);
                }
                Object obj3 = bVar.f5519a;
                int i12 = bVar.f5521c;
                z zVar = z.f12851a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj3);
                    return zVar;
                }
                t8.a.e(obj3);
                Object obj4 = xVar.f6688a;
                if (obj4 != gc.c.f6217b && i9.l.a(obj4, obj)) {
                    return zVar;
                }
                xVar.f6688a = obj;
                fc.e eVar2 = (fc.e) this.f1109c;
                bVar.f5521c = 1;
                Object objH2 = eVar2.h(obj, bVar);
                z8.a aVar2 = z8.a.f15774a;
                return objH2 == aVar2 ? aVar2 : zVar;
            case 6:
                if (cVar instanceof p) {
                    pVar = (p) cVar;
                    int i13 = pVar.f5586c;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        pVar.f5586c = i13 - Integer.MIN_VALUE;
                    } else {
                        pVar = new p(this, cVar);
                    }
                } else {
                    pVar = new p(this, cVar);
                }
                Object objInvoke = pVar.f5585b;
                int i14 = pVar.f5586c;
                if (i14 == 0) {
                    t8.a.e(objInvoke);
                    h9.n nVar = (h9.n) this.f1108b;
                    pVar.f5584a = this;
                    pVar.f5588e = obj;
                    pVar.f5586c = 1;
                    objInvoke = nVar.invoke(obj, pVar);
                    z8.a aVar3 = z8.a.f15774a;
                    if (objInvoke == aVar3) {
                        return aVar3;
                    }
                    fVar = this;
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = pVar.f5588e;
                    fVar = pVar.f5584a;
                    t8.a.e(objInvoke);
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    return z.f12851a;
                }
                ((x) fVar.f1109c).f6688a = obj;
                throw new gc.a(fVar);
            default:
                long j5 = ((x1.b) obj).f14521a;
                v.c cVar3 = (v.c) this.f1108b;
                long j10 = ((x1.b) cVar3.d()).f14521a & 9223372034707292159L;
                z zVar2 = z.f12851a;
                if (j10 == 9205357640488583168L || (j5 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((x1.b) cVar3.d()).f14521a & 4294967295L)) == Float.intBitsToFloat((int) (j5 & 4294967295L))) {
                    Object objE = cVar3.e(new x1.b(j5), cVar);
                    return objE == z8.a.f15774a ? objE : zVar2;
                }
                b0.s((y) this.f1109c, null, new j0(cVar3, j5, null, 2), 3);
                return zVar2;
        }
    }
}
