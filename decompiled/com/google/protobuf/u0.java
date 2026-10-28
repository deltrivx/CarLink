package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f2861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f2862b;

    static {
        Charset.forName("US-ASCII");
        f2861a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2862b = bArr;
        ByteBuffer.wrap(bArr);
        p.f(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }
}
