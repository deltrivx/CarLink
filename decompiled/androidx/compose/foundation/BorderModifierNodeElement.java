package androidx.compose.foundation;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import n3.f;
import q2.z0;
import r1.o;
import x.p;
import y1.l0;
import y1.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Lq2/z0;", "Lx/p;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final /* data */ class BorderModifierNodeElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f750c;

    public BorderModifierNodeElement(float f10, n0 n0Var, l0 l0Var) {
        this.f748a = f10;
        this.f749b = n0Var;
        this.f750c = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return f.a(this.f748a, borderModifierNodeElement.f748a) && this.f749b.equals(borderModifierNodeElement.f749b) && l.a(this.f750c, borderModifierNodeElement.f750c);
    }

    public final int hashCode() {
        return this.f750c.hashCode() + ((this.f749b.hashCode() + (Float.floatToIntBits(this.f748a) * 31)) * 31);
    }

    @Override // q2.z0
    public final o i() {
        return new p(this.f748a, this.f749b, this.f750c);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        p pVar = (p) oVar;
        float f10 = pVar.f14454r;
        v1.b bVar = pVar.f14457u;
        float f11 = this.f748a;
        if (!f.a(f10, f11)) {
            pVar.f14454r = f11;
            bVar.A0();
        }
        n0 n0Var = pVar.f14455s;
        n0 n0Var2 = this.f749b;
        if (!l.a(n0Var, n0Var2)) {
            pVar.f14455s = n0Var2;
            bVar.A0();
        }
        l0 l0Var = pVar.f14456t;
        l0 l0Var2 = this.f750c;
        if (l.a(l0Var, l0Var2)) {
            return;
        }
        pVar.f14456t = l0Var2;
        bVar.A0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) f.b(this.f748a)) + ", brush=" + this.f749b + ", shape=" + this.f750c + ')';
    }
}
