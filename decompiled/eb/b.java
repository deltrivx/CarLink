package eb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4664a;

    public b(String str) {
        if (str != null) {
            this.f4664a = str;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void a(int i7) {
        String str;
        int i10;
        if (i7 != 3 && i7 != 5) {
            switch (i7) {
                case 8:
                case 9:
                case 10:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i7 != 3 && i7 != 5) {
            switch (i7) {
                case 8:
                case 9:
                case 10:
                    i10 = 2;
                    break;
                default:
                    i10 = 3;
                    break;
            }
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            case 7:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i7 == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i7 != 5) {
            switch (i7) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i7) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 3 && i7 != 5) {
            switch (i7) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static b b(wa.c cVar) {
        if (cVar != null) {
            return new b(cVar.f14240a.f14243a.replace('.', '/'));
        }
        a(4);
        throw null;
    }

    public static b c(String str) {
        if (str != null) {
            return new b(str);
        }
        a(0);
        throw null;
    }

    public static String e(wa.b bVar) {
        wa.c cVar = bVar.f14236a;
        String strReplace = bVar.f14237b.f14240a.f14243a.replace('.', '$');
        if (!cVar.f14240a.c()) {
            strReplace = cVar.f14240a.f14243a.replace('.', '/') + "/" + strReplace;
        }
        if (strReplace != null) {
            return strReplace;
        }
        a(3);
        throw null;
    }

    public final String d() {
        String str = this.f4664a;
        if (str != null) {
            return str;
        }
        a(10);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f4664a.equals(((b) obj).f4664a);
    }

    public final int hashCode() {
        return this.f4664a.hashCode();
    }

    public final String toString() {
        return this.f4664a;
    }
}
