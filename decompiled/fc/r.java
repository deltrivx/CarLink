package fc;

import a8.r1;

/* JADX INFO: loaded from: classes.dex */
public final class r extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f5596c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(r1 r1Var, y8.c cVar) {
        super(cVar);
        this.f5596c = r1Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f5594a = obj;
        this.f5595b |= Integer.MIN_VALUE;
        return this.f5596c.h(null, this);
    }
}
