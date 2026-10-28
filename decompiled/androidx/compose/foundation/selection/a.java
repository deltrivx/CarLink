package androidx.compose.foundation.selection;

import androidx.compose.foundation.c;
import b0.k;
import f1.n;
import f1.s;
import h9.o;
import r1.m;
import r1.p;
import x.n0;
import y2.g;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a3.a f864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h9.a f867e;

    public a(a3.a aVar, h9.a aVar2, n0 n0Var, g gVar, boolean z10) {
        this.f863a = n0Var;
        this.f864b = aVar;
        this.f865c = z10;
        this.f866d = gVar;
        this.f867e = aVar2;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s sVar = (s) obj2;
        ((Number) obj3).intValue();
        sVar.W(-1525724089);
        Object objK = sVar.K();
        if (objK == n.f5051a) {
            objK = ob.a.m(sVar);
        }
        k kVar = (k) objK;
        p pVarA = c.a(m.f11116a, kVar, this.f863a).a(new TriStateToggleableElement(this.f864b, kVar, null, this.f865c, this.f866d, this.f867e));
        sVar.p(false);
        return pVarA;
    }
}
