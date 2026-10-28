package com.tencent.bugly.proguard;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Serializable {
    public abstract void a(k kVar);

    public abstract void a(l lVar);

    public abstract void a(StringBuilder sb2, int i7);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        a(sb2, 0);
        return sb2.toString();
    }
}
