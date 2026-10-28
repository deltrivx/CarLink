package e8;

import a8.r1;

/* JADX INFO: loaded from: classes.dex */
public final class v extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f4635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r1 r1Var, y8.c cVar) {
        super(cVar);
        this.f4635c = r1Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f4633a = obj;
        this.f4634b |= Integer.MIN_VALUE;
        return this.f4635c.h(null, this);
    }
}
