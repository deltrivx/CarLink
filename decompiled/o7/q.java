package o7;

import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.CarLife;
import fc.h0;
import java.util.Map;
import l8.j0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9512a;

    public /* synthetic */ q(int i7) {
        this.f9512a = i7;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // h9.k
    public final Object invoke(Object obj) {
        Object value;
        u uVar;
        Object value2;
        q7.i iVar;
        Object value3;
        q7.i iVar2;
        Object value4;
        q7.i iVar3;
        Object value5;
        q7.i iVar4;
        Object value6;
        q7.i iVar5;
        Object value7;
        r7.b bVar;
        Object value8;
        r7.b bVar2;
        Object value9;
        r7.b bVar3;
        Object value10;
        r7.b bVar4;
        Object value11;
        s7.e eVar;
        Object value12;
        s7.e eVar2;
        Object value13;
        s7.e eVar3;
        Object value14;
        u7.h hVar;
        Object value15;
        u7.h hVar2;
        Object value16;
        u7.h hVar3;
        Object value17;
        u7.h hVar4;
        Object value18;
        u7.h hVar5;
        Object value19;
        u7.h hVar6;
        Object value20;
        u7.h hVar7;
        Object value21;
        u7.h hVar8;
        Object value22;
        u7.h hVar9;
        switch (this.f9512a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                t8.o oVar = n8.d.f8898a;
                n8.d.f(zBooleanValue ? 1 : 0, Configs.CONFIG_WIFI_DIRECT_GROUP);
                CarLife.receiver().setConfig(Configs.CONFIG_WIFI_DIRECT_GROUP, Integer.valueOf(zBooleanValue ? 1 : 0));
                return Boolean.TRUE;
            case 1:
                String str = (String) obj;
                i9.l.e(str, "it");
                h0 h0Var = u.f9519o;
                h0 h0Var2 = u.f9519o;
                do {
                    value = h0Var2.getValue();
                    uVar = (u) value;
                    i9.l.e(uVar, "$this$update");
                } while (!h0Var2.f(value, u.a(uVar, null, null, 0, str, 0, null, 0, null, null, null, 65503)));
                t8.o oVar2 = n8.d.f8898a;
                n8.d.g(Configs.CONFIG_WIFI_DIRECT_NAME, str);
                CarLife.receiver().setConfig(Configs.CONFIG_WIFI_DIRECT_NAME, str);
                return z.f12851a;
            case 2:
                synchronized (p1.l.f10057c) {
                    ?? r8 = p1.l.f10063i;
                    int size = r8.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((h9.k) r8.get(i7)).invoke(obj);
                    }
                }
                return z.f12851a;
            case 3:
                q qVar = p1.l.f10055a;
                return z.f12851a;
            case 4:
                j0 j0Var = (j0) obj;
                i9.l.e(j0Var, "it");
                h0 h0Var3 = q7.i.f10981f;
                h0 h0Var4 = q7.i.f10981f;
                do {
                    value2 = h0Var4.getValue();
                    iVar = (q7.i) value2;
                    i9.l.e(iVar, "$this$update");
                } while (!h0Var4.f(value2, q7.i.a(iVar, j0Var.f8197b.a(), 0, 0, 0, 0, 30)));
                return z.f12851a;
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                h0 h0Var5 = q7.i.f10981f;
                h0 h0Var6 = q7.i.f10981f;
                do {
                    value3 = h0Var6.getValue();
                    iVar2 = (q7.i) value3;
                    i9.l.e(iVar2, "$this$update");
                } while (!h0Var6.f(value3, q7.i.a(iVar2, 0, iIntValue, 0, 0, 0, 29)));
                return z.f12851a;
            case 6:
                int iIntValue2 = ((Integer) obj).intValue();
                h0 h0Var7 = q7.i.f10981f;
                h0 h0Var8 = q7.i.f10981f;
                do {
                    value4 = h0Var8.getValue();
                    iVar3 = (q7.i) value4;
                    i9.l.e(iVar3, "$this$update");
                } while (!h0Var8.f(value4, q7.i.a(iVar3, 0, 0, iIntValue2, 0, 0, 27)));
                return z.f12851a;
            case 7:
                int iIntValue3 = ((Integer) obj).intValue();
                h0 h0Var9 = q7.i.f10981f;
                h0 h0Var10 = q7.i.f10981f;
                do {
                    value5 = h0Var10.getValue();
                    iVar4 = (q7.i) value5;
                    i9.l.e(iVar4, "$this$update");
                } while (!h0Var10.f(value5, q7.i.a(iVar4, 0, 0, 0, iIntValue3, 0, 23)));
                return z.f12851a;
            case 8:
                int iIntValue4 = ((Integer) obj).intValue();
                h0 h0Var11 = q7.i.f10981f;
                h0 h0Var12 = q7.i.f10981f;
                do {
                    value6 = h0Var12.getValue();
                    iVar5 = (q7.i) value6;
                    i9.l.e(iVar5, "$this$update");
                } while (!h0Var12.f(value6, q7.i.a(iVar5, 0, 0, 0, 0, iIntValue4, 15)));
                return z.f12851a;
            case 9:
                nc.a aVar = (nc.a) obj;
                i9.l.e(aVar, "$this$buildSerialDescriptor");
                nc.a.a(aVar, "JsonPrimitive", new qc.m(new n8.f(15)));
                nc.a.a(aVar, "JsonNull", new qc.m(new n8.f(16)));
                nc.a.a(aVar, "JsonLiteral", new qc.m(new n8.f(17)));
                nc.a.a(aVar, "JsonObject", new qc.m(new n8.f(18)));
                nc.a.a(aVar, "JsonArray", new qc.m(new n8.f(19)));
                return z.f12851a;
            case 10:
                Map.Entry entry = (Map.Entry) obj;
                i9.l.e(entry, "<destruct>");
                String str2 = (String) entry.getKey();
                qc.j jVar = (qc.j) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                rc.u.a(str2, sb2);
                sb2.append(':');
                sb2.append(jVar);
                return sb2.toString();
            case 11:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                h0 h0Var13 = r7.b.f11640e;
                h0 h0Var14 = r7.b.f11640e;
                do {
                    value7 = h0Var14.getValue();
                    bVar = (r7.b) value7;
                    i9.l.e(bVar, "$this$update");
                } while (!h0Var14.f(value7, r7.b.a(bVar, zBooleanValue2, 0, 0, 0, 14)));
                return Boolean.TRUE;
            case 12:
                int iIntValue5 = ((Integer) obj).intValue();
                h0 h0Var15 = r7.b.f11640e;
                h0 h0Var16 = r7.b.f11640e;
                do {
                    value8 = h0Var16.getValue();
                    bVar2 = (r7.b) value8;
                    i9.l.e(bVar2, "$this$update");
                } while (!h0Var16.f(value8, r7.b.a(bVar2, false, iIntValue5, 0, 0, 13)));
                return z.f12851a;
            case 13:
                int iIntValue6 = ((Integer) obj).intValue();
                h0 h0Var17 = r7.b.f11640e;
                h0 h0Var18 = r7.b.f11640e;
                do {
                    value9 = h0Var18.getValue();
                    bVar3 = (r7.b) value9;
                    i9.l.e(bVar3, "$this$update");
                } while (!h0Var18.f(value9, r7.b.a(bVar3, false, 0, iIntValue6, 0, 11)));
                return z.f12851a;
            case 14:
                int iIntValue7 = ((Integer) obj).intValue();
                h0 h0Var19 = r7.b.f11640e;
                h0 h0Var20 = r7.b.f11640e;
                do {
                    value10 = h0Var20.getValue();
                    bVar4 = (r7.b) value10;
                    i9.l.e(bVar4, "$this$update");
                } while (!h0Var20.f(value10, r7.b.a(bVar4, false, 0, 0, iIntValue7, 7)));
                return z.f12851a;
            case 15:
                int iIntValue8 = ((Integer) obj).intValue();
                h0 h0Var21 = s7.e.f12587e;
                h0 h0Var22 = s7.e.f12587e;
                do {
                    value11 = h0Var22.getValue();
                    eVar = (s7.e) value11;
                    i9.l.e(eVar, "$this$update");
                } while (!h0Var22.f(value11, s7.e.a(eVar, false, iIntValue8, 0, 0, 13)));
                return z.f12851a;
            case 16:
                int iIntValue9 = ((Integer) obj).intValue();
                h0 h0Var23 = s7.e.f12587e;
                h0 h0Var24 = s7.e.f12587e;
                do {
                    value12 = h0Var24.getValue();
                    eVar2 = (s7.e) value12;
                    i9.l.e(eVar2, "$this$update");
                } while (!h0Var24.f(value12, s7.e.a(eVar2, false, 0, iIntValue9, 0, 11)));
                return z.f12851a;
            case 17:
                int iIntValue10 = ((Integer) obj).intValue();
                h0 h0Var25 = s7.e.f12587e;
                h0 h0Var26 = s7.e.f12587e;
                do {
                    value13 = h0Var26.getValue();
                    eVar3 = (s7.e) value13;
                    i9.l.e(eVar3, "$this$update");
                } while (!h0Var26.f(value13, s7.e.a(eVar3, false, 0, 0, iIntValue10, 7)));
                return z.f12851a;
            case 18:
                return z.f12851a;
            case 19:
                return z.f12851a;
            case 20:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                h0 h0Var27 = u7.h.f13084n;
                h0 h0Var28 = u7.h.f13084n;
                do {
                    value14 = h0Var28.getValue();
                    hVar = (u7.h) value14;
                    i9.l.e(hVar, "$this$update");
                } while (!h0Var28.f(value14, u7.h.a(hVar, zBooleanValue3, 0, null, 0, 0, 0, null, null, 0, false, 0, 0, 0, 16382)));
                return Boolean.TRUE;
            case 21:
                j0 j0Var2 = (j0) obj;
                i9.l.e(j0Var2, "it");
                h0 h0Var29 = u7.h.f13084n;
                h0 h0Var30 = u7.h.f13084n;
                do {
                    value15 = h0Var30.getValue();
                    hVar2 = (u7.h) value15;
                    i9.l.e(hVar2, "$this$update");
                } while (!h0Var30.f(value15, u7.h.a(hVar2, false, 0, null, 0, 0, 0, j0Var2.f8197b.b(), null, 0, false, 0, 0, 0, 16319)));
                return z.f12851a;
            case 22:
                String str3 = (String) obj;
                i9.l.e(str3, "it");
                h0 h0Var31 = u7.h.f13084n;
                h0 h0Var32 = u7.h.f13084n;
                do {
                    value16 = h0Var32.getValue();
                    hVar3 = (u7.h) value16;
                    i9.l.e(hVar3, "$this$update");
                } while (!h0Var32.f(value16, u7.h.a(hVar3, false, 0, str3, 0, 0, 0, null, null, 0, false, 0, 0, 0, 16379)));
                return z.f12851a;
            case 23:
                int iIntValue11 = ((Integer) obj).intValue();
                h0 h0Var33 = u7.h.f13084n;
                h0 h0Var34 = u7.h.f13084n;
                do {
                    value17 = h0Var34.getValue();
                    hVar4 = (u7.h) value17;
                    i9.l.e(hVar4, "$this$update");
                } while (!h0Var34.f(value17, u7.h.a(hVar4, false, 0, null, iIntValue11, 0, 0, null, null, 0, false, 0, 0, 0, 16375)));
                return z.f12851a;
            case 24:
                String str4 = (String) obj;
                i9.l.e(str4, "it");
                h0 h0Var35 = u7.h.f13084n;
                h0 h0Var36 = u7.h.f13084n;
                while (true) {
                    Object value23 = h0Var36.getValue();
                    u7.h hVar10 = (u7.h) value23;
                    i9.l.e(hVar10, "$this$update");
                    String str5 = str4;
                    if (h0Var36.f(value23, u7.h.a(hVar10, false, 0, null, 0, 0, 0, null, str5, 0, false, 0, 0, 0, 16255))) {
                        return z.f12851a;
                    }
                    str4 = str5;
                }
                break;
            case 25:
                int iIntValue12 = ((Integer) obj).intValue();
                h0 h0Var37 = u7.h.f13084n;
                h0 h0Var38 = u7.h.f13084n;
                do {
                    value18 = h0Var38.getValue();
                    hVar5 = (u7.h) value18;
                    i9.l.e(hVar5, "$this$update");
                } while (!h0Var38.f(value18, u7.h.a(hVar5, false, 0, null, 0, 0, 0, null, null, iIntValue12, false, 0, 0, 0, 16127)));
                return z.f12851a;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                int iIntValue13 = ((Integer) obj).intValue();
                h0 h0Var39 = u7.h.f13084n;
                h0 h0Var40 = u7.h.f13084n;
                do {
                    value19 = h0Var40.getValue();
                    hVar6 = (u7.h) value19;
                    i9.l.e(hVar6, "$this$update");
                } while (!h0Var40.f(value19, u7.h.a(hVar6, false, 0, null, 0, 0, 0, null, null, 0, false, iIntValue13, 0, 0, 15359)));
                return z.f12851a;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                h0 h0Var41 = u7.h.f13084n;
                h0 h0Var42 = u7.h.f13084n;
                do {
                    value20 = h0Var42.getValue();
                    hVar7 = (u7.h) value20;
                    i9.l.e(hVar7, "$this$update");
                } while (!h0Var42.f(value20, u7.h.a(hVar7, false, 0, null, 0, 0, 0, null, null, 0, zBooleanValue4, 0, 0, 0, 15871)));
                return Boolean.TRUE;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                j0 j0Var3 = (j0) obj;
                i9.l.e(j0Var3, "it");
                h0 h0Var43 = u7.h.f13084n;
                h0 h0Var44 = u7.h.f13084n;
                do {
                    value21 = h0Var44.getValue();
                    hVar8 = (u7.h) value21;
                    i9.l.e(hVar8, "$this$update");
                } while (!h0Var44.f(value21, u7.h.a(hVar8, false, j0Var3.f8197b.a(), null, 0, 0, 0, null, null, 0, false, 0, 0, 0, 16381)));
                return z.f12851a;
            default:
                int iIntValue14 = ((Integer) obj).intValue();
                h0 h0Var45 = u7.h.f13084n;
                h0 h0Var46 = u7.h.f13084n;
                do {
                    value22 = h0Var46.getValue();
                    hVar9 = (u7.h) value22;
                    i9.l.e(hVar9, "$this$update");
                } while (!h0Var46.f(value22, u7.h.a(hVar9, false, 0, null, 0, iIntValue14, 0, null, null, 0, false, 0, 0, 0, 16367)));
                return z.f12851a;
        }
    }
}
