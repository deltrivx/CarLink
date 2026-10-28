package v9;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import zb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f13705b = new m(n3.l.J(g.f13697c, j.f13700c, h.f13698c, i.f13699c));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13706a;

    public m(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            wa.c cVar = ((k) obj).f13701a;
            Object arrayList = linkedHashMap.get(cVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVar, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f13706a = linkedHashMap;
    }

    public final l a(String str, wa.c cVar) {
        Integer numValueOf;
        i9.l.e(cVar, "packageFqName");
        i9.l.e(str, "className");
        List<k> list = (List) this.f13706a.get(cVar);
        if (list != null) {
            for (k kVar : list) {
                if (q.o0(str, kVar.f13702b)) {
                    String strSubstring = str.substring(kVar.f13702b.length());
                    i9.l.d(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        numValueOf = null;
                        break;
                    }
                    int length = strSubstring.length();
                    int i7 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i7 >= length) {
                            numValueOf = Integer.valueOf(i10);
                            break;
                        }
                        int iCharAt = strSubstring.charAt(i7) - '0';
                        if (iCharAt < 0 || iCharAt >= 10) {
                            numValueOf = null;
                            break;
                        }
                        i10 = (i10 * 10) + iCharAt;
                        i7++;
                    }
                    if (numValueOf != null) {
                        return new l(kVar, numValueOf.intValue());
                    }
                }
            }
        }
        return null;
    }
}
