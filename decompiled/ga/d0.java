package ga;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa.e f6062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6065e;

    public d0(String str, wa.e eVar, String str2, String str3) {
        i9.l.e(str, "classInternalName");
        this.f6061a = str;
        this.f6062b = eVar;
        this.f6063c = str2;
        this.f6064d = str3;
        String str4 = eVar + '(' + str2 + ')' + str3;
        i9.l.e(str4, "jvmDescriptor");
        this.f6065e = str + '.' + str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return i9.l.a(this.f6061a, d0Var.f6061a) && i9.l.a(this.f6062b, d0Var.f6062b) && i9.l.a(this.f6063c, d0Var.f6063c) && i9.l.a(this.f6064d, d0Var.f6064d);
    }

    public final int hashCode() {
        return this.f6064d.hashCode() + ob.a.l(this.f6063c, (this.f6062b.hashCode() + (this.f6061a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NameAndSignature(classInternalName=");
        sb2.append(this.f6061a);
        sb2.append(", name=");
        sb2.append(this.f6062b);
        sb2.append(", parameters=");
        sb2.append(this.f6063c);
        sb2.append(", returnType=");
        return a2.f.I(sb2, this.f6064d, ')');
    }
}
