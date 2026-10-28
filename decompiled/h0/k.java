package h0;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1.e f6332a;

    public k(int i7) {
        switch (i7) {
            case 1:
                this.f6332a = new h1.e(new z.e[16]);
                break;
            default:
                this.f6332a = new h1.e(new j[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        h1.e eVar = this.f6332a;
        int i7 = eVar.f6423c;
        cc.j[] jVarArr = new cc.j[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            jVarArr[i10] = ((z.e) eVar.f6421a[i10]).f15348b;
        }
        for (int i11 = 0; i11 < i7; i11++) {
            jVarArr[i11].w(cancellationException);
        }
        if (eVar.f6423c == 0) {
            return;
        }
        c0.b.c("uncancelled requests present");
    }

    public void b() {
        h1.e eVar = this.f6332a;
        n9.d dVarE0 = n3.r.e0(0, eVar.f6423c);
        int i7 = dVarE0.f8965a;
        int i10 = dVarE0.f8966b;
        if (i7 <= i10) {
            while (true) {
                ((z.e) eVar.f6421a[i7]).f15348b.resumeWith(t8.z.f12851a);
                if (i7 == i10) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        eVar.h();
    }
}
