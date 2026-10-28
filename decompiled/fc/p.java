package fc;

/* JADX INFO: loaded from: classes.dex */
public final class p extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0.f f5584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.f f5587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5588e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b0.f fVar, y8.c cVar) {
        super(cVar);
        this.f5587d = fVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f5585b = obj;
        this.f5586c |= Integer.MIN_VALUE;
        return this.f5587d.h(null, this);
    }
}
