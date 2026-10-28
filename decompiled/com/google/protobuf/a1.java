package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f2711c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i7, long j5, Object obj) {
        List listE;
        List list = (List) j2.f2774c.k(j5, obj);
        if (list.isEmpty()) {
            if (list instanceof z0) {
                listE = new y0(i7);
            } else {
                listE = ((list instanceof t1) && (list instanceof t0)) ? ((t0) list).e(i7) : new ArrayList(i7);
            }
            j2.p(j5, obj, listE);
            return listE;
        }
        if (f2711c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i7);
            arrayList.addAll(list);
            j2.p(j5, obj, arrayList);
            return arrayList;
        }
        if (list instanceof e2) {
            y0 y0Var = new y0(list.size() + i7);
            y0Var.addAll((e2) list);
            j2.p(j5, obj, y0Var);
            return y0Var;
        }
        if ((list instanceof t1) && (list instanceof t0)) {
            t0 t0Var = (t0) list;
            if (!((d) t0Var).f2729a) {
                t0 t0VarE = t0Var.e(list.size() + i7);
                j2.p(j5, obj, t0VarE);
                return t0VarE;
            }
        }
        return list;
    }

    @Override // com.google.protobuf.c1
    public final void a(long j5, Object obj) {
        Object objUnmodifiableList;
        List list = (List) j2.f2774c.k(j5, obj);
        if (list instanceof z0) {
            objUnmodifiableList = ((z0) list).b();
        } else {
            if (f2711c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof t1) && (list instanceof t0)) {
                d dVar = (d) ((t0) list);
                if (dVar.f2729a) {
                    dVar.f2729a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        j2.p(j5, obj, objUnmodifiableList);
    }

    @Override // com.google.protobuf.c1
    public final void b(long j5, Object obj, Object obj2) {
        List list = (List) j2.f2774c.k(j5, obj2);
        List listD = d(list.size(), j5, obj);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        j2.p(j5, obj, list);
    }

    @Override // com.google.protobuf.c1
    public final List c(long j5, Object obj) {
        return d(10, j5, obj);
    }
}
