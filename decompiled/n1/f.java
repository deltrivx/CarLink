package n1;

import f1.t1;
import f1.z2;
import k1.m;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k1.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f8711g;

    @Override // k1.e, i1.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final g build() {
        m mVar = this.f7157c;
        g gVar = this.f8711g;
        if (mVar != gVar.f7150a) {
            this.f7156b = new m1.b();
            gVar = new g(this.f7157c, this.f7160f);
        }
        this.f8711g = gVar;
        return gVar;
    }

    @Override // k1.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof t1) {
            return super.containsKey((t1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof z2) {
            return super.containsValue((z2) obj);
        }
        return false;
    }

    @Override // k1.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof t1) {
            return (z2) super.get((t1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof t1) ? obj2 : (z2) super.getOrDefault((t1) obj, (z2) obj2);
    }

    @Override // k1.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof t1) {
            return (z2) super.remove((t1) obj);
        }
        return null;
    }
}
