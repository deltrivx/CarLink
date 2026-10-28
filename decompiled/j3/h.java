package j3;

import f1.k1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends l4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1 f6946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2.d f6947b;

    public h(k1 k1Var, a2.d dVar) {
        this.f6946a = k1Var;
        this.f6947b = dVar;
    }

    @Override // l4.h
    public final void a() {
        this.f6947b.f20b = k.f6950a;
    }

    @Override // l4.h
    public final void b() {
        this.f6946a.setValue(Boolean.TRUE);
        this.f6947b.f20b = new l(true);
    }
}
