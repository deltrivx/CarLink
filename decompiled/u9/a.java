package u9;

import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f13127b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13128c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13129a;

    public /* synthetic */ a(int i7) {
        this.f13129a = i7;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f13129a) {
            case 0:
                b bVar = b.f13130a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(c.class, c.class.getClassLoader());
                i9.l.b(serviceLoaderLoad);
                c cVar = (c) u8.p.l0(serviceLoaderLoad);
                if (cVar != null) {
                    return cVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            default:
                e eVar = new e(new mb.k("DefaultBuiltIns"));
                eVar.c();
                return eVar;
        }
    }
}
