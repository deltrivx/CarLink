package q2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements o2.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f10764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h9.k f10765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h9.k f10766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0 f10767f;

    public o0(int i7, int i10, Map map, h9.k kVar, h9.k kVar2, p0 p0Var) {
        this.f10762a = i7;
        this.f10763b = i10;
        this.f10764c = map;
        this.f10765d = kVar;
        this.f10766e = kVar2;
        this.f10767f = p0Var;
    }

    @Override // o2.n0
    public final Map b() {
        return this.f10764c;
    }

    @Override // o2.n0
    public final void c() {
        this.f10766e.invoke(this.f10767f.f10773l);
    }

    @Override // o2.n0
    public final h9.k d() {
        return this.f10765d;
    }

    @Override // o2.n0
    public final int getHeight() {
        return this.f10763b;
    }

    @Override // o2.n0
    public final int getWidth() {
        return this.f10762a;
    }
}
