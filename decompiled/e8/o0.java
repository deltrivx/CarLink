package e8;

import b8.m2;
import b8.n2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f4597b;

    public /* synthetic */ o0(q0 q0Var, int i7) {
        this.f4596a = i7;
        this.f4597b = q0Var;
    }

    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        switch (this.f4596a) {
            case 0:
                t8.z zVar = t8.z.f12851a;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    u8.u.c0(((n2) it.next()).f1625c, arrayList);
                }
                ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((m2) it2.next()).f1617d);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (obj2 instanceof b8.o0) {
                        arrayList3.add(obj2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    d8.f fVar = this.f4597b.f4607b;
                    if (fVar != null) {
                        fVar.b();
                    }
                    this.f4597b.f4607b = null;
                } else {
                    this.f4597b.f4607b = new d8.f();
                    hc.c cVar2 = d8.v.f3842a;
                    d8.f fVar2 = this.f4597b.f4607b;
                    int i7 = 0;
                    if (fVar2 != null && fVar2.c()) {
                        i7 = 1;
                    }
                    d8.v.a(new b8.o0(i7));
                    d8.f fVar3 = this.f4597b.f4607b;
                    if (fVar3 != null) {
                        fVar3.f3801c = new n0();
                    }
                    d8.f fVar4 = this.f4597b.f4607b;
                    if (fVar4 != null) {
                        fVar4.a();
                    }
                }
                return zVar;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                q0 q0Var = this.f4597b;
                t8.z zVar2 = t8.z.f12851a;
                n2.Companion.getClass();
                Iterable iterable = (Iterable) n2.f1622h.getValue();
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    u8.u.c0(((n2) it3.next()).f1625c, arrayList4);
                }
                ArrayList arrayList5 = new ArrayList(u8.q.a0(arrayList4, 10));
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(((m2) it4.next()).f1617d);
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : arrayList5) {
                    if (obj3 instanceof b8.o0) {
                        arrayList6.add(obj3);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    if (zBooleanValue) {
                        d8.f fVar5 = q0Var.f4607b;
                        if (fVar5 != null) {
                            fVar5.a();
                        }
                    } else {
                        d8.f fVar6 = q0Var.f4607b;
                        if (fVar6 != null) {
                            fVar6.b();
                        }
                    }
                }
                return zVar2;
        }
    }
}
