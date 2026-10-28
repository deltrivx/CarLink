package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f2830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f2831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f2832c;

    public p1(b2 b2Var, z zVar, l1 l1Var) {
        this.f2831b = b2Var;
        zVar.getClass();
        this.f2832c = zVar;
        this.f2830a = l1Var;
    }

    @Override // com.google.protobuf.x1
    public final void a(Object obj, f1 f1Var) {
        this.f2832c.getClass();
        a2.f.N(obj);
        throw null;
    }

    @Override // com.google.protobuf.x1
    public final void b(Object obj, Object obj2) {
        y1.x(this.f2831b, obj, obj2);
    }

    @Override // com.google.protobuf.x1
    public final void c(Object obj, q qVar, y yVar) {
        this.f2831b.getClass();
        b2.a(obj);
        this.f2832c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.protobuf.x1
    public final void d(Object obj) {
        this.f2831b.getClass();
        ((j0) obj).unknownFields.f2717e = false;
        this.f2832c.getClass();
        a2.f.N(obj);
        throw null;
    }

    @Override // com.google.protobuf.x1
    public final boolean e(Object obj) {
        this.f2832c.getClass();
        a2.f.N(obj);
        throw null;
    }

    @Override // com.google.protobuf.x1
    public final void f(Object obj, byte[] bArr, int i7, int i10, f fVar) {
        j0 j0Var = (j0) obj;
        if (j0Var.unknownFields == a2.f2712f) {
            j0Var.unknownFields = new a2();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.protobuf.x1
    public final int g(j0 j0Var) {
        this.f2831b.getClass();
        return j0Var.unknownFields.hashCode();
    }

    @Override // com.google.protobuf.x1
    public final int h(j0 j0Var) {
        this.f2831b.getClass();
        a2 a2Var = j0Var.unknownFields;
        int i7 = a2Var.f2716d;
        if (i7 != -1) {
            return i7;
        }
        int iV = 0;
        for (int i10 = 0; i10 < a2Var.f2713a; i10++) {
            int i11 = a2Var.f2714b[i10] >>> 3;
            l lVar = (l) a2Var.f2715c[i10];
            iV += u.V(3, lVar) + u.d0(2, i11) + (u.c0(1) * 2);
        }
        a2Var.f2716d = iV;
        return iV;
    }

    @Override // com.google.protobuf.x1
    public final boolean i(j0 j0Var, j0 j0Var2) {
        this.f2831b.getClass();
        return j0Var.unknownFields.equals(j0Var2.unknownFields);
    }

    @Override // com.google.protobuf.x1
    public final Object j() {
        l1 l1Var = this.f2830a;
        return l1Var instanceof j0 ? ((j0) l1Var).newMutableInstance() : l1Var.newBuilderForType().buildPartial();
    }
}
