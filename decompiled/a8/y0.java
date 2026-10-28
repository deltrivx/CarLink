package a8;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285a;

    public /* synthetic */ y0(int i7) {
        this.f285a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        y1.q qVar;
        int i7 = this.f285a;
        t8.z zVar = t8.z.f12851a;
        b3.h0 h0Var = null;
        lVar = null;
        b3.l lVar = null;
        mVar = null;
        b3.m mVar = null;
        s0Var = null;
        b3.s0 s0Var = null;
        t0Var = null;
        b3.t0 t0Var = null;
        h0Var = null;
        b3.h0 h0Var2 = null;
        vVar = null;
        b3.v vVar = null;
        p0Var = null;
        b3.p0 p0Var = null;
        h0Var = null;
        boolean z10 = true;
        int i10 = 0;
        switch (i7) {
            case 0:
                i9.l.e((String) obj, "it");
                return zVar;
            case 1:
                String str = (String) obj;
                i9.l.e(str, "it");
                hc.c cVar = n8.c.f8897a;
                n8.c.j(0, str);
                return zVar;
            case 2:
                String str2 = (String) obj;
                i9.l.e(str2, "it");
                hc.c cVar2 = n8.c.f8897a;
                n8.c.j(0, str2);
                return zVar;
            case 3:
                String str3 = (String) obj;
                i9.l.e(str3, "it");
                hc.c cVar3 = n8.c.f8897a;
                n8.c.j(0, str3);
                Logger.INSTANCE.d("CarLife_Vehicle", "【WiFi连接】".concat(str3));
                return zVar;
            case 4:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 5:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 6:
                char cCharValue = ((Character) obj).charValue();
                if (cCharValue != 'T' && cCharValue != 't') {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 7:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 8:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 9:
                char cCharValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= cCharValue2 && cCharValue2 < ':');
            case 10:
                return Boolean.valueOf(!(((b3.c) obj) instanceof b3.v));
            case 11:
                b3.s sVar = (b3.s) obj;
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(sVar.f1442b);
                sb2.append(", ");
                return a2.f.H(sb2, sVar.f1443c, ')');
            case 12:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                h9.k kVar = (h9.k) b3.f0.f1335h.f12991c;
                Boolean bool = Boolean.FALSE;
                b3.h0 h0Var3 = (i9.l.a(obj2, bool) || obj2 == null) ? null : (b3.h0) kVar.invoke(obj2);
                Object obj3 = list.get(1);
                b3.h0 h0Var4 = (i9.l.a(obj3, bool) || obj3 == null) ? null : (b3.h0) kVar.invoke(obj3);
                Object obj4 = list.get(2);
                b3.h0 h0Var5 = (i9.l.a(obj4, bool) || obj4 == null) ? null : (b3.h0) kVar.invoke(obj4);
                Object obj5 = list.get(3);
                if (!i9.l.a(obj5, bool) && obj5 != null) {
                    h0Var = (b3.h0) kVar.invoke(obj5);
                }
                return new b3.p0(h0Var3, h0Var4, h0Var5, h0Var);
            case 13:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (i9.l.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((h9.k) b3.f0.f1328a.f12991c).invoke(obj6);
                Object obj7 = list2.get(0);
                String str4 = obj7 != null ? (String) obj7 : null;
                i9.l.b(str4);
                return new b3.h(list3, str4);
            case 14:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new m3.l(((Integer) obj).intValue());
            case 15:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list4 = (List) obj;
                return new m3.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 16:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                n3.s[] sVarArr = n3.q.f8753b;
                h9.k kVar2 = b3.f0.f1343q.f1323b;
                Boolean bool2 = Boolean.FALSE;
                i9.l.a(obj8, bool2);
                n3.q qVar2 = obj8 != null ? (n3.q) kVar2.invoke(obj8) : null;
                i9.l.b(qVar2);
                long j5 = qVar2.f8755a;
                Object obj9 = list5.get(1);
                i9.l.a(obj9, bool2);
                n3.q qVar3 = obj9 != null ? (n3.q) kVar2.invoke(obj9) : null;
                i9.l.b(qVar3);
                return new m3.q(j5, qVar3.f8755a);
            case 17:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new f3.k(((Integer) obj).intValue());
            case 18:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.Float");
                return new m3.a(((Float) obj).floatValue());
            case 19:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                i9.l.b(num);
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                i9.l.b(num2);
                return new b3.q0(b3.g0.b(iIntValue, num2.intValue()));
            case 20:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i11 = y1.q.f14959n;
                Boolean bool3 = Boolean.FALSE;
                i9.l.a(obj12, bool3);
                if (obj12 != null) {
                    qVar = i9.l.a(obj12, Boolean.FALSE) ? new y1.q(y1.q.f14958m) : new y1.q(y1.h0.c(((Integer) obj12).intValue()));
                } else {
                    qVar = null;
                }
                i9.l.b(qVar);
                long j10 = qVar.f14960a;
                Object obj13 = list7.get(1);
                b3.e0 e0Var = b3.f0.f1344r;
                i9.l.a(obj13, bool3);
                x1.b bVar = obj13 != null ? (x1.b) e0Var.f1323b.invoke(obj13) : null;
                i9.l.b(bVar);
                long j11 = bVar.f14521a;
                Object obj14 = list7.get(2);
                Float f10 = obj14 != null ? (Float) obj14 : null;
                i9.l.b(f10);
                return new y1.k0(f10.floatValue(), j10, j11);
            case 21:
                if (i9.l.a(obj, Boolean.FALSE)) {
                    return new n3.q(n3.q.f8754c);
                }
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                Float f11 = obj15 != null ? (Float) obj15 : null;
                i9.l.b(f11);
                float fFloatValue = f11.floatValue();
                Object obj16 = list8.get(1);
                n3.s sVar2 = obj16 != null ? (n3.s) obj16 : null;
                i9.l.b(sVar2);
                return new n3.q(n3.r.K(fFloatValue, sVar2.f8762a));
            case 22:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                String str5 = obj17 != null ? (String) obj17 : null;
                i9.l.b(str5);
                Object obj18 = list9.get(1);
                u0.k kVar3 = b3.f0.f1336i;
                if (!i9.l.a(obj18, Boolean.FALSE) && obj18 != null) {
                    p0Var = (b3.p0) ((h9.k) kVar3.f12991c).invoke(obj18);
                }
                return new b3.m(str5, p0Var);
            case 23:
                if (i9.l.a(obj, Boolean.FALSE)) {
                    return new x1.b(9205357640488583168L);
                }
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj19 = list10.get(0);
                Float f12 = obj19 != null ? (Float) obj19 : null;
                i9.l.b(f12);
                float fFloatValue2 = f12.floatValue();
                Object obj20 = list10.get(1);
                Float f13 = obj20 != null ? (Float) obj20 : null;
                i9.l.b(f13);
                return new x1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f13.floatValue())) & 4294967295L));
            case 24:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list11 = (List) obj;
                ArrayList arrayList = new ArrayList(list11.size());
                int size = list11.size();
                while (i10 < size) {
                    Object obj21 = list11.get(i10);
                    i3.a aVar = (i9.l.a(obj21, Boolean.FALSE) || obj21 == null) ? null : (i3.a) ((h9.k) b3.f0.f1346t.f12991c).invoke(obj21);
                    i9.l.b(aVar);
                    arrayList.add(aVar);
                    i10++;
                }
                return new i3.b(arrayList);
            case 25:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i10 < size2) {
                    Object obj22 = list12.get(i10);
                    b3.f fVar = (i9.l.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (b3.f) ((h9.k) b3.f0.f1329b.f12991c).invoke(obj22);
                    i9.l.b(fVar);
                    arrayList2.add(fVar);
                    i10++;
                }
                return arrayList2;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.String");
                return new i3.a(i3.d.f6616a.p((String) obj));
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                m3.f fVar2 = obj23 != null ? (m3.f) obj23 : null;
                i9.l.b(fVar2);
                float f14 = fVar2.f8411a;
                Object obj24 = list13.get(1);
                m3.h hVar = obj24 != null ? (m3.h) obj24 : null;
                i9.l.b(hVar);
                int i12 = hVar.f8412a;
                Object obj25 = list13.get(2);
                i9.l.b(obj25 != null ? (m3.g) obj25 : null);
                return new m3.i(f14, i12);
            default:
                i9.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj26 = list14.get(0);
                b3.j jVar = obj26 != null ? (b3.j) obj26 : null;
                i9.l.b(jVar);
                Object obj27 = list14.get(2);
                Integer num3 = obj27 != null ? (Integer) obj27 : null;
                i9.l.b(num3);
                int iIntValue2 = num3.intValue();
                Object obj28 = list14.get(3);
                Integer num4 = obj28 != null ? (Integer) obj28 : null;
                i9.l.b(num4);
                int iIntValue3 = num4.intValue();
                Object obj29 = list14.get(4);
                String str6 = obj29 != null ? (String) obj29 : null;
                i9.l.b(str6);
                switch (jVar.ordinal()) {
                    case 0:
                        Object obj30 = list14.get(1);
                        u0.k kVar4 = b3.f0.f1334g;
                        if (!i9.l.a(obj30, Boolean.FALSE) && obj30 != null) {
                            vVar = (b3.v) ((h9.k) kVar4.f12991c).invoke(obj30);
                        }
                        i9.l.b(vVar);
                        return new b3.f(vVar, iIntValue2, iIntValue3, str6);
                    case 1:
                        Object obj31 = list14.get(1);
                        u0.k kVar5 = b3.f0.f1335h;
                        if (!i9.l.a(obj31, Boolean.FALSE) && obj31 != null) {
                            h0Var2 = (b3.h0) ((h9.k) kVar5.f12991c).invoke(obj31);
                        }
                        i9.l.b(h0Var2);
                        return new b3.f(h0Var2, iIntValue2, iIntValue3, str6);
                    case 2:
                        Object obj32 = list14.get(1);
                        u0.k kVar6 = b3.f0.f1330c;
                        if (!i9.l.a(obj32, Boolean.FALSE) && obj32 != null) {
                            t0Var = (b3.t0) ((h9.k) kVar6.f12991c).invoke(obj32);
                        }
                        i9.l.b(t0Var);
                        return new b3.f(t0Var, iIntValue2, iIntValue3, str6);
                    case 3:
                        Object obj33 = list14.get(1);
                        u0.k kVar7 = b3.f0.f1331d;
                        if (!i9.l.a(obj33, Boolean.FALSE) && obj33 != null) {
                            s0Var = (b3.s0) ((h9.k) kVar7.f12991c).invoke(obj33);
                        }
                        i9.l.b(s0Var);
                        return new b3.f(s0Var, iIntValue2, iIntValue3, str6);
                    case 4:
                        Object obj34 = list14.get(1);
                        u0.k kVar8 = b3.f0.f1332e;
                        if (!i9.l.a(obj34, Boolean.FALSE) && obj34 != null) {
                            mVar = (b3.m) ((h9.k) kVar8.f12991c).invoke(obj34);
                        }
                        i9.l.b(mVar);
                        return new b3.f(mVar, iIntValue2, iIntValue3, str6);
                    case 5:
                        Object obj35 = list14.get(1);
                        u0.k kVar9 = b3.f0.f1333f;
                        if (!i9.l.a(obj35, Boolean.FALSE) && obj35 != null) {
                            lVar = (b3.l) ((h9.k) kVar9.f12991c).invoke(obj35);
                        }
                        i9.l.b(lVar);
                        return new b3.f(lVar, iIntValue2, iIntValue3, str6);
                    case 6:
                        Object obj36 = list14.get(1);
                        String str7 = obj36 != null ? (String) obj36 : null;
                        i9.l.b(str7);
                        return new b3.f(new b3.k0(str7), iIntValue2, iIntValue3, str6);
                    default:
                        throw new cc.s();
                }
        }
    }
}
