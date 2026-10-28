package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f2709a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f2710b;

    static {
        z zVar = null;
        try {
            zVar = (z) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2710b = zVar;
    }
}
