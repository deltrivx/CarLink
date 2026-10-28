package q0;

import r3.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.b f10566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n3.m f10567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n3.o f10568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n3.m f10569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n3.j f10570e;

    public m(wb.b bVar) {
        this.f10566a = bVar;
    }

    @Override // r3.y
    public final long a(n3.k kVar, long j5, n3.o oVar, long j10) {
        n3.j jVar = this.f10570e;
        if (jVar != null) {
            n3.m mVar = this.f10567b;
            if ((mVar == null ? false : n3.m.a(mVar.f8746a, j5)) && this.f10568c == oVar) {
                n3.m mVar2 = this.f10569d;
                if (mVar2 != null ? n3.m.a(mVar2.f8746a, j10) : false) {
                    return jVar.f8739a;
                }
            }
        }
        long jA = this.f10566a.a(kVar, j5, oVar, j10);
        this.f10567b = new n3.m(j5);
        this.f10568c = oVar;
        this.f10569d = new n3.m(j10);
        this.f10570e = new n3.j(jA);
        return jA;
    }
}
