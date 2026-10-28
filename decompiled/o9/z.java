package o9;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z extends i9.j implements h9.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z f9574i = new z(1, e0.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);

    @Override // h9.k
    public final Object invoke(Object obj) {
        Type type = (Type) obj;
        i9.l.e(type, "p0");
        return e0.j(type);
    }
}
