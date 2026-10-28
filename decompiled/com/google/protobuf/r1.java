package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1 f2841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f2842b;

    static {
        q1 q1Var = null;
        try {
            q1Var = (q1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2841a = q1Var;
        f2842b = new q1();
    }
}
