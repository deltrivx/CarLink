package q1;

import i9.l;
import java.util.List;
import u8.e0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10582a;

    public e(List list) {
        this.f10582a = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder("Composition stack when thrown:\n");
        v8.b bVar = new v8.b(10);
        List list = this.f10582a;
        l.e(list, "<this>");
        e0 e0Var = new e0(list);
        if (e0Var.c() > 0) {
            ((b) e0Var.get(0)).getClass();
            throw null;
        }
        v8.b bVarN = n3.l.n(bVar);
        l.e(bVarN, "<this>");
        e0 e0Var2 = new e0(bVarN);
        int iC = e0Var2.c();
        for (int i7 = 0; i7 < iC; i7++) {
            sb2.append("\tat " + ((String) e0Var2.get(i7)));
            sb2.append('\n');
        }
        String string = sb2.toString();
        l.d(string, "toString(...)");
        return string;
    }
}
