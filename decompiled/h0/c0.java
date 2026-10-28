package h0;

import f1.k1;
import f1.w2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f6294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6295d;

    public c0(int i7, int i10, int i11) {
        this.f6292a = i10;
        this.f6293b = i11;
        int i12 = (i7 / i10) * i10;
        this.f6294c = new k1(n3.r.e0(Math.max(i12 - i11, 0), i12 + i10 + i11), f1.w0.f5187f);
        this.f6295d = i7;
    }

    public final void b(int i7) {
        if (i7 != this.f6295d) {
            this.f6295d = i7;
            int i10 = this.f6292a;
            int i11 = (i7 / i10) * i10;
            int i12 = this.f6293b;
            this.f6294c.setValue(n3.r.e0(Math.max(i11 - i12, 0), i11 + i10 + i12));
        }
    }

    @Override // f1.w2
    public final Object getValue() {
        return (n9.d) this.f6294c.getValue();
    }
}
