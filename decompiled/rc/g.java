package rc;

import t8.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends n3.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ja.e f12322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n4.e f12323d;

    public g(ja.e eVar, qc.b bVar) {
        i9.l.e(bVar, "json");
        this.f12322c = eVar;
        this.f12323d = bVar.f11034b;
    }

    @Override // n3.n, oc.b
    public final int h() {
        ja.e eVar = this.f12322c;
        String strK = eVar.k();
        try {
            i9.l.e(strK, "<this>");
            t8.s sVarJ = n3.u.J(strK);
            if (sVarJ != null) {
                return sVarJ.f12844a;
            }
            zb.q.j0(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            ja.e.n(eVar, "Failed to parse type 'UInt' for input '" + strK + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // oc.a
    public final n4.e j() {
        return this.f12323d;
    }

    @Override // n3.n, oc.b
    public final long n() {
        ja.e eVar = this.f12322c;
        String strK = eVar.k();
        try {
            i9.l.e(strK, "<this>");
            t8.u uVarK = n3.u.K(strK);
            if (uVarK != null) {
                return uVarK.f12846a;
            }
            zb.q.j0(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            ja.e.n(eVar, "Failed to parse type 'ULong' for input '" + strK + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // oc.a
    public final int w(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // n3.n, oc.b
    public final byte x() {
        t8.q qVar;
        ja.e eVar = this.f12322c;
        String strK = eVar.k();
        try {
            i9.l.e(strK, "<this>");
            t8.s sVarJ = n3.u.J(strK);
            if (sVarJ != null) {
                int i7 = sVarJ.f12844a;
                qVar = Integer.compare(Integer.MIN_VALUE ^ i7, -2147483393) > 0 ? null : new t8.q((byte) i7);
            }
            if (qVar != null) {
                return qVar.f12842a;
            }
            zb.q.j0(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            ja.e.n(eVar, "Failed to parse type 'UByte' for input '" + strK + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // n3.n, oc.b
    public final short y() {
        x xVar;
        ja.e eVar = this.f12322c;
        String strK = eVar.k();
        try {
            i9.l.e(strK, "<this>");
            t8.s sVarJ = n3.u.J(strK);
            if (sVarJ != null) {
                int i7 = sVarJ.f12844a;
                xVar = Integer.compare(Integer.MIN_VALUE ^ i7, -2147418113) > 0 ? null : new x((short) i7);
            }
            if (xVar != null) {
                return xVar.f12849a;
            }
            zb.q.j0(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            ja.e.n(eVar, "Failed to parse type 'UShort' for input '" + strK + '\'', 0, null, 6);
            throw null;
        }
    }
}
