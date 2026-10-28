package o2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f9430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h9.k f9431d;

    public u(int i7, int i10, Map map, h9.k kVar) {
        this.f9428a = i7;
        this.f9429b = i10;
        this.f9430c = map;
        this.f9431d = kVar;
    }

    @Override // o2.n0
    public final Map b() {
        return this.f9430c;
    }

    @Override // o2.n0
    public final void c() {
    }

    @Override // o2.n0
    public final h9.k d() {
        return this.f9431d;
    }

    @Override // o2.n0
    public final int getHeight() {
        return this.f9429b;
    }

    @Override // o2.n0
    public final int getWidth() {
        return this.f9428a;
    }
}
