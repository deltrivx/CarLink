package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class bp extends m implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static ArrayList<bo> f3330b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<bo> f3331a = null;

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        if (f3330b == null) {
            f3330b = new ArrayList<>();
            f3330b.add(new bo());
        }
        this.f3331a = (ArrayList) kVar.a(f3330b, 0, true);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a((Collection) this.f3331a, 0);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i7) {
    }
}
