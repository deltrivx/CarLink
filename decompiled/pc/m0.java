package pc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nc.e[] f10476a = new nc.e[0];

    public static final x a(String str, mc.a aVar) {
        return new x(str, new y(aVar));
    }

    public static final nc.e[] b(List list) {
        nc.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (nc.e[]) list.toArray(new nc.e[0])) == null) ? f10476a : eVarArr;
    }

    public static final int c(nc.e eVar, nc.e[] eVarArr) {
        i9.l.e(eVarArr, "typeParams");
        int iHashCode = (eVar.h().hashCode() * 31) + Arrays.hashCode(eVarArr);
        i9.b bVar = new i9.b(eVar);
        int iHashCode2 = 1;
        int i7 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!bVar.hasNext()) {
                break;
            }
            int i10 = i7 * 31;
            String strH = ((nc.e) bVar.next()).h();
            if (strH != null) {
                iHashCode3 = strH.hashCode();
            }
            i7 = i10 + iHashCode3;
        }
        i9.b bVar2 = new i9.b(eVar);
        while (bVar2.hasNext()) {
            int i11 = iHashCode2 * 31;
            n4.h hVarF = ((nc.e) bVar2.next()).f();
            iHashCode2 = i11 + (hVarF != null ? hVarF.hashCode() : 0);
        }
        return (((iHashCode * 31) + i7) * 31) + iHashCode2;
    }

    public static final Set d(nc.e eVar) {
        i9.l.e(eVar, "<this>");
        if (eVar instanceof j) {
            return ((j) eVar).a();
        }
        HashSet hashSet = new HashSet(eVar.k());
        int iK = eVar.k();
        for (int i7 = 0; i7 < iK; i7++) {
            hashSet.add(eVar.l(i7));
        }
        return hashSet;
    }

    public static final void e(int i7, int i10, nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i11 = (~i7) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                arrayList.add(eVar.l(i12));
            }
            i11 >>>= 1;
        }
        String strH = eVar.h();
        i9.l.e(strH, "serialName");
        throw new mc.b(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strH + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strH + "', but they were missing", null);
    }

    public static final void f(String str, o9.c cVar) {
        String str2;
        i9.l.e(cVar, "baseClass");
        String str3 = "in the polymorphic scope of '" + cVar.l() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + cVar.l() + "' has to be sealed and '@Serializable'.";
        }
        throw new mc.e(str2);
    }

    public static final String g(nc.e eVar) {
        return u8.p.q0(n3.r.e0(0, eVar.k()), ", ", eVar.h() + '(', ")", new c8.k(25, eVar), 24);
    }
}
