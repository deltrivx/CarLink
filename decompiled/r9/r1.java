package r9;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements h9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s1 f11755c = new s1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9.a f11756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile SoftReference f11757b;

    public r1(Object obj, h9.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.f11757b = null;
        this.f11756a = aVar;
        if (obj != null) {
            this.f11757b = new SoftReference(obj);
        }
    }

    @Override // h9.a
    public final Object invoke() {
        Object obj;
        Object obj2 = f11755c;
        SoftReference softReference = this.f11757b;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.f11756a.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.f11757b = new SoftReference(obj2);
        return objInvoke;
    }
}
