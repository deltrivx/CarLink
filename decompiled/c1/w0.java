package c1;

import android.content.Context;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1.p f2250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.n f2251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n3.c f2252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q2 f2254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f2255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h9.k f2256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f2257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b3.r0 f2258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l0.s0 f2259j;
    public final /* synthetic */ l0.r0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f2260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2262n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b3.l0 f2263o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ b0.k f2264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ h9.n f2265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y1.l0 f2266r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(r1.p pVar, h9.n nVar, n3.c cVar, boolean z10, q2 q2Var, String str, h9.k kVar, boolean z11, b3.r0 r0Var, l0.s0 s0Var, l0.r0 r0Var2, boolean z12, int i7, int i10, b3.l0 l0Var, b0.k kVar2, h9.n nVar2, y1.l0 l0Var2) {
        super(2);
        this.f2250a = pVar;
        this.f2251b = nVar;
        this.f2252c = cVar;
        this.f2253d = z10;
        this.f2254e = q2Var;
        this.f2255f = str;
        this.f2256g = kVar;
        this.f2257h = z11;
        this.f2258i = r0Var;
        this.f2259j = s0Var;
        this.k = r0Var2;
        this.f2260l = z12;
        this.f2261m = i7;
        this.f2262n = i10;
        this.f2263o = l0Var;
        this.f2264p = kVar2;
        this.f2265q = nVar2;
        this.f2266r = l0Var2;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            r1.p pVarA = this.f2250a.a(this.f2251b != null ? androidx.compose.foundation.layout.a.k(new AppendedSemanticsElement(g.f1885c, true), 0.0f, this.f2252c.s(b1.f1821b), 0.0f, 0.0f, 13) : r1.m.f11116a);
            sVar.j(r2.n0.f11342a);
            String string = ((Context) sVar.j(r2.n0.f11343b)).getResources().getString(R.string.default_error_message);
            float f10 = d1.r.f3736b;
            if (this.f2253d) {
                pVarA = y2.k.a(pVarA, new j0(1, string));
            }
            r1.p pVarA2 = androidx.compose.foundation.layout.c.a(pVarA, t0.f2162c, t0.f2161b);
            q2 q2Var = this.f2254e;
            boolean z10 = this.f2253d;
            y1.n0 n0Var = new y1.n0(z10 ? q2Var.f2086j : q2Var.f2085i);
            h9.n nVar = this.f2265q;
            y1.l0 l0Var = this.f2266r;
            String str = this.f2255f;
            boolean z11 = this.f2257h;
            boolean z12 = this.f2260l;
            b3.l0 l0Var2 = this.f2263o;
            b0.k kVar = this.f2264p;
            l0.j.a(str, this.f2256g, pVarA2, z11, this.f2258i, this.f2259j, this.k, z12, this.f2261m, this.f2262n, l0Var2, null, kVar, n0Var, n1.h.e(1474611661, new v0(str, z11, z12, l0Var2, kVar, z10, this.f2251b, nVar, q2Var, l0Var), sVar), sVar, 0);
        }
        return t8.z.f12851a;
    }
}
