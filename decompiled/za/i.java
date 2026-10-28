package za;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f15795c = new i(1, "SUCCESS");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15797b;

    public i(int i7, String str) {
        if (i7 == 0) {
            a(3);
            throw null;
        }
        this.f15796a = i7;
        this.f15797b = str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4) ? 3 : 2];
        if (i7 == 1 || i7 == 2) {
            objArr[0] = "debugMessage";
        } else if (i7 == 3) {
            objArr[0] = "success";
        } else if (i7 != 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
        } else {
            objArr[0] = "debugMessage";
        }
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                break;
            case 5:
                objArr[1] = "getResult";
                break;
            case 6:
                objArr[1] = "getDebugMessage";
                break;
            default:
                objArr[1] = "success";
                break;
        }
        if (i7 == 1) {
            objArr[2] = "incompatible";
        } else if (i7 == 2) {
            objArr[2] = "conflict";
        } else if (i7 == 3 || i7 == 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    public static i c(String str) {
        return new i(2, str);
    }

    public final int b() {
        int i7 = this.f15796a;
        if (i7 != 0) {
            return i7;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i7 = this.f15796a;
        if (i7 == 1) {
            str = "OVERRIDABLE";
        } else if (i7 != 2) {
            str = i7 != 3 ? "null" : "CONFLICT";
        } else {
            str = "INCOMPATIBLE";
        }
        sb2.append(str);
        sb2.append(": ");
        sb2.append(this.f15797b);
        return sb2.toString();
    }
}
