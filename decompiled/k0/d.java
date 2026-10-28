package k0;

import i9.l;
import n3.o;
import n3.u;
import y1.c0;
import y1.d0;
import y1.h0;
import y1.l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f7140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f7141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f7142d;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f7139a = aVar;
        this.f7140b = aVar2;
        this.f7141c = aVar3;
        this.f7142d = aVar4;
    }

    public static d b(d dVar, b bVar, b bVar2, b bVar3, int i7) {
        a aVar = bVar;
        if ((i7 & 1) != 0) {
            aVar = dVar.f7139a;
        }
        a aVar2 = dVar.f7140b;
        a aVar3 = bVar2;
        if ((i7 & 4) != 0) {
            aVar3 = dVar.f7141c;
        }
        dVar.getClass();
        return new d(aVar, aVar2, aVar3, bVar3);
    }

    @Override // y1.l0
    public final h0 a(long j5, o oVar, n3.c cVar) {
        float fA = this.f7139a.a(j5, cVar);
        float fA2 = this.f7140b.a(j5, cVar);
        float fA3 = this.f7141c.a(j5, cVar);
        float fA4 = this.f7142d.a(j5, cVar);
        float fC = x1.e.c(j5);
        float f10 = fA + fA4;
        if (f10 > fC) {
            float f11 = fC / f10;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA2 + fA3;
        if (f12 > fC) {
            float f13 = fC / f12;
            fA2 *= f13;
            fA3 *= f13;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            c0.b.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new c0(u.c(0L, j5));
        }
        x1.c cVarC = u.c(0L, j5);
        o oVar2 = o.f8749a;
        float f14 = oVar == oVar2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
        if (oVar == oVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f15 = oVar == oVar2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
        if (oVar != oVar2) {
            fA4 = fA3;
        }
        return new d0(new x1.d(cVarC.f14523a, cVarC.f14524b, cVarC.f14525c, cVarC.f14526d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f7139a, dVar.f7139a) && l.a(this.f7140b, dVar.f7140b) && l.a(this.f7141c, dVar.f7141c) && l.a(this.f7142d, dVar.f7142d);
    }

    public final int hashCode() {
        return this.f7142d.hashCode() + ((this.f7141c.hashCode() + ((this.f7140b.hashCode() + (this.f7139a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f7139a + ", topEnd = " + this.f7140b + ", bottomEnd = " + this.f7141c + ", bottomStart = " + this.f7142d + ')';
    }
}
