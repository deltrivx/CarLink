package wa;

import i9.l;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import zb.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f14242e = e.g("<root>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c f14244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient d f14245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient e f14246d;

    static {
        l.d(Pattern.compile("\\."), "compile(...)");
    }

    public d(String str) {
        this.f14243a = str;
    }

    public d(String str, c cVar) {
        l.e(str, "fqName");
        this.f14243a = str;
        this.f14244b = cVar;
    }

    public d(String str, d dVar, e eVar) {
        this.f14243a = str;
        this.f14245c = dVar;
        this.f14246d = eVar;
    }

    public static final List e(d dVar) {
        if (dVar.c()) {
            return new ArrayList();
        }
        d dVar2 = dVar.f14245c;
        if (dVar2 == null) {
            if (dVar.c()) {
                throw new IllegalStateException("root");
            }
            dVar.b();
            dVar2 = dVar.f14245c;
            l.b(dVar2);
        }
        List listE = e(dVar2);
        listE.add(dVar.f());
        return listE;
    }

    public final d a(e eVar) {
        String strB;
        l.e(eVar, "name");
        if (c()) {
            strB = eVar.b();
        } else {
            strB = this.f14243a + '.' + eVar.b();
        }
        l.b(strB);
        return new d(strB, this, eVar);
    }

    public final void b() {
        String str = this.f14243a;
        int length = str.length() - 1;
        boolean z10 = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z10) {
                break;
            }
            if (cCharAt == '`') {
                z10 = !z10;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length < 0) {
            this.f14246d = e.d(str);
            this.f14245c = c.f14239c.f14240a;
            return;
        }
        String strSubstring = str.substring(length + 1);
        l.d(strSubstring, "substring(...)");
        this.f14246d = e.d(strSubstring);
        String strSubstring2 = str.substring(0, length);
        l.d(strSubstring2, "substring(...)");
        this.f14245c = new d(strSubstring2);
    }

    public final boolean c() {
        return this.f14243a.length() == 0;
    }

    public final boolean d() {
        return this.f14244b != null || j.z0(this.f14243a, '<', 0, 6) < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return l.a(this.f14243a, ((d) obj).f14243a);
        }
        return false;
    }

    public final e f() {
        e eVar = this.f14246d;
        if (eVar != null) {
            return eVar;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        b();
        e eVar2 = this.f14246d;
        l.b(eVar2);
        return eVar2;
    }

    public final c g() {
        c cVar = this.f14244b;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f14244b = cVar2;
        return cVar2;
    }

    public final int hashCode() {
        return this.f14243a.hashCode();
    }

    public final String toString() {
        if (!c()) {
            return this.f14243a;
        }
        String strB = f14242e.b();
        l.d(strB, "asString(...)");
        return strB;
    }
}
