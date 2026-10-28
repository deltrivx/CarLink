package com.tencent.bugly.crashreport.crash.jni;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
    }
}
