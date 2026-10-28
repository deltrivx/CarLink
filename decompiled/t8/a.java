package t8;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z8.a f12814a = z8.a.f15774a;

    public static void a(Throwable th, Throwable th2) {
        i9.l.e(th, "<this>");
        i9.l.e(th2, "exception");
        if (th != th2) {
            Integer num = d9.a.f3845a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = c9.a.f2572a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final l b(Throwable th) {
        i9.l.e(th, "exception");
        return new l(th);
    }

    public static h c(i iVar, h9.a aVar) {
        w wVar = w.f12848a;
        int iOrdinal = iVar.ordinal();
        if (iOrdinal == 0) {
            return new o(aVar);
        }
        if (iOrdinal == 1) {
            n nVar = new n();
            nVar.f12834a = aVar;
            nVar.f12835b = wVar;
            return nVar;
        }
        if (iOrdinal != 2) {
            throw new cc.s();
        }
        a0 a0Var = new a0();
        a0Var.f12815a = aVar;
        a0Var.f12816b = wVar;
        return a0Var;
    }

    public static o d(h9.a aVar) {
        i9.l.e(aVar, "initializer");
        return new o(aVar);
    }

    public static final void e(Object obj) {
        if (obj instanceof l) {
            throw ((l) obj).f12832a;
        }
    }

    public static final double f(long j5) {
        return ((j5 >>> 11) * ((double) 2048)) + (j5 & 2047);
    }
}
