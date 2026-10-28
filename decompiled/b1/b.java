package b1;

import android.view.ViewGroup;
import f1.b1;
import f1.d2;
import f1.k1;
import java.util.LinkedHashMap;
import q2.j0;
import x.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d2, j, o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f1122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1 f1125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b1 f1126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f1127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i f1128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f1129i = f1.b.s(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1 f1130j = f1.b.s(Boolean.TRUE);
    public long k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1131l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f1132m = new a(0, this);

    public b(boolean z10, float f10, b1 b1Var, b1 b1Var2, ViewGroup viewGroup) {
        this.f1121a = z10;
        this.f1122b = new q(new a(2, b1Var2), z10);
        this.f1123c = z10;
        this.f1124d = f10;
        this.f1125e = b1Var;
        this.f1126f = b1Var2;
        this.f1127g = viewGroup;
    }

    @Override // b1.j
    public final void D() {
        this.f1129i.setValue(null);
    }

    @Override // x.o0
    public final void a(j0 j0Var) {
        int iA0;
        a2.c cVar = j0Var.f10720a;
        this.k = cVar.f16b.J();
        float f10 = this.f1124d;
        if (Float.isNaN(f10)) {
            iA0 = k9.a.M(h.a(j0Var, this.f1123c, cVar.f16b.J()));
        } else {
            iA0 = j0Var.a0(f10);
        }
        this.f1131l = iA0;
        long j5 = ((y1.q) this.f1125e.getValue()).f14960a;
        float f11 = ((g) this.f1126f.getValue()).f1157d;
        j0Var.b();
        this.f1122b.c(j0Var, Float.isNaN(f10) ? h.a(j0Var, this.f1121a, j0Var.g()) : j0Var.R(f10), j5);
        y1.o oVarZ = cVar.f16b.z();
        ((Boolean) this.f1130j.getValue()).booleanValue();
        k kVar = (k) this.f1129i.getValue();
        if (kVar != null) {
            kVar.e(cVar.f16b.J(), this.f1131l, j5, f11);
            kVar.draw(y1.c.a(oVarZ));
        }
    }

    @Override // f1.d2
    public final void c() {
        i iVar = this.f1128h;
        if (iVar != null) {
            D();
            android.support.v4.media.session.r rVar = iVar.f1162d;
            k kVar = (k) ((LinkedHashMap) rVar.f604b).get(this);
            if (kVar != null) {
                kVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) rVar.f604b;
                k kVar2 = (k) linkedHashMap.get(this);
                if (kVar2 != null) {
                }
                linkedHashMap.remove(this);
                iVar.f1161c.add(kVar);
            }
        }
    }

    @Override // f1.d2
    public final void e() {
        i iVar = this.f1128h;
        if (iVar != null) {
            D();
            android.support.v4.media.session.r rVar = iVar.f1162d;
            k kVar = (k) ((LinkedHashMap) rVar.f604b).get(this);
            if (kVar != null) {
                kVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) rVar.f604b;
                k kVar2 = (k) linkedHashMap.get(this);
                if (kVar2 != null) {
                }
                linkedHashMap.remove(this);
                iVar.f1161c.add(kVar);
            }
        }
    }

    @Override // f1.d2
    public final void f() {
    }
}
