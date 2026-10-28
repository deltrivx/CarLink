package pc;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements mc.a {
    @Override // mc.a
    public Object c(oc.b bVar) {
        return i(bVar);
    }

    public abstract Object e();

    public abstract int f(Object obj);

    public abstract Iterator g(Object obj);

    public abstract int h(Object obj);

    public final Object i(oc.b bVar) {
        Object objE = e();
        int iF = f(objE);
        oc.a aVarM = bVar.m(d());
        while (true) {
            int iW = aVarM.w(d());
            if (iW == -1) {
                aVarM.p(d());
                return l(objE);
            }
            j(aVarM, iW + iF, objE);
        }
    }

    public abstract void j(oc.a aVar, int i7, Object obj);

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);
}
