package nb;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends tb.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0.k f8997b = new u0.k(17);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f8998c = new h0(u8.w.f13122a);

    public h0(List list) {
        this.f12893a = tb.k.f12912a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            gVar.getClass();
            String strK = i9.y.f6689a.b(g.class).k();
            i9.l.b(strK);
            int iT0 = f8997b.T0(strK);
            int iC = this.f12893a.c();
            if (iC != 0) {
                if (iC == 1) {
                    tb.a aVar = this.f12893a;
                    try {
                        i9.l.c(aVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                        tb.q qVar = (tb.q) aVar;
                        int i7 = qVar.f12924b;
                        if (i7 == iT0) {
                            this.f12893a = new tb.q(iT0, gVar);
                        } else {
                            tb.c cVar = new tb.c();
                            cVar.f12891a = new Object[20];
                            cVar.f12892b = 0;
                            cVar.d(i7, qVar.f12923a);
                            this.f12893a = cVar;
                        }
                    } catch (ClassCastException e7) {
                        throw new IllegalStateException(tb.d.c(aVar, 1, "OneElementArrayMap"), e7);
                    }
                }
                this.f12893a.d(iT0, gVar);
            } else {
                tb.a aVar2 = this.f12893a;
                if (!(aVar2 instanceof tb.k)) {
                    throw new IllegalStateException(tb.d.c(aVar2, 0, "EmptyArrayMap"));
                }
                this.f12893a = new tb.q(iT0, gVar);
            }
        }
    }
}
