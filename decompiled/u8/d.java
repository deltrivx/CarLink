package u8;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f13104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13106c;

    public d(e eVar, int i7, int i10) {
        this.f13104a = eVar;
        this.f13105b = i7;
        n3.u.n(i7, i10, eVar.c());
        this.f13106c = i10 - i7;
    }

    @Override // u8.a
    public final int c() {
        return this.f13106c;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int i10 = this.f13106c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        return this.f13104a.get(this.f13105b + i7);
    }

    @Override // u8.e, java.util.List
    public final List subList(int i7, int i10) {
        n3.u.n(i7, i10, this.f13106c);
        int i11 = this.f13105b;
        return new d(this.f13104a, i7 + i11, i11 + i10);
    }
}
