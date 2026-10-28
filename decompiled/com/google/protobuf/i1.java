package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f2767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h1 f2768b;

    static {
        h1 h1Var = null;
        try {
            h1Var = (h1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2767a = h1Var;
        f2768b = new h1();
    }
}
