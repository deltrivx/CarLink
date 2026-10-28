package d8;

/* JADX INFO: loaded from: classes.dex */
public final class s extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0.f f3837c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(b0.f fVar, y8.c cVar) {
        super(cVar);
        this.f3837c = fVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f3835a = obj;
        this.f3836b |= Integer.MIN_VALUE;
        return this.f3837c.h(null, this);
    }
}
