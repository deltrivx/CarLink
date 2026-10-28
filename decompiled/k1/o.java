package k1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7180d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7180d) {
            case 0:
                int i7 = this.f7179c;
                this.f7179c = i7 + 2;
                Object[] objArr = this.f7177a;
                return new a(0, objArr[i7], objArr[i7 + 1]);
            case 1:
                int i10 = this.f7179c;
                this.f7179c = i10 + 2;
                return this.f7177a[i10];
            default:
                int i11 = this.f7179c;
                this.f7179c = i11 + 2;
                return this.f7177a[i11 + 1];
        }
    }
}
