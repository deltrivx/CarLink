package e8;

import a8.r1;

/* JADX INFO: loaded from: classes.dex */
public final class u extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f4627c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r1 r1Var, y8.c cVar) {
        super(cVar);
        this.f4627c = r1Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f4625a = obj;
        this.f4626b |= Integer.MIN_VALUE;
        return this.f4627c.h(null, this);
    }
}
