package p1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1.a f9999a = new n1.a(0);

    public final boolean b(int i7) {
        return (i7 & this.f9999a.get()) != 0;
    }

    @Override // p1.z
    public /* synthetic */ b0 d(b0 b0Var, b0 b0Var2, b0 b0Var3) {
        return null;
    }

    public final void e(int i7) {
        n1.a aVar;
        int i10;
        do {
            aVar = this.f9999a;
            i10 = aVar.get();
            if ((i10 & i7) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i10, i10 | i7));
    }
}
