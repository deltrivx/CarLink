package ua;

import xa.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum h implements o {
    NONE(0),
    INTERNAL_TO_CLASS_ID(1),
    DESC_TO_CLASS_ID(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13278a;

    h(int i7) {
        this.f13278a = i7;
    }

    @Override // xa.o
    public final int getNumber() {
        return this.f13278a;
    }
}
