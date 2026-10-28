package mb;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import l0.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class k implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f8626d = zb.j.Q0(k.class.getCanonicalName(), "");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f8627e = new b("NO_LOCKS", a.f8612a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f8628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f8629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8630c;

    public k(String str) {
        this(str, new o0(2, new ReentrantLock()));
    }

    public k(String str, m mVar) {
        a aVar = a.f8613b;
        this.f8628a = mVar;
        this.f8629b = aVar;
        this.f8630c = str;
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i7 = 0;
        while (i7 < length) {
            if (!stackTrace[i7].getClassName().startsWith(f8626d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i7, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i7++;
        }
        i7 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i7, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    public final i a(h9.a aVar) {
        return new i(this, aVar);
    }

    public final e b(h9.k kVar) {
        return new e(this, new ConcurrentHashMap(3, 1.0f, 2), kVar, 1);
    }

    public final f1.e c(h9.k kVar) {
        return new f1.e(this, new ConcurrentHashMap(3, 1.0f, 2), kVar, 1);
    }

    public e6.h d(Object obj, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder("Recursion detected ");
        sb2.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        AssertionError assertionError = new AssertionError(sb2.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(" (");
        return ob.a.s(sb2, this.f8630c, ")");
    }
}
