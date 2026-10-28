package r9;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends n3.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f11706g;

    public l(Field field) {
        i9.l.e(field, "field");
        this.f11706g = field;
    }

    @Override // n3.r
    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        Field field = this.f11706g;
        String name = field.getName();
        i9.l.d(name, "getName(...)");
        sb2.append(ga.x.a(name));
        sb2.append("()");
        Class<?> type = field.getType();
        i9.l.d(type, "getType(...)");
        sb2.append(da.d.b(type));
        return sb2.toString();
    }
}
