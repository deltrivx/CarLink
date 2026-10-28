package a8;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(r1 r1Var, y8.c cVar) {
        super(cVar);
        this.f246c = r1Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f244a = obj;
        this.f245b |= Integer.MIN_VALUE;
        return this.f246c.h(null, this);
    }
}
