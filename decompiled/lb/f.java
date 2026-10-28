package lb;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class f implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f8310b;

    public /* synthetic */ f(g gVar, int i7) {
        this.f8309a = i7;
        this.f8310b = gVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f8309a) {
            case 0:
                gb.f fVar = gb.f.f6173m;
                gb.o.f6199a.getClass();
                return this.f8310b.i(fVar, gb.l.f6192b);
            default:
                g gVar = this.f8310b;
                ob.g gVar2 = gVar.f8311g;
                h hVar = gVar.f8314j;
                gVar2.getClass();
                i9.l.e(hVar, "classDescriptor");
                Collection collectionM = ((nb.f) hVar.t()).m();
                i9.l.d(collectionM, "getSupertypes(...)");
                return collectionM;
        }
    }
}
