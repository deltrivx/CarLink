package a8;

import android.app.Activity;
import b8.h2;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f282e;

    public /* synthetic */ x1(Activity activity, List list, Collection collection, f1.b1 b1Var, int i7) {
        this.f278a = i7;
        this.f280c = activity;
        this.f281d = list;
        this.f282e = collection;
        this.f279b = b1Var;
    }

    public /* synthetic */ x1(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f278a = i7;
        this.f280c = obj;
        this.f281d = obj2;
        this.f279b = obj3;
        this.f282e = obj4;
    }

    public x1(ArrayList arrayList, f1.b1 b1Var, f1.b1 b1Var2, f1.b1 b1Var3) {
        this.f278a = 2;
        this.f280c = arrayList;
        this.f279b = b1Var;
        this.f282e = b1Var2;
        this.f281d = b1Var3;
    }

    public x1(r1.p pVar, f1.b1 b1Var, n1.c cVar, s0.c cVar2) {
        this.f278a = 10;
        this.f280c = pVar;
        this.f279b = b1Var;
        this.f281d = cVar;
        this.f282e = cVar2;
    }

    public x1(t8.j jVar, h9.k kVar, f1.b1 b1Var, f1.b1 b1Var2) {
        this.f278a = 8;
        this.f281d = jVar;
        this.f280c = kVar;
        this.f279b = b1Var;
        this.f282e = b1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Collection] */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i7 = this.f278a;
        Object obj3 = this.f282e;
        t8.z zVar = t8.z.f12851a;
        Object obj4 = f1.n.f5051a;
        Object obj5 = this.f280c;
        Object obj6 = this.f281d;
        Object obj7 = this.f279b;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                e2 e2Var = (e2) obj6;
                h9.k kVar = (h9.k) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    sVar.W(-1224400529);
                    boolean zF = sVar.f(kVar) | sVar.f(e2Var);
                    f1.b1 b1Var = (f1.b1) obj7;
                    f1.b1 b1Var2 = (f1.b1) obj3;
                    Object objK = sVar.K();
                    if (zF || objK == obj4) {
                        objK = new j1(kVar, e2Var, b1Var, b1Var2);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK, sVar, 6, 6);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                List list = (List) obj6;
                Activity activity = (Activity) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    r1.g gVar = r1.c.k;
                    d0.b bVar = d0.h.f3567b;
                    r1.p pVarK = androidx.compose.foundation.layout.a.k(r1.m.f11116a, 0.0f, 0.0f, 8, 0.0f, 11);
                    sVar2.W(1849434622);
                    Object objK2 = sVar2.K();
                    if (objK2 == obj4) {
                        objK2 = ob.a.m(sVar2);
                    }
                    b0.k kVar2 = (b0.k) objK2;
                    sVar2.p(false);
                    sVar2.W(-1224400529);
                    boolean zH = sVar2.h(activity) | sVar2.h(list);
                    ?? r11 = this.f282e;
                    boolean zH2 = zH | sVar2.h(r11);
                    f1.b1 b1Var3 = (f1.b1) obj7;
                    Object objK3 = sVar2.K();
                    if (zH2 || objK3 == obj4) {
                        objK3 = new m0(activity, list, (Collection) r11, b1Var3, 2);
                        sVar2.h0(objK3);
                    }
                    sVar2.p(false);
                    r1.p pVarC = androidx.compose.foundation.a.c(pVarK, kVar2, null, false, (h9.a) objK3, 28);
                    d0.n0 n0VarA = d0.l0.a(bVar, gVar, sVar2, 54);
                    long j5 = sVar2.T;
                    int i10 = (int) (j5 ^ (j5 >>> 32));
                    f1.q1 q1VarL = sVar2.l();
                    r1.p pVarC2 = r1.a.c(sVar2, pVarC);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var = q2.i.f10705b;
                    sVar2.a0();
                    if (sVar2.S) {
                        sVar2.k(a0Var);
                    } else {
                        sVar2.k0();
                    }
                    f1.b.w(sVar2, q2.i.f10708e, n0VarA);
                    f1.b.w(sVar2, q2.i.f10707d, q1VarL);
                    q2.h hVar = q2.i.f10709f;
                    if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i10))) {
                        ob.a.w(i10, sVar2, i10, hVar);
                    }
                    f1.b.w(sVar2, q2.i.f10706c, pVarC2);
                    i2.c.m("选择", null, sVar2, 6, 2);
                    i2.c.i(0, sVar2);
                    sVar2.p(true);
                }
                break;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                f1.b1 b1Var4 = (f1.b1) obj7;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    ArrayList arrayList = (ArrayList) obj5;
                    int i11 = e8.w.f4641e;
                    l8.j0 j0Var = (l8.j0) b1Var4.getValue();
                    sVar3.W(-1746271574);
                    f1.b1 b1Var5 = (f1.b1) obj3;
                    f1.b1 b1Var6 = (f1.b1) obj6;
                    Object objK4 = sVar3.K();
                    if (objK4 == obj4) {
                        objK4 = new e8.l(1, b1Var4, b1Var5, b1Var6);
                        sVar3.h0(objK4);
                    }
                    sVar3.p(false);
                    g5.a.c(arrayList, j0Var, 2, null, 0.0f, 0.0f, (h9.k) objK4, sVar3, 1573248, 56);
                }
                break;
            case 3:
                f1.s sVar4 = (f1.s) obj;
                e8.b0 b0Var = (e8.b0) obj6;
                h9.k kVar3 = (h9.k) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    sVar4.W(-1224400529);
                    boolean zF2 = sVar4.f(kVar3) | sVar4.h(b0Var);
                    f1.b1 b1Var7 = (f1.b1) obj7;
                    f1.h1 h1Var = (f1.h1) obj3;
                    Object objK5 = sVar4.K();
                    if (zF2 || objK5 == obj4) {
                        objK5 = new m0(kVar3, (h2) b0Var, b1Var7, h1Var, 3);
                        sVar4.h0(objK5);
                    }
                    sVar4.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK5, sVar4, 6, 6);
                }
                break;
            case 4:
                f1.s sVar5 = (f1.s) obj;
                Set set = (Set) obj3;
                List list2 = (List) obj6;
                Activity activity2 = (Activity) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    r1.g gVar2 = r1.c.k;
                    d0.b bVar2 = d0.h.f3567b;
                    r1.p pVarK2 = androidx.compose.foundation.layout.a.k(r1.m.f11116a, 0.0f, 0.0f, 8, 0.0f, 11);
                    sVar5.W(1849434622);
                    Object objK6 = sVar5.K();
                    if (objK6 == obj4) {
                        objK6 = ob.a.m(sVar5);
                    }
                    b0.k kVar4 = (b0.k) objK6;
                    sVar5.p(false);
                    sVar5.W(-1224400529);
                    boolean zH3 = sVar5.h(activity2) | sVar5.h(list2) | sVar5.h(set);
                    f1.b1 b1Var8 = (f1.b1) obj7;
                    Object objK7 = sVar5.K();
                    if (zH3 || objK7 == obj4) {
                        objK7 = new m0(activity2, list2, (Collection) set, b1Var8, 4);
                        sVar5.h0(objK7);
                    }
                    sVar5.p(false);
                    r1.p pVarC3 = androidx.compose.foundation.a.c(pVarK2, kVar4, null, false, (h9.a) objK7, 28);
                    d0.n0 n0VarA2 = d0.l0.a(bVar2, gVar2, sVar5, 54);
                    long j10 = sVar5.T;
                    int i12 = (int) (j10 ^ (j10 >>> 32));
                    f1.q1 q1VarL2 = sVar5.l();
                    r1.p pVarC4 = r1.a.c(sVar5, pVarC3);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var2 = q2.i.f10705b;
                    sVar5.a0();
                    if (sVar5.S) {
                        sVar5.k(a0Var2);
                    } else {
                        sVar5.k0();
                    }
                    f1.b.w(sVar5, q2.i.f10708e, n0VarA2);
                    f1.b.w(sVar5, q2.i.f10707d, q1VarL2);
                    q2.h hVar2 = q2.i.f10709f;
                    if (sVar5.S || !i9.l.a(sVar5.K(), Integer.valueOf(i12))) {
                        ob.a.w(i12, sVar5, i12, hVar2);
                    }
                    f1.b.w(sVar5, q2.i.f10706c, pVarC4);
                    i2.c.m("选择", null, sVar5, 6, 2);
                    i2.c.i(0, sVar5);
                    sVar5.p(true);
                }
                break;
            case 5:
                f1.s sVar6 = (f1.s) obj;
                e8.f0 f0Var = (e8.f0) obj6;
                h9.k kVar5 = (h9.k) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    sVar6.W(-1224400529);
                    boolean zF3 = sVar6.f(kVar5) | sVar6.h(f0Var);
                    f1.b1 b1Var9 = (f1.b1) obj7;
                    f1.h1 h1Var2 = (f1.h1) obj3;
                    Object objK8 = sVar6.K();
                    if (zF3 || objK8 == obj4) {
                        objK8 = new m0(kVar5, (h2) f0Var, b1Var9, h1Var2, 5);
                        sVar6.h0(objK8);
                    }
                    sVar6.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK8, sVar6, 6, 6);
                }
                break;
            case 6:
                f1.s sVar7 = (f1.s) obj;
                e8.b1 b1Var10 = (e8.b1) obj6;
                h9.k kVar6 = (h9.k) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar7.z()) {
                    sVar7.Q();
                } else {
                    sVar7.W(-1224400529);
                    boolean zF4 = sVar7.f(kVar6) | sVar7.h(b1Var10);
                    f1.b1 b1Var11 = (f1.b1) obj7;
                    f1.h1 h1Var3 = (f1.h1) obj3;
                    Object objK9 = sVar7.K();
                    if (zF4 || objK9 == obj4) {
                        objK9 = new m0(kVar6, (h2) b1Var10, b1Var11, h1Var3, 6);
                        sVar7.h0(objK9);
                    }
                    sVar7.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK9, sVar7, 6, 6);
                }
                break;
            case 7:
                f1.s sVar8 = (f1.s) obj;
                e8.d1 d1Var = (e8.d1) obj6;
                h9.k kVar7 = (h9.k) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar8.z()) {
                    sVar8.Q();
                } else {
                    sVar8.W(-1224400529);
                    boolean zF5 = sVar8.f(kVar7) | sVar8.h(d1Var);
                    f1.b1 b1Var12 = (f1.b1) obj7;
                    f1.h1 h1Var4 = (f1.h1) obj3;
                    Object objK10 = sVar8.K();
                    if (zF5 || objK10 == obj4) {
                        objK10 = new j1(kVar7, d1Var, b1Var12, h1Var4);
                        sVar8.h0(objK10);
                    }
                    sVar8.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK10, sVar8, 6, 6);
                }
                break;
            case 8:
                f1.s sVar9 = (f1.s) obj;
                h9.k kVar8 = (h9.k) obj5;
                t8.j jVar = (t8.j) obj6;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar9.z()) {
                    sVar9.Q();
                } else {
                    sVar9.W(-1224400529);
                    boolean zF6 = sVar9.f(jVar) | sVar9.f(kVar8);
                    f1.b1 b1Var13 = (f1.b1) obj7;
                    f1.b1 b1Var14 = (f1.b1) obj3;
                    Object objK11 = sVar9.K();
                    if (zF6 || objK11 == obj4) {
                        objK11 = new m0(jVar, kVar8, b1Var13, b1Var14);
                        sVar9.h0(objK11);
                    }
                    sVar9.p(false);
                    i2.c.o("默认", (h9.a) objK11, sVar9, 6);
                }
                break;
            case 9:
                f1.s sVar10 = (f1.s) obj;
                h9.a aVar = (h9.a) obj6;
                h9.n nVar = (h9.n) obj5;
                f1.b1 b1Var15 = (f1.b1) obj3;
                f1.b1 b1Var16 = (f1.b1) obj7;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar10.z()) {
                    sVar10.Q();
                } else {
                    File[] fileArr = (File[]) b1Var16.getValue();
                    ArrayList arrayList2 = new ArrayList(fileArr.length);
                    for (File file : fileArr) {
                        String name = file.getName();
                        i9.l.d(name, "getName(...)");
                        l8.l0 l0Var = new l8.l0(file.hashCode());
                        String canonicalPath = file.getCanonicalPath();
                        i9.l.d(canonicalPath, "getCanonicalPath(...)");
                        arrayList2.add(new l8.j0(name, l0Var, canonicalPath, null, null, 24));
                    }
                    float fN = g5.a.n(88, sVar10);
                    n1.c cVarE = n1.h.e(2141620427, new l0.m1(1, b1Var15, b1Var16), sVar10);
                    sVar10.W(-1746271574);
                    boolean zF7 = sVar10.f(nVar) | sVar10.f(aVar);
                    Object objK12 = sVar10.K();
                    if (zF7 || objK12 == obj4) {
                        objK12 = new u0(nVar, aVar, b1Var15);
                        sVar10.h0(objK12);
                    }
                    sVar10.p(false);
                    g5.a.c(arrayList2, null, 1, cVarE, fN, 0.0f, (h9.k) objK12, sVar10, 3456, 34);
                }
                break;
            case 10:
                f1.s sVar11 = (f1.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                f1.b1 b1Var17 = (f1.b1) obj7;
                if (sVar11.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r1.p pVar = (r1.p) obj5;
                    Object objK13 = sVar11.K();
                    if (objK13 == obj4) {
                        objK13 = new f8.h(b1Var17, 5);
                        sVar11.h0(objK13);
                    }
                    r1.p pVarD = androidx.compose.ui.layout.a.d(pVar, (h9.k) objK13);
                    n1.c cVar = (n1.c) obj6;
                    s0.c cVar2 = (s0.c) obj3;
                    o2.m0 m0VarD = d0.m.d(r1.c.f11092a, true);
                    long j11 = sVar11.T;
                    int i13 = (int) (j11 ^ (j11 >>> 32));
                    f1.q1 q1VarL3 = sVar11.l();
                    r1.p pVarC5 = r1.a.c(sVar11, pVarD);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var3 = q2.i.f10705b;
                    sVar11.a0();
                    if (sVar11.S) {
                        sVar11.k(a0Var3);
                    } else {
                        sVar11.k0();
                    }
                    f1.b.w(sVar11, q2.i.f10708e, m0VarD);
                    f1.b.w(sVar11, q2.i.f10707d, q1VarL3);
                    q2.h hVar3 = q2.i.f10709f;
                    if (sVar11.S || !i9.l.a(sVar11.K(), Integer.valueOf(i13))) {
                        ob.a.w(i13, sVar11, i13, hVar3);
                    }
                    f1.b.w(sVar11, q2.i.f10706c, pVarC5);
                    cVar.invoke(sVar11, 0);
                    Object objK14 = sVar11.K();
                    if (objK14 == obj4) {
                        objK14 = new o7.o(b1Var17, 8);
                        sVar11.h0(objK14);
                    }
                    cVar2.b((h9.a) objK14, sVar11, 6);
                    sVar11.p(true);
                } else {
                    sVar11.Q();
                }
                break;
            default:
                f1.s sVar12 = (f1.s) obj;
                String str = (String) obj3;
                String str2 = (String) obj7;
                r2.e1 e1Var = (r2.e1) obj6;
                cc.y yVar = (cc.y) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar12.z()) {
                    sVar12.Q();
                } else {
                    sVar12.W(-1224400529);
                    boolean zH4 = sVar12.h(yVar) | sVar12.h(e1Var) | sVar12.f(str2) | sVar12.f(str);
                    Object objK15 = sVar12.K();
                    if (zH4 || objK15 == obj4) {
                        objK15 = new m0(yVar, e1Var, str2, str, 8);
                        sVar12.h0(objK15);
                    }
                    sVar12.p(false);
                    i2.c.l("复制", 0L, 0L, (h9.a) objK15, sVar12, 6, 6);
                }
                break;
        }
        return zVar;
    }
}
