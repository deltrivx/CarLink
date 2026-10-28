package l4;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8021b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8022c = -1;

    public p(int i7) {
        this.f8020a = i7;
    }

    @Override // l4.o
    public final Object O() {
        return this;
    }

    @Override // l4.o
    public final boolean R(CharSequence charSequence, int i7, int i10, w wVar) {
        int i11 = this.f8020a;
        if (i7 > i11 || i11 >= i10) {
            return i10 <= i11;
        }
        this.f8021b = i7;
        this.f8022c = i10;
        return false;
    }
}
