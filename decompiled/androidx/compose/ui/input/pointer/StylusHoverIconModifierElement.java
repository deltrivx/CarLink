package androidx.compose.ui.input.pointer;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import k2.a;
import k2.f0;
import kotlin.Metadata;
import l0.q0;
import q2.n;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;", "Lq2/z0;", "Lk2/f0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final /* data */ class StylusHoverIconModifierElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f952a;

    public StylusHoverIconModifierElement(n nVar) {
        this.f952a = nVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        a aVar = q0.f7800b;
        return aVar.equals(aVar) && l.a(this.f952a, stylusHoverIconModifierElement.f952a);
    }

    public final int hashCode() {
        int i7 = ((1022 * 31) + 1237) * 31;
        n nVar = this.f952a;
        return i7 + (nVar == null ? 0 : nVar.hashCode());
    }

    @Override // q2.z0
    public final o i() {
        return new f0(q0.f7800b, this.f952a);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        f0 f0Var = (f0) oVar;
        a aVar = q0.f7800b;
        if (!l.a(f0Var.f7215p, aVar)) {
            f0Var.f7215p = aVar;
            if (f0Var.f7216q) {
                f0Var.C0();
            }
        }
        f0Var.f7214o = this.f952a;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + q0.f7800b + ", overrideDescendants=false, touchBoundsExpansion=" + this.f952a + ')';
    }
}
