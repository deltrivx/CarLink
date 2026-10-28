package i9;

import c1.q0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class z {
    public o9.f a(j jVar) {
        return jVar;
    }

    public o9.c b(Class cls) {
        return new f(cls);
    }

    public o9.e c(Class cls) {
        return new q(cls);
    }

    public o9.i d(d1.j jVar) {
        return jVar;
    }

    public o9.k e(o oVar) {
        return oVar;
    }

    public o9.r f(q0 q0Var) {
        return q0Var;
    }

    public o9.t g(r rVar) {
        return rVar;
    }

    public String h(i iVar) {
        String string = iVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String i(n nVar) {
        return h(nVar);
    }
}
