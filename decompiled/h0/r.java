package h0;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g7.l f6361b;

    public /* synthetic */ r(g7.l lVar, int i7) {
        this.f6360a = i7;
        this.f6361b = lVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6360a) {
            case 0:
                Object key = ((y) obj).getKey();
                g7.l lVar = this.f6361b;
                return n3.n.X(Integer.valueOf(lVar.d(key)), Integer.valueOf(lVar.d(((y) obj2).getKey())));
            case 1:
                Object key2 = ((y) obj).getKey();
                g7.l lVar2 = this.f6361b;
                return n3.n.X(Integer.valueOf(lVar2.d(key2)), Integer.valueOf(lVar2.d(((y) obj2).getKey())));
            case 2:
                Object key3 = ((y) obj2).getKey();
                g7.l lVar3 = this.f6361b;
                return n3.n.X(Integer.valueOf(lVar3.d(key3)), Integer.valueOf(lVar3.d(((y) obj).getKey())));
            default:
                Object key4 = ((y) obj2).getKey();
                g7.l lVar4 = this.f6361b;
                return n3.n.X(Integer.valueOf(lVar4.d(key4)), Integer.valueOf(lVar4.d(((y) obj).getKey())));
        }
    }
}
