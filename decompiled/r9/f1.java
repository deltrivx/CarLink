package r9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class f1 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f11679b;

    public /* synthetic */ f1(l1 l1Var, int i7) {
        this.f11678a = i7;
        this.f11679b = l1Var;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:72:0x0207  */
    @Override // h9.a
    public final Object invoke() throws IOException {
        aa.x xVarH0;
        boolean zI;
        Class<?> enclosingClass;
        int i7 = this.f11678a;
        l1 l1Var = this.f11679b;
        boolean z10 = true;
        int i10 = 2;
        switch (i7) {
            case 0:
                wa.b bVar = v1.f11778a;
                x9.k0 k0VarJ = l1Var.j();
                e0 e0Var = l1Var.f11709c;
                n3.r rVarB = v1.b(k0VarJ);
                if (!(rVarB instanceof n)) {
                    if (rVarB instanceof l) {
                        return ((l) rVarB).f11706g;
                    }
                    if ((rVarB instanceof m) || (rVarB instanceof o)) {
                        return null;
                    }
                    throw new cc.s();
                }
                n nVar = (n) rVarB;
                ra.i0 i0Var = nVar.f11720h;
                x9.k0 k0Var = nVar.f11719g;
                xa.g gVar = va.g.f13718a;
                va.d dVarB = va.g.b(i0Var, nVar.f11722j, nVar.k, true);
                if (dVarB == null) {
                    return null;
                }
                if (k0Var.f() != 2) {
                    x9.k kVarL = k0Var.l();
                    if (kVarL == null) {
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "companionObject", "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil", "isClassCompanionObjectWithBackingFieldsInOuter"));
                    }
                    if (za.d.l(kVarL)) {
                        x9.k kVarL2 = kVarL.l();
                        if (za.d.n(kVarL2, x9.f.f14701a) || za.d.n(kVarL2, x9.f.f14703c)) {
                            LinkedHashSet linkedHashSet = u9.d.f13133a;
                            if (n3.u.D((x9.e) kVarL)) {
                                if (za.d.l(k0Var.l())) {
                                    xVarH0 = k0Var.h0();
                                    if (xVarH0 == null && xVarH0.getAnnotations().i(ga.x.f6124a)) {
                                        zI = true;
                                    } else {
                                        zI = k0Var.getAnnotations().i(ga.x.f6124a);
                                    }
                                    if (!zI) {
                                        z10 = false;
                                    }
                                } else {
                                    z10 = false;
                                }
                            }
                        } else if (za.d.l(k0Var.l())) {
                            z10 = false;
                        } else {
                            xVarH0 = k0Var.h0();
                            if (xVarH0 == null) {
                                zI = k0Var.getAnnotations().i(ga.x.f6124a);
                            } else {
                                zI = k0Var.getAnnotations().i(ga.x.f6124a);
                            }
                            if (!zI) {
                                z10 = false;
                            }
                        }
                    } else if (za.d.l(k0Var.l())) {
                        z10 = false;
                    } else {
                        xVarH0 = k0Var.h0();
                        if (xVarH0 == null) {
                            zI = k0Var.getAnnotations().i(ga.x.f6124a);
                        } else {
                            zI = k0Var.getAnnotations().i(ga.x.f6124a);
                        }
                        if (!zI) {
                            z10 = false;
                        }
                    }
                } else {
                    z10 = false;
                }
                if (z10 || va.g.d(i0Var)) {
                    enclosingClass = e0Var.a().getEnclosingClass();
                } else {
                    x9.k kVarL3 = k0Var.l();
                    enclosingClass = kVarL3 instanceof x9.e ? x1.k((x9.e) kVarL3) : e0Var.a();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(dVarB.f13710d);
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            default:
                e0 e0Var2 = l1Var.f11709c;
                String str = l1Var.f11710d;
                String str2 = l1Var.f11711e;
                e0Var2.getClass();
                i9.l.e(str, "name");
                i9.l.e(str2, "signature");
                zb.i iVar = e0.f11673a;
                iVar.getClass();
                Matcher matcher = iVar.f15828a.matcher(str2);
                i9.l.d(matcher, "matcher(...)");
                a2.b bVar2 = matcher.matches() ? new a2.b(matcher, str2) : null;
                if (bVar2 != null) {
                    if (((u8.e0) bVar2.f14d) == null) {
                        bVar2.f14d = new u8.e0(bVar2);
                    }
                    u8.e0 e0Var3 = (u8.e0) bVar2.f14d;
                    i9.l.b(e0Var3);
                    String str3 = (String) e0Var3.get(1);
                    x9.k0 k0VarG = e0Var2.g(Integer.parseInt(str3));
                    if (k0VarG != null) {
                        return k0VarG;
                    }
                    throw new cc.a0(2, "Local property #" + str3 + " not found in " + e0Var2.a());
                }
                Collection collectionN = e0Var2.n(wa.e.e(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionN) {
                    if (i9.l.a(v1.b((x9.k0) obj).d(), str2)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new cc.a0(2, "Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + e0Var2);
                }
                if (arrayList.size() == 1) {
                    return (x9.k0) u8.p.A0(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    ga.o oVarD = ((x9.k0) obj2).d();
                    Object arrayList2 = linkedHashMap.get(oVarD);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(oVarD, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                TreeMap treeMap = new TreeMap(new f(i10));
                treeMap.putAll(linkedHashMap);
                Collection collectionValues = treeMap.values();
                i9.l.d(collectionValues, "<get-values>(...)");
                List list = (List) u8.p.r0(collectionValues);
                if (list.size() == 1) {
                    return (x9.k0) u8.p.k0(list);
                }
                String strQ0 = u8.p.q0(e0Var2.n(wa.e.e(str)), "\n", null, null, b.f11655f, 30);
                StringBuilder sb2 = new StringBuilder("Property '");
                sb2.append(str);
                sb2.append("' (JVM signature: ");
                sb2.append(str2);
                sb2.append(") not resolved in ");
                sb2.append(e0Var2);
                sb2.append(':');
                sb2.append(strQ0.length() == 0 ? " no members found" : "\n".concat(strQ0));
                throw new cc.a0(2, sb2.toString());
        }
    }
}
