package androidx.compose.foundation.text.contextmenu.modifier;

import a9.i;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.k;
import kotlin.Metadata;
import l0.o0;
import q2.z0;
import r0.f;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;", "Lq2/z0;", "Lr0/f;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class TextContextMenuToolbarHandlerElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f873d;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuToolbarHandlerElement(o0 o0Var, k kVar, k kVar2, k kVar3) {
        this.f870a = o0Var;
        this.f871b = (i) kVar;
        this.f872c = kVar2;
        this.f873d = kVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextContextMenuToolbarHandlerElement)) {
            return false;
        }
        TextContextMenuToolbarHandlerElement textContextMenuToolbarHandlerElement = (TextContextMenuToolbarHandlerElement) obj;
        return this.f870a == textContextMenuToolbarHandlerElement.f870a && this.f871b == textContextMenuToolbarHandlerElement.f871b && this.f872c == textContextMenuToolbarHandlerElement.f872c && this.f873d == textContextMenuToolbarHandlerElement.f873d;
    }

    public final int hashCode() {
        int iHashCode = (this.f871b.hashCode() + (this.f870a.hashCode() * 31)) * 31;
        k kVar = this.f872c;
        return this.f873d.hashCode() + ((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [a9.i, h9.k] */
    @Override // q2.z0
    public final o i() {
        return new f(this.f870a, this.f871b, this.f872c, this.f873d);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        f fVar = (f) oVar;
        fVar.f11082q.f7772b = null;
        o0 o0Var = this.f870a;
        fVar.f11082q = o0Var;
        o0Var.f7772b = fVar;
        fVar.f11083r = this.f871b;
        fVar.f11084s = this.f872c;
        fVar.f11085t = this.f873d;
    }
}
