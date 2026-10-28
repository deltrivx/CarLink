package a8;

import b8.m2;
import b8.n2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fc.e f220b;

    public /* synthetic */ r1(fc.e eVar, int i7) {
        this.f219a = i7;
        this.f220b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:128:0x0209  */
    /* JADX WARN: Code duplicated, block: B:149:0x0256  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0134  */
    /* JADX WARN: Code duplicated, block: B:90:0x0178  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        q1 q1Var;
        t1 t1Var;
        e8.u uVar;
        e8.v vVar;
        e8.i0 i0Var;
        e8.j0 j0Var;
        int i7;
        fc.r rVar;
        switch (this.f219a) {
            case 0:
                if (cVar instanceof q1) {
                    q1Var = (q1) cVar;
                    int i10 = q1Var.f207b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        q1Var.f207b = i10 - Integer.MIN_VALUE;
                    } else {
                        q1Var = new q1(this, cVar);
                    }
                } else {
                    q1Var = new q1(this, cVar);
                }
                Object obj2 = q1Var.f206a;
                int i11 = q1Var.f207b;
                if (i11 == 0) {
                    t8.a.e(obj2);
                    o7.v vVar2 = ((o7.u) obj).f9521a;
                    q1Var.f207b = 1;
                    Object objH = this.f220b.h(vVar2, q1Var);
                    z8.a aVar = z8.a.f15774a;
                    if (objH == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj2);
                }
                return t8.z.f12851a;
            case 1:
                if (cVar instanceof t1) {
                    t1Var = (t1) cVar;
                    int i12 = t1Var.f245b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        t1Var.f245b = i12 - Integer.MIN_VALUE;
                    } else {
                        t1Var = new t1(this, cVar);
                    }
                } else {
                    t1Var = new t1(this, cVar);
                }
                Object obj3 = t1Var.f244a;
                int i13 = t1Var.f245b;
                if (i13 == 0) {
                    t8.a.e(obj3);
                    Boolean boolValueOf = Boolean.valueOf(((o7.v) obj) == o7.v.f9536c);
                    t1Var.f245b = 1;
                    Object objH2 = this.f220b.h(boolValueOf, t1Var);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objH2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj3);
                }
                return t8.z.f12851a;
            case 2:
                if (cVar instanceof e8.u) {
                    uVar = (e8.u) cVar;
                    int i14 = uVar.f4626b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        uVar.f4626b = i14 - Integer.MIN_VALUE;
                    } else {
                        uVar = new e8.u(this, cVar);
                    }
                } else {
                    uVar = new e8.u(this, cVar);
                }
                Object obj4 = uVar.f4625a;
                int i15 = uVar.f4626b;
                if (i15 == 0) {
                    t8.a.e(obj4);
                    o7.v vVar3 = ((o7.u) obj).f9521a;
                    uVar.f4626b = 1;
                    Object objH3 = this.f220b.h(vVar3, uVar);
                    z8.a aVar3 = z8.a.f15774a;
                    if (objH3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj4);
                }
                return t8.z.f12851a;
            case 3:
                if (cVar instanceof e8.v) {
                    vVar = (e8.v) cVar;
                    int i16 = vVar.f4634b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        vVar.f4634b = i16 - Integer.MIN_VALUE;
                    } else {
                        vVar = new e8.v(this, cVar);
                    }
                } else {
                    vVar = new e8.v(this, cVar);
                }
                Object obj5 = vVar.f4633a;
                int i17 = vVar.f4634b;
                if (i17 == 0) {
                    t8.a.e(obj5);
                    Boolean boolValueOf2 = Boolean.valueOf(((o7.v) obj) == o7.v.f9536c);
                    vVar.f4634b = 1;
                    Object objH4 = this.f220b.h(boolValueOf2, vVar);
                    z8.a aVar4 = z8.a.f15774a;
                    if (objH4 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj5);
                }
                return t8.z.f12851a;
            case 4:
                if (cVar instanceof e8.i0) {
                    i0Var = (e8.i0) cVar;
                    int i18 = i0Var.f4562b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        i0Var.f4562b = i18 - Integer.MIN_VALUE;
                    } else {
                        i0Var = new e8.i0(this, cVar);
                    }
                } else {
                    i0Var = new e8.i0(this, cVar);
                }
                Object obj6 = i0Var.f4561a;
                int i19 = i0Var.f4562b;
                if (i19 == 0) {
                    t8.a.e(obj6);
                    o7.v vVar4 = ((o7.u) obj).f9521a;
                    i0Var.f4562b = 1;
                    Object objH5 = this.f220b.h(vVar4, i0Var);
                    z8.a aVar5 = z8.a.f15774a;
                    if (objH5 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj6);
                }
                return t8.z.f12851a;
            case 5:
                if (cVar instanceof e8.j0) {
                    j0Var = (e8.j0) cVar;
                    int i20 = j0Var.f4565b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        j0Var.f4565b = i20 - Integer.MIN_VALUE;
                    } else {
                        j0Var = new e8.j0(this, cVar);
                    }
                } else {
                    j0Var = new e8.j0(this, cVar);
                }
                Object obj7 = j0Var.f4564a;
                int i21 = j0Var.f4565b;
                if (i21 == 0) {
                    t8.a.e(obj7);
                    o7.v vVar5 = (o7.v) obj;
                    n2.Companion.getClass();
                    Iterable iterable = (Iterable) n2.f1622h.getValue();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        u8.u.c0(((n2) it.next()).f1625c, arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        b8.c2 c2Var = ((m2) it2.next()).f1617d;
                        b8.f0 f0Var = c2Var instanceof b8.f0 ? (b8.f0) c2Var : null;
                        if (f0Var != null) {
                            arrayList2.add(f0Var);
                        }
                    }
                    int iS0 = u8.c0.S0(u8.q.a0(arrayList2, 10));
                    if (iS0 < 16) {
                        iS0 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS0);
                    for (Object obj8 : arrayList2) {
                        linkedHashMap.put(new Integer(((b8.f0) obj8).f1582b), obj8);
                    }
                    int iOrdinal = vVar5.ordinal();
                    if (iOrdinal == 0) {
                        i7 = 0;
                    } else if (iOrdinal != 1) {
                        i7 = 2;
                        if (iOrdinal != 2) {
                            i7 = 3;
                        }
                    } else {
                        i7 = 1;
                    }
                    Object obj9 = linkedHashMap.get(new Integer(i7));
                    j0Var.f4565b = 1;
                    Object objH6 = this.f220b.h(obj9, j0Var);
                    z8.a aVar6 = z8.a.f15774a;
                    if (objH6 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj7);
                }
                return t8.z.f12851a;
            default:
                if (cVar instanceof fc.r) {
                    rVar = (fc.r) cVar;
                    int i22 = rVar.f5595b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        rVar.f5595b = i22 - Integer.MIN_VALUE;
                    } else {
                        rVar = new fc.r(this, cVar);
                    }
                } else {
                    rVar = new fc.r(this, cVar);
                }
                Object obj10 = rVar.f5594a;
                int i23 = rVar.f5595b;
                if (i23 == 0) {
                    t8.a.e(obj10);
                    if (obj != null) {
                        rVar.f5595b = 1;
                        Object objH7 = this.f220b.h(obj, rVar);
                        z8.a aVar7 = z8.a.f15774a;
                        if (objH7 == aVar7) {
                            return aVar7;
                        }
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj10);
                }
                return t8.z.f12851a;
        }
    }
}
