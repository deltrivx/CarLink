package f1;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v2 implements Iterable, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2 f5179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f5181c;

    public v2(i2 i2Var, int i7, n0 n0Var, b bVar) {
        this.f5179a = i2Var;
        this.f5180b = i7;
        this.f5181c = bVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new m0(this.f5179a, this.f5180b, null, this.f5181c);
    }
}
