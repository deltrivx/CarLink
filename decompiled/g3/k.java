package g3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f5865g = new k(false, 0, true, 1, 1, i3.b.f6613c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i3.b f5871f;

    public k(boolean z10, int i7, boolean z11, int i10, int i11, i3.b bVar) {
        this.f5866a = z10;
        this.f5867b = i7;
        this.f5868c = z11;
        this.f5869d = i10;
        this.f5870e = i11;
        this.f5871f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f5866a == kVar.f5866a && this.f5867b == kVar.f5867b && this.f5868c == kVar.f5868c && this.f5869d == kVar.f5869d && this.f5870e == kVar.f5870e && i9.l.a(this.f5871f, kVar.f5871f);
    }

    public final int hashCode() {
        return this.f5871f.f6614a.hashCode() + ((((((((((this.f5866a ? 1231 : 1237) * 31) + this.f5867b) * 31) + (this.f5868c ? 1231 : 1237)) * 31) + this.f5869d) * 31) + this.f5870e) * 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ImeOptions(singleLine=");
        sb2.append(this.f5866a);
        sb2.append(", capitalization=");
        int i7 = this.f5867b;
        if (i7 == -1) {
            str = "Unspecified";
        } else if (i7 == 0) {
            str = "None";
        } else if (i7 == 1) {
            str = "Characters";
        } else if (i7 == 2) {
            str = "Words";
        } else {
            str = i7 == 3 ? "Sentences" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", autoCorrect=");
        sb2.append(this.f5868c);
        sb2.append(", keyboardType=");
        sb2.append((Object) o9.e0.S(this.f5869d));
        sb2.append(", imeAction=");
        sb2.append((Object) j.a(this.f5870e));
        sb2.append(", platformImeOptions=null, hintLocales=");
        sb2.append(this.f5871f);
        sb2.append(')');
        return sb2.toString();
    }
}
