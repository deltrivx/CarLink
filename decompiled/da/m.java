package da;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m extends i9.j implements h9.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m f3879i = new m(1, u.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);

    @Override // h9.k
    public final Object invoke(Object obj) {
        Field field = (Field) obj;
        i9.l.e(field, "p0");
        return new u(field);
    }
}
