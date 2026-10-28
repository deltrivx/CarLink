package i1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends u8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1.c f6582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6584c;

    public a(j1.c cVar, int i7, int i10) {
        this.f6582a = cVar;
        this.f6583b = i7;
        a.a.p(i7, i10, cVar.c());
        this.f6584c = i10 - i7;
    }

    @Override // u8.a
    public final int c() {
        return this.f6584c;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        a.a.n(i7, this.f6584c);
        return this.f6582a.get(this.f6583b + i7);
    }

    @Override // u8.e, java.util.List
    public final List subList(int i7, int i10) {
        a.a.p(i7, i10, this.f6584c);
        int i11 = this.f6583b;
        return new a(this.f6582a, i7 + i11, i11 + i10);
    }
}
