package androidx.compose.foundation.text.input.internal;

import b3.q0;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import g3.d0;
import g3.k;
import g3.q;
import g3.w;
import i9.l;
import kotlin.Metadata;
import l0.u0;
import q2.f;
import q2.z0;
import u0.c;
import u0.e;
import w0.t1;
import w1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "Lq2/z0;", "Lu0/e;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final /* data */ class CoreTextFieldSemanticsModifier extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t1 f881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f883h;

    public CoreTextFieldSemanticsModifier(d0 d0Var, w wVar, u0 u0Var, boolean z10, q qVar, t1 t1Var, k kVar, o oVar) {
        this.f876a = d0Var;
        this.f877b = wVar;
        this.f878c = u0Var;
        this.f879d = z10;
        this.f880e = qVar;
        this.f881f = t1Var;
        this.f882g = kVar;
        this.f883h = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return this.f876a.equals(coreTextFieldSemanticsModifier.f876a) && this.f877b.equals(coreTextFieldSemanticsModifier.f877b) && this.f878c.equals(coreTextFieldSemanticsModifier.f878c) && this.f879d == coreTextFieldSemanticsModifier.f879d && l.a(this.f880e, coreTextFieldSemanticsModifier.f880e) && this.f881f.equals(coreTextFieldSemanticsModifier.f881f) && l.a(this.f882g, coreTextFieldSemanticsModifier.f882g) && l.a(this.f883h, coreTextFieldSemanticsModifier.f883h);
    }

    public final int hashCode() {
        return this.f883h.hashCode() + ((this.f882g.hashCode() + ((this.f881f.hashCode() + ((this.f880e.hashCode() + ((((((((this.f878c.hashCode() + ((this.f877b.hashCode() + (this.f876a.hashCode() * 31)) * 31)) * 31) + 1237) * 31) + (this.f879d ? 1231 : 1237)) * 31) + 1237) * 31)) * 31)) * 31)) * 31);
    }

    @Override // q2.z0
    public final r1.o i() {
        e eVar = new e();
        eVar.f12975q = this.f876a;
        eVar.f12976r = this.f877b;
        eVar.f12977s = this.f878c;
        eVar.f12978t = this.f879d;
        eVar.f12979u = this.f880e;
        t1 t1Var = this.f881f;
        eVar.f12980v = t1Var;
        eVar.f12981w = this.f882g;
        eVar.f12982x = this.f883h;
        t1Var.f13944f = new c(eVar, 4);
        return eVar;
    }

    @Override // q2.z0
    public final void j(r1.o oVar) {
        e eVar = (e) oVar;
        boolean z10 = eVar.f12978t;
        k kVar = eVar.f12981w;
        t1 t1Var = eVar.f12980v;
        eVar.f12975q = this.f876a;
        w wVar = this.f877b;
        eVar.f12976r = wVar;
        eVar.f12977s = this.f878c;
        boolean z11 = this.f879d;
        eVar.f12978t = z11;
        eVar.f12979u = this.f880e;
        t1 t1Var2 = this.f881f;
        eVar.f12980v = t1Var2;
        k kVar2 = this.f882g;
        eVar.f12981w = kVar2;
        eVar.f12982x = this.f883h;
        if (z11 != z10 || z11 != z10 || !l.a(kVar2, kVar) || !q0.c(wVar.f5890b)) {
            f.n(eVar);
        }
        if (t1Var2.equals(t1Var)) {
            return;
        }
        t1Var2.f13944f = new c(eVar, 0);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f876a + ", value=" + this.f877b + ", state=" + this.f878c + ", readOnly=false, enabled=" + this.f879d + ", isPassword=false, offsetMapping=" + this.f880e + ", manager=" + this.f881f + ", imeOptions=" + this.f882g + ", focusRequester=" + this.f883h + ')';
    }
}
