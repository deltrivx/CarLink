package wa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14248b;

    public e(String str, boolean z10) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.f14247a = str;
        this.f14248b = z10;
    }

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4) ? 2 : 3];
        if (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i7 == 1) {
            objArr[1] = "asString";
        } else if (i7 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i7 == 3 || i7 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static e d(String str) {
        if (str != null) {
            return str.startsWith("<") ? g(str) : e(str);
        }
        a(9);
        throw null;
    }

    public static e e(String str) {
        if (str != null) {
            return new e(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean f(String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static e g(String str) {
        if (str == null) {
            a(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new e(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    public final String b() {
        String str = this.f14247a;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public final String c() {
        if (this.f14248b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strB = b();
        if (strB != null) {
            return strB;
        }
        a(2);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f14247a.compareTo(((e) obj).f14247a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f14248b == eVar.f14248b && this.f14247a.equals(eVar.f14247a);
    }

    public final int hashCode() {
        return (this.f14247a.hashCode() * 31) + (this.f14248b ? 1 : 0);
    }

    public final String toString() {
        return this.f14247a;
    }
}
