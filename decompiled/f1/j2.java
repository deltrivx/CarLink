package f1;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements Iterable, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2 f4996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4998c;

    public j2(i2 i2Var, int i7, int i10) {
        this.f4996a = i2Var;
        this.f4997b = i7;
        this.f4998c = i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        i2 i2Var = this.f4996a;
        if (i2Var.f4992h != this.f4998c) {
            k2.f();
        }
        int i7 = this.f4997b;
        i2Var.o(i7);
        return new m0(i2Var, i7 + 1, k2.a(i2Var.f4985a, i7) + i7);
    }
}
