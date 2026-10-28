package h7;

import f1.s;
import h9.n;
import t8.z;
import z7.f;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6442b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6443c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6444a;

    public /* synthetic */ a(int i7) {
        this.f6444a = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6444a) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    f.f15751a.a(6, sVar);
                }
                break;
            default:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    m8.b.a(false, b.f6445a, sVar2, 384);
                }
                break;
        }
        return z.f12851a;
    }
}
