package g1;

import f1.l2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f5784d = new g(0, 2, 1);

    @Override // g1.j0
    public final void c(com.google.protobuf.q qVar, f1.c cVar, l2 l2Var, n1.i iVar, k0 k0Var) {
        int i7 = ((n1.d) qVar.d(0)).f8708a;
        List list = (List) qVar.d(1);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            int i11 = i7 + i10;
            cVar.b(i11, obj);
            cVar.l(i11, obj);
        }
    }
}
