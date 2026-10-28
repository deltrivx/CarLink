package androidx.compose.foundation.text.modifiers;

import b3.h;
import b3.r0;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f3.d;
import h9.k;
import i9.l;
import kotlin.Metadata;
import q2.z0;
import r1.o;
import v0.f;
import v0.n;
import y1.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Lq2/z0;", "Lv0/f;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class SelectableTextAnnotatedStringElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v0.h f895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f896j;

    public SelectableTextAnnotatedStringElement(h hVar, r0 r0Var, d dVar, k kVar, int i7, boolean z10, int i10, int i11, v0.h hVar2, r rVar) {
        this.f887a = hVar;
        this.f888b = r0Var;
        this.f889c = dVar;
        this.f890d = kVar;
        this.f891e = i7;
        this.f892f = z10;
        this.f893g = i10;
        this.f894h = i11;
        this.f895i = hVar2;
        this.f896j = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return l.a(this.f896j, selectableTextAnnotatedStringElement.f896j) && this.f887a.equals(selectableTextAnnotatedStringElement.f887a) && l.a(this.f888b, selectableTextAnnotatedStringElement.f888b) && l.a(this.f889c, selectableTextAnnotatedStringElement.f889c) && this.f890d == selectableTextAnnotatedStringElement.f890d && this.f891e == selectableTextAnnotatedStringElement.f891e && this.f892f == selectableTextAnnotatedStringElement.f892f && this.f893g == selectableTextAnnotatedStringElement.f893g && this.f894h == selectableTextAnnotatedStringElement.f894h && this.f895i.equals(selectableTextAnnotatedStringElement.f895i);
    }

    public final int hashCode() {
        int iHashCode = (this.f889c.hashCode() + ((this.f888b.hashCode() + (this.f887a.hashCode() * 31)) * 31)) * 31;
        k kVar = this.f890d;
        int iHashCode2 = (this.f895i.hashCode() + ((((((((((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31) + this.f891e) * 31) + (this.f892f ? 1231 : 1237)) * 31) + this.f893g) * 31) + this.f894h) * 29791)) * 961;
        r rVar = this.f896j;
        return iHashCode2 + (rVar != null ? rVar.hashCode() : 0);
    }

    @Override // q2.z0
    public final o i() {
        return new f(this.f887a, this.f888b, this.f889c, this.f890d, this.f891e, this.f892f, this.f893g, this.f894h, this.f895i, this.f896j);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // q2.z0
    public final void j(o oVar) {
        boolean z10;
        f fVar = (f) oVar;
        n nVar = fVar.f13530r;
        r rVar = nVar.f13566x;
        r rVar2 = this.f896j;
        boolean zA = l.a(rVar2, rVar);
        nVar.f13566x = rVar2;
        r0 r0Var = this.f888b;
        if (zA) {
            r0 r0Var2 = nVar.f13558p;
            if (r0Var == r0Var2) {
                r0Var.getClass();
            } else if (!r0Var.f1438a.b(r0Var2.f1438a)) {
                z10 = true;
            }
            z10 = false;
        } else {
            z10 = true;
        }
        boolean zF0 = nVar.F0(this.f887a);
        boolean zE0 = fVar.f13530r.E0(r0Var, this.f894h, this.f893g, this.f892f, this.f889c, this.f891e);
        k kVar = this.f890d;
        v0.h hVar = this.f895i;
        nVar.A0(z10, zF0, zE0, nVar.D0(kVar, hVar));
        fVar.f13529q = hVar;
        q2.f.m(fVar);
    }
}
