package lb;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.y;
import i9.z;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ra.a0;
import ra.i0;
import ra.u0;
import u8.c0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f8341j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f8343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f8344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mb.e f8345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mb.e f8346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f1.e f8347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mb.i f8348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mb.i f8349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f8350i;

    static {
        i9.r rVar = new i9.r(n.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0);
        z zVar = y.f6689a;
        f8341j = new o9.u[]{zVar.g(rVar), ob.a.v(n.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, zVar)};
    }

    public n(o oVar, List list, List list2, List list3) {
        i9.l.e(list, "functionList");
        i9.l.e(list2, "propertyList");
        i9.l.e(list3, "typeAliasList");
        this.f8350i = oVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            wa.e eVarG = i2.c.G(oVar.f8352b.f7044b, ((a0) ((xa.a) obj)).f11807f);
            Object arrayList = linkedHashMap.get(eVarG);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(eVarG, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f8342a = a(linkedHashMap);
        o oVar2 = this.f8350i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            wa.e eVarG2 = i2.c.G(oVar2.f8352b.f7044b, ((i0) ((xa.a) obj2)).f12011f);
            Object arrayList2 = linkedHashMap2.get(eVarG2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(eVarG2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.f8343b = a(linkedHashMap2);
        this.f8350i.f8352b.f7043a.f7020c.getClass();
        o oVar3 = this.f8350i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            wa.e eVarG3 = i2.c.G(oVar3.f8352b.f7044b, ((u0) ((xa.a) obj3)).f12212e);
            Object arrayList3 = linkedHashMap3.get(eVarG3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(eVarG3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.f8344c = a(linkedHashMap3);
        this.f8345d = this.f8350i.f8352b.f7043a.f7018a.b(new l(this, 0));
        this.f8346e = this.f8350i.f8352b.f7043a.f7018a.b(new l(this, 1));
        this.f8347f = this.f8350i.f8352b.f7043a.f7018a.c(new l(this, 2));
        o oVar4 = this.f8350i;
        mb.k kVar = oVar4.f8352b.f7043a.f7018a;
        m mVar = new m(this, oVar4, 0);
        kVar.getClass();
        this.f8348g = new mb.i(kVar, mVar);
        o oVar5 = this.f8350i;
        mb.k kVar2 = oVar5.f8352b.f7043a.f7018a;
        m mVar2 = new m(this, oVar5, 1);
        kVar2.getClass();
        this.f8349h = new mb.i(kVar2, mVar2);
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c0.S0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<xa.a> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(u8.q.a0(iterable, 10));
            for (xa.a aVar : iterable) {
                int iA = aVar.a();
                int iH = d3.e.h(iA) + iA;
                if (iH > 4096) {
                    iH = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
                }
                d3.e eVarS = d3.e.s(byteArrayOutputStream, iH);
                eVarS.J(iA);
                aVar.d(eVarS);
                eVarS.k();
                arrayList.add(t8.z.f12851a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
