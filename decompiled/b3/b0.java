package b3;

import b8.e2;
import b8.f2;
import b8.m2;
import b8.n2;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1313a;

    public /* synthetic */ b0(int i7) {
        this.f1313a = i7;
    }

    public /* synthetic */ b0(int i7, f0.o oVar) {
        this.f1313a = 17;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        y1.q qVar;
        y1.q qVar2;
        Object value;
        g8.i iVar;
        Object value2;
        g8.i iVar2;
        Object value3;
        g8.i iVar3;
        Object value4;
        g8.i iVar4;
        Object value5;
        g8.i iVar5;
        Object value6;
        g8.i iVar6;
        int i7 = this.f1313a;
        t8.z zVar = t8.z.f12851a;
        switch (i7) {
            case 0:
                String str = obj != null ? (String) obj : null;
                i9.l.b(str);
                return new s0(str);
            case 1:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                String str2 = obj2 != null ? (String) obj2 : null;
                i9.l.b(str2);
                Object obj3 = list.get(1);
                return new l(str2, (i9.l.a(obj3, Boolean.FALSE) || obj3 == null) ? null : (p0) ((h9.k) f0.f1336i.f12991c).invoke(obj3));
            case 2:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                m3.k kVar = obj4 != null ? (m3.k) obj4 : null;
                i9.l.b(kVar);
                int i10 = kVar.f8419a;
                Object obj5 = list2.get(1);
                m3.m mVar = obj5 != null ? (m3.m) obj5 : null;
                i9.l.b(mVar);
                int i11 = mVar.f8424a;
                Object obj6 = list2.get(2);
                n3.s[] sVarArr = n3.q.f8753b;
                e0 e0Var = f0.f1343q;
                Boolean bool = Boolean.FALSE;
                i9.l.a(obj6, bool);
                n3.q qVar3 = obj6 != null ? (n3.q) e0Var.f1323b.invoke(obj6) : null;
                i9.l.b(qVar3);
                long j5 = qVar3.f8755a;
                Object obj7 = list2.get(3);
                m3.q qVar4 = m3.q.f8429c;
                m3.q qVar5 = (i9.l.a(obj7, bool) || obj7 == null) ? null : (m3.q) ((h9.k) f0.f1338l.f12991c).invoke(obj7);
                Object obj8 = list2.get(4);
                x xVar = (i9.l.a(obj8, bool) || obj8 == null) ? null : (x) ((h9.k) g0.f1349a.f12991c).invoke(obj8);
                Object obj9 = list2.get(5);
                m3.i iVar7 = m3.i.f8413c;
                m3.i iVar8 = (i9.l.a(obj9, bool) || obj9 == null) ? null : (m3.i) ((h9.k) f0.f1347u.f12991c).invoke(obj9);
                Object obj10 = list2.get(6);
                m3.e eVar = (i9.l.a(obj10, bool) || obj10 == null) ? null : (m3.e) ((h9.k) g0.f1350b.f12991c).invoke(obj10);
                i9.l.b(eVar);
                int i12 = eVar.f8407a;
                Object obj11 = list2.get(7);
                m3.d dVar = obj11 != null ? (m3.d) obj11 : null;
                i9.l.b(dVar);
                int i13 = dVar.f8405a;
                Object obj12 = list2.get(8);
                return new v(i10, i11, j5, qVar5, xVar, iVar8, i12, i13, (i9.l.a(obj12, bool) || obj12 == null) ? null : (m3.s) ((h9.k) g0.f1351c.f12991c).invoke(obj12));
            case 3:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj13 = list3.get(0);
                int i14 = y1.q.f14959n;
                Boolean bool2 = Boolean.FALSE;
                i9.l.a(obj13, bool2);
                if (obj13 != null) {
                    qVar = obj13.equals(bool2) ? new y1.q(y1.q.f14958m) : new y1.q(y1.h0.c(((Integer) obj13).intValue()));
                } else {
                    qVar = null;
                }
                i9.l.b(qVar);
                long j10 = qVar.f14960a;
                Object obj14 = list3.get(1);
                n3.s[] sVarArr2 = n3.q.f8753b;
                h9.k kVar2 = f0.f1343q.f1323b;
                i9.l.a(obj14, bool2);
                n3.q qVar6 = obj14 != null ? (n3.q) kVar2.invoke(obj14) : null;
                i9.l.b(qVar6);
                long j11 = qVar6.f8755a;
                Object obj15 = list3.get(2);
                f3.k kVar3 = f3.k.f5257b;
                f3.k kVar4 = (i9.l.a(obj15, bool2) || obj15 == null) ? null : (f3.k) ((h9.k) f0.f1339m.f12991c).invoke(obj15);
                Object obj16 = list3.get(3);
                f3.i iVar9 = obj16 != null ? (f3.i) obj16 : null;
                Object obj17 = list3.get(4);
                f3.j jVar = obj17 != null ? (f3.j) obj17 : null;
                Object obj18 = list3.get(6);
                String str3 = obj18 != null ? (String) obj18 : null;
                Object obj19 = list3.get(7);
                i9.l.a(obj19, bool2);
                n3.q qVar7 = obj19 != null ? (n3.q) kVar2.invoke(obj19) : null;
                i9.l.b(qVar7);
                long j12 = qVar7.f8755a;
                Object obj20 = list3.get(8);
                m3.a aVar = (i9.l.a(obj20, bool2) || obj20 == null) ? null : (m3.a) ((h9.k) f0.f1340n.f12991c).invoke(obj20);
                Object obj21 = list3.get(9);
                m3.p pVar = (i9.l.a(obj21, bool2) || obj21 == null) ? null : (m3.p) ((h9.k) f0.k.f12991c).invoke(obj21);
                Object obj22 = list3.get(10);
                i3.b bVar = i3.b.f6613c;
                i3.b bVar2 = (i9.l.a(obj22, bool2) || obj22 == null) ? null : (i3.b) ((h9.k) f0.f1345s.f12991c).invoke(obj22);
                Object obj23 = list3.get(11);
                i9.l.a(obj23, bool2);
                if (obj23 != null) {
                    qVar2 = obj23.equals(bool2) ? new y1.q(y1.q.f14958m) : new y1.q(y1.h0.c(((Integer) obj23).intValue()));
                } else {
                    qVar2 = null;
                }
                i9.l.b(qVar2);
                long j13 = qVar2.f14960a;
                Object obj24 = list3.get(12);
                m3.l lVar = (i9.l.a(obj24, bool2) || obj24 == null) ? null : (m3.l) ((h9.k) f0.f1337j.f12991c).invoke(obj24);
                Object obj25 = list3.get(13);
                y1.k0 k0Var = y1.k0.f14924d;
                return new h0(j10, j11, kVar4, iVar9, jVar, (f3.n) null, str3, j12, aVar, pVar, bVar2, j13, lVar, (i9.l.a(obj25, bool2) || obj25 == null) ? null : (y1.k0) ((h9.k) f0.f1341o.f12991c).invoke(obj25), 49184);
            case 4:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list4 = (List) obj;
                Object obj26 = list4.get(0);
                Boolean bool3 = obj26 != null ? (Boolean) obj26 : null;
                i9.l.b(bool3);
                boolean zBooleanValue = bool3.booleanValue();
                Object obj27 = list4.get(1);
                i9.l.b(obj27 != null ? (k) obj27 : null);
                return new x(zBooleanValue);
            case 5:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new m3.e(((Integer) obj).intValue());
            case 6:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj28 = list5.get(0);
                m3.r rVar = obj28 != null ? (m3.r) obj28 : null;
                i9.l.b(rVar);
                int i15 = rVar.f8432a;
                Object obj29 = list5.get(1);
                Boolean bool4 = obj29 != null ? (Boolean) obj29 : null;
                i9.l.b(bool4);
                return new m3.s(i15, bool4.booleanValue());
            case 7:
                m2 m2Var = (m2) obj;
                i9.l.e(m2Var, "it");
                return m2Var.f1616c;
            case 8:
                m2 m2Var2 = (m2) obj;
                i9.l.e(m2Var2, "it");
                return m2Var2.f1616c;
            case 9:
                y8.f fVar = (y8.f) obj;
                if (fVar instanceof cc.u) {
                    return (cc.u) fVar;
                }
                return null;
            case 10:
                m2 m2Var3 = (m2) obj;
                i9.l.e(m2Var3, "it");
                return m2Var3.f1617d;
            case 11:
                n2 n2Var = (n2) obj;
                i9.l.e(n2Var, "it");
                return n2Var.f1625c;
            case 12:
                m2 m2Var4 = (m2) obj;
                i9.l.e(m2Var4, "it");
                return m2Var4.f1617d;
            case 13:
                n2 n2Var2 = (n2) obj;
                i9.l.e(n2Var2, "it");
                return n2Var2.f1625c;
            case 14:
                m2 m2Var5 = (m2) obj;
                i9.l.e(m2Var5, "it");
                return m2Var5.f1617d;
            case 15:
                n2 n2Var3 = (n2) obj;
                i9.l.e(n2Var3, "it");
                return n2Var3.f1625c;
            case 16:
                List list6 = (List) obj;
                return new f0.u(((Number) list6.get(0)).intValue(), ((Number) list6.get(1)).intValue());
            case 17:
                return zVar;
            case 18:
                l8.j0 j0Var = (l8.j0) obj;
                i9.l.e(j0Var, "it");
                int iA = j0Var.f8197b.a();
                f2.f1583c.getClass();
                e2.a(iA);
                return zVar;
            case 19:
                List list7 = (List) obj;
                return new g0.v(((Number) list7.get(0)).intValue(), ((Number) list7.get(1)).intValue());
            case 20:
                ((Integer) obj).getClass();
                g0.n nVar = g0.x.f5759a;
                return u8.w.f13122a;
            case 21:
                ((Integer) obj).getClass();
                g0.n nVar2 = g0.x.f5759a;
                return -1;
            case 22:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                fc.h0 h0Var = g8.i.f6024i;
                fc.h0 h0Var2 = g8.i.f6024i;
                do {
                    value = h0Var2.getValue();
                    iVar = (g8.i) value;
                    i9.l.e(iVar, "$this$update");
                } while (!h0Var2.f(value, g8.i.a(iVar, 0, 0, 0, 0, zBooleanValue2, false, 191)));
                return Boolean.TRUE;
            case 23:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                fc.h0 h0Var3 = g8.i.f6024i;
                fc.h0 h0Var4 = g8.i.f6024i;
                do {
                    value2 = h0Var4.getValue();
                    iVar2 = (g8.i) value2;
                    i9.l.e(iVar2, "$this$update");
                } while (!h0Var4.f(value2, g8.i.a(iVar2, 0, 0, 0, 0, false, zBooleanValue3, 127)));
                return Boolean.TRUE;
            case 24:
                l8.j0 j0Var2 = (l8.j0) obj;
                i9.l.e(j0Var2, "it");
                fc.h0 h0Var5 = g8.i.f6024i;
                fc.h0 h0Var6 = g8.i.f6024i;
                do {
                    value3 = h0Var6.getValue();
                    iVar3 = (g8.i) value3;
                    i9.l.e(iVar3, "$this$update");
                } while (!h0Var6.f(value3, g8.i.a(iVar3, 0, 0, 0, j0Var2.f8197b.a(), false, false, 239)));
                return zVar;
            case 25:
                int iIntValue = ((Integer) obj).intValue();
                fc.h0 h0Var7 = g8.i.f6024i;
                fc.h0 h0Var8 = g8.i.f6024i;
                do {
                    value4 = h0Var8.getValue();
                    iVar4 = (g8.i) value4;
                    i9.l.e(iVar4, "$this$update");
                } while (!h0Var8.f(value4, g8.i.a(iVar4, iIntValue, 0, 0, 0, false, false, 254)));
                return zVar;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                int iIntValue2 = ((Integer) obj).intValue();
                fc.h0 h0Var9 = g8.i.f6024i;
                fc.h0 h0Var10 = g8.i.f6024i;
                do {
                    value5 = h0Var10.getValue();
                    iVar5 = (g8.i) value5;
                    i9.l.e(iVar5, "$this$update");
                } while (!h0Var10.f(value5, g8.i.a(iVar5, 0, iIntValue2, 0, 0, false, false, 253)));
                return zVar;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                l8.j0 j0Var3 = (l8.j0) obj;
                i9.l.e(j0Var3, "it");
                fc.h0 h0Var11 = g8.i.f6024i;
                fc.h0 h0Var12 = g8.i.f6024i;
                do {
                    value6 = h0Var12.getValue();
                    iVar6 = (g8.i) value6;
                    i9.l.e(iVar6, "$this$update");
                } while (!h0Var12.f(value6, g8.i.a(iVar6, 0, 0, j0Var3.f8197b.a(), 0, false, false, 251)));
                return zVar;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                int i16 = l0.j.f7688a;
                return zVar;
            default:
                Long l10 = (Long) obj;
                l10.longValue();
                return l10;
        }
    }
}
