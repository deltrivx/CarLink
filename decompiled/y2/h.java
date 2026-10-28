package y2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9.a f14984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.a f14985b;

    public h(h9.a aVar, h9.a aVar2) {
        this.f14984a = aVar;
        this.f14985b = aVar2;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f14984a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f14985b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
