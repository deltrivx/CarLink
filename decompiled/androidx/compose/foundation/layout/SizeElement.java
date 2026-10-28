package androidx.compose.foundation.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d0.p0;
import kotlin.Metadata;
import n3.f;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Lq2/z0;", "Ld0/p0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class SizeElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f813e;

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, int i7) {
        this((i7 & 1) != 0 ? Float.NaN : f10, (i7 & 2) != 0 ? Float.NaN : f11, (i7 & 4) != 0 ? Float.NaN : f12, (i7 & 8) != 0 ? Float.NaN : f13, true);
    }

    public SizeElement(float f10, float f11, float f12, float f13, boolean z10) {
        this.f809a = f10;
        this.f810b = f11;
        this.f811c = f12;
        this.f812d = f13;
        this.f813e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return f.a(this.f809a, sizeElement.f809a) && f.a(this.f810b, sizeElement.f810b) && f.a(this.f811c, sizeElement.f811c) && f.a(this.f812d, sizeElement.f812d) && this.f813e == sizeElement.f813e;
    }

    public final int hashCode() {
        return ob.a.j(this.f812d, ob.a.j(this.f811c, ob.a.j(this.f810b, Float.floatToIntBits(this.f809a) * 31, 31), 31), 31) + (this.f813e ? 1231 : 1237);
    }

    @Override // q2.z0
    public final o i() {
        p0 p0Var = new p0();
        p0Var.f3611o = this.f809a;
        p0Var.f3612p = this.f810b;
        p0Var.f3613q = this.f811c;
        p0Var.f3614r = this.f812d;
        p0Var.f3615s = this.f813e;
        return p0Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        p0 p0Var = (p0) oVar;
        p0Var.f3611o = this.f809a;
        p0Var.f3612p = this.f810b;
        p0Var.f3613q = this.f811c;
        p0Var.f3614r = this.f812d;
        p0Var.f3615s = this.f813e;
    }
}
