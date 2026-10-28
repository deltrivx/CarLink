package u9;

import n3.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum r {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(u.z("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(u.z("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(u.z("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(u.z("kotlin/ULong", false));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa.b f13221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa.e f13222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wa.b f13223c;

    r(wa.b bVar) {
        this.f13221a = bVar;
        wa.e eVarF = bVar.f();
        this.f13222b = eVarF;
        this.f13223c = new wa.b(bVar.f14236a, wa.e.e(eVarF.b() + "Array"));
    }
}
