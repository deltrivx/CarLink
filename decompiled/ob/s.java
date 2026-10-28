package ob;

import nb.i0;
import nb.w0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f9660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f9661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f9662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f9663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ s[] f9664e;

    static {
        q qVar = new q();
        f9660a = qVar;
        o oVar = new o();
        f9661b = oVar;
        r rVar = new r();
        f9662c = rVar;
        p pVar = new p();
        f9663d = pVar;
        f9664e = new s[]{qVar, oVar, rVar, pVar};
    }

    public static s b(w0 w0Var) {
        i9.l.e(w0Var, "<this>");
        if (w0Var.E0()) {
            return f9661b;
        }
        if (w0Var instanceof nb.l) {
        }
        return nb.c.g(f.f9639b.I(), nb.c.l(w0Var), i0.f9002b) ? f9663d : f9662c;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f9664e.clone();
    }

    public abstract s a(w0 w0Var);
}
