package n1;

import f1.d2;
import f1.e2;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f8709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1.e f8710b = new h1.e(new e2[16]);

    public e(Set set) {
        this.f8709a = set;
    }

    @Override // f1.d2
    public final void c() {
    }

    @Override // f1.d2
    public final void e() {
    }

    @Override // f1.d2
    public final void f() {
        h1.e eVar = this.f8710b;
        Object[] objArr = eVar.f6421a;
        int i7 = eVar.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            d2 d2Var = ((e2) objArr[i10]).f4944a;
            this.f8709a.remove(d2Var);
            d2Var.f();
        }
    }
}
