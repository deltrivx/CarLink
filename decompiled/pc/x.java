package pc;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x extends o0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10517l;

    public x(String str, y yVar) {
        super(str, yVar, 1);
        this.f10517l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, t8.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, t8.h] */
    @Override // pc.o0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            nc.e eVar = (nc.e) obj;
            if (this.f10482a.equals(eVar.h())) {
                x xVar = (x) obj;
                if (xVar.f10517l && Arrays.equals((nc.e[]) this.f10491j.getValue(), (nc.e[]) xVar.f10491j.getValue())) {
                    int iK = eVar.k();
                    int i7 = this.f10484c;
                    if (i7 == iK) {
                        for (int i10 = 0; i10 < i7; i10++) {
                            if (i9.l.a(n(i10).h(), eVar.n(i10).h()) && i9.l.a(n(i10).f(), eVar.n(i10).f())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // pc.o0, nc.e
    public final boolean g() {
        return this.f10517l;
    }

    @Override // pc.o0
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
