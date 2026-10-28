package e2;

import java.util.ArrayList;
import java.util.List;
import y1.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f4104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4105c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4106d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4107e = y1.q.f14958m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f4108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y1.h f4110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h9.k f4111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2.a f4112j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f4113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f4114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f4115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f4116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f4117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f4118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f4119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4120s;

    public c() {
        int i7 = i0.f4202a;
        this.f4108f = u8.w.f13122a;
        this.f4109g = true;
        this.f4112j = new b2.a(1, this);
        this.k = "";
        this.f4116o = 1.0f;
        this.f4117p = 1.0f;
        this.f4120s = true;
    }

    @Override // e2.d0
    public final void a(a2.g gVar) {
        if (this.f4120s) {
            float[] fArrA = this.f4104b;
            if (fArrA == null) {
                fArrA = y1.a0.a();
                this.f4104b = fArrA;
            } else {
                y1.a0.d(fArrA);
            }
            y1.a0.f(fArrA, this.f4118q + this.f4114m, this.f4119r + this.f4115n);
            float f10 = this.f4113l;
            if (fArrA.length >= 16) {
                double d10 = ((double) f10) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d10);
                float fCos = (float) Math.cos(d10);
                float f11 = fArrA[0];
                float f12 = fArrA[4];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = -fSin;
                float f15 = (f12 * fCos) + (f11 * f14);
                float f16 = fArrA[1];
                float f17 = fArrA[5];
                float f18 = (fSin * f17) + (fCos * f16);
                float f19 = (f17 * fCos) + (f16 * f14);
                float f20 = fArrA[2];
                float f21 = fArrA[6];
                float f22 = (fSin * f21) + (fCos * f20);
                float f23 = (f21 * fCos) + (f20 * f14);
                float f24 = fArrA[3];
                float f25 = fArrA[7];
                float f26 = (fSin * f25) + (fCos * f24);
                fArrA[0] = f13;
                fArrA[1] = f18;
                fArrA[2] = f22;
                fArrA[3] = f26;
                fArrA[4] = f15;
                fArrA[5] = f19;
                fArrA[6] = f23;
                fArrA[7] = (fCos * f25) + (f14 * f24);
            }
            float f27 = this.f4116o;
            float f28 = this.f4117p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f27;
                fArrA[1] = fArrA[1] * f27;
                fArrA[2] = fArrA[2] * f27;
                fArrA[3] = fArrA[3] * f27;
                fArrA[4] = fArrA[4] * f28;
                fArrA[5] = fArrA[5] * f28;
                fArrA[6] = fArrA[6] * f28;
                fArrA[7] = fArrA[7] * f28;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            y1.a0.f(fArrA, -this.f4114m, -this.f4115n);
            this.f4120s = false;
        }
        if (this.f4109g) {
            if (!this.f4108f.isEmpty()) {
                y1.h hVarA = this.f4110h;
                if (hVarA == null) {
                    hVarA = y1.j.a();
                    this.f4110h = hVarA;
                }
                b.d(this.f4108f, hVarA);
            }
            this.f4109g = false;
        }
        a2.b bVarW = gVar.W();
        long J = bVarW.J();
        bVarW.z().h();
        try {
            a2.b bVar = (a2.b) ((a2.d) bVarW.f12b).f20b;
            float[] fArr = this.f4104b;
            if (fArr != null) {
                bVar.z().k(fArr);
            }
            y1.h hVar = this.f4110h;
            if (!this.f4108f.isEmpty() && hVar != null) {
                bVar.z().j(hVar);
            }
            ArrayList arrayList = this.f4105c;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((d0) arrayList.get(i7)).a(gVar);
            }
        } finally {
            ob.a.y(bVarW, J);
        }
    }

    @Override // e2.d0
    public final h9.k b() {
        return this.f4111i;
    }

    @Override // e2.d0
    public final void d(b2.a aVar) {
        this.f4111i = aVar;
    }

    public final void e(int i7, d0 d0Var) {
        ArrayList arrayList = this.f4105c;
        if (i7 < arrayList.size()) {
            arrayList.set(i7, d0Var);
        } else {
            arrayList.add(d0Var);
        }
        g(d0Var);
        d0Var.d(this.f4112j);
        c();
    }

    public final void f(long j5) {
        if (this.f4106d && j5 != 16) {
            long j10 = this.f4107e;
            if (j10 == 16) {
                this.f4107e = j5;
                return;
            }
            int i7 = i0.f4202a;
            if (y1.q.h(j10) == y1.q.h(j5) && y1.q.g(j10) == y1.q.g(j5) && y1.q.e(j10) == y1.q.e(j5)) {
                return;
            }
            this.f4106d = false;
            this.f4107e = y1.q.f14958m;
        }
    }

    public final void g(d0 d0Var) {
        if (!(d0Var instanceof i)) {
            if (d0Var instanceof c) {
                c cVar = (c) d0Var;
                if (cVar.f4106d && this.f4106d) {
                    f(cVar.f4107e);
                    return;
                } else {
                    this.f4106d = false;
                    this.f4107e = y1.q.f14958m;
                    return;
                }
            }
            return;
        }
        i iVar = (i) d0Var;
        y1.m mVar = iVar.f4184b;
        if (this.f4106d && mVar != null) {
            if (mVar instanceof n0) {
                f(((n0) mVar).f14942a);
            } else {
                this.f4106d = false;
                this.f4107e = y1.q.f14958m;
            }
        }
        y1.m mVar2 = iVar.f4189g;
        if (this.f4106d && mVar2 != null) {
            if (mVar2 instanceof n0) {
                f(((n0) mVar2).f14942a);
            } else {
                this.f4106d = false;
                this.f4107e = y1.q.f14958m;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.k);
        ArrayList arrayList = this.f4105c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            d0 d0Var = (d0) arrayList.get(i7);
            sb2.append("\t");
            sb2.append(d0Var.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
