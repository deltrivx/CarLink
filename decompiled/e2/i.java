package e2;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y1.m f4184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4185c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f4186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f4187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f4188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y1.m f4189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f4192j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f4193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f4194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4195n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4196o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4197p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2.k f4198q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y1.h f4199r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y1.h f4200s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f4201t;

    public i() {
        int i7 = i0.f4202a;
        this.f4186d = u8.w.f13122a;
        this.f4187e = 1.0f;
        this.f4190h = 0;
        this.f4191i = 0;
        this.f4192j = 4.0f;
        this.f4193l = 1.0f;
        this.f4195n = true;
        this.f4196o = true;
        y1.h hVarA = y1.j.a();
        this.f4199r = hVarA;
        this.f4200s = hVarA;
        this.f4201t = t8.a.c(t8.i.f12828b, h.f4171b);
    }

    @Override // e2.d0
    public final void a(a2.g gVar) {
        a2.g gVar2;
        a2.k kVar;
        if (this.f4195n) {
            b.d(this.f4186d, this.f4199r);
            e();
        } else if (this.f4197p) {
            e();
        }
        this.f4195n = false;
        this.f4197p = false;
        y1.m mVar = this.f4184b;
        if (mVar != null) {
            gVar2 = gVar;
            a2.f.t(gVar2, this.f4200s, mVar, this.f4185c, null, 56);
        } else {
            gVar2 = gVar;
        }
        y1.m mVar2 = this.f4189g;
        if (mVar2 != null) {
            a2.k kVar2 = this.f4198q;
            if (this.f4196o || kVar2 == null) {
                a2.k kVar3 = new a2.k(this.f4188f, this.f4192j, this.f4190h, this.f4191i, 16);
                this.f4198q = kVar3;
                this.f4196o = false;
                kVar = kVar3;
            } else {
                kVar = kVar2;
            }
            a2.f.t(gVar2, this.f4200s, mVar2, this.f4187e, kVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, t8.h] */
    public final void e() {
        float f10 = this.k;
        y1.h hVar = this.f4199r;
        if (f10 == 0.0f && this.f4193l == 1.0f) {
            this.f4200s = hVar;
            return;
        }
        if (i9.l.a(this.f4200s, hVar)) {
            this.f4200s = y1.j.a();
        } else {
            Path.FillType fillType = this.f4200s.f14895a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z10 = fillType == fillType2;
            this.f4200s.f14895a.rewind();
            Path path = this.f4200s.f14895a;
            if (!z10) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r8 = this.f4201t;
        ((y1.i) r8.getValue()).f14902a.setPath(hVar != null ? hVar.f14895a : null, false);
        float length = ((y1.i) r8.getValue()).f14902a.getLength();
        float f11 = this.k;
        float f12 = this.f4194m;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.f4193l + f12) % 1.0f) * length;
        if (f13 <= f14) {
            ((y1.i) r8.getValue()).a(f13, f14, this.f4200s);
        } else {
            ((y1.i) r8.getValue()).a(f13, length, this.f4200s);
            ((y1.i) r8.getValue()).a(0.0f, f14, this.f4200s);
        }
    }

    public final String toString() {
        return this.f4199r.toString();
    }
}
