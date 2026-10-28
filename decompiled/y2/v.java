package y2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import s.w;
import w0.c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator[] f15081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f15082b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i7 = 0;
        while (i7 < 2) {
            comparatorArr[i7] = new nb.u(3, new nb.u(i7 == 0 ? e.f14976c : e.f14975b));
            i7++;
        }
        f15081a = comparatorArr;
        f15082b = q.f15048t;
    }

    public static final void a(m mVar, ArrayList arrayList, b2.a aVar, b2.a aVar2, w wVar) {
        j jVar = mVar.f15020d;
        Object objG = jVar.f15011a.g(r.f15061m);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) aVar2.invoke(mVar)).booleanValue()) && ((Boolean) aVar.invoke(mVar)).booleanValue()) {
            arrayList.add(mVar);
        }
        if (zBooleanValue) {
            wVar.h(mVar.f15023g, b(mVar, aVar, aVar2, m.j(7, mVar)));
            return;
        }
        List listJ = m.j(7, mVar);
        int size = listJ.size();
        for (int i7 = 0; i7 < size; i7++) {
            a((m) listJ.get(i7), arrayList, aVar, aVar2, wVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d3  */
    public static final ArrayList b(m mVar, b2.a aVar, b2.a aVar2, List list) {
        char c10;
        w wVar = s.l.f12468a;
        w wVar2 = new w();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            a((m) list.get(i7), arrayList, aVar, aVar2, wVar2);
        }
        char c11 = mVar.f15019c.f10690y == n3.o.f8750b ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int iA = n3.l.A(arrayList);
        if (iA >= 0) {
            int i10 = 0;
            while (true) {
                m mVar2 = (m) arrayList.get(i10);
                if (i10 == 0) {
                    c10 = 0;
                    x1.c cVarH = mVar2.h();
                    m[] mVarArr = new m[1];
                    mVarArr[c10] = mVar2;
                    arrayList2.add(new t8.j(cVarH, n3.l.L(mVarArr)));
                    break;
                }
                float f10 = mVar2.h().f14524b;
                float f11 = mVar2.h().f14526d;
                boolean z10 = f10 >= f11;
                int iA2 = n3.l.A(arrayList2);
                if (iA2 >= 0) {
                    int i11 = 0;
                    while (true) {
                        c10 = 0;
                        x1.c cVar = (x1.c) ((t8.j) arrayList2.get(i11)).f12830a;
                        float f12 = cVar.f14524b;
                        float f13 = cVar.f14526d;
                        boolean z11 = f12 >= f13;
                        if (!z10 && !z11 && Math.max(f10, f12) < Math.min(f11, f13)) {
                            arrayList2.set(i11, new t8.j(new x1.c(Math.max(cVar.f14523a, 0.0f), Math.max(cVar.f14524b, f10), Math.min(cVar.f14525c, Float.POSITIVE_INFINITY), Math.min(f13, f11)), ((t8.j) arrayList2.get(i11)).f12831b));
                            ((List) ((t8.j) arrayList2.get(i11)).f12831b).add(mVar2);
                            break;
                        }
                        if (i11 != iA2) {
                            i11++;
                        }
                    }
                } else {
                    c10 = 0;
                }
                x1.c cVarH2 = mVar2.h();
                m[] mVarArr2 = new m[1];
                mVarArr2[c10] = mVar2;
                arrayList2.add(new t8.j(cVarH2, n3.l.L(mVarArr2)));
                break;
                if (i10 == iA) {
                    break;
                }
                i10++;
            }
        }
        u8.t.b0(arrayList2, e.f14977d);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f15081a[c11 ^ 1];
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            t8.j jVar = (t8.j) arrayList2.get(i12);
            u8.t.b0((List) jVar.f12831b, comparator);
            arrayList3.addAll((Collection) jVar.f12831b);
        }
        u8.t.b0(arrayList3, new c1(2, f15082b));
        int size3 = 0;
        while (size3 <= n3.l.A(arrayList3)) {
            List list2 = (List) wVar2.b(((m) arrayList3.get(size3)).f15023g);
            if (list2 != null) {
                if (((Boolean) aVar2.invoke(arrayList3.get(size3))).booleanValue()) {
                    size3++;
                } else {
                    arrayList3.remove(size3);
                }
                arrayList3.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList3;
    }
}
