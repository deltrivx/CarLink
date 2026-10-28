package q2;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f10760b = new n1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10761a;

    public /* synthetic */ n1(int i7) {
        this.f10761a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10761a) {
            case 0:
                h0 h0Var = (h0) obj;
                h0 h0Var2 = (h0) obj2;
                int iF = i9.l.f(h0Var2.f10680o, h0Var.f10680o);
                return iF != 0 ? iF : i9.l.f(h0Var.hashCode(), h0Var2.hashCode());
            default:
                h0 h0Var3 = (h0) obj;
                h0 h0Var4 = (h0) obj2;
                int iF2 = i9.l.f(h0Var3.f10680o, h0Var4.f10680o);
                return iF2 != 0 ? iF2 : i9.l.f(h0Var3.hashCode(), h0Var4.hashCode());
        }
    }
}
