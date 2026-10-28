package da;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n extends i9.j implements h9.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f3880i = new n(1, x.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);

    @Override // h9.k
    public final Object invoke(Object obj) {
        Method method = (Method) obj;
        i9.l.e(method, "p0");
        return new x(method);
    }
}
