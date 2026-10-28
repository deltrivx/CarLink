package ka;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements wb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f7401a = new b0();

    @Override // wb.a
    public final Iterable g(Object obj) {
        int i7 = d0.f7410p;
        Collection collectionM = ((x9.e) obj).t().m();
        i9.l.d(collectionM, "getSupertypes(...)");
        return new u8.n(2, yb.l.T(u8.p.f0(collectionM), m.f7453f));
    }
}
