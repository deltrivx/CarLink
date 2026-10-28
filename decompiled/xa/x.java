package xa;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f14830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.google.protobuf.h f14831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14832c;

    public x(y yVar) {
        w wVar = new w(yVar);
        this.f14830a = wVar;
        this.f14831b = new com.google.protobuf.h(wVar.next());
        this.f14832c = yVar.f14834b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14832c > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f14831b.hasNext()) {
            this.f14831b = new com.google.protobuf.h(this.f14830a.next());
        }
        this.f14832c--;
        return Byte.valueOf(this.f14831b.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
