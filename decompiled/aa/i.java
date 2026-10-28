package aa;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import r9.x1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f354d;

    public i(l lVar, mb.n nVar, x9.o0 o0Var) {
        this.f351a = 0;
        this.f354d = lVar;
        this.f352b = nVar;
        this.f353c = o0Var;
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i7) {
        this.f351a = i7;
        this.f352b = obj;
        this.f353c = obj2;
        this.f354d = obj3;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f351a) {
            case 0:
                return new k((l) this.f354d, (mb.n) this.f352b, (x9.o0) this.f353c);
            case 1:
                return ((xa.b) ((xa.v) this.f352b)).c((ByteArrayInputStream) this.f353c, ((lb.o) this.f354d).f8352b.f7043a.f7032p);
            default:
                nb.w wVar = (nb.w) this.f352b;
                r9.w wVar2 = (r9.w) this.f353c;
                r9.a0 a0Var = (r9.a0) this.f354d;
                x9.h hVarL = wVar.D0().l();
                if (!(hVarL instanceof x9.e)) {
                    throw new cc.a0(2, "Supertype not a class: " + hVarL);
                }
                Class clsK = x1.k((x9.e) hVarL);
                if (clsK == null) {
                    throw new cc.a0(2, "Unsupported superclass of " + wVar2 + ": " + hVarL);
                }
                Class cls = a0Var.f11648b;
                if (i9.l.a(cls.getSuperclass(), clsK)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    i9.l.b(genericSuperclass);
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                i9.l.d(interfaces, "getInterfaces(...)");
                int iC0 = u8.l.C0(clsK, interfaces);
                if (iC0 >= 0) {
                    Type type = cls.getGenericInterfaces()[iC0];
                    i9.l.b(type);
                    return type;
                }
                throw new cc.a0(2, "No superclass of " + wVar2 + " in Java reflection for " + hVarL);
        }
    }
}
