package androidx.compose.ui.input.pointer;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import k2.a;
import k2.q;
import k2.u;
import kotlin.Metadata;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Lq2/z0;", "Lk2/q;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final /* data */ class PointerHoverIconModifierElement extends z0 {
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
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        a aVar = u.f7276b;
        return aVar.equals(aVar);
    }

    public final int hashCode() {
        return (1008 * 31) + 1237;
    }

    @Override // q2.z0
    public final o i() {
        return new q(u.f7276b, null);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        q qVar = (q) oVar;
        a aVar = u.f7276b;
        if (l.a(qVar.f7215p, aVar)) {
            return;
        }
        qVar.f7215p = aVar;
        if (qVar.f7216q) {
            qVar.C0();
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + u.f7276b + ", overrideDescendants=false)";
    }
}
