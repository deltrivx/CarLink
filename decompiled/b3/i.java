package b3;

import a8.y0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f1371a = new h("");

    public static final List a(h hVar, int i7, int i10, y0 y0Var) {
        List list;
        if (i7 == i10 || (list = hVar.f1352a) == null) {
            return null;
        }
        if (i7 != 0 || i10 < hVar.f1353b.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar = (f) list.get(i11);
                if ((y0Var != null ? ((Boolean) y0Var.invoke(fVar.f1324a)).booleanValue() : true) && b(i7, i10, fVar.f1325b, fVar.f1326c)) {
                    arrayList.add(new f((c) fVar.f1324a, n3.r.m(fVar.f1325b, i7, i10) - i7, n3.r.m(fVar.f1326c, i7, i10) - i7, fVar.f1327d));
                }
            }
            return arrayList;
        }
        if (y0Var == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Object obj = list.get(i12);
            if (((Boolean) y0Var.invoke(((f) obj).f1324a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i7, int i10, int i11, int i12) {
        return ((i7 < i12) & (i11 < i10)) | (((i7 == i10) | (i11 == i12)) & (i7 == i11));
    }
}
