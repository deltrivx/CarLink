package rc;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f12326a = new k();

    public static final h a(Number number, String str, String str2) {
        i9.l.e(str, "key");
        i9.l.e(str2, "output");
        return d(-1, "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) k(str2, -1)));
    }

    public static final h b(Number number, String str) {
        return new h(1, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) k(str, -1)));
    }

    public static final h c(nc.e eVar) {
        return new h(1, "Value of type '" + eVar.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + eVar.f() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final h d(int i7, String str) {
        i9.l.e(str, "message");
        if (i7 >= 0) {
            str = "Unexpected JSON token at offset " + i7 + ": " + str;
        }
        return new h(0, str);
    }

    public static final h e(String str, CharSequence charSequence, int i7) {
        i9.l.e(str, "message");
        i9.l.e(charSequence, "input");
        return d(i7, str + "\nJSON input: " + ((Object) k(charSequence, i7)));
    }

    public static final nc.e f(nc.e eVar, n4.e eVar2) {
        i9.l.e(eVar, "<this>");
        i9.l.e(eVar2, "module");
        return (!i9.l.a(eVar.f(), nc.g.f9088c) && eVar.g()) ? f(eVar.n(0), eVar2) : eVar;
    }

    public static final byte g(char c10) {
        if (c10 < '~') {
            return d.f12319b[c10];
        }
        return (byte) 0;
    }

    public static final String h(nc.e eVar, qc.b bVar) {
        i9.l.e(eVar, "<this>");
        i9.l.e(bVar, "json");
        for (Annotation annotation : eVar.getAnnotations()) {
            if (annotation instanceof qc.g) {
                return ((qc.g) annotation).discriminator();
            }
        }
        return (String) bVar.f11033a.f9625e;
    }

    public static final boolean i(nc.e eVar, qc.b bVar) {
        i9.l.e(eVar, "<this>");
        i9.l.e(bVar, "json");
        bVar.f11033a.getClass();
        List annotations = eVar.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof qc.n) {
                return true;
            }
        }
        return false;
    }

    public static final void j(ja.e eVar, String str) {
        eVar.m("Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.", eVar.f6996b - 1);
        throw null;
    }

    public static final CharSequence k(CharSequence charSequence, int i7) {
        i9.l.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i7 != -1) {
                int i10 = i7 - 30;
                int i11 = i7 + 30;
                String str = i10 <= 0 ? "" : ".....";
                String str2 = i11 >= charSequence.length() ? "" : ".....";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                if (i10 < 0) {
                    i10 = 0;
                }
                int length = charSequence.length();
                if (i11 > length) {
                    i11 = length;
                }
                sb2.append(charSequence.subSequence(i10, i11).toString());
                sb2.append(str2);
                return sb2.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void l(nc.e eVar, qc.b bVar) {
        i9.l.e(eVar, "<this>");
        i9.l.e(bVar, "json");
        if (i9.l.a(eVar.f(), nc.i.f9090c)) {
            bVar.f11033a.getClass();
        }
    }

    public static final Object m(qc.b bVar, String str, qc.u uVar, mc.a aVar) {
        i9.l.e(bVar, "<this>");
        i9.l.e(str, "discriminator");
        return new m(bVar, uVar, str, aVar.d()).D(aVar);
    }

    public static final v n(nc.e eVar, qc.b bVar) {
        i9.l.e(bVar, "<this>");
        i9.l.e(eVar, "desc");
        n4.h hVarF = eVar.f();
        if (hVarF instanceof nc.b) {
            return v.POLY_OBJ;
        }
        if (i9.l.a(hVarF, nc.i.f9091d)) {
            return v.LIST;
        }
        if (!i9.l.a(hVarF, nc.i.f9092e)) {
            return v.OBJ;
        }
        nc.e eVarF = f(eVar.n(0), bVar.f11034b);
        n4.h hVarF2 = eVarF.f();
        if ((hVarF2 instanceof nc.d) || i9.l.a(hVarF2, nc.h.f9089c)) {
            return v.MAP;
        }
        bVar.f11033a.getClass();
        throw c(eVarF);
    }

    public static final void o(ja.e eVar, Number number) {
        ja.e.n(eVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String p(byte b10) {
        if (b10 == 1) {
            return "quotation mark '\"'";
        }
        if (b10 == 2) {
            return "string escape sequence '\\'";
        }
        if (b10 == 4) {
            return "comma ','";
        }
        if (b10 == 5) {
            return "colon ':'";
        }
        if (b10 == 6) {
            return "start of the object '{'";
        }
        if (b10 == 7) {
            return "end of the object '}'";
        }
        if (b10 == 8) {
            return "start of the array '['";
        }
        if (b10 == 9) {
            return "end of the array ']'";
        }
        if (b10 == 10) {
            return "end of the input";
        }
        return b10 == 127 ? "invalid token" : "valid token";
    }
}
