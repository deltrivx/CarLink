package da;

import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k extends i9.j implements h9.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f3877i = new k(1, r.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);

    @Override // h9.k
    public final Object invoke(Object obj) {
        Constructor constructor = (Constructor) obj;
        i9.l.e(constructor, "p0");
        return new r(constructor);
    }
}
