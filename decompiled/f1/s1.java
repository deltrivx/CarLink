package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements b1, cc.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f5135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y8.h f5136b;

    public s1(b1 b1Var, y8.h hVar) {
        this.f5135a = b1Var;
        this.f5136b = hVar;
    }

    @Override // f1.w2
    public final Object getValue() {
        return this.f5135a.getValue();
    }

    @Override // f1.b1
    public final void setValue(Object obj) {
        this.f5135a.setValue(obj);
    }

    @Override // cc.y
    public final y8.h u() {
        return this.f5136b;
    }
}
