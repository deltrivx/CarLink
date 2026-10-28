package eb;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import u9.k;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum c {
    BOOLEAN(k.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(k.CHAR, "char", "C", "java.lang.Character"),
    BYTE(k.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(k.SHORT, "short", "S", "java.lang.Short"),
    INT(k.INT, "int", "I", "java.lang.Integer"),
    FLOAT(k.FLOAT, "float", "F", "java.lang.Float"),
    LONG(k.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(k.DOUBLE, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap f4672m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumMap f4673n = new EnumMap(k.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f4674o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final HashSet f4675p = new HashSet();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final HashMap f4676q = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f4678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wa.c f4681d;

    static {
        for (c cVar : values()) {
            f4672m.put(cVar.f4679b, cVar);
            f4673n.put(cVar.d(), cVar);
            f4674o.put(cVar.c(), cVar);
            String strReplace = cVar.f4681d.f14240a.f14243a.replace('.', '/');
            f4675p.add(strReplace);
            f4676q.put(strReplace, "(" + cVar.f4680c + ")L" + strReplace + ";");
        }
    }

    c(k kVar, String str, String str2, String str3) {
        if (kVar == null) {
            a(8);
            throw null;
        }
        this.f4678a = kVar;
        this.f4679b = str;
        this.f4680c = str2;
        this.f4681d = new wa.c(str3);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void a(int i7) {
        String str;
        int i10;
        if (i7 != 4 && i7 != 6) {
            switch (i7) {
                case 12:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i7 != 4 && i7 != 6) {
            switch (i7) {
                case 12:
                case 13:
                case 14:
                case 15:
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
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = "name";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = "type";
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i7 != 4 && i7 != 6) {
            switch (i7) {
                case 12:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i7) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 6) {
            switch (i7) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static c b(String str) {
        c cVar = (c) f4672m.get(str);
        if (cVar != null) {
            return cVar;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final String c() {
        String str = this.f4680c;
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final k d() {
        k kVar = this.f4678a;
        if (kVar != null) {
            return kVar;
        }
        a(12);
        throw null;
    }
}
