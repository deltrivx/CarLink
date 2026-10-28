package u8;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o implements yb.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13120b;

    public /* synthetic */ o(int i7, Object obj) {
        this.f13119a = i7;
        this.f13120b = obj;
    }

    @Override // yb.j
    public final Iterator iterator() {
        switch (this.f13119a) {
            case 0:
                return i9.l.h((Object[]) this.f13120b);
            case 1:
                return ((Iterable) this.f13120b).iterator();
            case 2:
                return (Iterator) this.f13120b;
            case 3:
                return new wb.h(1, this.f13120b);
            default:
                return new l1.c(this);
        }
    }
}
