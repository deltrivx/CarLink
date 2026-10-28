package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class bm extends m implements Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static ArrayList<String> f3298c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3299a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<String> f3300b = null;

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f3299a = kVar.b(0, true);
        if (f3298c == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            f3298c = arrayList;
            arrayList.add("");
        }
        this.f3300b = (ArrayList) kVar.a(f3298c, 1, false);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f3299a, 0);
        ArrayList<String> arrayList = this.f3300b;
        if (arrayList != null) {
            lVar.a((Collection) arrayList, 1);
        }
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i7) {
    }
}
