package androidx.compose.foundation.gestures;

import b0.k;
import c1.i2;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.o;
import i9.l;
import kotlin.Metadata;
import q2.z0;
import x.n1;
import z.j0;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Lq2/z0;", "Lz/j0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class DraggableElement extends z0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n1 f780h = new n1(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2 f781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f787g;

    public DraggableElement(i2 i2Var, boolean z10, k kVar, boolean z11, o oVar, o oVar2, boolean z12) {
        this.f781a = i2Var;
        this.f782b = z10;
        this.f783c = kVar;
        this.f784d = z11;
        this.f785e = oVar;
        this.f786f = oVar2;
        this.f787g = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return this.f781a.equals(draggableElement.f781a) && this.f782b == draggableElement.f782b && l.a(this.f783c, draggableElement.f783c) && this.f784d == draggableElement.f784d && l.a(this.f785e, draggableElement.f785e) && l.a(this.f786f, draggableElement.f786f) && this.f787g == draggableElement.f787g;
    }

    public final int hashCode() {
        int iHashCode = (((x0.f15592b.hashCode() + (this.f781a.hashCode() * 31)) * 31) + (this.f782b ? 1231 : 1237)) * 31;
        k kVar = this.f783c;
        return ((this.f786f.hashCode() + ((this.f785e.hashCode() + ((((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31) + (this.f784d ? 1231 : 1237)) * 31)) * 31)) * 31) + (this.f787g ? 1231 : 1237);
    }

    @Override // q2.z0
    public final r1.o i() {
        n1 n1Var = f780h;
        boolean z10 = this.f782b;
        k kVar = this.f783c;
        x0 x0Var = x0.f15592b;
        j0 j0Var = new j0(n1Var, z10, kVar, x0Var);
        j0Var.f15414z = this.f781a;
        j0Var.A = x0Var;
        j0Var.B = this.f784d;
        j0Var.C = this.f785e;
        j0Var.D = this.f786f;
        j0Var.E = this.f787g;
        return j0Var;
    }

    @Override // q2.z0
    public final void j(r1.o oVar) {
        boolean z10;
        boolean z11;
        j0 j0Var = (j0) oVar;
        i2 i2Var = j0Var.f15414z;
        i2 i2Var2 = this.f781a;
        if (l.a(i2Var, i2Var2)) {
            z10 = false;
        } else {
            j0Var.f15414z = i2Var2;
            z10 = true;
        }
        x0 x0Var = j0Var.A;
        x0 x0Var2 = x0.f15592b;
        if (x0Var != x0Var2) {
            j0Var.A = x0Var2;
            z10 = true;
        }
        boolean z12 = j0Var.E;
        boolean z13 = this.f787g;
        if (z12 != z13) {
            j0Var.E = z13;
            z11 = true;
        } else {
            z11 = z10;
        }
        j0Var.C = this.f785e;
        j0Var.D = this.f786f;
        j0Var.B = this.f784d;
        j0Var.L0(f780h, this.f782b, this.f783c, x0Var2, z11);
    }
}
