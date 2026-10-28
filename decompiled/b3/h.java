package b3;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1355d;

    static {
        u0.k kVar = f0.f1328a;
    }

    public /* synthetic */ h(String str) {
        this(str, u8.w.f13122a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(String str, ArrayList arrayList, int i7) {
        List list = (i7 & 2) != 0 ? u8.w.f13122a : arrayList;
        h hVar = i.f1371a;
        this(list.isEmpty() ? null : list, str);
    }

    public h(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }

    public h(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f1352a = list;
        this.f1353b = str;
        int i7 = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) list.get(i10);
                Object obj = fVar.f1324a;
                if (obj instanceof h0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(fVar);
                } else if (obj instanceof v) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(fVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f1354c = arrayList;
        this.f1355d = arrayList2;
        List listE0 = arrayList2 != null ? u8.p.E0(arrayList2, new g(i7)) : null;
        if (listE0 == null || listE0.isEmpty()) {
            return;
        }
        int i11 = ((f) u8.p.k0(listE0)).f1326c;
        s.v vVar = s.j.f12449a;
        s.v vVar2 = new s.v(1);
        vVar2.a(i11);
        int size2 = listE0.size();
        for (int i12 = 1; i12 < size2; i12++) {
            f fVar2 = (f) listE0.get(i12);
            while (true) {
                int i13 = vVar2.f12509b;
                if (i13 == 0) {
                    break;
                }
                if (i13 == 0) {
                    t.a.e("IntList is empty.");
                    throw null;
                }
                int i14 = vVar2.f12508a[i13 - 1];
                int i15 = fVar2.f1325b;
                int i16 = fVar2.f1326c;
                if (i15 < i14) {
                    if (i16 > i14) {
                        h3.a.a("Paragraph overlap not allowed, end " + i16 + " should be less than or equal to " + i14);
                        break;
                    }
                    break;
                }
                vVar2.c(i13 - 1);
            }
            vVar2.a(fVar2.f1326c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h subSequence(int i7, int i10) {
        ArrayList arrayList;
        if (!(i7 <= i10)) {
            h3.a.a("start (" + i7 + ") should be less or equal to end (" + i10 + ')');
        }
        String str = this.f1353b;
        if (i7 == 0 && i10 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i7, i10);
        i9.l.d(strSubstring, "substring(...)");
        h hVar = i.f1371a;
        if (i7 > i10) {
            h3.a.a("start (" + i7 + ") should be less than or equal to end (" + i10 + ')');
        }
        List list = this.f1352a;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar = (f) list.get(i11);
                int i12 = fVar.f1325b;
                int i13 = fVar.f1326c;
                if (i.b(i7, i10, i12, i13)) {
                    arrayList.add(new f(fVar.f1324a, Math.max(i7, fVar.f1325b) - i7, Math.min(i10, i13) - i7, fVar.f1327d));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new h(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f1353b.charAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return i9.l.a(this.f1353b, hVar.f1353b) && i9.l.a(this.f1352a, hVar.f1352a);
    }

    public final int hashCode() {
        int iHashCode = this.f1353b.hashCode() * 31;
        List list = this.f1352a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1353b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1353b;
    }
}
