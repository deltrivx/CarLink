package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s2 f2845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s2 f2846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s2 f2847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s2 f2848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s2 f2849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s2 f2850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s2 f2851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s2 f2852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s2 f2853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ s2[] f2854j;

    static {
        s2 s2Var = new s2("INT", 0);
        f2845a = s2Var;
        s2 s2Var2 = new s2("LONG", 1);
        f2846b = s2Var2;
        s2 s2Var3 = new s2("FLOAT", 2);
        f2847c = s2Var3;
        s2 s2Var4 = new s2("DOUBLE", 3);
        f2848d = s2Var4;
        s2 s2Var5 = new s2("BOOLEAN", 4);
        f2849e = s2Var5;
        s2 s2Var6 = new s2("STRING", 5);
        f2850f = s2Var6;
        k kVar = l.f2785b;
        s2 s2Var7 = new s2("BYTE_STRING", 6);
        f2851g = s2Var7;
        s2 s2Var8 = new s2("ENUM", 7);
        f2852h = s2Var8;
        s2 s2Var9 = new s2("MESSAGE", 8);
        f2853i = s2Var9;
        f2854j = new s2[]{s2Var, s2Var2, s2Var3, s2Var4, s2Var5, s2Var6, s2Var7, s2Var8, s2Var9};
    }

    public static s2 valueOf(String str) {
        return (s2) Enum.valueOf(s2.class, str);
    }

    public static s2[] values() {
        return (s2[]) f2854j.clone();
    }
}
