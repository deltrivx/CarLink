package f1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s.d0 f5007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.d0 f5008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s.v f5009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5010d;

    public l(s.d0 d0Var, s.d0 d0Var2, s.v vVar, int i7, Exception exc) {
        super(exc);
        this.f5007a = d0Var;
        this.f5008b = d0Var2;
        this.f5009c = vVar;
        this.f5010d = i7;
    }

    @Override // java.lang.Throwable
    public final String getMessage() throws IOException {
        List listI;
        String strSubstring;
        StringBuilder sb2 = new StringBuilder("\n            |Exception while applying pausable composition. Last 10 operations:\n            |");
        yb.k kVarE = n3.u.E(new k(this, null));
        boolean zHasNext = kVarE.hasNext();
        List listI2 = u8.w.f13122a;
        if (zHasNext) {
            Object next = kVarE.next();
            if (kVarE.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (kVarE.hasNext()) {
                    arrayList.add(kVarE.next());
                }
                listI = arrayList;
            } else {
                listI = n3.l.I(next);
            }
        } else {
            listI = listI2;
        }
        sb2.append(u8.p.q0(u8.p.G0(10, listI), "\n", null, null, null, 62));
        sb2.append("\n            ");
        String string = sb2.toString();
        i9.l.e(string, "<this>");
        if (zb.j.B0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        zb.h hVar = new zb.h(string);
        if (hVar.hasNext()) {
            Object next2 = hVar.next();
            if (hVar.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(next2);
                while (hVar.hasNext()) {
                    arrayList2.add(hVar.next());
                }
                listI2 = arrayList2;
            } else {
                listI2 = n3.l.I(next2);
            }
        }
        int length = string.length();
        listI2.size();
        int iA = n3.l.A(listI2);
        ArrayList arrayList3 = new ArrayList();
        int i7 = 0;
        for (Object obj : listI2) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                n3.l.Y();
                throw null;
            }
            String str = (String) obj;
            if ((i7 == 0 || i7 == iA) && zb.j.B0(str)) {
                str = null;
            } else {
                int length2 = str.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i11 = -1;
                        break;
                    }
                    if (!n3.l.H(str.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && str.startsWith("|", i11)) {
                    strSubstring = str.substring(1 + i11);
                    i9.l.d(strSubstring, "substring(...)");
                } else {
                    strSubstring = null;
                }
                if (strSubstring != null) {
                    str = strSubstring;
                }
            }
            if (str != null) {
                arrayList3.add(str);
            }
            i7 = i10;
        }
        StringBuilder sb3 = new StringBuilder(length);
        u8.p.p0(arrayList3, sb3, "\n", null, null, null, 124);
        return sb3.toString();
    }
}
