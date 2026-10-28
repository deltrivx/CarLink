package f1;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5042a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2 f5043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5046e;

    public m0(i2 i2Var, int i7, int i10) {
        this.f5043b = i2Var;
        this.f5044c = i10;
        this.f5045d = i7;
        this.f5046e = i2Var.f4992h;
        if (i2Var.f4991g) {
            k2.f();
        }
    }

    public m0(i2 i2Var, int i7, n0 n0Var, b bVar) {
        this.f5043b = i2Var;
        this.f5044c = i7;
        this.f5045d = i2Var.f4992h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5042a) {
            case 0:
                return this.f5045d < this.f5044c;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5042a) {
            case 0:
                i2 i2Var = this.f5043b;
                int i7 = i2Var.f4992h;
                int i10 = this.f5046e;
                if (i7 != i10) {
                    k2.f();
                }
                int i11 = this.f5045d;
                this.f5045d = k2.a(i2Var.f4985a, i11) + i11;
                return new j2(i2Var, i11, i10);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5042a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
