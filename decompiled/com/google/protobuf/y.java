package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile y f2888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f2889b;

    static {
        y yVar = new y();
        Map map = Collections.EMPTY_MAP;
        f2889b = yVar;
    }

    public static y a() {
        y yVar;
        y yVar2 = f2888a;
        if (yVar2 != null) {
            return yVar2;
        }
        synchronized (y.class) {
            try {
                yVar = f2888a;
                if (yVar == null) {
                    Class cls = x.f2877a;
                    y yVar3 = null;
                    if (cls != null) {
                        try {
                            yVar3 = (y) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    yVar = yVar3 != null ? yVar3 : f2889b;
                    f2888a = yVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yVar;
    }
}
