package com.google.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends c1 {
    @Override // com.google.protobuf.c1
    public final void a(long j5, Object obj) {
        ((d) ((t0) j2.f2774c.k(j5, obj))).f2729a = false;
    }

    @Override // com.google.protobuf.c1
    public final void b(long j5, Object obj, Object obj2) {
        i2 i2Var = j2.f2774c;
        t0 t0VarE = (t0) i2Var.k(j5, obj);
        t0 t0Var = (t0) i2Var.k(j5, obj2);
        int size = t0VarE.size();
        int size2 = t0Var.size();
        if (size > 0 && size2 > 0) {
            if (!((d) t0VarE).f2729a) {
                t0VarE = t0VarE.e(size2 + size);
            }
            t0VarE.addAll(t0Var);
        }
        if (size > 0) {
            t0Var = t0VarE;
        }
        j2.p(j5, obj, t0Var);
    }

    @Override // com.google.protobuf.c1
    public final List c(long j5, Object obj) {
        t0 t0Var = (t0) j2.f2774c.k(j5, obj);
        if (((d) t0Var).f2729a) {
            return t0Var;
        }
        int size = t0Var.size();
        t0 t0VarE = t0Var.e(size == 0 ? 10 : size * 2);
        j2.p(j5, obj, t0VarE);
        return t0VarE;
    }
}
