package androidx.compose.foundation.text.modifiers;

import b3.r0;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f3.d;
import i9.l;
import kotlin.Metadata;
import q2.f;
import q2.z0;
import r1.o;
import v0.e;
import y1.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Lq2/z0;", "Lv0/r;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class TextStringSimpleElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f913h;

    public TextStringSimpleElement(String str, r0 r0Var, d dVar, int i7, boolean z10, int i10, int i11, r rVar) {
        this.f906a = str;
        this.f907b = r0Var;
        this.f908c = dVar;
        this.f909d = i7;
        this.f910e = z10;
        this.f911f = i10;
        this.f912g = i11;
        this.f913h = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return l.a(this.f913h, textStringSimpleElement.f913h) && l.a(this.f906a, textStringSimpleElement.f906a) && l.a(this.f907b, textStringSimpleElement.f907b) && l.a(this.f908c, textStringSimpleElement.f908c) && this.f909d == textStringSimpleElement.f909d && this.f910e == textStringSimpleElement.f910e && this.f911f == textStringSimpleElement.f911f && this.f912g == textStringSimpleElement.f912g;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f908c.hashCode() + ((this.f907b.hashCode() + (this.f906a.hashCode() * 31)) * 31)) * 31) + this.f909d) * 31) + (this.f910e ? 1231 : 1237)) * 31) + this.f911f) * 31) + this.f912g) * 31;
        r rVar = this.f913h;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }

    @Override // q2.z0
    public final o i() {
        v0.r rVar = new v0.r();
        rVar.f13577o = this.f906a;
        rVar.f13578p = this.f907b;
        rVar.f13579q = this.f908c;
        rVar.f13580r = this.f909d;
        rVar.f13581s = this.f910e;
        rVar.f13582t = this.f911f;
        rVar.f13583u = this.f912g;
        rVar.f13584v = this.f913h;
        return rVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // q2.z0
    public final void j(o oVar) {
        boolean z10;
        v0.r rVar = (v0.r) oVar;
        r rVar2 = rVar.f13584v;
        r rVar3 = this.f913h;
        boolean zA = l.a(rVar3, rVar2);
        rVar.f13584v = rVar3;
        boolean z11 = false;
        boolean z12 = true;
        r0 r0Var = this.f907b;
        if (zA) {
            r0 r0Var2 = rVar.f13578p;
            if (r0Var == r0Var2) {
                r0Var.getClass();
            } else if (!r0Var.f1438a.b(r0Var2.f1438a)) {
                z10 = true;
            }
            z10 = false;
        } else {
            z10 = true;
        }
        String str = rVar.f13577o;
        String str2 = this.f906a;
        if (!l.a(str, str2)) {
            rVar.f13577o = str2;
            rVar.f13588z = null;
            z11 = true;
        }
        boolean z13 = !rVar.f13578p.c(r0Var);
        rVar.f13578p = r0Var;
        int i7 = rVar.f13583u;
        int i10 = this.f912g;
        if (i7 != i10) {
            rVar.f13583u = i10;
            z13 = true;
        }
        int i11 = rVar.f13582t;
        int i12 = this.f911f;
        if (i11 != i12) {
            rVar.f13582t = i12;
            z13 = true;
        }
        boolean z14 = rVar.f13581s;
        boolean z15 = this.f910e;
        if (z14 != z15) {
            rVar.f13581s = z15;
            z13 = true;
        }
        d dVar = rVar.f13579q;
        d dVar2 = this.f908c;
        if (!l.a(dVar, dVar2)) {
            rVar.f13579q = dVar2;
            z13 = true;
        }
        int i13 = rVar.f13580r;
        int i14 = this.f909d;
        if (i13 == i14) {
            z12 = z13;
        } else {
            rVar.f13580r = i14;
        }
        if (z11 || z12) {
            e eVarA0 = rVar.A0();
            String str3 = rVar.f13577o;
            r0 r0Var3 = rVar.f13578p;
            d dVar3 = rVar.f13579q;
            int i15 = rVar.f13580r;
            boolean z16 = rVar.f13581s;
            int i16 = rVar.f13582t;
            int i17 = rVar.f13583u;
            eVarA0.f13511a = str3;
            eVarA0.f13512b = r0Var3;
            eVarA0.f13513c = dVar3;
            eVarA0.f13514d = i15;
            eVarA0.f13515e = z16;
            eVarA0.f13516f = i16;
            eVarA0.f13517g = i17;
            eVarA0.f13528s = (eVarA0.f13528s << 2) | 2;
            eVarA0.c();
        }
        if (rVar.f11129n) {
            if (z11 || (z10 && rVar.f13587y != null)) {
                f.n(rVar);
            }
            if (z11 || z12) {
                f.m(rVar);
                f.l(rVar);
            }
            if (z10) {
                f.l(rVar);
            }
        }
    }
}
