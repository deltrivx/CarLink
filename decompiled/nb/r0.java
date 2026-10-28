package nb;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f9028b = new r0(p0.f9025a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f9029a;

    public r0(p0 p0Var) {
        this.f9029a = p0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void a(int i7) {
        String str;
        int i10;
        if (i7 != 1 && i7 != 2 && i7 != 8 && i7 != 34 && i7 != 37) {
            switch (i7) {
                default:
                    switch (i7) {
                        default:
                            switch (i7) {
                                default:
                                    switch (i7) {
                                        case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                                        case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                                        case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case ServiceTypes.KEYCODE_TEL /* 29 */:
                                case 30:
                                case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i7 != 1 && i7 != 2 && i7 != 8 && i7 != 34 && i7 != 37) {
            switch (i7) {
                default:
                    switch (i7) {
                        default:
                            switch (i7) {
                                default:
                                    switch (i7) {
                                        case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                                        case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                                        case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                                            break;
                                        default:
                                            i10 = 3;
                                            break;
                                    }
                                case ServiceTypes.KEYCODE_TEL /* 29 */:
                                case 30:
                                case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                                case 32:
                                    i10 = 2;
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i10 = 2;
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    i10 = 2;
                    break;
            }
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case 30:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
            case 32:
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                objArr[0] = "originalProjection";
                break;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                objArr[0] = "originalType";
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                objArr[0] = "substituted";
                break;
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
                objArr[0] = "annotations";
                break;
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                objArr[0] = "typeParameterVariance";
                break;
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                objArr[0] = "projectionKind";
                break;
        }
        if (i7 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i7 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i7 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i7 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i7 != 37) {
            switch (i7) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i7) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i7) {
                                case ServiceTypes.KEYCODE_TEL /* 29 */:
                                case 30:
                                case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i7) {
                                        case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                                        case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                                        case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i7) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case ServiceTypes.KEYCODE_TEL /* 29 */:
            case 30:
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
            case 32:
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2 && i7 != 8 && i7 != 34 && i7 != 37) {
            switch (i7) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i7) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i7) {
                                case ServiceTypes.KEYCODE_TEL /* 29 */:
                                case 30:
                                case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                                case 32:
                                    break;
                                default:
                                    switch (i7) {
                                        case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                                        case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                                        case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static x0 b(x0 x0Var, x0 x0Var2) {
        if (x0Var == null) {
            a(38);
            throw null;
        }
        if (x0Var2 == null) {
            a(39);
            throw null;
        }
        x0 x0Var3 = x0.INVARIANT;
        if (x0Var == x0Var3) {
            if (x0Var2 != null) {
                return x0Var2;
            }
            a(40);
            throw null;
        }
        if (x0Var2 == x0Var3) {
            if (x0Var != null) {
                return x0Var;
            }
            a(41);
            throw null;
        }
        if (x0Var == x0Var2) {
            if (x0Var2 != null) {
                return x0Var2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + x0Var + "' and projection kind '" + x0Var2 + "' cannot be combined");
    }

    public static int c(x0 x0Var, x0 x0Var2) {
        x0 x0Var3 = x0.OUT_VARIANCE;
        x0 x0Var4 = x0.IN_VARIANCE;
        if (x0Var == x0Var4 && x0Var2 == x0Var3) {
            return 3;
        }
        return (x0Var == x0Var3 && x0Var2 == x0Var4) ? 2 : 1;
    }

    public static r0 d(w wVar) {
        if (wVar == null) {
            a(6);
            throw null;
        }
        return new r0(l0.f9017b.g(wVar.D0(), wVar.B0()));
    }

    public static r0 e(p0 p0Var, p0 p0Var2) {
        if (p0Var == null) {
            a(3);
            throw null;
        }
        if (p0Var2 == null) {
            a(4);
            throw null;
        }
        if (p0Var.e()) {
            p0Var = p0Var2;
        } else if (!p0Var2.e()) {
            p0Var = new o(p0Var, p0Var2);
        }
        return new r0(p0Var);
    }

    public static String h(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (wb.l.i(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final p0 f() {
        p0 p0Var = this.f9029a;
        if (p0Var != null) {
            return p0Var;
        }
        a(8);
        throw null;
    }

    public final w g(w wVar, x0 x0Var) {
        if (wVar == null) {
            a(9);
            throw null;
        }
        if (this.f9029a.e()) {
            return wVar;
        }
        try {
            w wVarB = j(new f0(wVar, x0Var), null, 0).b();
            if (wVarB != null) {
                return wVarB;
            }
            a(12);
            throw null;
        } catch (q0 e7) {
            return pb.l.c(pb.k.UNABLE_TO_SUBSTITUTE_TYPE, e7.getMessage());
        }
    }

    public final w i(w wVar, x0 x0Var) {
        if (wVar == null) {
            a(14);
            throw null;
        }
        if (x0Var == null) {
            a(15);
            throw null;
        }
        n0 f0Var = new f0(f().f(wVar, x0Var), x0Var);
        p0 p0Var = this.f9029a;
        if (!p0Var.e()) {
            try {
                f0Var = j(f0Var, null, 0);
            } catch (q0 unused) {
                f0Var = null;
            }
        }
        if (p0Var.a() || p0Var.b()) {
            boolean zB = p0Var.b();
            if (f0Var == null) {
                f0Var = null;
            } else if (!f0Var.c()) {
                w wVarB = f0Var.b();
                i9.l.d(wVarB, "getType(...)");
                if (u0.c(wVarB, sb.b.f12714a, null)) {
                    x0 x0VarA = f0Var.a();
                    i9.l.d(x0VarA, "getProjectionKind(...)");
                    if (x0VarA == x0.OUT_VARIANCE) {
                        f0Var = new f0((w) n3.u.j(wVarB).f12713b, x0VarA);
                    } else if (zB) {
                        f0Var = new f0((w) n3.u.j(wVarB).f12712a, x0VarA);
                    } else {
                        sb.c cVar = new sb.c();
                        r0 r0Var = new r0(cVar);
                        if (!cVar.e()) {
                            try {
                                f0Var = r0Var.j(f0Var, null, 0);
                            } catch (q0 unused2) {
                                f0Var = null;
                            }
                        }
                    }
                }
            }
        }
        if (f0Var == null) {
            return null;
        }
        return f0Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:105:0x0212  */
    /* JADX WARN: Code duplicated, block: B:107:0x021a  */
    /* JADX WARN: Code duplicated, block: B:108:0x021d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0220  */
    /* JADX WARN: Code duplicated, block: B:111:0x0223  */
    /* JADX WARN: Code duplicated, block: B:114:0x0228  */
    /* JADX WARN: Code duplicated, block: B:116:0x022c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0234  */
    /* JADX WARN: Code duplicated, block: B:120:0x0243  */
    /* JADX WARN: Code duplicated, block: B:125:0x0264  */
    /* JADX WARN: Code duplicated, block: B:127:0x0288  */
    /* JADX WARN: Code duplicated, block: B:134:0x0295  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:159:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0141  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:74:0x017e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0181  */
    /* JADX WARN: Code duplicated, block: B:80:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0192 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0195  */
    /* JADX WARN: Code duplicated, block: B:86:0x019e  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01be  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final n0 j(n0 n0Var, x9.r0 r0Var, int i7) throws q0 {
        w wVarB;
        x0 x0VarA;
        w0 w0VarG0;
        a aVar;
        a0 a0Var;
        x0 x0Var;
        List listN;
        List listB0;
        ArrayList arrayList;
        boolean z10;
        w wVarP;
        x9.r0 r0Var2;
        n0 n0Var2;
        n0 n0VarJ;
        int iB;
        r0 r0Var3;
        s sVar;
        int iC;
        qb.d dVarG0;
        j jVar;
        w wVarH;
        y9.h hVarC;
        int iB2;
        r0 r0Var4 = this;
        w wVarI = null;
        if (n0Var == null) {
            a(18);
            throw null;
        }
        p0 p0Var = r0Var4.f9029a;
        if (i7 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + h(n0Var) + "; substitution: " + h(p0Var));
        }
        if (!n0Var.c()) {
            w wVarB2 = n0Var.b();
            int i10 = 1;
            if (wVarB2 instanceof v0) {
                v0 v0Var = (v0) wVarB2;
                w0 w0VarW0 = v0Var.w0();
                w wVarD = v0Var.D();
                n0 n0VarJ2 = r0Var4.j(new f0(w0VarW0, n0Var.a()), r0Var, i7 + 1);
                return n0VarJ2.c() ? n0VarJ2 : new f0(c.F(n0VarJ2.b().G0(), r0Var4.i(wVarD, n0Var.a())), n0VarJ2.a());
            }
            i9.l.e(wVarB2, "<this>");
            wVarB2.G0();
            if (!(wVarB2.G0() instanceof la.h)) {
                n0 n0VarD = p0Var.d(wVarB2);
                if (n0VarD == null) {
                    n0VarD = null;
                } else if (wVarB2.getAnnotations().i(u9.n.f13195y)) {
                    k0 k0VarD0 = n0VarD.b().D0();
                    if (k0VarD0 instanceof ob.j) {
                        n0 n0Var3 = ((ob.j) k0VarD0).f9648a;
                        x0 x0VarA2 = n0Var3.a();
                        if (c(n0Var.a(), x0VarA2) == 3) {
                            n0VarD = new f0(n0Var3.b());
                        } else if (r0Var != null && c(r0Var.I(), x0VarA2) == 3) {
                            n0VarD = new f0(n0Var3.b());
                        }
                    }
                }
                x0 x0VarA3 = n0Var.a();
                int i11 = 0;
                if (n0VarD == null && c.k(wVarB2)) {
                    qb.d dVarG1 = wVarB2.G0();
                    j jVar2 = dVarG1 instanceof j ? (j) dVarG1 : null;
                    if (!(jVar2 != null ? jVar2.p0() : false)) {
                        p pVar = (p) wVarB2.G0();
                        a0 a0Var2 = pVar.f9024c;
                        a0 a0Var3 = pVar.f9023b;
                        int i12 = i7 + 1;
                        n0 n0VarJ3 = r0Var4.j(new f0(a0Var3, x0VarA3), r0Var, i12);
                        n0 n0VarJ4 = r0Var4.j(new f0(a0Var2, x0VarA3), r0Var, i12);
                        x0 x0VarA4 = n0VarJ3.a();
                        if (n0VarJ3.b() != a0Var3 || n0VarJ4.b() != a0Var2) {
                            return new f0(c.e(c.b(n0VarJ3.b()), c.b(n0VarJ4.b())), x0VarA4);
                        }
                    } else if (!u9.i.F(wVarB2)) {
                        if (n0VarD != null) {
                            iC = c(x0VarA3, n0VarD.a());
                            if (!(wVarB2.D0() instanceof ab.b)) {
                                iB2 = e1.d.b(iC);
                                if (iB2 != 1) {
                                    return new f0(wVarB2.D0().k().p(), x0.OUT_VARIANCE);
                                }
                                if (iB2 == 2) {
                                    throw new q0("Out-projection in in-position");
                                }
                            }
                            dVarG0 = wVarB2.G0();
                            if (dVarG0 instanceof j) {
                                jVar = (j) dVarG0;
                            } else {
                                jVar = null;
                            }
                            if (jVar != null) {
                                jVar = null;
                            } else {
                                jVar = null;
                            }
                            if (n0VarD.c()) {
                                return n0VarD;
                            }
                            if (jVar != null) {
                                wVarH = jVar.v0(n0VarD.b());
                            } else {
                                wVarH = u0.h(n0VarD.b(), wVarB2.E0());
                            }
                            if (!wVarB2.getAnnotations().isEmpty()) {
                                hVarC = p0Var.c(wVarB2.getAnnotations());
                                if (hVarC != null) {
                                    a(33);
                                    throw null;
                                }
                                if (hVarC.i(u9.n.f13195y)) {
                                    hVarC = new y9.l(hVarC, new t(i10));
                                }
                                wVarH = n3.n.H0(wVarH, new y9.i(new y9.h[]{wVarH.getAnnotations(), hVarC}));
                            }
                            if (iC == 1) {
                                x0VarA3 = b(x0VarA3, n0VarD.a());
                            }
                            return new f0(wVarH, x0VarA3);
                        }
                        wVarB = n0Var.b();
                        x0VarA = n0Var.a();
                        if (!(wVarB.D0().l() instanceof x9.r0)) {
                            w0VarG0 = wVarB.G0();
                            if (w0VarG0 instanceof a) {
                                aVar = (a) w0VarG0;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                a0Var = aVar.f8974c;
                            } else {
                                a0Var = null;
                            }
                            x0Var = x0.INVARIANT;
                            if (a0Var != null) {
                                if (p0Var instanceof s) {
                                    sVar = (s) p0Var;
                                    if (sVar.f9032d) {
                                        r0Var3 = new r0(new s(sVar.f9030b, sVar.f9031c, false));
                                    } else {
                                        r0Var3 = r0Var4;
                                    }
                                } else {
                                    r0Var3 = r0Var4;
                                }
                                wVarI = r0Var3.i(a0Var, x0Var);
                            }
                            listN = wVarB.D0().n();
                            listB0 = wVarB.B0();
                            arrayList = new ArrayList(listN.size());
                            z10 = false;
                            while (i11 < listN.size()) {
                                r0Var2 = (x9.r0) listN.get(i11);
                                n0Var2 = (n0) listB0.get(i11);
                                n0VarJ = r0Var4.j(n0Var2, r0Var2, i7 + 1);
                                iB = e1.d.b(c(r0Var2.I(), n0VarJ.a()));
                                if (iB != 0) {
                                    if (iB != 1) {
                                    }
                                    n0VarJ = u0.j(r0Var2);
                                } else if (r0Var2.I() != x0Var) {
                                    n0VarJ = new f0(n0VarJ.b(), x0Var);
                                }
                                if (n0VarJ != n0Var2) {
                                    z10 = true;
                                }
                                arrayList.add(n0VarJ);
                                i11++;
                                r0Var4 = this;
                            }
                            if (z10) {
                                listB0 = arrayList;
                            }
                            y9.h hVarC2 = p0Var.c(wVarB.getAnnotations());
                            i9.l.e(listB0, "newArguments");
                            i9.l.e(hVarC2, "newAnnotations");
                            wVarP = c.p(wVarB, listB0, hVarC2, 4);
                            if (wVarP instanceof a0) {
                                wVarP = c.E((a0) wVarP, (a0) wVarI);
                            }
                            return new f0(wVarP, x0VarA);
                        }
                    }
                } else if (!u9.i.F(wVarB2) && !c.j(wVarB2)) {
                    if (n0VarD != null) {
                        iC = c(x0VarA3, n0VarD.a());
                        if (!(wVarB2.D0() instanceof ab.b)) {
                            iB2 = e1.d.b(iC);
                            if (iB2 != 1) {
                                return new f0(wVarB2.D0().k().p(), x0.OUT_VARIANCE);
                            }
                            if (iB2 == 2) {
                                throw new q0("Out-projection in in-position");
                            }
                        }
                        dVarG0 = wVarB2.G0();
                        if (dVarG0 instanceof j) {
                            jVar = (j) dVarG0;
                        } else {
                            jVar = null;
                        }
                        if (jVar != null || !jVar.p0()) {
                            jVar = null;
                        }
                        if (n0VarD.c()) {
                            return n0VarD;
                        }
                        if (jVar != null) {
                            wVarH = jVar.v0(n0VarD.b());
                        } else {
                            wVarH = u0.h(n0VarD.b(), wVarB2.E0());
                        }
                        if (!wVarB2.getAnnotations().isEmpty()) {
                            hVarC = p0Var.c(wVarB2.getAnnotations());
                            if (hVarC != null) {
                                a(33);
                                throw null;
                            }
                            if (hVarC.i(u9.n.f13195y)) {
                                hVarC = new y9.l(hVarC, new t(i10));
                            }
                            wVarH = n3.n.H0(wVarH, new y9.i(new y9.h[]{wVarH.getAnnotations(), hVarC}));
                        }
                        if (iC == 1) {
                            x0VarA3 = b(x0VarA3, n0VarD.a());
                        }
                        return new f0(wVarH, x0VarA3);
                    }
                    wVarB = n0Var.b();
                    x0VarA = n0Var.a();
                    if (!(wVarB.D0().l() instanceof x9.r0)) {
                        w0VarG0 = wVarB.G0();
                        if (w0VarG0 instanceof a) {
                            aVar = (a) w0VarG0;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            a0Var = aVar.f8974c;
                        } else {
                            a0Var = null;
                        }
                        x0Var = x0.INVARIANT;
                        if (a0Var != null) {
                            if (p0Var instanceof s) {
                                sVar = (s) p0Var;
                                if (sVar.f9032d) {
                                    r0Var3 = r0Var4;
                                } else {
                                    r0Var3 = new r0(new s(sVar.f9030b, sVar.f9031c, false));
                                }
                            } else {
                                r0Var3 = r0Var4;
                            }
                            wVarI = r0Var3.i(a0Var, x0Var);
                        }
                        listN = wVarB.D0().n();
                        listB0 = wVarB.B0();
                        arrayList = new ArrayList(listN.size());
                        z10 = false;
                        while (i11 < listN.size()) {
                            r0Var2 = (x9.r0) listN.get(i11);
                            n0Var2 = (n0) listB0.get(i11);
                            n0VarJ = r0Var4.j(n0Var2, r0Var2, i7 + 1);
                            iB = e1.d.b(c(r0Var2.I(), n0VarJ.a()));
                            if (iB != 0) {
                                if (iB != 1 || iB == 2) {
                                    n0VarJ = u0.j(r0Var2);
                                }
                            } else if (r0Var2.I() != x0Var && !n0VarJ.c()) {
                                n0VarJ = new f0(n0VarJ.b(), x0Var);
                            }
                            if (n0VarJ != n0Var2) {
                                z10 = true;
                            }
                            arrayList.add(n0VarJ);
                            i11++;
                            r0Var4 = this;
                        }
                        if (z10) {
                            listB0 = arrayList;
                        }
                        y9.h hVarC3 = p0Var.c(wVarB.getAnnotations());
                        i9.l.e(listB0, "newArguments");
                        i9.l.e(hVarC3, "newAnnotations");
                        wVarP = c.p(wVarB, listB0, hVarC3, 4);
                        if ((wVarP instanceof a0) && (wVarI instanceof a0)) {
                            wVarP = c.E((a0) wVarP, (a0) wVarI);
                        }
                        return new f0(wVarP, x0VarA);
                    }
                }
            }
        }
        return n0Var;
    }
}
