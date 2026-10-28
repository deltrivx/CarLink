package androidx.compose.material3;

import b0.k;
import c1.x2;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import q2.f;
import q2.z0;
import r1.o;
import v.d;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/ThumbElement;", "Lq2/z0;", "Lc1/x2;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final /* data */ class ThumbElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f916b;

    public ThumbElement(k kVar, boolean z10) {
        this.f915a = kVar;
        this.f916b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return l.a(this.f915a, thumbElement.f915a) && this.f916b == thumbElement.f916b;
    }

    public final int hashCode() {
        return (this.f915a.hashCode() * 31) + (this.f916b ? 1231 : 1237);
    }

    @Override // q2.z0
    public final o i() {
        x2 x2Var = new x2();
        x2Var.f2312o = this.f915a;
        x2Var.f2313p = this.f916b;
        x2Var.f2317t = Float.NaN;
        x2Var.f2318u = Float.NaN;
        return x2Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        x2 x2Var = (x2) oVar;
        x2Var.f2312o = this.f915a;
        boolean z10 = x2Var.f2313p;
        boolean z11 = this.f916b;
        if (z10 != z11) {
            f.m(x2Var);
        }
        x2Var.f2313p = z11;
        if (x2Var.f2316s == null && !Float.isNaN(x2Var.f2318u)) {
            x2Var.f2316s = d.a(x2Var.f2318u);
        }
        if (x2Var.f2315r != null || Float.isNaN(x2Var.f2317t)) {
            return;
        }
        x2Var.f2315r = d.a(x2Var.f2317t);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f915a + ", checked=" + this.f916b + ')';
    }
}
