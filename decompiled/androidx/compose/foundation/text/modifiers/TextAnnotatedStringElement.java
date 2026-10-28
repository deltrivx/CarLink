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
import v0.n;
import y1.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Lq2/z0;", "Lv0/n;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class TextAnnotatedStringElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f905i;

    public TextAnnotatedStringElement(h hVar, r0 r0Var, d dVar, k kVar, int i7, boolean z10, int i10, int i11, r rVar) {
        this.f897a = hVar;
        this.f898b = r0Var;
        this.f899c = dVar;
        this.f900d = kVar;
        this.f901e = i7;
        this.f902f = z10;
        this.f903g = i10;
        this.f904h = i11;
        this.f905i = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return l.a(this.f905i, textAnnotatedStringElement.f905i) && this.f897a.equals(textAnnotatedStringElement.f897a) && l.a(this.f898b, textAnnotatedStringElement.f898b) && l.a(this.f899c, textAnnotatedStringElement.f899c) && this.f900d == textAnnotatedStringElement.f900d && this.f901e == textAnnotatedStringElement.f901e && this.f902f == textAnnotatedStringElement.f902f && this.f903g == textAnnotatedStringElement.f903g && this.f904h == textAnnotatedStringElement.f904h;
    }

    public final int hashCode() {
        int iHashCode = (this.f899c.hashCode() + ((this.f898b.hashCode() + (this.f897a.hashCode() * 31)) * 31)) * 31;
        k kVar = this.f900d;
        int iHashCode2 = (((((((((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31) + this.f901e) * 31) + (this.f902f ? 1231 : 1237)) * 31) + this.f903g) * 31) + this.f904h) * 923521;
        r rVar = this.f905i;
        return (iHashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31;
    }

    @Override // q2.z0
    public final o i() {
        return new n(this.f897a, this.f898b, this.f899c, this.f900d, this.f901e, this.f902f, this.f903g, this.f904h, null, this.f905i);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // q2.z0
    public final void j(o oVar) {
        boolean z10;
        n nVar = (n) oVar;
        r rVar = nVar.f13566x;
        r rVar2 = this.f905i;
        boolean zA = l.a(rVar2, rVar);
        nVar.f13566x = rVar2;
        if (zA) {
            r0 r0Var = nVar.f13558p;
            r0 r0Var2 = this.f898b;
            if (r0Var2 == r0Var) {
                r0Var2.getClass();
            } else if (!r0Var2.f1438a.b(r0Var.f1438a)) {
                z10 = true;
            }
            z10 = false;
        } else {
            z10 = true;
        }
        nVar.A0(z10, nVar.F0(this.f897a), nVar.E0(this.f898b, this.f904h, this.f903g, this.f902f, this.f899c, this.f901e), nVar.D0(this.f900d, null));
    }
}
