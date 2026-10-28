package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j1[] f2738a;

    @Override // com.google.protobuf.j1
    public final w1 a(Class cls) {
        for (j1 j1Var : this.f2738a) {
            if (j1Var.b(cls)) {
                return j1Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.j1
    public final boolean b(Class cls) {
        for (j1 j1Var : this.f2738a) {
            if (j1Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
