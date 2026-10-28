package zb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n3.r;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends r {
    public static String g0(String str) throws IOException {
        List listI;
        int length;
        Comparable comparable;
        i9.l.e(str, "<this>");
        h hVar = new h(str);
        if (hVar.hasNext()) {
            Object next = hVar.next();
            if (hVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (hVar.hasNext()) {
                    arrayList.add(hVar.next());
                }
                listI = arrayList;
            } else {
                listI = n3.l.I(next);
            }
        } else {
            listI = w.f13122a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listI) {
            if (!j.B0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(u8.q.a0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!n3.l.H(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList3.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listI.size();
        int iA = n3.l.A(listI);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : listI) {
            int i7 = length + 1;
            if (length < 0) {
                n3.l.Y();
                throw null;
            }
            String str3 = (String) obj2;
            String strT0 = ((length == 0 || length == iA) && j.B0(str3)) ? null : j.t0(iIntValue, str3);
            if (strT0 != null) {
                arrayList4.add(strT0);
            }
            length = i7;
        }
        StringBuilder sb2 = new StringBuilder(length3);
        u8.p.p0(arrayList4, sb2, "\n", null, null, null, 124);
        return sb2.toString();
    }
}
