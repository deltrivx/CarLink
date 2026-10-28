package e2;

import android.graphics.Bitmap;
import f1.k1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f4157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f4160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i9.n f4161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k1 f4162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y1.k f4163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f4164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f4165j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f4166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e0 f4167m;

    public f0(c cVar) {
        this.f4157b = cVar;
        cVar.f4111i = new e0(this, 0);
        this.f4158c = "";
        this.f4159d = true;
        this.f4160e = new a();
        this.f4161f = h.f4172c;
        this.f4162g = f1.b.s(null);
        this.f4164i = f1.b.s(new x1.e(0L));
        this.f4165j = 9205357640488583168L;
        this.k = 1.0f;
        this.f4166l = 1.0f;
        this.f4167m = new e0(this, 1);
    }

    @Override // e2.d0
    public final void a(a2.g gVar) {
        e(gVar, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:51:0x010b  */
    public final void e(a2.g gVar, float f10, y1.k kVar) {
        int i7;
        y1.k kVar2;
        y1.f fVarF;
        long j5;
        char c10;
        long jB;
        int i10;
        int i11;
        y1.k kVar3 = kVar;
        c cVar = this.f4157b;
        boolean z10 = cVar.f4106d;
        k1 k1Var = this.f4162g;
        if (!z10 || cVar.f4107e == 16) {
            i7 = 0;
        } else {
            y1.k kVar4 = (y1.k) k1Var.getValue();
            int i12 = i0.f4202a;
            if (!(kVar4 instanceof y1.k) ? kVar4 == null : (i11 = kVar4.f14923c) == 5 || i11 == 3) {
                i7 = 0;
            } else if (!(kVar3 instanceof y1.k) ? kVar3 == null : (i10 = kVar3.f14923c) == 5 || i10 == 3) {
                i7 = 0;
            } else {
                i7 = 1;
            }
        }
        boolean z11 = this.f4159d;
        a aVar = this.f4160e;
        if (z11 || !x1.e.a(this.f4165j, gVar.g())) {
            if (i7 == 1) {
                jB = cVar.f4107e;
                int i13 = i0.f4202a;
                if (y1.q.d(jB) != 1.0f) {
                    jB = y1.q.b(1.0f, jB);
                }
                kVar2 = new y1.k(5, jB);
            } else {
                kVar2 = null;
            }
            this.f4163h = kVar2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar.g() >> 32));
            k1 k1Var2 = this.f4164i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((x1.e) k1Var2.getValue()).f14535a >> 32));
            this.f4166l = Float.intBitsToFloat((int) (gVar.g() & 4294967295L)) / Float.intBitsToFloat((int) (((x1.e) k1Var2.getValue()).f14535a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (gVar.g() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (gVar.g() & 4294967295L))))) & 4294967295L);
            n3.o layoutDirection = gVar.getLayoutDirection();
            fVarF = aVar.f4095a;
            y1.b bVarA = aVar.f4096b;
            if (fVarF != null || bVarA == null) {
                j5 = 4294967295L;
                c10 = ' ';
            } else {
                int i14 = (int) (jCeil >> 32);
                Bitmap bitmap = fVarF.f14890a;
                c10 = ' ';
                j5 = 4294967295L;
                if (i14 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || aVar.f4098d != i7) {
                }
                aVar.f4097c = jCeil;
                a2.c cVar2 = aVar.f4099e;
                long jM0 = n3.n.M0(jCeil);
                a2.a aVar2 = cVar2.f15a;
                n3.c cVar3 = aVar2.f6a;
                n3.o oVar = aVar2.f7b;
                y1.o oVar2 = aVar2.f8c;
                y1.b bVar = bVarA;
                long j10 = aVar2.f9d;
                aVar2.f6a = gVar;
                aVar2.f7b = layoutDirection;
                aVar2.f8c = bVar;
                aVar2.f9d = jM0;
                bVar.h();
                a2.f.w(cVar2, y1.q.f14948b, 0L, 0L, 62);
                this.f4167m.invoke(cVar2);
                bVar.r();
                a2.a aVar3 = cVar2.f15a;
                aVar3.f6a = cVar3;
                aVar3.f7b = oVar;
                aVar3.f8c = oVar2;
                aVar3.f9d = j10;
                fVarF.f14890a.prepareToDraw();
                this.f4159d = false;
                this.f4165j = gVar.g();
            }
            fVarF = y1.h0.f((int) (jCeil >> c10), (int) (jCeil & j5), i7);
            bVarA = y1.h0.a(fVarF);
            aVar.f4095a = fVarF;
            aVar.f4096b = bVarA;
            aVar.f4098d = i7;
            aVar.f4097c = jCeil;
            a2.c cVar4 = aVar.f4099e;
            long jM1 = n3.n.M0(jCeil);
            a2.a aVar4 = cVar4.f15a;
            n3.c cVar5 = aVar4.f6a;
            n3.o oVar3 = aVar4.f7b;
            y1.o oVar4 = aVar4.f8c;
            y1.b bVar2 = bVarA;
            long j11 = aVar4.f9d;
            aVar4.f6a = gVar;
            aVar4.f7b = layoutDirection;
            aVar4.f8c = bVar2;
            aVar4.f9d = jM1;
            bVar2.h();
            a2.f.w(cVar4, y1.q.f14948b, 0L, 0L, 62);
            this.f4167m.invoke(cVar4);
            bVar2.r();
            a2.a aVar5 = cVar4.f15a;
            aVar5.f6a = cVar5;
            aVar5.f7b = oVar3;
            aVar5.f8c = oVar4;
            aVar5.f9d = j11;
            fVarF.f14890a.prepareToDraw();
            this.f4159d = false;
            this.f4165j = gVar.g();
        } else {
            y1.f fVar = aVar.f4095a;
            if (i7 != (fVar != null ? fVar.a() : 0)) {
                if (i7 == 1) {
                    jB = cVar.f4107e;
                    int i15 = i0.f4202a;
                    if (y1.q.d(jB) != 1.0f) {
                        jB = y1.q.b(1.0f, jB);
                    }
                    kVar2 = new y1.k(5, jB);
                } else {
                    kVar2 = null;
                }
                this.f4163h = kVar2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gVar.g() >> 32));
                k1 k1Var3 = this.f4164i;
                this.k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((x1.e) k1Var3.getValue()).f14535a >> 32));
                this.f4166l = Float.intBitsToFloat((int) (gVar.g() & 4294967295L)) / Float.intBitsToFloat((int) (((x1.e) k1Var3.getValue()).f14535a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (gVar.g() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (gVar.g() & 4294967295L))))) & 4294967295L);
                n3.o layoutDirection2 = gVar.getLayoutDirection();
                fVarF = aVar.f4095a;
                y1.b bVarA2 = aVar.f4096b;
                if (fVarF != null) {
                    j5 = 4294967295L;
                    c10 = ' ';
                    fVarF = y1.h0.f((int) (jCeil2 >> c10), (int) (jCeil2 & j5), i7);
                    bVarA2 = y1.h0.a(fVarF);
                    aVar.f4095a = fVarF;
                    aVar.f4096b = bVarA2;
                    aVar.f4098d = i7;
                } else {
                    j5 = 4294967295L;
                    c10 = ' ';
                    fVarF = y1.h0.f((int) (jCeil2 >> c10), (int) (jCeil2 & j5), i7);
                    bVarA2 = y1.h0.a(fVarF);
                    aVar.f4095a = fVarF;
                    aVar.f4096b = bVarA2;
                    aVar.f4098d = i7;
                }
                aVar.f4097c = jCeil2;
                a2.c cVar6 = aVar.f4099e;
                long jM2 = n3.n.M0(jCeil2);
                a2.a aVar6 = cVar6.f15a;
                n3.c cVar7 = aVar6.f6a;
                n3.o oVar5 = aVar6.f7b;
                y1.o oVar6 = aVar6.f8c;
                y1.b bVar3 = bVarA2;
                long j12 = aVar6.f9d;
                aVar6.f6a = gVar;
                aVar6.f7b = layoutDirection2;
                aVar6.f8c = bVar3;
                aVar6.f9d = jM2;
                bVar3.h();
                a2.f.w(cVar6, y1.q.f14948b, 0L, 0L, 62);
                this.f4167m.invoke(cVar6);
                bVar3.r();
                a2.a aVar7 = cVar6.f15a;
                aVar7.f6a = cVar7;
                aVar7.f7b = oVar5;
                aVar7.f8c = oVar6;
                aVar7.f9d = j12;
                fVarF.f14890a.prepareToDraw();
                this.f4159d = false;
                this.f4165j = gVar.g();
            }
        }
        if (kVar3 == null) {
            kVar3 = ((y1.k) k1Var.getValue()) != null ? (y1.k) k1Var.getValue() : this.f4163h;
        }
        y1.k kVar5 = kVar3;
        y1.f fVar2 = aVar.f4095a;
        if (fVar2 == null) {
            n2.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        a2.f.s(gVar, fVar2, aVar.f4097c, 0L, f10, kVar5, 0, 858);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f4158c);
        sb2.append("\n\tviewportWidth: ");
        k1 k1Var = this.f4164i;
        sb2.append(Float.intBitsToFloat((int) (((x1.e) k1Var.getValue()).f14535a >> 32)));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(Float.intBitsToFloat((int) (((x1.e) k1Var.getValue()).f14535a & 4294967295L)));
        sb2.append("\n");
        String string = sb2.toString();
        i9.l.d(string, "toString(...)");
        return string;
    }
}
