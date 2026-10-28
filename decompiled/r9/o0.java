package r9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f11734b;

    public /* synthetic */ o0(q0 q0Var, int i7) {
        this.f11733a = i7;
        this.f11734b = q0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Iterable] */
    @Override // h9.a
    public final Object invoke() throws xa.q {
        ?? I;
        switch (this.f11733a) {
            case 0:
                q0 q0Var = this.f11734b;
                r1 r1Var = q0Var.f11747c;
                o9.u uVar = q0.f11746g[0];
                ca.c cVar = (ca.c) r1Var.invoke();
                if (cVar == null) {
                    return gb.n.f6198b;
                }
                r1 r1Var2 = q0Var.f11662a;
                o9.u uVar2 = b0.f11661b[0];
                Object objInvoke = r1Var2.invoke();
                i9.l.d(objInvoke, "getValue(...)");
                a2.b bVar = ((ca.f) objInvoke).f2582b;
                pa.e eVar = (pa.e) bVar.f12b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) bVar.f14d;
                Class cls = cVar.f2576a;
                wa.b bVarA = da.d.a(cls);
                Object obj = concurrentHashMap.get(bVarA);
                if (obj == null) {
                    wa.c cVar2 = da.d.a(cls).f14236a;
                    qa.b bVar2 = cVar.f2577b;
                    qa.a aVar = bVar2.f10999a;
                    qa.a aVar2 = qa.a.MULTIFILE_CLASS;
                    if (aVar == aVar2) {
                        String[] strArr = bVar2.f11001c;
                        if (aVar != aVar2) {
                            strArr = null;
                        }
                        List listJ0 = strArr != null ? u8.l.j0(strArr) : null;
                        if (listJ0 == null) {
                            listJ0 = u8.w.f13122a;
                        }
                        I = new ArrayList();
                        Iterator it = listJ0.iterator();
                        while (it.hasNext()) {
                            wa.c cVar3 = new wa.c(eb.b.c((String) it.next()).f4664a.replace('/', '.'));
                            wa.b bVar3 = new wa.b(cVar3.b(), cVar3.f14240a.f());
                            ca.b bVar4 = (ca.b) bVar.f13c;
                            eVar.c().f7020c.getClass();
                            ca.c cVarY = n3.u.y(bVar4, bVar3, ta.e.f12885g);
                            if (cVarY != null) {
                                I.add(cVarY);
                            }
                        }
                    } else {
                        I = n3.l.I(cVar);
                    }
                    aa.s sVar = new aa.s(eVar.c().f7019b, cVar2, 0);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = I.iterator();
                    while (it2.hasNext()) {
                        lb.p pVarA = eVar.a(sVar, (ca.c) it2.next());
                        if (pVarA != null) {
                            arrayList.add(pVarA);
                        }
                    }
                    gb.o oVarO = o9.e0.o("package " + cVar2 + " (" + cVar + ')', u8.p.J0(arrayList));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(bVarA, oVarO);
                    obj = objPutIfAbsent == null ? oVarO : objPutIfAbsent;
                }
                i9.l.d(obj, "getOrPut(...)");
                return (gb.o) obj;
            default:
                r1 r1Var3 = this.f11734b.f11747c;
                o9.u uVar3 = q0.f11746g[0];
                ca.c cVar4 = (ca.c) r1Var3.invoke();
                if (cVar4 != null) {
                    qa.b bVar5 = cVar4.f2577b;
                    String[] strArr2 = bVar5.f11001c;
                    String[] strArr3 = bVar5.f11003e;
                    if (strArr2 != null && strArr3 != null) {
                        t8.j jVarH = va.g.h(strArr2, strArr3);
                        return new t8.p((va.f) jVarH.f12830a, (ra.e0) jVarH.f12831b, bVar5.f11000b);
                    }
                }
                return null;
        }
    }
}
