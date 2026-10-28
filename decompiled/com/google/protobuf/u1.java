package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u1 f2863c = new u1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2865b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f2864a = new f1();

    public final x1 a(Class cls) {
        x1 x1VarC;
        Class cls2;
        u0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f2865b;
        x1 x1Var = (x1) concurrentHashMap.get(cls);
        if (x1Var != null) {
            return x1Var;
        }
        f1 f1Var = this.f2864a;
        f1Var.getClass();
        Class cls3 = y1.f2891a;
        if (!j0.class.isAssignableFrom(cls) && (cls2 = y1.f2891a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        w1 w1VarA = ((e1) f1Var.f2744a).a(cls);
        int i7 = w1VarA.f2876d;
        l1 l1Var = w1VarA.f2873a;
        if ((i7 & 2) == 2) {
            if (j0.class.isAssignableFrom(cls)) {
                x1VarC = new p1(y1.f2894d, a0.f2709a, l1Var);
            } else {
                b2 b2Var = y1.f2892b;
                z zVar = a0.f2710b;
                if (zVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                x1VarC = new p1(b2Var, zVar, l1Var);
            }
        } else if (j0.class.isAssignableFrom(cls)) {
            x1VarC = (w1VarA.f2876d & 1) == 1 ? o1.C(w1VarA, r1.f2842b, c1.f2727b, y1.f2894d, a0.f2709a, i1.f2768b) : o1.C(w1VarA, r1.f2842b, c1.f2727b, y1.f2894d, null, i1.f2768b);
        } else if ((w1VarA.f2876d & 1) == 1) {
            q1 q1Var = r1.f2841a;
            a1 a1Var = c1.f2726a;
            b2 b2Var2 = y1.f2892b;
            z zVar2 = a0.f2710b;
            if (zVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            x1VarC = o1.C(w1VarA, q1Var, a1Var, b2Var2, zVar2, i1.f2767a);
        } else {
            x1VarC = o1.C(w1VarA, r1.f2841a, c1.f2726a, y1.f2893c, null, i1.f2767a);
        }
        x1 x1Var2 = (x1) concurrentHashMap.putIfAbsent(cls, x1VarC);
        return x1Var2 != null ? x1Var2 : x1VarC;
    }
}
