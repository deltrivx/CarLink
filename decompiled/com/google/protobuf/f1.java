package com.google.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f2743b = new d0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2744a;

    public f1() {
        j1 j1Var;
        try {
            j1Var = (j1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            j1Var = f2743b;
        }
        j1[] j1VarArr = {d0.f2730b, j1Var};
        e1 e1Var = new e1();
        e1Var.f2738a = j1VarArr;
        Charset charset = u0.f2861a;
        this.f2744a = e1Var;
    }

    public f1(u uVar) {
        u0.a(uVar, "output");
        this.f2744a = uVar;
        uVar.f2860j = this;
    }

    public void a(int i7, l lVar) {
        ((u) this.f2744a).j0(i7, lVar);
    }

    public void b(int i7, int i10) {
        ((u) this.f2744a).k0(i7, i10);
    }

    public void c(int i7, long j5) {
        ((u) this.f2744a).m0(i7, j5);
    }

    public void d(int i7, Object obj, x1 x1Var) {
        u uVar = (u) this.f2744a;
        uVar.s0(i7, 3);
        x1Var.a((l1) obj, uVar.f2860j);
        uVar.s0(i7, 4);
    }

    public void e(int i7, int i10) {
        ((u) this.f2744a).o0(i7, i10);
    }

    public void f(int i7, long j5) {
        ((u) this.f2744a).v0(i7, j5);
    }

    public void g(int i7, Object obj, x1 x1Var) {
        ((u) this.f2744a).q0(i7, (l1) obj, x1Var);
    }
}
