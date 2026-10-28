package pb;

import gb.o;
import java.util.Arrays;
import java.util.List;
import nb.a0;
import nb.h0;
import nb.k0;
import nb.w;
import nb.w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f10380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f10381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f10382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f10383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f10385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10386h;

    public i(k0 k0Var, g gVar, k kVar, List list, boolean z10, String... strArr) {
        i9.l.e(kVar, "kind");
        i9.l.e(list, "arguments");
        i9.l.e(strArr, "formatParams");
        this.f10380b = k0Var;
        this.f10381c = gVar;
        this.f10382d = kVar;
        this.f10383e = list;
        this.f10384f = z10;
        this.f10385g = strArr;
        String str = kVar.f10413a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f10386h = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // nb.w
    public final List B0() {
        return this.f10383e;
    }

    @Override // nb.w
    public final h0 C0() {
        h0.f8997b.getClass();
        return h0.f8998c;
    }

    @Override // nb.w
    public final k0 D0() {
        return this.f10380b;
    }

    @Override // nb.w
    public final boolean E0() {
        return this.f10384f;
    }

    @Override // nb.w
    /* JADX INFO: renamed from: F0 */
    public final w I0(ob.g gVar) {
        i9.l.e(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // nb.w0
    /* JADX INFO: renamed from: I0 */
    public final w0 F0(ob.g gVar) {
        i9.l.e(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // nb.a0, nb.w0
    public final w0 J0(h0 h0Var) {
        i9.l.e(h0Var, "newAttributes");
        return this;
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: K0 */
    public final a0 H0(boolean z10) {
        String[] strArr = this.f10385g;
        return new i(this.f10380b, this.f10381c, this.f10382d, this.f10383e, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: L0 */
    public final a0 J0(h0 h0Var) {
        i9.l.e(h0Var, "newAttributes");
        return this;
    }

    @Override // nb.w
    public final o U() {
        return this.f10381c;
    }
}
