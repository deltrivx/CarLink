package androidx.compose.foundation;

import b0.k;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import q2.z0;
import r1.o;
import x.r;
import x.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Lq2/z0;", "Lx/r;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class ClickableElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h9.a f756f;

    public ClickableElement(k kVar, r0 r0Var, boolean z10, boolean z11, String str, h9.a aVar) {
        this.f751a = kVar;
        this.f752b = r0Var;
        this.f753c = z10;
        this.f754d = z11;
        this.f755e = str;
        this.f756f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return l.a(this.f751a, clickableElement.f751a) && l.a(this.f752b, clickableElement.f752b) && this.f753c == clickableElement.f753c && this.f754d == clickableElement.f754d && l.a(this.f755e, clickableElement.f755e) && this.f756f == clickableElement.f756f;
    }

    public final int hashCode() {
        k kVar = this.f751a;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        r0 r0Var = this.f752b;
        int iHashCode2 = (((((iHashCode + (r0Var != null ? r0Var.hashCode() : 0)) * 31) + (this.f753c ? 1231 : 1237)) * 31) + (this.f754d ? 1231 : 1237)) * 31;
        String str = this.f755e;
        return this.f756f.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 961);
    }

    @Override // q2.z0
    public final o i() {
        return new r(this.f751a, this.f752b, this.f753c, this.f754d, this.f755e, null, this.f756f);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((r) oVar).M0(this.f751a, this.f752b, this.f753c, this.f754d, this.f755e, null, this.f756f);
    }
}
