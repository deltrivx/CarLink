package pb;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends g {
    @Override // pb.g, gb.q
    public final x9.h a(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        throw new IllegalStateException(this.f10372b + ", required name: " + eVar);
    }

    @Override // pb.g, gb.o
    public final /* bridge */ /* synthetic */ Collection b(wa.e eVar, fa.b bVar) {
        b(eVar, bVar);
        throw null;
    }

    @Override // pb.g, gb.o
    public final Set c() {
        throw new IllegalStateException();
    }

    @Override // pb.g, gb.q
    public final Collection d(gb.f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        throw new IllegalStateException(this.f10372b);
    }

    @Override // pb.g, gb.o
    public final Set e() {
        throw new IllegalStateException();
    }

    @Override // pb.g, gb.o
    public final /* bridge */ /* synthetic */ Collection f(wa.e eVar, fa.b bVar) {
        f(eVar, bVar);
        throw null;
    }

    @Override // pb.g, gb.o
    public final Set g() {
        throw new IllegalStateException();
    }

    @Override // pb.g
    /* JADX INFO: renamed from: h */
    public final Set f(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        throw new IllegalStateException(this.f10372b + ", required name: " + eVar);
    }

    @Override // pb.g
    /* JADX INFO: renamed from: i */
    public final Set b(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        throw new IllegalStateException(this.f10372b + ", required name: " + eVar);
    }

    @Override // pb.g
    public final String toString() {
        return a2.f.I(new StringBuilder("ThrowingScope{"), this.f10372b, '}');
    }
}
