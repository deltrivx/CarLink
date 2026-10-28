package mc;

import i9.l;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o9.e0;
import rc.s;
import t8.i;
import u8.b0;
import u8.c0;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o9.c f8634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f8637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f8638e;

    public d(o9.c cVar, o9.c[] cVarArr, a[] aVarArr, Annotation[] annotationArr) {
        l.e(cVar, "baseClass");
        this.f8634a = cVar;
        this.f8635b = w.f13122a;
        this.f8636c = t8.a.c(i.f12827a, new a5.e(14, this));
        if (cVarArr.length != aVarArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + cVar.l() + " should be marked @Serializable");
        }
        Map mapZ0 = b0.Z0(u8.l.N0(cVarArr, aVarArr));
        this.f8637d = mapZ0;
        Set<Map.Entry> setEntrySet = mapZ0.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strH = ((a) entry.getValue()).d().h();
            Object obj = linkedHashMap.get(strH);
            if (obj == null) {
                linkedHashMap.containsKey(strH);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.f8634a + "' have the same serial name '" + strH + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(strH, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c0.S0(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (a) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f8638e = linkedHashMap2;
        this.f8635b = u8.l.j0(annotationArr);
    }

    @Override // mc.a
    public final void a(s sVar, Object obj) {
        l.e(obj, "value");
        a aVarV = e0.v(this, sVar, obj);
        nc.e eVarD = d();
        s sVarA = sVar.a(eVarD);
        sVarA.s(d(), 0, aVarV.d().h());
        sVarA.o(d(), 1, aVarV, obj);
        sVarA.t(eVarD);
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        nc.e eVarD = d();
        oc.a aVarM = bVar.m(eVarD);
        Object objT = null;
        String strS = null;
        while (true) {
            int iW = aVarM.w(d());
            if (iW == -1) {
                if (objT == null) {
                    throw new IllegalArgumentException(ob.a.q("Polymorphic value has not been read for class ", strS).toString());
                }
                aVarM.p(eVarD);
                return objT;
            }
            if (iW == 0) {
                strS = aVarM.s(d(), iW);
            } else {
                if (iW != 1) {
                    StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strS == null) {
                        strS = "unknown class";
                    }
                    sb2.append(strS);
                    sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb2.append(iW);
                    throw new e(sb2.toString());
                }
                if (strS == null) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                objT = aVarM.t(d(), iW, e0.u(this, aVarM, strS), null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // mc.a
    public final nc.e d() {
        return (nc.e) this.f8636c.getValue();
    }
}
