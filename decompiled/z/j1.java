package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e6.h f15417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(e6.h hVar, a9.c cVar) {
        super(cVar);
        this.f15417c = hVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f15416b = obj;
        this.f15418d |= Integer.MIN_VALUE;
        return this.f15417c.l(0L, 0L, this);
    }
}
