package da;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f3887a;

    public u(Field field) {
        i9.l.e(field, "member");
        this.f3887a = field;
    }

    @Override // da.w
    public final Member b() {
        return this.f3887a;
    }
}
