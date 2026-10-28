package e8;

import b8.c2;
import b8.m2;
import b8.n2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y extends a9.i implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ List f4657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f4658b;

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        y yVar = new y(3, (y8.c) obj3);
        yVar.f4657a = (List) obj;
        yVar.f4658b = zBooleanValue;
        return yVar.invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        t8.a.e(obj);
        List list = this.f4657a;
        boolean z10 = this.f4658b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u8.u.c0(((n2) it.next()).f1625c, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c2 c2Var = ((m2) it2.next()).f1617d;
            b8.j jVar = c2Var instanceof b8.j ? (b8.j) c2Var : null;
            if (jVar != null) {
                arrayList2.add(jVar);
            }
        }
        int iS0 = u8.c0.S0(u8.q.a0(arrayList2, 10));
        if (iS0 < 16) {
            iS0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS0);
        for (Object obj2 : arrayList2) {
            linkedHashMap.put(new Integer(((b8.j) obj2).f1600b), obj2);
        }
        return new t8.j(linkedHashMap, Boolean.valueOf(z10));
    }
}
