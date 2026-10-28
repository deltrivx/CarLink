package ga;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wa.c f6124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wa.b f6125b;

    static {
        wa.c cVar = new wa.c("kotlin.jvm.JvmField");
        f6124a = cVar;
        n3.u.L(cVar);
        n3.u.L(new wa.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f6125b = n3.u.z("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        i9.l.e(str, "propertyName");
        if (c(str)) {
            return str;
        }
        return "get" + n3.l.p(str);
    }

    public static final String b(String str) {
        String strP;
        StringBuilder sb2 = new StringBuilder("set");
        if (c(str)) {
            strP = str.substring(2);
            i9.l.d(strP, "substring(...)");
        } else {
            strP = n3.l.p(str);
        }
        sb2.append(strP);
        return sb2.toString();
    }

    public static final boolean c(String str) {
        i9.l.e(str, "name");
        if (!zb.q.o0(str, "is") || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return i9.l.f(97, cCharAt) > 0 || i9.l.f(cCharAt, 122) > 0;
    }
}
