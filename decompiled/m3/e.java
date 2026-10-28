package m3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f8406b = 66305;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8407a;

    public static String a(int i7) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("LineBreak(strategy=");
        int i10 = i7 & 255;
        String str3 = "Invalid";
        if (i10 == 1) {
            str = "Strategy.Simple";
        } else if (i10 == 2) {
            str = "Strategy.HighQuality";
        } else if (i10 == 3) {
            str = "Strategy.Balanced";
        } else {
            str = i10 == 0 ? "Strategy.Unspecified" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", strictness=");
        int i11 = (i7 >> 8) & 255;
        if (i11 == 1) {
            str2 = "Strictness.None";
        } else if (i11 == 2) {
            str2 = "Strictness.Loose";
        } else if (i11 == 3) {
            str2 = "Strictness.Normal";
        } else if (i11 == 4) {
            str2 = "Strictness.Strict";
        } else {
            str2 = i11 == 0 ? "Strictness.Unspecified" : "Invalid";
        }
        sb2.append((Object) str2);
        sb2.append(", wordBreak=");
        int i12 = (i7 >> 16) & 255;
        if (i12 == 1) {
            str3 = "WordBreak.None";
        } else if (i12 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i12 == 0) {
            str3 = "WordBreak.Unspecified";
        }
        sb2.append((Object) str3);
        sb2.append(')');
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f8407a == ((e) obj).f8407a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8407a;
    }

    public final String toString() {
        return a(this.f8407a);
    }
}
