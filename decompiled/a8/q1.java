package a8;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f208c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, y8.c cVar) {
        super(cVar);
        this.f208c = r1Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f206a = obj;
        this.f207b |= Integer.MIN_VALUE;
        return this.f208c.h(null, this);
    }
}
