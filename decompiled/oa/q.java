package oa;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9620a;

    public q(int i7) {
        switch (i7) {
            case 1:
                this.f9620a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f9620a = new LinkedHashMap();
                break;
        }
    }
}
