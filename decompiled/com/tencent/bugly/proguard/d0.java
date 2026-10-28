package com.tencent.bugly.proguard;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3405b;

    public d0(String str, String str2) {
        this.f3404a = str;
        this.f3405b = str2;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str != null && str.startsWith(this.f3404a) && str.endsWith(this.f3405b);
    }
}
