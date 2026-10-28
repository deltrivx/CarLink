package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b2 {
    public static a2 a(Object obj) {
        j0 j0Var = (j0) obj;
        a2 a2Var = j0Var.unknownFields;
        if (a2Var != a2.f2712f) {
            return a2Var;
        }
        a2 a2Var2 = new a2();
        j0Var.unknownFields = a2Var2;
        return a2Var2;
    }

    public static boolean b(Object obj, q qVar) throws w0 {
        int i7 = qVar.f2834b;
        p pVar = (p) qVar.f2837e;
        int i10 = i7 >>> 3;
        int i11 = i7 & 7;
        if (i11 == 0) {
            qVar.y(0);
            ((a2) obj).f(i10 << 3, Long.valueOf(pVar.r()));
            return true;
        }
        if (i11 == 1) {
            qVar.y(1);
            ((a2) obj).f((i10 << 3) | 1, Long.valueOf(pVar.o()));
            return true;
        }
        if (i11 == 2) {
            ((a2) obj).f((i10 << 3) | 2, qVar.h());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw w0.c();
            }
            qVar.y(5);
            ((a2) obj).f((i10 << 3) | 5, Integer.valueOf(pVar.n()));
            return true;
        }
        a2 a2Var = new a2();
        int i12 = i10 << 3;
        int i13 = i12 | 4;
        while (qVar.b() != Integer.MAX_VALUE && b(a2Var, qVar)) {
        }
        if (i13 != qVar.f2834b) {
            throw new w0("Protocol message end-group tag did not match expected tag.");
        }
        a2Var.f2717e = false;
        ((a2) obj).f(i12 | 3, a2Var);
        return true;
    }
}
